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

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import org.openapitools.codegen.*;
import org.openapitools.codegen.config.CodegenConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class OpenApiGenerator {
    private static final Logger logger = LoggerFactory.getLogger(OpenApiGenerator.class);
    
    private final Path specPath;
    private final Path outputDir;
    private final ObjectMapper objectMapper = new ObjectMapper();
    
    public OpenApiGenerator(Path specPath, Path outputDir) {
        this.specPath = specPath;
        this.outputDir = outputDir;
    }
    
    public void generateModels() throws IOException {
        Path rawOutputDir = outputDir.resolve("raw");
        
        // Clean and create output directory
        if (rawOutputDir.toFile().exists()) {
            FileUtils.deleteDirectory(rawOutputDir.toFile());
        }
        rawOutputDir.toFile().mkdirs();
        
        // Copy .openapi-generator-ignore file to output directory
        Path ignoreFile = findProjectRoot().resolve("tools/model-generator/.openapi-generator-ignore");
        if (ignoreFile.toFile().exists()) {
            Path targetIgnoreFile = rawOutputDir.resolve(".openapi-generator-ignore");
            FileUtils.copyFile(ignoreFile.toFile(), targetIgnoreFile.toFile());
            logger.info("Copied .openapi-generator-ignore to output directory");
        }
        
        // Configure OpenAPI Generator
        CodegenConfigurator configurator = new CodegenConfigurator();
        configurator.setGeneratorName("java");
        configurator.setInputSpec(specPath.toString());
        configurator.setOutputDir(rawOutputDir.toString());
        
        // Configure generation options for Java
        Map<String, Object> additionalProperties = new HashMap<>();
        additionalProperties.put("modelPackage", "com.coinbase.prime.model");
        additionalProperties.put("apiPackage", "com.coinbase.prime.api");
        additionalProperties.put("invokerPackage", "com.coinbase.prime.client");
        additionalProperties.put("groupId", "com.coinbase.prime");
        additionalProperties.put("artifactId", "prime-sdk-java");
        additionalProperties.put("artifactVersion", "1.0.0");
        additionalProperties.put("library", "native");  // Use native Java HTTP client
        additionalProperties.put("dateLibrary", "java8");  // Use Java 8 time
        additionalProperties.put("serializationLibrary", "jackson");  // Use Jackson
        additionalProperties.put("useJakartaEe", "false");
        additionalProperties.put("hideGenerationTimestamp", "true");
        additionalProperties.put("generateApiTests", "false");
        additionalProperties.put("generateModelTests", "false");
        additionalProperties.put("generateApiDocumentation", "false");
        additionalProperties.put("generateModelDocumentation", "false");
        additionalProperties.put("sourceFolder", "src/main/java");
        additionalProperties.put("useBeanValidation", "false");
        additionalProperties.put("performBeanValidation", "false");
        additionalProperties.put("generateBuilders", "false"); // We'll add our own builders
        additionalProperties.put("openApiNullable", "false");
        additionalProperties.put("enumPropertyNaming", "MACRO_CASE"); // This generates UPPERCASE_WITH_UNDERSCORES style
        
        configurator.setAdditionalProperties(additionalProperties);
        
        // Generate only models (not APIs)
        configurator.setGenerateAliasAsModel(true);
        
        // Set global properties to control what gets generated
        Map<String, String> globalProperties = new HashMap<>();
        globalProperties.put("models", "");  // Generate models
        globalProperties.put("apis", "false");  // Don't generate APIs
        globalProperties.put("supportingFiles", "false");  // Don't generate supporting files
        configurator.setGlobalProperties(globalProperties);
        
        // Run the generator
        logger.info("Running OpenAPI Generator...");
        final ClientOptInput input = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        generator.opts(input).generate();
        
        logger.info("Raw models generated in: {}", rawOutputDir);
    }
    
    private Path findProjectRoot() {
        Path current = specPath.getParent();
        while (current != null) {
            if (current.resolve("pom.xml").toFile().exists() &&
                current.resolve("apiSpec/prime-public-spec.yaml").toFile().exists()) {
                return current;
            }
            current = current.getParent();
        }
        throw new RuntimeException("Could not find project root");
    }
}