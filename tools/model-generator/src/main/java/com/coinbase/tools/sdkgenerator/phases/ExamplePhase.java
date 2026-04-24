package com.coinbase.tools.sdkgenerator.phases;

import com.coinbase.tools.sdkgenerator.CopyrightHelper;
import com.coinbase.tools.sdkgenerator.processing.GeneratorConfiguration;
import com.coinbase.tools.sdkgenerator.processing.NamingResolver;
import com.coinbase.tools.sdkgenerator.processing.ServiceDefinition;
import com.coinbase.tools.sdkgenerator.spec.ParsedOpenApiDocument;
import com.coinbase.tools.sdkgenerator.spec.ParsedOperation;
import com.coinbase.tools.sdkgenerator.spec.SdkOperationBinding;
import org.slf4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Creates minimal example .java under {@code com.coinbase.examples} when missing.
 */
public final class ExamplePhase {

    private final Logger log;
    private final ParsedOpenApiDocument doc;
    @SuppressWarnings("unused")
    private final GeneratorConfiguration cfg;
    private final Path examplesRoot;

    public ExamplePhase(
            Logger log, ParsedOpenApiDocument doc, GeneratorConfiguration cfg, Path examplesRoot) {
        this.log = log;
        this.doc = doc;
        this.cfg = cfg;
        this.examplesRoot = examplesRoot;
    }

    public void run(List<SdkOperationBinding> bindings, boolean dryRun, boolean diffMode)
            throws IOException {
        for (SdkOperationBinding b : bindings) {
            ParsedOperation op = doc.getOperationsById().get(b.getOperationId());
            if (op == null) {
                continue;
            }
            ServiceDefinition svc = NamingResolver.requireService(cfg, b.getService());
            Path p =
                    examplesRoot
                            .resolve(svc.getFolder())
                            .resolve(b.getSdkMethod() + ".java");
            if (Files.exists(p)) {
                if (!diffMode) {
                    log.info("EXAMPLE skip (exists): {}", p);
                }
                continue;
            }
            String content = emitStub(b, op, svc);
            if (dryRun) {
                log.info("EXAMPLE DRY-RUN would create {} ({} chars)", p, content.length());
                continue;
            }
            if (diffMode) {
                log.info("EXAMPLE DIFF missing: {}", p);
                continue;
            }
            Files.createDirectories(p.getParent());
            Files.writeString(p, content);
            log.info("EXAMPLE created: {}", p);
        }
    }

    private static String emitStub(
            SdkOperationBinding b, ParsedOperation op, ServiceDefinition svc) {
        String name = b.getSdkMethod();
        StringBuilder s = new StringBuilder();
        s.append(CopyrightHelper.javaFileHeader());
        s.append("package com.coinbase.examples.").append(svc.getFolder()).append(";\n\n");
        s.append("/**\n * Example stub for ")
                .append(name)
                .append(" (")
                .append(op.getHttpMethod())
                .append(" ")
                .append(op.getPath())
                .append(").\n * Replace with a real example using requests from this package.\n */\n");
        s.append("public class ").append(name).append(" {\n");
        s.append("    public static void main(String[] args) {\n");
        s.append("        System.out.println(\"TODO: implement example for ").append(name).append("\");\n");
        s.append("    }\n");
        s.append("}\n");
        return s.toString();
    }
}
