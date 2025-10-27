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

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostProcessor {
    private static final Logger logger = LoggerFactory.getLogger(PostProcessor.class);


    // Special case enum renames: stripped name -> final enum name
    // This handles cases where enums need custom naming beyond simple prefix stripping
    private static final Map<String, String> ENUM_NAME_MAPPINGS = new HashMap<String, String>() {{
        put("ActivityType", "PrimeActivityType");  // CoinbasePublicRestApiActivityType -> PrimeActivityType
        // CoinbaseCustodyApiActivityType is handled by stripCommonPrefixes special case
    }};

    private final Path tempDir;
    private final Path outputDir;
    private final Path enumsDir;

    private int newModelsCount = 0;
    private int updatedModelsCount = 0;

    public PostProcessor(Path tempDir, Path outputDir, Path enumsDir) {
        this.tempDir = tempDir;
        this.outputDir = outputDir;
        this.enumsDir = enumsDir;
    }

    public void processModels() throws IOException {
        logger.info("Finding generated model files...");
        List<Path> modelFiles = findGeneratedModelFiles();
        logger.info("Found {} model files to process", modelFiles.size());

        // Create output directories
        Files.createDirectories(outputDir);
        Files.createDirectories(enumsDir);

        // Separate enum files from model files
        List<Path> enumFiles = new ArrayList<>();
        List<Path> nonEnumFiles = new ArrayList<>();

        for (Path file : modelFiles) {
            if (isEnumFile(file)) {
                enumFiles.add(file);
            } else {
                nonEnumFiles.add(file);
            }
        }

        logger.info("Found {} enum files and {} model files", enumFiles.size(), nonEnumFiles.size());

        // Process enums FIRST so they're available for import fixing
        logger.info("Processing enums first...");
        for (Path file : enumFiles) {
            String fileName = file.getFileName().toString();
            logger.info("Processing enum: {}", fileName);

            try {
                processEnumFile(file);
            } catch (Exception e) {
                logger.error("Error processing enum file: " + fileName, e);
            }
        }

        // Then process models with fixed enum imports
        logger.info("Processing models...");
        for (Path file : nonEnumFiles) {
            String fileName = file.getFileName().toString();
            logger.info("Processing model: {}", fileName);

            try {
                processModelFile(file);
            } catch (Exception e) {
                logger.error("Error processing model file: " + fileName, e);
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
        logger.info("  Total processed: {}", modelFiles.size());
        logger.info("==========================================");
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

    /**
     * Fixes enum imports to use the enums package and applies special case enum name mappings.
     * Handles both import statements and type references throughout the content.
     */
    private String fixEnumImports(String content) {
        // Get list of all actual enum names from enums directory
        Set<String> actualEnumNames = new HashSet<>();
        try {
            Files.walk(enumsDir, 1)
                .filter(p -> p.toString().endsWith(".java"))
                .forEach(p -> {
                    String fileName = p.getFileName().toString();
                    actualEnumNames.add(fileName.replace(".java", ""));
                });
        } catch (Exception e) {
            logger.warn("Could not read enums directory: {}", e.getMessage());
        }

        // First, apply special case enum name mappings (e.g., ActivityType -> PrimeActivityType)
        // This must happen BEFORE fixing import paths
        for (Map.Entry<String, String> mapping : ENUM_NAME_MAPPINGS.entrySet()) {
            String strippedName = mapping.getKey();
            String actualEnumName = mapping.getValue();

            // Only apply mapping if the actual enum exists
            if (actualEnumNames.contains(actualEnumName)) {
                // Replace type references (but not in @JsonProperty annotations)
                // Pattern: word boundary + strippedName + word boundary (not followed by quotes)
                content = content.replaceAll(
                    "\\b" + strippedName + "\\b(?![^@]*@JsonProperty)",
                    actualEnumName
                );
                logger.debug("Applied enum mapping: {} -> {}", strippedName, actualEnumName);
            }
        }

        // Then, fix import paths for all enums (move from model to model.enums package)
        for (String enumName : actualEnumNames) {
            content = content.replace(
                "import com.coinbase.prime.model." + enumName + ";",
                "import com.coinbase.prime.model.enums." + enumName + ";"
            );
        }

        return content;
    }

    private void processEnumFile(Path file) throws IOException {
        String content = Files.readString(file);
        String className = extractClassName(content);

        // Apply content replacements to ALL files (matching TS replaceString logic)
        content = applyContentReplacements(content);

        // Strip prefixes from class name (matching prime-sdk-ts logic)
        String originalClassName = className;
        className = stripCommonPrefixes(className);

        if (!className.equals(originalClassName)) {
            content = content.replace("enum " + originalClassName, "enum " + className);
            logger.info("Transformed enum name: {} -> {}", originalClassName, className);
        }

        // Extract final class name after all transformations (for correct filename)
        className = extractClassName(content);
        String fileName = className + ".java";
        Path outputPath = enumsDir.resolve(fileName);

        boolean existsBefore = Files.exists(outputPath);

        // Handle case-only filename changes on case-insensitive filesystems
        final String finalFileName = fileName;
        try {
            Files.list(enumsDir)
                .filter(p -> p.getFileName().toString().equalsIgnoreCase(finalFileName) &&
                            !p.getFileName().toString().equals(finalFileName))
                .forEach(p -> {
                    try {
                        Files.delete(p);
                        logger.info("Deleted old enum file with different casing: {}", p.getFileName());
                    } catch (IOException e) {
                        logger.warn("Could not delete old enum file: {}", p);
                    }
                });
        } catch (IOException e) {
            logger.warn("Could not check for enum case variants: {}", e.getMessage());
        }

        // Custom templates already produce correct output - just fix package
        content = content.replace("package com.coinbase.prime.model;", "package com.coinbase.prime.model.enums;");
        Files.writeString(outputPath, content);

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

        // Apply content replacements to ALL files (matching TS replaceString logic)
        content = applyContentReplacements(content);

        // Strip prefixes from class name (matching prime-sdk-ts logic)
        String originalClassName = className;
        className = stripCommonPrefixes(className);

        if (!className.equals(originalClassName)) {
            content = content.replace("class " + originalClassName, "class " + className);
            content = content.replace("enum " + originalClassName, "enum " + className);
            logger.info("Transformed class name: {} -> {}", originalClassName, className);
        }

        // Apply Web3 to Onchain transformation
        content = applyWeb3ToOnchainTransformation(content, className);

        // Extract final class name after all transformations (for correct filename)
        className = extractClassName(content);
        String fileName = className + ".java";

        // Apply Web3 to Onchain transformation to filename
        if (fileName.contains("Web3")) {
            fileName = fileName.replace("Web3", "Onchain");
            className = className.replace("Web3", "Onchain");
        }

        Path outputPath = outputDir.resolve(fileName);
        boolean existsBefore = Files.exists(outputPath);

        // Handle case-only filename changes on case-insensitive filesystems
        // Check if there's a file with different casing that needs to be deleted
        final String finalFileName = fileName;
        try {
            Files.list(outputDir)
                .filter(p -> p.getFileName().toString().equalsIgnoreCase(finalFileName) &&
                            !p.getFileName().toString().equals(finalFileName))
                .forEach(p -> {
                    try {
                        Files.delete(p);
                        logger.info("Deleted old file with different casing: {}", p.getFileName());
                    } catch (IOException e) {
                        logger.warn("Could not delete old file: {}", p);
                    }
                });
        } catch (IOException e) {
            logger.warn("Could not check for case variants: {}", e.getMessage());
        }

        // Custom templates already produce correct output - just fix enum imports
        content = fixEnumImports(content);
        Files.writeString(outputPath, content);

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

    // File path replacements (matching prime-sdk-ts filePathReplacements)
    // Used for transforming class names and file names
    private static final Map<String, String> FILE_PATH_REPLACEMENTS = new LinkedHashMap<String, String>() {{
        put("CoinbaseCustodyApiActivityType", "CustodyActivityType");
        put("CoinbasePublicRestApiActivityType", "PrimeActivityType");
        put("CoinbaseBrokerageProxyEventsMaterializedApi", "");
        put("CoinbasePublicRestApi", "");
        put("CoinbaseCustodyApi", "");
        put("PrimeRESTAPI", "");
        put("PublicRestApi", "");
        put("rFQ", "RFQ");
        put("FcmFuturesSweep", "FuturesSweep");
    }};

    // Content replacements (matching prime-sdk-ts replacements)
    // Applied to all file content to strip prefixes from type references
    private static final Map<String, String> CONTENT_REPLACEMENTS = new LinkedHashMap<String, String>() {{
        put("coinbaseCustodyApiActivityType", "CustodyActivityType");
        put("coinbasePublicRestApiActivityType", "PrimeActivityType");
        put("CoinbaseCustodyApiActivityType", "CustodyActivityType");
        put("CoinbasePublicRestApiActivityType", "PrimeActivityType");
        put("CoinbasePublicRestApi", "");
        put("coinbasePublicRestApi", "");
        put("PrimeRESTAPI", "");
        put("primeRESTAPI", "");
        put("CoinbaseCustodyApi", "");
        put("coinbaseCustodyApi", "");
        put("CoinbaseBrokerageProxyEventsMaterializedApi", "");
        put("coinbaseBrokerageProxyEventsMaterializedApi", "");
        put("publicRestApi", "");
        put("PublicRestApi", "");
        // Simplify verbose model names
        put("CreateOnchainTransactionRequestEvmParams", "EvmParams");
        put("FcmFuturesSweepRequestAmount", "SweepAmount");
        put("FcmFuturesSweep", "FuturesSweep");
    }};


    /**
     * Apply file path replacements to strip common prefixes from class names.
     * Matches prime-sdk-ts filePathReplacements behavior.
     */
    private String stripCommonPrefixes(String className) {
        String result = className;

        // Apply replacements in order (LinkedHashMap maintains insertion order)
        for (Map.Entry<String, String> entry : FILE_PATH_REPLACEMENTS.entrySet()) {
            if (result.contains(entry.getKey())) {
                result = result.replace(entry.getKey(), entry.getValue());
            }
        }

        return result;
    }

    /**
     * Apply content replacements to all files to strip prefixes from type references.
     * Matches prime-sdk-ts replaceString() behavior - uses split/join like TS.
     */
    private String applyContentReplacements(String content) {
        // Apply content replacements (matching TS replacements object)
        // Uses String.replace() which replaces ALL occurrences (like TS split().join())
        for (Map.Entry<String, String> entry : CONTENT_REPLACEMENTS.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            // Simple string replacement - replaces all occurrences
            content = content.replace(key, value);
        }
        return content;
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
