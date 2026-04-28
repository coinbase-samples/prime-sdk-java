package com.coinbase.tools.sdkgenerator.spec;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.Iterator;
import java.util.Map;

/**
 * Heuristics for pagination detection from success response schemas.
 */
public final class SpecResponseSchema {

    private static final String[] PAGINATION_PROPERTY_NAMES = {
        "pagination", "has_next", "hasNext", "next_cursor", "nextCursor", "cursor"
    };

    private SpecResponseSchema() {}

    public static boolean responseSchemaSuggestsPagination(JsonNode root, ParsedOperation op) {
        JsonNode resolved = tryResolveSuccessResponseSchema(root, op);
        if (resolved == null) {
            return false;
        }
        return schemaNodeSuggestsPagination(root, resolved);
    }

    public static JsonNode tryResolveSuccessResponseSchema(JsonNode root, ParsedOperation op) {
        if (op.getSuccessResponseSchemaRef() == null
                || op.getSuccessResponseSchemaRef().isEmpty()) {
            return null;
        }
        JsonNode node = SpecRef.resolveRef(root, op.getSuccessResponseSchemaRef());
        if (node == null) {
            return null;
        }
        return unwrapSchemaObject(root, node);
    }

    private static JsonNode unwrapSchemaObject(JsonNode root, JsonNode schema) {
        if (schema == null
                || !schema.isObject()
                || !schema.has("allOf")
                || !schema.get("allOf").isArray()) {
            return schema;
        }
        for (JsonNode child : schema.get("allOf")) {
            if (child == null || !child.isObject()) {
                continue;
            }
            JsonNode inner =
                    child.has("$ref")
                            ? SpecRef.resolveRef(root, child.get("$ref").asText())
                            : child;
            if (inner != null && inner.isObject() && inner.has("properties")) {
                return inner;
            }
        }
        return schema;
    }

    private static boolean schemaNodeSuggestsPagination(JsonNode root, JsonNode schema) {
        if (schema == null
                || !schema.isObject()
                || !schema.has("properties")
                || !schema.get("properties").isObject()) {
            return false;
        }
        JsonNode props = schema.get("properties");
        for (String hint : PAGINATION_PROPERTY_NAMES) {
            Iterator<String> it = props.fieldNames();
            boolean has = false;
            while (it.hasNext()) {
                if (hint.equals(it.next())) {
                    has = true;
                    break;
                }
            }
            if (!has) {
                continue;
            }
            if ("pagination".equals(hint)) {
                JsonNode propSchema = null;
                Iterator<Map.Entry<String, JsonNode>> pIt = props.fields();
                while (pIt.hasNext()) {
                    Map.Entry<String, JsonNode> e = pIt.next();
                    if (hint.equals(e.getKey())) {
                        propSchema = e.getValue();
                        break;
                    }
                }
                if (propSchema != null
                        && propSchema.isObject()
                        && propSchema.has("$ref")
                        && propSchema.get("$ref").isTextual()
                        && propSchema
                                .get("$ref")
                                .asText()
                                .contains("PaginatedResponse")) {
                    return true;
                }
            } else if ("has_next".equals(hint)
                    || "next_cursor".equals(hint)
                    || "cursor".equals(hint)
                    || "hasNext".equals(hint)
                    || "nextCursor".equals(hint)) {
                return true;
            }
        }
        return false;
    }
}
