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
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ModelTransformer {
    private static final Logger logger = LoggerFactory.getLogger(ModelTransformer.class);
    
    private static final String LICENSE_HEADER = 
        "/*\n" +
        " * Copyright 2024-present Coinbase Global, Inc.\n" +
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
        
        // Transform enum values to uppercase with underscores
        content = transformEnumValues(content);
        
        // Add proper license header
        return LICENSE_HEADER + "\n\n" + content.trim();
    }
    
    public String transformModel(String content, JsonNode schema) {
        try {
            return transformModelWithJavaPoet(content);
        } catch (Exception e) {
            logger.error("Error transforming model with JavaPoet, falling back to basic transform", e);
            return basicTransform(content);
        }
    }
    
    /**
     * Transform model using JavaPoet for proper code generation
     */
    private String transformModelWithJavaPoet(String content) throws IOException {
        // Parse the model information from OpenAPI-generated content
        ModelInfo info = parseModelInfo(content);
        
        if (info.className == null || info.className.isEmpty()) {
            throw new IOException("Could not extract class name from content");
        }
        
        // Build the complete class using JavaPoet
        TypeSpec.Builder classBuilder = TypeSpec.classBuilder(info.className)
                .addModifiers(Modifier.PUBLIC);
        
        // Add fields with annotations
        for (FieldInfo field : info.fields) {
            FieldSpec.Builder fieldBuilder = FieldSpec.builder(field.type, field.name, Modifier.PRIVATE);
            
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
                .addFileComment("Copyright 2024-present Coinbase Global, Inc.\n\n" +
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
    
    private ModelInfo parseModelInfo(String content) {
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
                field.type = parseType(typeString);
                field.name = fieldMatcher.group(2);
                field.jsonProperty = pendingJsonProperty;
                
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
            default:
                // Assume it's in the model package or enums package
                if (name.matches("^[A-Z_]+$")) {
                    // Likely an enum
                    return ClassName.get("com.coinbase.prime.model.enums", name);
                } else {
                    return ClassName.get("com.coinbase.prime.model", name);
                }
        }
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
    }
}