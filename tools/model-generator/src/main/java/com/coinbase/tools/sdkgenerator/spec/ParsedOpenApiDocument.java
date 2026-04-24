package com.coinbase.tools.sdkgenerator.spec;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * OpenAPI document root as {@link JsonNode} and parsed {@link ParsedOperation} map keyed by
 * operationId.
 */
public final class ParsedOpenApiDocument {
    private final JsonNode root;
    private final Map<String, ParsedOperation> operationsById;

    public ParsedOpenApiDocument(JsonNode root, Map<String, ParsedOperation> operationsById) {
        this.root = root;
        this.operationsById = Collections.unmodifiableMap(new LinkedHashMap<>(operationsById));
    }

    public JsonNode getRoot() {
        return root;
    }

    public Map<String, ParsedOperation> getOperationsById() {
        return operationsById;
    }
}
