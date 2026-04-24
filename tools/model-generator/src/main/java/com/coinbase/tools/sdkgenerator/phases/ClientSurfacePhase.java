package com.coinbase.tools.sdkgenerator.phases;

import com.coinbase.tools.sdkgenerator.processing.GeneratorConfiguration;
import com.coinbase.tools.sdkgenerator.processing.NamingResolver;
import com.coinbase.tools.sdkgenerator.processing.ServiceDefinition;
import com.coinbase.tools.sdkgenerator.processing.SharedTransforms;
import com.coinbase.tools.sdkgenerator.spec.ParsedOpenApiDocument;
import com.coinbase.tools.sdkgenerator.spec.ParsedOperation;
import com.coinbase.tools.sdkgenerator.spec.SdkOperationBinding;
import org.slf4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public final class ClientSurfacePhase {

    private final Logger log;
    private final ParsedOpenApiDocument doc;
    private final GeneratorConfiguration cfg;
    private final SharedTransforms transforms;
    private final Path primeSrcRoot;

    public ClientSurfacePhase(
            Logger log,
            ParsedOpenApiDocument doc,
            GeneratorConfiguration cfg,
            SharedTransforms transforms,
            Path primeSrcRoot) {
        this.log = log;
        this.doc = doc;
        this.cfg = cfg;
        this.transforms = transforms;
        this.primeSrcRoot = primeSrcRoot;
    }

    public void run(
            List<SdkOperationBinding> bindings, boolean dryRun, boolean diffMode) throws IOException {
        Map<String, List<ServicePhase.SdkOpPair>> byService = new LinkedHashMap<>();
        for (SdkOperationBinding b : bindings) {
            ParsedOperation op = doc.getOperationsById().get(b.getOperationId());
            if (op == null) {
                log.warn("OpenAPI spec missing operationId {}; skipping.", b.getOperationId());
                continue;
            }
            byService.computeIfAbsent(b.getService(), k -> new ArrayList<>())
                    .add(new ServicePhase.SdkOpPair(b, op));
        }
        for (String key : new ArrayList<>(byService.keySet())) {
            byService.put(key, sortOperationsForService(key, byService.get(key)));
        }

        for (Map.Entry<String, List<ServicePhase.SdkOpPair>> e :
                byService.entrySet().stream()
                        .sorted(Map.Entry.comparingByKey())
                        .collect(Collectors.toList())) {
            String serviceKey = e.getKey();
            List<ServicePhase.SdkOpPair> ops = e.getValue();
            ServiceDefinition svc = NamingResolver.requireService(cfg, serviceKey);
            Path folder = primeSrcRoot.resolve(svc.getFolder());
            for (ServicePhase.SdkOpPair pair : ops) {
                SdkOperationBinding b = pair.binding;
                if (!b.isOmitRequest()) {
                    String req = RequestPhase.emitRequest(doc, cfg, transforms, b, pair.op);
                    writeOrDiff(
                            folder.resolve(b.getSdkMethod() + "Request.java"), req, dryRun, diffMode);
                } else {
                    Path stale = folder.resolve(b.getSdkMethod() + "Request.java");
                    if (Files.exists(stale) && !dryRun && !diffMode) {
                        Files.delete(stale);
                        log.info("REQUEST deleted stale (omitRequest): {}", stale);
                    } else if (Files.exists(stale) && (dryRun || diffMode)) {
                        log.info("REQUEST stale (omitRequest) would delete: {}", stale);
                    }
                }
                String resp =
                        ResponsePhase.emitResponse(
                                doc, cfg, transforms, b, pair.op);
                writeOrDiff(
                        folder.resolve(b.getSdkMethod() + "Response.java"), resp, dryRun, diffMode);
            }
        }

        for (Map.Entry<String, List<ServicePhase.SdkOpPair>> e :
                byService.entrySet().stream()
                        .sorted(Map.Entry.comparingByKey())
                        .collect(Collectors.toList())) {
            ServiceDefinition svc = NamingResolver.requireService(cfg, e.getKey());
            Path folder = primeSrcRoot.resolve(svc.getFolder());
            String iface = ServicePhase.emitInterface(svc, e.getValue());
            String impl = ServicePhase.emitServiceImpl(cfg, svc, e.getValue());
            writeOrDiff(folder.resolve(svc.getJavaInterfaceName() + ".java"), iface, dryRun, diffMode);
            writeOrDiff(
                    folder.resolve(svc.getJavaServiceImplName() + ".java"), impl, dryRun, diffMode);
        }
    }

    private void writeOrDiff(Path path, String content, boolean dryRun, boolean diffMode)
            throws IOException {
        content = content.replace("\r\n", "\n");
        if (diffMode) {
            if (!Files.exists(path)) {
                log.info("DIFF missing file would be created: {}", path);
                return;
            }
            String existing = Files.readString(path).replace("\r\n", "\n");
            if (!existing.equals(content)) {
                log.warn("DIFF differs: {}", path);
            }
            return;
        }
        if (dryRun) {
            log.info("DRY-RUN would write {} ({} chars)", path, content.length());
            return;
        }
        Files.createDirectories(path.getParent());
        Files.writeString(path, content);
    }

    private static int httpVerbRank(String m) {
        switch (m.toUpperCase(Locale.ROOT)) {
            case "GET":
                return 0;
            case "POST":
                return 1;
            case "PUT":
                return 2;
            case "PATCH":
                return 3;
            case "DELETE":
                return 4;
            default:
                return 5;
        }
    }

    private static int pathDepth(String path) {
        if (path == null) {
            return 0;
        }
        return (int) path.chars().filter(c -> c == '/').count();
    }

    private List<ServicePhase.SdkOpPair> sortOperationsForService(
            String serviceKey, List<ServicePhase.SdkOpPair> ops) {
        List<String> order = cfg.getServiceMethodOrderOverrides().get(serviceKey);
        if (order != null && !order.isEmpty()) {
            Map<String, Integer> rank = new LinkedHashMap<>();
            for (int i = 0; i < order.size(); i++) {
                rank.put(order.get(i), i);
            }
            return ops.stream()
                    .sorted(
                            Comparator.comparing(
                                            (ServicePhase.SdkOpPair x) ->
                                                    rank.getOrDefault(
                                                            x.binding.getSdkMethod(),
                                                            Integer.MAX_VALUE))
                                    .thenComparing(x -> x.binding.getSdkMethod()))
                    .collect(Collectors.toList());
        }
        return ops.stream()
                .sorted(
                        Comparator.comparingInt(
                                        (ServicePhase.SdkOpPair x) -> httpVerbRank(x.op.getHttpMethod()))
                                .thenComparingInt(
                                        (ServicePhase.SdkOpPair x) -> pathDepth(x.op.getPath()))
                                .thenComparing((ServicePhase.SdkOpPair x) -> x.op.getPath())
                                .thenComparing((ServicePhase.SdkOpPair x) -> x.binding.getSdkMethod()))
                .collect(Collectors.toList());
    }
}
