package com.coinbase.tools.sdkgenerator.processing;

import com.coinbase.tools.sdkgenerator.spec.ParsedOpenApiDocument;
import com.coinbase.tools.sdkgenerator.spec.ParsedOperation;
import com.coinbase.tools.sdkgenerator.spec.ParsedParameter;
import com.coinbase.tools.sdkgenerator.spec.SdkOperationBinding;
import com.coinbase.tools.sdkgenerator.spec.SpecResponseSchema;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class OperationBindingGenerator {

    private static final String OPERATION_ID_PREFIX = "PrimeRESTAPI_";

    private OperationBindingGenerator() {}

    public static List<SdkOperationBinding> deriveAll(
            ParsedOpenApiDocument doc, GeneratorConfiguration cfg) {
        SharedTransforms transforms = new SharedTransforms(cfg);
        List<ParsedOperation> sorted = new ArrayList<>(doc.getOperationsById().values());
        sorted.sort(Comparator.comparing(ParsedOperation::getOperationId));
        List<SdkOperationBinding> list = new ArrayList<>();
        for (ParsedOperation op : sorted) {
            list.add(deriveOne(doc.getRoot(), cfg, transforms, op));
        }
        return list;
    }

    private static SdkOperationBinding deriveOne(
            JsonNode root,
            GeneratorConfiguration cfg,
            SharedTransforms transforms,
            ParsedOperation op) {
        String sdkMethod = deriveSdkMethod(op, transforms);
        String service = resolveServiceKey(cfg, op);
        boolean omitRequest = deriveOmitRequest(op);
        Map<String, String> paramOverrides = deriveParamTypeOverrides(root, transforms, op);
        boolean forcePaginated = deriveForcePaginated(root, op);

        SdkOperationBinding b = new SdkOperationBinding();
        b.setOperationId(op.getOperationId());
        b.setSdkMethod(sdkMethod);
        b.setService(service);
        b.setOmitRequest(omitRequest);
        b.setForcePaginated(forcePaginated);
        b.getParamTypeOverrides().putAll(paramOverrides);
        return b;
    }

    private static String deriveSdkMethod(ParsedOperation op, SharedTransforms transforms) {
        if (op.getExtensionSdkMethodName() != null
                && !op.getExtensionSdkMethodName().trim().isEmpty()) {
            String ext = op.getExtensionSdkMethodName().trim();
            ext = transforms.normalizeAcronyms(ext);
            return transforms.applyWeb3ToOnchainName(ext);
        }
        String name = op.getOperationId();
        if (name.startsWith(OPERATION_ID_PREFIX)) {
            name = name.substring(OPERATION_ID_PREFIX.length());
        }
        name = transforms.normalizeAcronyms(name);
        name = transforms.applyWeb3ToOnchainName(name);
        if ("GET".equals(op.getHttpMethod())
                && op.getSummary() != null
                && op.getSummary().startsWith("List ")
                && name.startsWith("Get")) {
            name = "List" + name.substring(3);
        }
        name = applyPortfolioPathPrefix(name, op);
        return name;
    }

    private static final java.util.Set<String> PORTFOLIO_SCOPED_GET_SUFFIXES =
            new java.util.HashSet<>(java.util.Arrays.asList("BuyingPower", "WithdrawalPower"));

    private static String applyPortfolioPathPrefix(String name, ParsedOperation op) {
        String path = op.getPath();
        if (path == null
                || (!path.contains("{portfolio_id}") && !path.contains("/portfolios/"))) {
            return name;
        }
        if (!name.startsWith("Get")
                || name.contains("Portfolio")
                || name.length() <= 3) {
            return name;
        }
        String rest = name.substring(3);
        if (!PORTFOLIO_SCOPED_GET_SUFFIXES.contains(rest)) {
            return name;
        }
        return "GetPortfolio" + rest;
    }

    private static String resolveServiceKey(GeneratorConfiguration cfg, ParsedOperation op) {
        for (String tag : op.getTags()) {
            if (cfg.getTagToFolder().containsKey(tag)) {
                String folder = cfg.getTagToFolder().get(tag);
                if (cfg.getServices().containsKey(folder)) {
                    return folder;
                }
            }
        }
        throw new IllegalStateException(
                "Operation '"
                        + op.getOperationId()
                        + "' has no tag mapped in tagToFolder (tags: "
                        + String.join(", ", op.getTags())
                        + ").");
    }

    private static boolean deriveOmitRequest(ParsedOperation op) {
        return op.getParameters().isEmpty() && op.getRequestBodyJsonSchema() == null;
    }

    private static boolean deriveForcePaginated(JsonNode root, ParsedOperation op) {
        return "GET".equals(op.getHttpMethod())
                && SpecResponseSchema.responseSchemaSuggestsPagination(root, op);
    }

    private static Map<String, String> deriveParamTypeOverrides(
            JsonNode root, SharedTransforms transforms, ParsedOperation op) {
        Map<String, String> result = new HashMap<>();
        for (ParsedParameter p : op.getParameters()) {
            if (!"query".equals(p.getIn())) {
                continue;
            }
            if (!"symbols".equals(p.getName())) {
                continue;
            }
            JsonNode schema = p.getSchema();
            if (schema == null || !schema.isObject()) {
                continue;
            }
            if (!schema.has("type") || !"string".equals(schema.get("type").asText())) {
                continue;
            }
            OpenApiSchemaCodegen.JavaTypeResult def =
                    OpenApiSchemaCodegen.toJavaType(root, schema, transforms);
            if (!"String[]".equals(def.getJavaType())) {
                result.put("symbols", "String[]");
            }
        }
        return result;
    }
}
