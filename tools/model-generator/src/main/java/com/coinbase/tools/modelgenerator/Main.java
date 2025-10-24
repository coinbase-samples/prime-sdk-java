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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            logger.info("Coinbase Prime Java SDK Model Generator");
            logger.info("========================================");
            logger.info("Mode: FULL GENERATION (regenerates all models from OpenAPI spec)");
            logger.info("");

            // Find project root
            Path projectRoot = findProjectRoot();
            Path specPath = projectRoot.resolve("apiSpec/prime-public-spec.yaml");
            Path outputDir = projectRoot.resolve("src/main/java/com/coinbase/prime/model");
            Path enumsDir = outputDir.resolve("enums");
            Path tempDir = projectRoot.resolve("generated");

            logger.info("Project Root: {}", projectRoot);
            logger.info("OpenAPI Spec: {}", specPath);
            logger.info("Output Directory: {}", outputDir);
            logger.info("Enums Directory: {}", enumsDir);
            logger.info("Temp Directory: {}", tempDir);

            if (!specPath.toFile().exists()) {
                throw new RuntimeException("OpenAPI spec not found at: " + specPath);
            }

            // Phase 1: Generate raw models using OpenAPI Generator
            logger.info("\nPhase 1: Generating raw models with OpenAPI Generator...");
            OpenApiGenerator generator = new OpenApiGenerator(specPath, tempDir);
            generator.generateModels();

            // Phase 2: Post-process models to match existing patterns
            logger.info("\nPhase 2: Post-processing models...");
            PostProcessor postProcessor = new PostProcessor(tempDir, outputDir, enumsDir);
            postProcessor.processModels();

            logger.info("\nModel generation completed successfully!");
            logger.info("\nGenerated models are in: {}", outputDir);
            logger.info("Generated enums are in: {}", enumsDir);
            logger.info("\nNext steps:");
            logger.info("1. Review the generated models");
            logger.info("2. Run tests to ensure everything works");
            logger.info("3. Build the project: mvn clean install");

        } catch (Exception e) {
            logger.error("Error during model generation", e);
            System.exit(1);
        }
    }

    private static Path findProjectRoot() {
        Path current = Paths.get(System.getProperty("user.dir"));
        while (current != null) {
            if (current.resolve("pom.xml").toFile().exists() &&
                current.resolve("apiSpec/prime-public-spec.yaml").toFile().exists()) {
                return current;
            }
            current = current.getParent();
        }
        
        // If we can't find it, check if we're in the tools directory
        Path toolsPath = Paths.get(System.getProperty("user.dir"));
        if (toolsPath.toString().contains("tools/model-generator")) {
            return toolsPath.getParent().getParent();
        }
        
        throw new RuntimeException("Could not find project root (looking for pom.xml and apiSpec/prime-public-spec.yaml)");
    }
}