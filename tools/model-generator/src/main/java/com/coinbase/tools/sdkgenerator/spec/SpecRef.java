package com.coinbase.tools.sdkgenerator.spec;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.Iterator;
import java.util.Map;

/**
 * Resolves <code>#/components/schemas/Name</code> references in the OpenAPI document.
 */
public final class SpecRef {
    private static final String PREFIX = "#/components/schemas/";

    private SpecRef() {}

    public static JsonNode resolveRef(JsonNode documentRoot, String ref) {
        if (ref == null || !ref.startsWith(PREFIX)) {
            return null;
        }
        String name = ref.substring(PREFIX.length());
        JsonNode components = documentRoot.path("components");
        if (!components.isObject()) {
            return null;
        }
        JsonNode schemas = components.path("schemas");
        if (!schemas.isObject()) {
            return null;
        }
        JsonNode schema = null;
        Iterator<Map.Entry<String, JsonNode>> it = schemas.fields();
        while (it.hasNext()) {
            Map.Entry<String, JsonNode> e = it.next();
            if (name.equals(e.getKey())) {
                schema = e.getValue();
                break;
            }
        }
        return schema;
    }

    public static String getRefName(String ref) {
        if (ref == null || !ref.startsWith(PREFIX)) {
            return null;
        }
        return ref.substring(PREFIX.length());
    }
}
