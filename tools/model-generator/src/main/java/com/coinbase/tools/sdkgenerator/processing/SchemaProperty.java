package com.coinbase.tools.sdkgenerator.processing;

import java.util.Set;

public final class SchemaProperty {
    private final String jsonName;
    private final String javaName;
    private final String javaType;
    private final boolean required;
    private final boolean usesModel;
    private final boolean usesEnum;
    private final Set<String> referencedModelTypeNames;
    private final Set<String> referencedEnumTypeNames;

    public SchemaProperty(
            String jsonName,
            String javaName,
            String javaType,
            boolean required,
            boolean usesModel,
            boolean usesEnum,
            Set<String> referencedModelTypeNames,
            Set<String> referencedEnumTypeNames) {
        this.jsonName = jsonName;
        this.javaName = javaName;
        this.javaType = javaType;
        this.required = required;
        this.usesModel = usesModel;
        this.usesEnum = usesEnum;
        this.referencedModelTypeNames = Set.copyOf(referencedModelTypeNames);
        this.referencedEnumTypeNames = Set.copyOf(referencedEnumTypeNames);
    }

    public String getJsonName() {
        return jsonName;
    }

    public String getJavaName() {
        return javaName;
    }

    public String getJavaType() {
        return javaType;
    }

    public boolean isRequired() {
        return required;
    }

    public boolean isUsesModel() {
        return usesModel;
    }

    public boolean isUsesEnum() {
        return usesEnum;
    }

    public Set<String> getReferencedModelTypeNames() {
        return referencedModelTypeNames;
    }

    public Set<String> getReferencedEnumTypeNames() {
        return referencedEnumTypeNames;
    }
}
