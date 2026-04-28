package com.coinbase.tools.sdkgenerator.spec;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Loads OpenAPI YAML and extracts {@link ParsedOperation} entries (same contract as the .NET
 * generator's SpecParser).
 */
public final class SpecParser {

    private static final String[] HTTP_VERBS = {
        "get", "post", "put", "patch", "delete", "head", "options"
    };

    private SpecParser() {}

    public static ParsedOpenApiDocument load(Path yamlPath) throws IOException {
        ObjectMapper om = new ObjectMapper(new YAMLFactory());
        try (InputStream in = Files.newInputStream(yamlPath)) {
            return load(om.readTree(in));
        }
    }

    public static ParsedOpenApiDocument load(JsonNode root) {
        Map<String, ParsedOperation> ops = new LinkedHashMap<>();
        JsonNode paths = root.path("paths");
        if (!paths.isObject()) {
            return new ParsedOpenApiDocument(root, ops);
        }
        paths.fields().forEachRemaining(
                pathEntry -> {
                    String pathKey = pathEntry.getKey();
                    JsonNode pathItem = pathEntry.getValue();
                    if (!pathItem.isObject()) {
                        return;
                    }
                    for (String methodKey : HTTP_VERBS) {
                        if (!pathItem.has(methodKey)) {
                            continue;
                        }
                        JsonNode opNode = pathItem.get(methodKey);
                        if (opNode == null || !opNode.isObject()) {
                            continue;
                        }
                        if (!opNode.has("operationId")) {
                            continue;
                        }
                        String operationId = opNode.get("operationId").asText();
                        String summary = opNode.has("summary") ? opNode.get("summary").asText() : null;

                        List<String> tags = new ArrayList<>();
                        if (opNode.has("tags") && opNode.get("tags").isArray()) {
                            for (JsonNode t : opNode.get("tags")) {
                                if (t != null && t.isTextual() && !t.asText().isEmpty()) {
                                    tags.add(t.asText());
                                }
                            }
                        }

                        List<ParsedParameter> parameters = new ArrayList<>();
                        if (opNode.has("parameters") && opNode.get("parameters").isArray()) {
                            for (JsonNode p : opNode.get("parameters")) {
                                if (p == null || !p.isObject()) {
                                    continue;
                                }
                                if (!p.has("name") || !p.has("in") || !p.has("schema")) {
                                    continue;
                                }
                                String name = p.get("name").asText();
                                String in = p.get("in").asText();
                                boolean required =
                                        p.has("required") && p.get("required").asBoolean();
                                parameters.add(
                                        new ParsedParameter(
                                                name, in, required, p.get("schema")));
                            }
                        }

                        JsonNode bodySchema = null;
                        if (opNode.has("requestBody")
                                && opNode.get("requestBody").isObject()) {
                            JsonNode rb = opNode.get("requestBody");
                            JsonNode content = rb.path("content");
                            JsonNode appJson = content.path("application/json");
                            if (appJson.isObject() && appJson.has("schema")) {
                                bodySchema = resolveSchemaNode(root, appJson.get("schema"));
                            }
                        }

                        String successRef = null;
                        List<Integer> successStatusCodes = new ArrayList<>();
                        if (opNode.has("responses") && opNode.get("responses").isObject()) {
                            JsonNode responses = opNode.get("responses");
                            for (String[] pair :
                                    new String[][] {
                                        {"200", "200"},
                                        {"201", "201"},
                                        {"202", "202"},
                                        {"204", "204"}
                                    }) {
                                String codeStr = pair[0];
                                int codeInt = Integer.parseInt(pair[1]);
                                if (!responses.has(codeStr)) {
                                    continue;
                                }
                                JsonNode resp = responses.get(codeStr);
                                if (codeInt == 204) {
                                    successStatusCodes.add(codeInt);
                                    continue;
                                }
                                if (!resp.isObject() || !resp.has("content")) {
                                    continue;
                                }
                                JsonNode respContent = resp.get("content");
                                JsonNode aj = respContent.path("application/json");
                                if (!aj.isObject() || !aj.has("schema")) {
                                    continue;
                                }
                                successStatusCodes.add(codeInt);
                                if (successRef == null) {
                                    JsonNode schemaNode = aj.get("schema");
                                    successRef = extractRef(schemaNode);
                                }
                            }
                        }

                        String extensionSdk = null;
                        if (opNode.has("x-sdk-method-name")
                                && opNode.get("x-sdk-method-name").isTextual()) {
                            String v = opNode.get("x-sdk-method-name").asText();
                            if (v != null && !v.isEmpty()) {
                                extensionSdk = v;
                            }
                        }

                        String httpMethod = methodKey.toUpperCase();
                        ops.put(
                                operationId,
                                new ParsedOperation(
                                        operationId,
                                        httpMethod,
                                        pathKey,
                                        tags,
                                        parameters,
                                        bodySchema,
                                        successRef,
                                        successStatusCodes,
                                        summary,
                                        extensionSdk));
                    }
                });
        return new ParsedOpenApiDocument(root, ops);
    }

    private static String extractRef(JsonNode schemaNode) {
        if (schemaNode != null
                && schemaNode.isObject()
                && schemaNode.has("$ref")
                && schemaNode.get("$ref").isTextual()) {
            return schemaNode.get("$ref").asText();
        }
        return null;
    }

    public static JsonNode resolveSchemaNode(JsonNode documentRoot, JsonNode schemaNode) {
        if (schemaNode == null) {
            return null;
        }
        if (schemaNode.isObject() && schemaNode.has("$ref") && schemaNode.get("$ref").isTextual()) {
            return SpecRef.resolveRef(documentRoot, schemaNode.get("$ref").asText());
        }
        return schemaNode;
    }
}
