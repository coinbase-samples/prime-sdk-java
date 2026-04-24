package com.coinbase.tools.sdkgenerator.processing;

import com.coinbase.tools.sdkgenerator.spec.SpecRef;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * OpenAPI JSON Schema → Java type strings, mirroring the .NET OpenApiSchemaCodegen.
 */
public final class OpenApiSchemaCodegen {

    public static class JavaTypeResult {
        private final String javaType;
        private final boolean needsModel;
        private final boolean needsEnum;
        private final Set<String> modelTypeNames;
        private final Set<String> enumTypeNames;

        public JavaTypeResult(
                String javaType,
                boolean needsModel,
                boolean needsEnum,
                Set<String> modelTypeNames,
                Set<String> enumTypeNames) {
            this.javaType = javaType;
            this.needsModel = needsModel;
            this.needsEnum = needsEnum;
            this.modelTypeNames = Set.copyOf(modelTypeNames);
            this.enumTypeNames = Set.copyOf(enumTypeNames);
        }

        public String getJavaType() {
            return javaType;
        }

        public boolean isNeedsModel() {
            return needsModel;
        }

        public boolean isNeedsEnum() {
            return needsEnum;
        }

        public Set<String> getModelTypeNames() {
            return modelTypeNames;
        }

        public Set<String> getEnumTypeNames() {
            return enumTypeNames;
        }
    }

    private OpenApiSchemaCodegen() {}

    public static JavaTypeResult toJavaType(
            JsonNode documentRoot, JsonNode node, SharedTransforms transforms) {
        Set<String> models = new HashSet<>();
        Set<String> enums = new HashSet<>();
        String t = mapType(documentRoot, node, transforms, models, enums);
        return new JavaTypeResult(t, !models.isEmpty(), !enums.isEmpty(), models, enums);
    }

    private static String mapType(
            JsonNode documentRoot,
            JsonNode node,
            SharedTransforms transforms,
            Set<String> modelTypes,
            Set<String> enumTypes) {
        if (node == null || node.isNull()) {
            return "Object";
        }
        if (!node.isObject()) {
            return "Object";
        }
        if (node.has("$ref") && node.get("$ref").isTextual()) {
            String r = node.get("$ref").asText();
            JsonNode resolved = SpecRef.resolveRef(documentRoot, r);
            String refName = SpecRef.getRefName(r);
            if (resolved == null || refName == null) {
                return "Object";
            }
            if (resolved.has("enum") && resolved.get("enum").isArray()) {
                String t = transforms.transformSchemaRefToJavaName(refName);
                enumTypes.add(t);
                return t;
            }
            String t = transforms.transformSchemaRefToJavaName(refName);
            modelTypes.add(t);
            return t;
        }
        if (node.has("type")) {
            String type = node.get("type").asText();
            if ("array".equals(type) && node.has("items")) {
                JsonNode items = node.get("items");
                if (items != null && items.isObject()) {
                    String matched = findMatchingNamedEnum(documentRoot, (ObjectNode) items, transforms);
                    if (matched != null) {
                        enumTypes.add(matched);
                        return matched + "[]";
                    }
                }
                String inner = mapType(documentRoot, items, transforms, modelTypes, enumTypes);
                return normalizeArrayElementType(inner) + "[]";
            }
            if ("string".equals(type)
                    && node.has("enum")
                    && node.get("enum").isArray()) {
                String matched = findMatchingNamedEnum(documentRoot, (ObjectNode) node, transforms);
                if (matched != null) {
                    enumTypes.add(matched);
                    return matched;
                }
            }
            return mapPrimitive((ObjectNode) node, type);
        }
        if (node.has("oneOf") || node.has("anyOf")) {
            return "Object";
        }
        return "Object";
    }

    private static Set<String> getInlineEnumValues(ObjectNode node) {
        if (!node.has("enum") || !node.get("enum").isArray()) {
            return new HashSet<>();
        }
        Set<String> s = new HashSet<>();
        for (JsonNode n : node.get("enum")) {
            if (n != null && n.isTextual()) {
                s.add(n.asText());
            }
        }
        return s;
    }

