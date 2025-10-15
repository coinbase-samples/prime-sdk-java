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

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            // Parse command line arguments
            boolean updateAll = false;
            boolean fullRegenerate = false;
            
            for (String arg : args) {
                if ("--update-all".equals(arg)) {
                    updateAll = true;
                } else if ("--full-regenerate".equals(arg)) {
                    fullRegenerate = true;
                    updateAll = true; // Full regenerate implies update all
                }
            }
            
            logger.info("Coinbase Prime Java SDK Model Generator");
            logger.info("========================================");
            String mode = fullRegenerate ? "FULL REGENERATE (delete and regenerate everything)" :
                         updateAll ? "UPDATE ALL (regenerate everything)" : 
                         "INCREMENTAL (new models only)";
            logger.info("Mode: {}", mode);
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

            // Phase 0: Delete existing models and enums if in full regenerate mode
            if (fullRegenerate) {
                logger.info("\nPhase 0: Deleting existing models and enums...");
                deleteExistingModelsAndEnums(outputDir, enumsDir);
            }

            // Phase 1: Generate raw models using OpenAPI Generator
            logger.info("\nPhase 1: Generating raw models with OpenAPI Generator...");
            OpenApiGenerator generator = new OpenApiGenerator(specPath, tempDir);
            generator.generateModels();

            // Phase 2: Post-process models to match existing patterns
            logger.info("\nPhase 2: Post-processing models...");
            PostProcessor postProcessor = new PostProcessor(tempDir, outputDir, enumsDir, updateAll);
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

    /**
     * Deletes all existing models and enums from the output directories.
     * This is used in full regeneration mode to ensure a clean slate.
     * 
     * @param outputDir The directory containing model classes
     * @param enumsDir The directory containing enum classes
     * @throws IOException If there's an error deleting files
     */
    private static void deleteExistingModelsAndEnums(Path outputDir, Path enumsDir) throws IOException {
        AtomicInteger deletedModels = new AtomicInteger(0);
        AtomicInteger deletedEnums = new AtomicInteger(0);
        
        // Delete all Java files in the models directory (but not the enums subdirectory)
        if (Files.exists(outputDir)) {
            Files.walkFileTree(outputDir, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                    // Skip the enums directory - we'll handle it separately
                    if (dir.equals(enumsDir)) {
                        return FileVisitResult.SKIP_SUBTREE;
                    }
                    return FileVisitResult.CONTINUE;
                }
                
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    if (file.toString().endsWith(".java")) {
                        logger.info("  Deleting model: {}", file.getFileName());
                        Files.delete(file);
                        deletedModels.incrementAndGet();
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
        }
        
        // Delete all Java files in the enums directory
        if (Files.exists(enumsDir)) {
            Files.walkFileTree(enumsDir, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    if (file.toString().endsWith(".java")) {
                        logger.info("  Deleting enum: {}", file.getFileName());
                        Files.delete(file);
                        deletedEnums.incrementAndGet();
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
        }
        
        logger.info("Deleted {} model files and {} enum files", deletedModels.get(), deletedEnums.get());
        logger.info("Ready for full regeneration");
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