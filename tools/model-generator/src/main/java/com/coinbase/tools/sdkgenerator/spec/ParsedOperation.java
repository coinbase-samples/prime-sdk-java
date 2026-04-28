package com.coinbase.tools.sdkgenerator.spec;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.Collections;
import java.util.List;

public final class ParsedOperation {
    private final String operationId;
    private final String httpMethod;
    private final String path;
    private final List<String> tags;
    private final List<ParsedParameter> parameters;
    private final JsonNode requestBodyJsonSchema;
    private final String successResponseSchemaRef;
    private final List<Integer> successStatusCodes;
    private final String summary;
    private final String extensionSdkMethodName;

    public ParsedOperation(
            String operationId,
            String httpMethod,
            String path,
            List<String> tags,
            List<ParsedParameter> parameters,
            JsonNode requestBodyJsonSchema,
            String successResponseSchemaRef,
            List<Integer> successStatusCodes,
            String summary,
            String extensionSdkMethodName) {
        this.operationId = operationId;
        this.httpMethod = httpMethod;
        this.path = path;
        this.tags = tags;
        this.parameters = parameters;
        this.requestBodyJsonSchema = requestBodyJsonSchema;
        this.successResponseSchemaRef = successResponseSchemaRef;
        this.successStatusCodes = successStatusCodes;
        this.summary = summary;
        this.extensionSdkMethodName = extensionSdkMethodName;
    }

    public String getOperationId() {
        return operationId;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public String getPath() {
        return path;
    }

    public List<String> getTags() {
        return Collections.unmodifiableList(tags);
    }

    public List<ParsedParameter> getParameters() {
        return Collections.unmodifiableList(parameters);
    }

    public JsonNode getRequestBodyJsonSchema() {
        return requestBodyJsonSchema;
    }

    public String getSuccessResponseSchemaRef() {
        return successResponseSchemaRef;
    }

    public List<Integer> getSuccessStatusCodes() {
        return Collections.unmodifiableList(successStatusCodes);
    }

    public String getSummary() {
        return summary;
    }

    public String getExtensionSdkMethodName() {
        return extensionSdkMethodName;
    }
}