    private static String findMatchingNamedEnum(
            JsonNode documentRoot, ObjectNode inlineNode, SharedTransforms transforms) {
        Set<String> inlineValues = getInlineEnumValues(inlineNode);
        if (inlineValues.isEmpty()) {
            return null;
        }
        if (!documentRoot.has("components") || !documentRoot.get("components").isObject()) {
            return null;
        }
        JsonNode schemas = documentRoot.get("components").path("schemas");
        if (!schemas.isObject()) {
            return null;
        }
        Iterator<String> it = ((ObjectNode) schemas).fieldNames();
        while (it.hasNext()) {
            String key = it.next();
            JsonNode schema = schemas.get(key);
            if (schema == null
                    || !schema.isObject()
                    || !schema.has("enum")
                    || !schema.get("enum").isArray()) {
                continue;
            }
            Set<String> schemaValues = getInlineEnumValues((ObjectNode) schema);
            if (schemaValues.containsAll(inlineValues)) {
                return transforms.transformSchemaRefToJavaName(key);
            }
        }
        return null;
    }

    private static String mapPrimitive(ObjectNode mm, String type) {
        switch (type) {
            case "string":
                return "String";
            case "integer":
                if (mm.has("format")
                        && "int64".equals(mm.get("format").asText())) {
                    return "Long";
                }
                return "Integer";
            case "number":
                return "String";
            case "boolean":
                return "Boolean";
            case "object":
                return "Object";
            default:
                return "String";
        }
    }

    public static List<SchemaProperty> listProperties(
            JsonNode documentRoot, JsonNode schema, SharedTransforms transforms) {
        List<SchemaProperty> list = new ArrayList<>();
        if (schema == null
                || !schema.isObject()
                || !schema.has("properties")
                || !schema.get("properties").isObject()) {
            return list;
        }
        ObjectNode schemaObj = (ObjectNode) schema;
        ObjectNode props = (ObjectNode) schema.get("properties");
        Set<String> required = new HashSet<>();
        if (schemaObj.has("required") && schemaObj.get("required").isArray()) {
            for (JsonNode r : schemaObj.get("required")) {
                if (r != null && r.isTextual()) {
                    required.add(r.asText());
                }
            }
        }
        Iterator<Map.Entry<String, JsonNode>> it = props.fields();
        while (it.hasNext()) {
            Map.Entry<String, JsonNode> e = it.next();
            String jsonName = e.getKey();
            JsonNode pnode = e.getValue();
            String javaName = toPascalCase(jsonName);
            Set<String> model = new HashSet<>();
            Set<String> enums = new HashSet<>();
            String jt = mapType(documentRoot, pnode, transforms, model, enums);
            boolean isReq = required.contains(jsonName);
            boolean usesEnum = !enums.isEmpty();
            if (!isReq && usesEnum && !jt.endsWith("[]")) {
                jt = optionalScalarEnumJava(jt);
            }
            list.add(
                    new SchemaProperty(
                            jsonName,
                            javaName,
                            jt,
                            isReq,
                            !model.isEmpty(),
                            usesEnum,
                            model,
                            enums));
        }
        return list;
    }

    public static String toPascalCase(String snakeOrDotted) {
        if (snakeOrDotted == null) {
            return "";
        }
        String[] segments = snakeOrDotted.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (String segment : segments) {
            if (segment == null || segment.isEmpty()) {
                continue;
            }
            String[] parts = segment.split("_");
            for (String p : parts) {
                if (p == null || p.isEmpty()) {
                    continue;
                }
                sb.append(Character.toUpperCase(p.charAt(0)));
                if (p.length() > 1) {
                    sb.append(p, 1, p.length());
                }
            }
        }
        String s = sb.toString();
        return s.isEmpty() ? snakeOrDotted : s;
    }

    private static String normalizeArrayElementType(String element) {
        if ("String".equals(element)) {
            return "String";
        }
        return element;
    }

    private static String optionalScalarEnumJava(String jt) {
        if (jt.endsWith("?")) {
            return jt;
        }
        return jt; // Java: reference type already nullable; primitives need wrapper — enums are refs
    }

    public static boolean typeIsEnumRef(JsonNode documentRoot, JsonNode node) {
        if (node == null) {
            return false;
        }
        if (node.isObject() && node.has("type")) {
            String type = node.get("type").asText();
            if ("array".equals(type) && node.has("items")) {
                return typeIsEnumRef(documentRoot, node.get("items"));
            }
            if ("string".equals(type) && node.has("enum") && node.get("enum").isArray()) {
                return true;
            }
        }
        if (node.isObject() && node.has("$ref") && node.get("$ref").isTextual()) {
            String r = node.get("$ref").asText();
            JsonNode resolved = SpecRef.resolveRef(documentRoot, r);
            return resolved != null && resolved.isObject() && resolved.has("enum");
        }
        return false;
    }
}
