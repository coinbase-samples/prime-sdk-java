/*
 * Copyright 2025-present Coinbase Global, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.coinbase.tools.modelgenerator;

import com.fasterxml.jackson.databind.JsonNode;
import com.palantir.javapoet.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.lang.model.element.Modifier;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ModelTransformer {
    private static final Logger logger = LoggerFactory.getLogger(ModelTransformer.class);
    
    // Cache of available enum types from the enums directory
    private static Map<String, String> availableEnums = null;
    
    // Common field name patterns that typically use enums
    private static final Set<String> ENUM_FIELD_NAMES = new HashSet<>(Arrays.asList(
        "type", "status", "side", "state", "category", "visibility", 
        "level", "action", "role", "permission"
    ));
    
    private static final String LICENSE_HEADER = 
        "/*\n" +
        " * Copyright 2025-present Coinbase Global, Inc.\n" +
        " *\n" +
        " *  Licensed under the Apache License, Version 2.0 (the \"License\");\n" +
        " *  you may not use this file except in compliance with the License.\n" +
        " *  You may obtain a copy of the License at\n" +
        " *\n" +
        " *  http://www.apache.org/licenses/LICENSE-2.0\n" +
        " *\n" +
        " *  Unless required by applicable law or agreed to in writing, software\n" +
        " *  distributed under the License is distributed on an \"AS IS\" BASIS,\n" +
        " *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n" +
        " *  See the License for the specific language governing permissions and\n" +
        " *  limitations under the License.\n" +
        " */";
    
    public String transformEnum(String content) {
        // Remove any existing license headers
        content = removeLicenseHeader(content);
        
        // Simplify enum by removing unnecessary value fields and boilerplate
        content = simplifyEnum(content);
        
        // Transform enum values to uppercase with underscores
        content = transformEnumValues(content);
        
        // Add proper license header
        return LICENSE_HEADER + "\n\n" + content.trim();
    }
    
    /**
     * Simplifies enum by removing unnecessary value fields, constructors,
     * and Jackson annotations. Creates a clean enum with just constants.
     */
    private String simplifyEnum(String content) {
        // Enums should always be in the enums package
        String packageDeclaration = "package com.coinbase.prime.model.enums;";
        
        // Extract enum name
        String enumName = "";
        Pattern enumNamePattern = Pattern.compile("public\\s+enum\\s+(\\w+)");
        Matcher enumNameMatcher = enumNamePattern.matcher(content);
        if (enumNameMatcher.find()) {
            enumName = enumNameMatcher.group(1);
        }
        
        // Extract enum constants (looking for the pattern: CONSTANT_NAME("value"))
        List<String> enumConstants = new ArrayList<>();
        Pattern enumConstantPattern = Pattern.compile("([A-Z][A-Z0-9_]*)\\s*\\(\\s*\"[^\"]*\"\\s*\\)");
        Matcher enumConstantMatcher = enumConstantPattern.matcher(content);
        while (enumConstantMatcher.find()) {
            enumConstants.add(enumConstantMatcher.group(1));
        }
        
        // If no constants found with values, try simple pattern (just constant names)
        if (enumConstants.isEmpty()) {
            Pattern simpleConstantPattern = Pattern.compile("^\\s*([A-Z][A-Z0-9_]*)\\s*[,;]?\\s*$", Pattern.MULTILINE);
            Matcher simpleConstantMatcher = simpleConstantPattern.matcher(content);
            while (simpleConstantMatcher.find()) {
                String constant = simpleConstantMatcher.group(1).trim();
                // Filter out keywords and common method names
                if (!constant.isEmpty() && 
                    !constant.equals("STRING") && 
                    !constant.equals("VALUE") &&
                    !content.contains("public static " + constant)) {
                    enumConstants.add(constant);
                }
            }
        }
        
        if (enumConstants.isEmpty() || enumName.isEmpty()) {
            // If we can't parse it, return as-is
            logger.warn("Could not parse enum for simplification, returning original");
            return content;
        }
        
        // Build simplified enum
        StringBuilder result = new StringBuilder();
        result.append(packageDeclaration).append("\n\n");
        result.append("public enum ").append(enumName).append(" {\n");
        
        for (int i = 0; i < enumConstants.size(); i++) {
            result.append("    ").append(enumConstants.get(i));
            if (i < enumConstants.size() - 1) {
                result.append(",");
            }
            result.append("\n");
        }
        
        result.append("}\n");
        
        return result.toString();
    }
    
    public String transformModel(String content, JsonNode schema) {
        try {
            return transformModelWithJavaPoet(content, schema);
        } catch (Exception e) {
            logger.error("Error transforming model with JavaPoet, falling back to basic transform", e);
            return basicTransform(content);
        }
    }
    
    /**
     * Transform model using JavaPoet for proper code generation
     */
    private String transformModelWithJavaPoet(String content, JsonNode schema) throws IOException {
        // Parse the model information from OpenAPI-generated content
        ModelInfo info = parseModelInfo(content, schema);

        if (info.className == null || info.className.isEmpty()) {
            throw new IOException("Could not extract class name from content");
        }

        // Build the complete class using JavaPoet
        TypeSpec.Builder classBuilder = TypeSpec.classBuilder(info.className)
                .addModifiers(Modifier.PUBLIC);

        // Add fields with annotations
        for (FieldInfo field : info.fields) {
            FieldSpec.Builder fieldBuilder = FieldSpec.builder(field.type, field.name, Modifier.PRIVATE);

            // Add Javadoc comment if description is available
            if (field.description != null && !field.description.isEmpty()) {
                fieldBuilder.addJavadoc(field.description + "\n");
            }

            // Add @JsonProperty annotation if needed
            if (field.jsonProperty != null && !field.jsonProperty.equals(field.name)) {
                fieldBuilder.addAnnotation(
                    AnnotationSpec.builder(ClassName.get("com.fasterxml.jackson.annotation", "JsonProperty"))
                        .addMember("value", "$S", field.jsonProperty)
                        .build()
                );
            }

            classBuilder.addField(fieldBuilder.build());
        }

        // Add no-arg constructor
        classBuilder.addMethod(MethodSpec.constructorBuilder()
                .addModifiers(Modifier.PUBLIC)
                .build());

        // Add Builder constructor
        classBuilder.addMethod(generateBuilderConstructor(info));

        // Add getters
        for (FieldInfo field : info.fields) {
            classBuilder.addMethod(generateGetter(field));
        }

        // Add setters
        for (FieldInfo field : info.fields) {
            classBuilder.addMethod(generateSetter(field));
        }

        // Add Builder inner class
        classBuilder.addType(generateBuilderClass(info));

        // Generate the Java file
        JavaFile javaFile = JavaFile.builder(info.packageName, classBuilder.build())
                .addFileComment("Copyright 2025-present Coinbase Global, Inc.\n\n" +
                        " Licensed under the Apache License, Version 2.0 (the \"License\");\n" +
                        " you may not use this file except in compliance with the License.\n" +
                        " You may obtain a copy of the License at\n\n" +
                        "     http://www.apache.org/licenses/LICENSE-2.0\n\n" +
                        " Unless required by applicable law or agreed to in writing, software\n" +
                        " distributed under the License is distributed on an \"AS IS\" BASIS,\n" +
                        " WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n" +
                        " See the License for the specific language governing permissions and\n" +
                        " limitations under the License.")
                .indent("    ")
                .skipJavaLangImports(true)
                .build();

        // Convert to string and fix the license header format
        String generated = javaFile.toString();

        // Replace JavaPoet's comment format with proper license header
        generated = generated.replaceFirst("/\\*\\n \\* Copyright", "/*\n * Copyright");

        return generated;
    }
    
    private String basicTransform(String content) {
        content = removeLicenseHeader(content);
        content = addBuilderPattern(content);
        return LICENSE_HEADER + "\n\n" + content.trim();
    }
    
    private String enhancedBasicTransform(String content, JsonNode schema) {
        // Remove existing headers and imports
        content = removeLicenseHeader(content);
        
        // Extract class information
        String className = extractClassName(content);
        
        // Parse the content to extract fields and methods
        List<String> lines = Arrays.asList(content.split("\n"));
        StringBuilder result = new StringBuilder();
        
        // Add license header
        result.append(LICENSE_HEADER).append("\n\n");
        
        // Add package
        for (String line : lines) {
            if (line.startsWith("package ")) {
                result.append(line).append("\n\n");
                break;
            }
        }
        
        // Collect and add imports
        Set<String> imports = new TreeSet<>();  // TreeSet for sorted imports
        boolean inClass = false;
        
        for (String line : lines) {
            if (line.startsWith("import ")) {
                imports.add(line);
            } else if (line.contains("public class ") || line.contains("public enum ")) {
                inClass = true;
                break;
            }
        }
        
        // Add standard imports if needed
        boolean hasJsonProperty = content.contains("@JsonProperty");
        if (hasJsonProperty) {
            imports.add("import com.fasterxml.jackson.annotation.JsonProperty;");
        }
        
        // Add enum imports - scan for enum types in the field declarations
        Pattern enumPattern = Pattern.compile("private\\s+([A-Z][A-Za-z0-9_]*(?:Category|Type|Status|State))\\s+");
        Matcher enumMatcher = enumPattern.matcher(content);
        while (enumMatcher.find()) {
            String enumType = enumMatcher.group(1);
            imports.add("import com.coinbase.prime.model.enums." + enumType + ";");
        }
        
        // Write imports
        for (String imp : imports) {
            result.append(imp).append("\n");
        }
        if (!imports.isEmpty()) {
            result.append("\n");
        }
        
        // Process the class content
        boolean foundClass = false;
        boolean inFields = false;
        boolean addedConstructors = false;
        int braceLevel = 0;
        
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i).trim();
            
            if (!foundClass && (line.startsWith("public class ") || line.startsWith("public enum "))) {
                foundClass = true;
                result.append(line).append("\n");
                if (line.contains("{")) braceLevel++;
                continue;
            }
            
            if (!foundClass) continue;
            
            // Track brace level
            for (char c : line.toCharArray()) {
                if (c == '{') braceLevel++;
                if (c == '}') braceLevel--;
            }
            
            // Add constructors after fields, before getters/setters
            if (!addedConstructors && !inFields && (line.startsWith("public ") && (line.contains(" get") || line.contains(" set") || line.contains(" is")))) {
                // Add default constructor
                result.append("\n    public ").append(className).append("() {\n    }\n");
                
                // Add builder constructor
                result.append("\n    public ").append(className).append("(Builder builder) {\n");
                
                // Extract fields and add assignments
                Pattern fieldPattern = Pattern.compile("private\\s+([\\w<>\\[\\]]+)\\s+(\\w+);");
                Matcher fieldMatcher = fieldPattern.matcher(content);
                while (fieldMatcher.find()) {
                    String fieldName = fieldMatcher.group(2);
                    result.append("        this.").append(fieldName).append(" = builder.").append(fieldName).append(";\n");
                }
                
                result.append("    }\n");
                addedConstructors = true;
            }
            
            // Check if we're in the fields section
            if (line.startsWith("private ") && line.endsWith(";")) {
                inFields = true;
                
                // Check if previous line has @JsonProperty
                String fieldLine = lines.get(i);
                if (i > 0 && lines.get(i-1).trim().startsWith("@JsonProperty")) {
                    result.append("    ").append(lines.get(i-1).trim()).append("\n");
                }
                result.append("    ").append(fieldLine.trim()).append("\n");
            } else if (inFields && !line.startsWith("private ")) {
                inFields = false;
            }
            
            // Add other lines (methods, etc)
            if (!line.startsWith("private ") || !line.endsWith(";")) {
                if (!line.startsWith("import ") && !line.startsWith("package ")) {
                    // Add proper indentation
                    if (braceLevel > 0 && !line.isEmpty() && !line.equals("}")) {
                        result.append("    ");
                    }
                    if (braceLevel > 1 && !line.startsWith("public") && !line.startsWith("private")) {
                        result.append("    ");
                    }
                    result.append(line).append("\n");
                }
            }
        }
        
        // Add Builder class if not present
        if (!content.contains("public static class Builder")) {
            result.append(addBuilderClass(className, content));
        }
        
        return result.toString();
    }
    
    private ModelInfo parseModelInfo(String content, JsonNode schema) {
        ModelInfo info = new ModelInfo();
        
        // Extract package name
        Pattern packagePattern = Pattern.compile("package\\s+([^;]+);");
        Matcher packageMatcher = packagePattern.matcher(content);
        if (packageMatcher.find()) {
            info.packageName = packageMatcher.group(1);
        }
        
        // Extract class name
        Pattern classPattern = Pattern.compile("public\\s+class\\s+(\\w+)");
        Matcher classMatcher = classPattern.matcher(content);
        if (classMatcher.find()) {
            info.className = classMatcher.group(1);
        }
        
        // Build a map of field descriptions from the schema
        Map<String, String> fieldDescriptions = new HashMap<>();
        if (schema != null && schema.has("properties")) {
            JsonNode properties = schema.get("properties");
            properties.fieldNames().forEachRemaining(fieldName -> {
                JsonNode property = properties.get(fieldName);
                String description = null;
                
                // Check for 'description' first, then 'title'
                if (property.has("description")) {
                    description = property.get("description").asText();
                } else if (property.has("title")) {
                    description = property.get("title").asText();
                }
                
                if (description != null && !description.isEmpty()) {
                    fieldDescriptions.put(fieldName, description);
                }
            });
        }
        
        // Extract fields with better annotation detection
        String[] lines = content.split("\n");
        String pendingJsonProperty = null;
        
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i].trim();
            
            // Check for @JsonProperty annotation
            if (line.startsWith("@JsonProperty")) {
                Pattern jsonPropertyPattern = Pattern.compile("@JsonProperty\\((?:value\\s*=\\s*)?\"([^\"]+)\"\\)");
                Matcher jsonPropertyMatcher = jsonPropertyPattern.matcher(line);
                if (jsonPropertyMatcher.find()) {
                    pendingJsonProperty = jsonPropertyMatcher.group(1);
                }
                continue;
            }
            
            // Check for field declaration
            Pattern fieldPattern = Pattern.compile("private\\s+([\\w<>\\[\\],\\s?]+)\\s+(\\w+);");
            Matcher fieldMatcher = fieldPattern.matcher(line);
            if (fieldMatcher.find()) {
                FieldInfo field = new FieldInfo();
                String typeString = fieldMatcher.group(1).trim();
                String fieldName = fieldMatcher.group(2);
                
                // Use intelligent type resolution to potentially replace String with enum
                field.type = intelligentTypeResolution(typeString, fieldName);
                field.name = fieldName;
                field.jsonProperty = pendingJsonProperty;
                
                // Look up description from schema using the JSON property name if available,
                // otherwise use the field name
                String lookupKey = pendingJsonProperty != null ? pendingJsonProperty : fieldName;
                field.description = fieldDescriptions.get(lookupKey);
                
                info.fields.add(field);
                pendingJsonProperty = null; // Reset after use
            }
        }
        
        return info;
    }
    
    private TypeName parseType(String typeString) {
        // Clean up whitespace
        typeString = typeString.trim();
        
        // Handle arrays
        if (typeString.endsWith("[]")) {
            String componentType = typeString.substring(0, typeString.length() - 2).trim();
            return ArrayTypeName.of(parseType(componentType));
        }
        
        // Handle generics (including nested generics like Map<String, List<String>>)
        if (typeString.contains("<")) {
            int genericStart = typeString.indexOf('<');
            String rawType = typeString.substring(0, genericStart).trim();
            String genericContent = typeString.substring(genericStart + 1, typeString.lastIndexOf('>')).trim();
            
            ClassName raw = parseClassName(rawType);
            
            // Handle multiple generic parameters (e.g., Map<K, V>)
            if (genericContent.contains(",") && !genericContent.contains("<")) {
                String[] genericTypes = genericContent.split(",");
                TypeName[] typeNames = new TypeName[genericTypes.length];
                for (int i = 0; i < genericTypes.length; i++) {
                    typeNames[i] = parseType(genericTypes[i].trim());
                }
                return ParameterizedTypeName.get(raw, typeNames);
            } else {
                // Single generic parameter or nested generic
                TypeName generic = parseType(genericContent);
                return ParameterizedTypeName.get(raw, generic);
            }
        }
        
        // Handle primitives
        switch (typeString) {
            case "int": return TypeName.INT;
            case "long": return TypeName.LONG;
            case "double": return TypeName.DOUBLE;
            case "float": return TypeName.FLOAT;
            case "boolean": return TypeName.BOOLEAN;
            case "byte": return TypeName.BYTE;
            case "short": return TypeName.SHORT;
            case "char": return TypeName.CHAR;
            default: return parseClassName(typeString);
        }
    }
    
    private ClassName parseClassName(String name) {
        // Common Java types
        switch (name) {
            case "String": return ClassName.get(String.class);
            case "Integer": return ClassName.get(Integer.class);
            case "Long": return ClassName.get(Long.class);
            case "Double": return ClassName.get(Double.class);
            case "Float": return ClassName.get(Float.class);
            case "Boolean": return ClassName.get(Boolean.class);
            case "List": return ClassName.get(List.class);
            case "Map": return ClassName.get(Map.class);
            case "Set": return ClassName.get(Set.class);
            // Java time types
            case "OffsetDateTime": return ClassName.get("java.time", "OffsetDateTime");
            case "LocalDate": return ClassName.get("java.time", "LocalDate");
            case "LocalDateTime": return ClassName.get("java.time", "LocalDateTime");
            case "LocalTime": return ClassName.get("java.time", "LocalTime");
            case "Instant": return ClassName.get("java.time", "Instant");
            case "ZonedDateTime": return ClassName.get("java.time", "ZonedDateTime");
            default:
                // Check if it's an available enum
                if (getAvailableEnums().containsKey(name)) {
                    return ClassName.get("com.coinbase.prime.model.enums", name);
                }
                // Assume it's in the model package or enums package
                if (name.matches("^[A-Z_]+$")) {
                    // Likely an enum
                    return ClassName.get("com.coinbase.prime.model.enums", name);
                } else {
                    return ClassName.get("com.coinbase.prime.model", name);
                }
        }
    }
    
    /**
     * Loads and caches available enum types from the enums directory.
     * Returns a map of enum simple name to full class name.
     */
    private static Map<String, String> getAvailableEnums() {
        if (availableEnums != null) {
            return availableEnums;
        }
        
        availableEnums = new HashMap<>();
        
        try {
            // Find the enums directory
            Path projectRoot = findProjectRootForEnums();
            if (projectRoot == null) {
                logger.warn("Could not find project root for enum detection");
                return availableEnums;
            }
            
            Path enumsDir = projectRoot.resolve("src/main/java/com/coinbase/prime/model/enums");
            if (!Files.exists(enumsDir)) {
                logger.warn("Enums directory not found: {}", enumsDir);
                return availableEnums;
            }
            
            // Scan for all enum files
            Files.list(enumsDir)
                .filter(p -> p.toString().endsWith(".java"))
                .forEach(p -> {
                    String fileName = p.getFileName().toString();
                    String enumName = fileName.substring(0, fileName.length() - 5); // Remove .java
                    availableEnums.put(enumName, "com.coinbase.prime.model.enums." + enumName);
                    logger.debug("Registered enum: {}", enumName);
                });
            
            logger.info("Loaded {} available enum types for field matching", availableEnums.size());
        } catch (IOException e) {
            logger.warn("Error loading available enums: {}", e.getMessage());
        }
        
        return availableEnums;
    }
    
    /**
     * Attempts to intelligently determine if a String field should use an enum type
     * based on the field name and available enums.
     */
    private TypeName intelligentTypeResolution(String typeString, String fieldName) {
        // If it's not a String, use normal parsing
        if (!typeString.equals("String")) {
            return parseType(typeString);
        }
        
        // Check if this field name suggests it should be an enum
        String lowerFieldName = fieldName.toLowerCase();
        
        // Try exact field name match with available enums
        Map<String, String> enums = getAvailableEnums();
        
        // Pattern 1: Direct match (e.g., "status" -> "Status" enum, but only if there's a generic Status enum)
        // We skip this as it's too generic
        
        // Pattern 2: Field name is a common enum field (type, status, side, etc.)
        // Look for an enum that matches the pattern
        if (ENUM_FIELD_NAMES.contains(lowerFieldName)) {
            // Look for a matching enum
            // e.g., "type" could be OrderType, TransactionType, etc.
            // "status" could be OrderStatus, TransactionStatus, etc.
            // We'll look for *Type or *Status patterns
            
            String capitalizedFieldName = capitalize(fieldName);
            
            // Check for compound names in the enum list
            for (String enumName : enums.keySet()) {
                if (enumName.endsWith(capitalizedFieldName)) {
                    // Found a match! But we need context to know which one...
                    // For now, we'll let it stay as String and rely on manual fixes
                    // This is because we don't have enough context in the field alone
                    logger.debug("Field '{}' could use enum {}, but needs context - keeping as String", 
                        fieldName, enumName);
                }
            }
        }
        
        // Pattern 3: Field name already contains a type suffix (e.g., transactionType, orderStatus)
        // Convert camelCase to separate words and check
        String[] words = fieldName.split("(?=[A-Z])");
        if (words.length >= 2) {
            // Build potential enum name (e.g., transactionType -> TransactionType)
            StringBuilder enumNameBuilder = new StringBuilder();
            for (String word : words) {
                enumNameBuilder.append(capitalize(word));
            }
            String potentialEnumName = enumNameBuilder.toString();
            
            if (enums.containsKey(potentialEnumName)) {
                logger.info("Converting field '{}' from String to enum {}", fieldName, potentialEnumName);
                return ClassName.get("com.coinbase.prime.model.enums", potentialEnumName);
            }
        }
        
        // Default: keep as String
        return ClassName.get(String.class);
    }
    
    private static Path findProjectRootForEnums() {
        Path current = Paths.get(System.getProperty("user.dir"));
        while (current != null) {
            if (Files.exists(current.resolve("pom.xml")) &&
                Files.exists(current.resolve("apiSpec"))) {
                return current;
            }
            current = current.getParent();
        }
        return null;
    }
    
    private MethodSpec generateBuilderConstructor(ModelInfo modelInfo) {
        MethodSpec.Builder constructor = MethodSpec.constructorBuilder()
                .addModifiers(Modifier.PUBLIC)
                .addParameter(ClassName.get("", "Builder"), "builder");
        
        for (FieldInfo field : modelInfo.fields) {
            constructor.addStatement("this.$L = builder.$L", field.name, field.name);
        }
        
        return constructor.build();
    }
    
    private MethodSpec generateGetter(FieldInfo field) {
        // Handle boolean fields with 'is' prefix
        String methodName;
        if (field.type.equals(TypeName.BOOLEAN) || 
            (field.type instanceof ClassName && ((ClassName)field.type).simpleName().equals("Boolean"))) {
            // For boolean fields, use 'is' prefix
            methodName = "is" + capitalize(field.name);
        } else {
            methodName = "get" + capitalize(field.name);
        }
        
        return MethodSpec.methodBuilder(methodName)
                .addModifiers(Modifier.PUBLIC)
                .returns(field.type)
                .addStatement("return $L", field.name)
                .build();
    }
    
    private MethodSpec generateSetter(FieldInfo field) {
        return MethodSpec.methodBuilder("set" + capitalize(field.name))
                .addModifiers(Modifier.PUBLIC)
                .addParameter(field.type, field.name)
                .addStatement("this.$L = $L", field.name, field.name)
                .build();
    }
    
    private TypeSpec generateBuilderClass(ModelInfo modelInfo) {
        TypeSpec.Builder builder = TypeSpec.classBuilder("Builder")
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC);
        
        // Add fields
        for (FieldInfo field : modelInfo.fields) {
            builder.addField(FieldSpec.builder(field.type, field.name, Modifier.PRIVATE).build());
        }
        
        // Add builder methods
        for (FieldInfo field : modelInfo.fields) {
            MethodSpec builderMethod = MethodSpec.methodBuilder(field.name)
                    .addModifiers(Modifier.PUBLIC)
                    .addParameter(field.type, field.name)
                    .addStatement("this.$L = $L", field.name, field.name)
                    .addStatement("return this")
                    .returns(ClassName.get("", "Builder"))
                    .build();
            builder.addMethod(builderMethod);
        }
        
        // Add build method
        MethodSpec buildMethod = MethodSpec.methodBuilder("build")
                .addModifiers(Modifier.PUBLIC)
                .returns(ClassName.get(modelInfo.packageName, modelInfo.className))
                .addStatement("return new $L(this)", modelInfo.className)
                .build();
        builder.addMethod(buildMethod);
        
        return builder.build();
    }
    
    private String removeLicenseHeader(String content) {
        // Remove existing license headers
        int packageIndex = content.indexOf("package ");
        if (packageIndex > 0) {
            return content.substring(packageIndex);
        }
        return content;
    }
    
    private String extractClassName(String content) {
        Pattern pattern = Pattern.compile("public\\s+(?:class|enum)\\s+(\\w+)");
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }
    
    private String transformEnumValues(String content) {
        // Transform enum values to match existing pattern (UPPERCASE_WITH_UNDERSCORES)
        Pattern enumValuePattern = Pattern.compile("^\\s*([A-Z][A-Za-z0-9_]*)(,)?\\s*$", Pattern.MULTILINE);
        Matcher matcher = enumValuePattern.matcher(content);
        StringBuffer sb = new StringBuffer();
        
        while (matcher.find()) {
            String value = matcher.group(1);
            String comma = matcher.group(2) != null ? matcher.group(2) : "";
            
            // Convert camelCase to UPPER_SNAKE_CASE
            String transformed = camelToUpperSnake(value);
            matcher.appendReplacement(sb, "    " + transformed + comma);
        }
        matcher.appendTail(sb);
        
        return sb.toString();
    }
    
    private String camelToUpperSnake(String camel) {
        // Handle already uppercase enums
        if (camel.matches("^[A-Z_0-9]+$")) {
            return camel;
        }
        
        // Convert camelCase to UPPER_SNAKE_CASE
        String result = camel.replaceAll("([a-z])([A-Z])", "$1_$2");
        return result.toUpperCase();
    }
    
    private String addBuilderPattern(String content) {
        // This is a simplified version - the JavaPoet approach above is preferred
        // This is just a fallback
        return content;
    }
    
    private String addBuilderClass(String className, String content) {
        StringBuilder builder = new StringBuilder();
        builder.append("\n    public static class Builder {\n");
        
        // Extract fields and add to builder
        Pattern fieldPattern = Pattern.compile("private\\s+([\\w<>\\[\\]]+)\\s+(\\w+);");
        Matcher fieldMatcher = fieldPattern.matcher(content);
        
        // Add fields
        while (fieldMatcher.find()) {
            String type = fieldMatcher.group(1);
            String name = fieldMatcher.group(2);
            builder.append("        private ").append(type).append(" ").append(name).append(";\n");
        }
        
        builder.append("\n");
        
        // Add builder methods
        fieldMatcher.reset();
        while (fieldMatcher.find()) {
            String type = fieldMatcher.group(1);
            String name = fieldMatcher.group(2);
            builder.append("        public Builder ").append(name).append("(").append(type).append(" ").append(name).append(") {\n");
            builder.append("            this.").append(name).append(" = ").append(name).append(";\n");
            builder.append("            return this;\n");
            builder.append("        }\n\n");
        }
        
        // Add build method
        builder.append("        public ").append(className).append(" build() {\n");
        builder.append("            return new ").append(className).append("(this);\n");
        builder.append("        }\n");
        builder.append("    }\n");
        
        return builder.toString();
    }
    
    private String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
    
    private static class ModelInfo {
        String packageName = "com.coinbase.prime.model";
        String className;
        List<FieldInfo> fields = new ArrayList<>();
    }
    
    private static class FieldInfo {
        TypeName type;
        String name;
        String jsonProperty;
        String description;  // Field description/title from OpenAPI spec
    }
}