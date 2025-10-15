/*
 * Copyright 2025-present Coinbase Global, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.coinbase.tools.modelgenerator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.palantir.javapoet.*;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class PostProcessor {
    private static final Logger logger = LoggerFactory.getLogger(PostProcessor.class);
    
    private final Path tempDir;
    private final Path outputDir;
    private final Path enumsDir;
    private final boolean updateAll;
    private final Map<String, JsonNode> schemas = new HashMap<>();
    private final ObjectMapper yamlMapper = new ObjectMapper(new YAMLFactory());
    private final ModelTransformer transformer = new ModelTransformer();
    
    private int newModelsCount = 0;
    private int skippedModelsCount = 0;
    private int updatedModelsCount = 0;
    
    public PostProcessor(Path tempDir, Path outputDir, Path enumsDir) {
        this(tempDir, outputDir, enumsDir, false);
    }
    
    public PostProcessor(Path tempDir, Path outputDir, Path enumsDir, boolean updateAll) {
        this.tempDir = tempDir;
        this.outputDir = outputDir;
        this.enumsDir = enumsDir;
        this.updateAll = updateAll;
    }
    
    public void processModels() throws IOException {
        logger.info("Loading OpenAPI schema information...");
        loadSchemas();
        
        logger.info("Finding generated model files...");
        List<Path> modelFiles = findGeneratedModelFiles();
        logger.info("Found {} model files to process", modelFiles.size());
        
        // Create output directories
        Files.createDirectories(outputDir);
        Files.createDirectories(enumsDir);
        
        // Process each model file
        for (Path file : modelFiles) {
            String fileName = file.getFileName().toString();
            logger.info("Processing: {}", fileName);
            
            try {
                if (isEnumFile(file)) {
                    processEnumFile(file);
                } else {
                    processModelFile(file);
                }
            } catch (Exception e) {
                logger.error("Error processing file: " + fileName, e);
            }
        }
        
        // Clean up temporary directory
        logger.info("Cleaning up temporary files...");
        FileUtils.deleteDirectory(tempDir.toFile());
        
        // Log summary
        logger.info("==========================================");
        logger.info("Model Generation Summary:");
        logger.info("  New models: {}", newModelsCount);
        logger.info("  Updated models: {}", updatedModelsCount);
        logger.info("  Skipped models: {}", skippedModelsCount);
        logger.info("  Total processed: {}", modelFiles.size());
        logger.info("  Mode: {}", updateAll ? "UPDATE ALL" : "INCREMENTAL");
        logger.info("==========================================");
    }
    
    private void loadSchemas() throws IOException {
        Path projectRoot = findProjectRoot();
        Path specPath = projectRoot.resolve("apiSpec/prime-public-spec.yaml");
        
        if (!Files.exists(specPath)) {
            logger.warn("OpenAPI spec not found, proceeding without schema info");
            return;
        }
        
        try {
            JsonNode spec = yamlMapper.readTree(specPath.toFile());
            JsonNode components = spec.get("components");
            if (components != null && components.has("schemas")) {
                JsonNode schemasNode = components.get("schemas");
                schemasNode.fieldNames().forEachRemaining(name -> 
                    schemas.put(name, schemasNode.get(name))
                );
            }
            logger.info("Loaded {} schema definitions from OpenAPI spec", schemas.size());
        } catch (Exception e) {
            logger.warn("Could not parse OpenAPI spec for schema info: {}", e.getMessage());
            logger.info("Proceeding without schema info - basic transformations will still be applied");
        }
    }
    
    private List<Path> findGeneratedModelFiles() throws IOException {
        List<Path> files = new ArrayList<>();
        Path modelPath = tempDir.resolve("raw");
        
        if (Files.exists(modelPath)) {
            Files.walkFileTree(modelPath, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                    String fileName = file.getFileName().toString();
                    if (file.toString().endsWith(".java") && 
                        !fileName.contains("Test") &&
                        !fileName.matches(".*Api\\.java$")) { // Only skip files ending with "Api.java", not containing "Api"
                        files.add(file);
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
        }
        
        return files;
    }
    
    private boolean isEnumFile(Path file) throws IOException {
        String content = Files.readString(file);
        return content.contains("public enum ");
    }
    
    private void processEnumFile(Path file) throws IOException {
        String content = Files.readString(file);
        String className = extractClassName(content);
        
        // Strip prefixes from class name (matching prime-sdk-ts logic)
        String originalClassName = className;
        className = stripCommonPrefixes(className);
        
        if (!className.equals(originalClassName)) {
            content = content.replace("enum " + originalClassName, "enum " + className);
            content = replaceAllPrefixReferences(content, originalClassName, className);
            logger.info("Transformed enum name: {} -> {}", originalClassName, className);
        }
        
        String fileName = className + ".java";
        Path outputPath = enumsDir.resolve(fileName);
        
        boolean existsBefore = Files.exists(outputPath);
        
        // Check if model already exists (unless updateAll is true)
        if (!updateAll && existsBefore) {
            logger.info("Skipping existing enum: {}", className);
            skippedModelsCount++;
            return;
        }
        
        String transformedContent = transformer.transformEnum(content);
        
        Files.writeString(outputPath, transformedContent);
        
        if (!existsBefore) {
            logger.info("Generated new enum: {}", className);
            newModelsCount++;
        } else {
            logger.info("Updated enum: {}", className);
            updatedModelsCount++;
        }
        logger.debug("Wrote enum file: {}", outputPath);
    }
    
    private void processModelFile(Path file) throws IOException {
        String content = Files.readString(file);
        String className = extractClassName(content);
        
        // Skip certain generated files we don't need
        if (shouldSkipFile(className)) {
            logger.debug("Skipping file: {}", className);
            return;
        }
        
        // Strip prefixes from class name (matching prime-sdk-ts logic)
        String originalClassName = className;
        className = stripCommonPrefixes(className);
        
        if (!className.equals(originalClassName)) {
            content = content.replace("class " + originalClassName, "class " + className);
            content = content.replace("enum " + originalClassName, "enum " + className);
            content = replaceAllPrefixReferences(content, originalClassName, className);
            logger.info("Transformed class name: {} -> {}", originalClassName, className);
        }
        
        // Apply Web3 to Onchain transformation
        content = applyWeb3ToOnchainTransformation(content, className);
        
        String fileName = className + ".java";
        
        // Apply Web3 to Onchain transformation to filename
        if (fileName.contains("Web3")) {
            fileName = fileName.replace("Web3", "Onchain");
            className = className.replace("Web3", "Onchain");
        }
        
        Path outputPath = outputDir.resolve(fileName);
        boolean existsBefore = Files.exists(outputPath);
        
        // Check if model already exists (unless updateAll is true)
        if (!updateAll && existsBefore) {
            logger.info("Skipping existing model: {}", className);
            skippedModelsCount++;
            return;
        }
        
        // Transform the model content
        String transformedContent = transformer.transformModel(content, schemas.get(className));
        
        Files.writeString(outputPath, transformedContent);
        
        if (!existsBefore) {
            logger.info("Generated new model: {}", className);
            newModelsCount++;
        } else {
            logger.info("Updated model: {}", className);
            updatedModelsCount++;
        }
        logger.debug("Wrote model file: {}", outputPath);
    }
    
    private String applyWeb3ToOnchainTransformation(String content, String className) {
        if (content.contains("Web3") || content.contains("web3")) {
            logger.info("Applying Web3 to Onchain transformation for: {}", className);
            
            // Replace class names
            content = content.replaceAll("\\bWeb3", "Onchain");
            
            // Replace in property names and method names
            content = content.replaceAll("\\bweb3", "onchain");
            
            // Keep JSON property mappings unchanged
            content = content.replaceAll("@JsonProperty\\(\"onchain", "@JsonProperty(\"web3");
        }
        
        return content;
    }
    
    private String extractClassName(String content) {
        Pattern pattern = Pattern.compile("public\\s+(?:class|enum)\\s+(\\w+)");
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }
    
    /**
     * Strip common prefixes from class names to match prime-sdk-ts behavior.
     * This ensures consistency across SDKs.
     */
    private String stripCommonPrefixes(String className) {
        // Handle special cases first (matching prime-sdk-ts logic)
        // coinbaseCustodyApiActivityType → CustodyActivityType
        // coinbasePublicRestApiActivityType → PrimeActivityType
        if (className.equals("CoinbaseCustodyApiActivityType")) {
            return "CustodyActivityType";
        }
        if (className.equals("CoinbasePublicRestApiActivityType")) {
            return "PrimeActivityType";
        }
        
        // Order matters - check longer prefixes first to avoid partial matches
        String[] prefixesToStrip = {
            "CoinbaseBrokerageProxyEventsMaterializedApi",
            "CoinbasePublicRestApi",
            "CoinbaseCustodyApi",
            "PrimeRESTAPI",
            "PublicRestApi"
        };
        
        for (String prefix : prefixesToStrip) {
            if (className.startsWith(prefix)) {
                return className.substring(prefix.length());
            }
        }
        
        return className;
    }
    
    /**
     * Replace all references to the old prefixed class name with the new stripped name.
     */
    private String replaceAllPrefixReferences(String content, String originalClassName, String newClassName) {
        // Replace the prefix in all type references throughout the content
        String[] prefixesToStrip = {
            "CoinbaseBrokerageProxyEventsMaterializedApi",
            "CoinbasePublicRestApi",
            "CoinbaseCustodyApi",
            "PrimeRESTAPI",
            "PublicRestApi"
        };
        
        for (String prefix : prefixesToStrip) {
            content = content.replaceAll("\\b" + prefix + "(\\w+)", "$1");
        }
        
        return content;
    }
    
    private boolean shouldSkipFile(String className) {
        // Strip common prefixes for checking
        String cleanName = stripCommonPrefixes(className);
        
        // Skip Request/Response models (service-specific)
        if (cleanName.endsWith("Request") || cleanName.endsWith("Response")) {
            logger.info("Skipping Request/Response model: {}", className);
            return true;
        }
        
        // Skip Google infrastructure types
        if (className.startsWith("Google")) {
            logger.info("Skipping Google infrastructure type: {}", className);
            return true;
        }
        
        // Skip inline schemas
        if (cleanName.equals("RFQ")) {
            logger.info("Skipping inline schema: {}", className);
            return true;
        }
        
        // Skip malformed class names
        List<String> malformedNames = Arrays.asList(
            "ChangeOnchainAddressGroupRequestIsARequestToCreateOrUpdateANewOnchainAddressGroup",
            "CreateATransferBetweenTwoWallets"
        );
        if (malformedNames.contains(className)) {
            logger.info("Skipping malformed class name: {}", className);
            return true;
        }
        
        // Skip OpenAPI composition artifacts
        List<String> skipPatterns = Arrays.asList(
            "AllOf",
            "OneOf",
            "AnyOf",
            "ModelApiResponse",
            "AbstractOpenApiSchema"
        );
        
        boolean shouldSkip = skipPatterns.stream().anyMatch(cleanName::contains);
        if (shouldSkip) {
            logger.info("Skipping OpenAPI artifact: {}", className);
        }
        
        return shouldSkip;
    }
    
    private Path findProjectRoot() {
        Path current = outputDir;
        while (current != null) {
            if (Files.exists(current.resolve("pom.xml")) &&
                Files.exists(current.resolve("apiSpec/prime-public-spec.yaml"))) {
                return current;
            }
            current = current.getParent();
        }
        throw new RuntimeException("Could not find project root");
    }
}