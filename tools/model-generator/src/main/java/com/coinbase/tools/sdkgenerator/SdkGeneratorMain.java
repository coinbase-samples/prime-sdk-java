package com.coinbase.tools.sdkgenerator;

import com.coinbase.tools.sdkgenerator.phases.ClientSurfacePhase;
import com.coinbase.tools.sdkgenerator.phases.ExamplePhase;
import com.coinbase.tools.sdkgenerator.phases.FactoryPhase;
import com.coinbase.tools.sdkgenerator.phases.ModelEnumPhase;
import com.coinbase.tools.sdkgenerator.processing.GeneratorConfiguration;
import com.coinbase.tools.sdkgenerator.processing.OperationBindingValidator;
import com.coinbase.tools.sdkgenerator.processing.SharedTransforms;
import com.coinbase.tools.sdkgenerator.processing.SpecAnalyzer;
import com.coinbase.tools.sdkgenerator.spec.ParsedOpenApiDocument;
import com.coinbase.tools.sdkgenerator.spec.SdkOperationBinding;
import com.coinbase.tools.sdkgenerator.spec.SpecParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Holistic Prime Java SDK generator: models, enums, client surface, factory, examples.
 */
public final class SdkGeneratorMain {

    private static final Logger log = LoggerFactory.getLogger(SdkGeneratorMain.class);

    private SdkGeneratorMain() {}

    public static void main(String[] args) throws Exception {
        boolean dryRun = java.util.Arrays.asList(args).contains("--dry-run");
        boolean diffMode = java.util.Arrays.asList(args).contains("--diff");

        log.info("Coinbase Prime Java SDK Generator");
        log.info("==================================");
        if (dryRun) {
            log.info("Mode: DRY-RUN (no files written)");
        } else if (diffMode) {
            log.info("Mode: DIFF (compare to existing files)");
        } else {
            log.info("Mode: WRITE (full generation)");
        }

        Path projectRoot = GeneratorPaths.findProjectRoot();
        GeneratorConfiguration cfg = GeneratorConfiguration.load(projectRoot);
        SharedTransforms transforms = new SharedTransforms(cfg);

        Path specPath = projectRoot.resolve("generated").resolve("openapi.yaml");
        Files.createDirectories(specPath.getParent());
        log.info("Downloading OpenAPI spec from {} to {}...", cfg.getSpecUrl(), specPath);
        HttpClient http = HttpClient.newHttpClient();
        HttpRequest req =
                HttpRequest.newBuilder(URI.create(cfg.getSpecUrl()))
                        .GET()
                        .build();
        HttpResponse<String> res = http.send(req, HttpResponse.BodyHandlers.ofString());
        Files.writeString(specPath, res.body());

        log.info("Parsing OpenAPI YAML for client surface...");
        ParsedOpenApiDocument document = SpecParser.load(specPath);
        SpecAnalyzer.apply(document, cfg, log);

        if (!dryRun && !diffMode) {
            ModelEnumPhase.run(log, projectRoot, specPath.toString());
        } else {
            log.info("Skipping model/enum CLI phase (--dry-run or --diff).");
        }

        GeneratorConfiguration.OperationBindingMergeResult merge =
                GeneratorConfiguration.mergeOperationBindings(document, cfg, projectRoot);
        OperationBindingValidator.validateOperationBindings(log, document, merge);
        List<SdkOperationBinding> operations = merge.getMerged();

        Path primeRoot = projectRoot.resolve("src/main/java/com/coinbase/prime");
        ClientSurfacePhase client =
                new ClientSurfacePhase(log, document, cfg, transforms, primeRoot);
        client.run(operations, dryRun, diffMode);

        Path examplesRoot = projectRoot.resolve("src/main/java/com/coinbase/examples");
        ExamplePhase examples = new ExamplePhase(log, document, cfg, examplesRoot);
        examples.run(operations, dryRun, diffMode);

        String factory = FactoryPhase.emit(cfg);
        Path factoryPath =
                projectRoot.resolve("src/main/java/com/coinbase/prime/factory/PrimeServiceFactory.java");
        if (diffMode) {
            if (!Files.exists(factoryPath)) {
                log.info("DIFF missing factory would be created: {}", factoryPath);
            } else {
                String existing = Files.readString(factoryPath).replace("\r\n", "\n");
                if (!existing.equals(factory.replace("\r\n", "\n"))) {
                    log.warn("DIFF differs: {}", factoryPath);
                }
            }
        } else if (dryRun) {
            log.info("DRY-RUN would write {} ({} chars)", factoryPath, factory.length());
        } else {
            Files.createDirectories(factoryPath.getParent());
            Files.writeString(factoryPath, factory);
        }

        log.info("");
        log.info("Holistic generation finished.");
        if (!dryRun && !diffMode) {
            log.info("Next: mvn clean install (from repository root)");
        }
    }
}
