package com.coinbase.tools.sdkgenerator.spec;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * A single OpenAPI operation parameter.
 */
public final class ParsedParameter {
    private final String name;
    private final String in;
    private final boolean required;
    private final JsonNode schema;

    public ParsedParameter(String name, String in, boolean required, JsonNode schema) {
        this.name = name;
        this.in = in;
        this.required = required;
        this.schema = schema;
    }

    public String getName() {
        return name;
    }

    public String getIn() {
        return in;
    }

    public boolean isRequired() {
        return required;
    }

    public JsonNode getSchema() {
        return schema;
    }
}
