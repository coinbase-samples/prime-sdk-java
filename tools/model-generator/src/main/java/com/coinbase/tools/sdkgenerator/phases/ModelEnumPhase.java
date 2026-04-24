package com.coinbase.tools.sdkgenerator.phases;

import com.coinbase.tools.modelgenerator.OpenApiGenerator;
import com.coinbase.tools.modelgenerator.PostProcessor;
import org.slf4j.Logger;

import java.nio.file.Path;

/**
 * Runs OpenAPI Generator for models/enums then post-processes into the SDK tree.
 */
public final class ModelEnumPhase {

    private ModelEnumPhase() {}

    public static void run(Logger log, Path projectRoot, String specPath) throws Exception {
        Path generated = projectRoot.resolve("generated");
        Path modelDir = projectRoot.resolve("src/main/java/com/coinbase/prime/model");
        Path enumsDir = modelDir.resolve("enums");
        log.info("Phase: model/enum OpenAPI generation into {}", modelDir);
        OpenApiGenerator generator = new OpenApiGenerator(specPath, generated);
        generator.generateModels();
        PostProcessor postProcessor = new PostProcessor(generated, modelDir, enumsDir);
        postProcessor.processModels();
    }
}
