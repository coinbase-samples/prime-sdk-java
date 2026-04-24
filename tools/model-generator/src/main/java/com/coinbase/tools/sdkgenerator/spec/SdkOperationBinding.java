package com.coinbase.tools.sdkgenerator.spec;

import java.util.HashMap;
import java.util.Map;

public class SdkOperationBinding {
    private String operationId = "";
    private String sdkMethod = "";
    private String service = "";
    private boolean omitRequest;
    private final Map<String, String> paramTypeOverrides = new HashMap<>();
    private boolean forcePaginated;

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public String getSdkMethod() {
        return sdkMethod;
    }

    public void setSdkMethod(String sdkMethod) {
        this.sdkMethod = sdkMethod;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public boolean isOmitRequest() {
        return omitRequest;
    }

    public void setOmitRequest(boolean omitRequest) {
        this.omitRequest = omitRequest;
    }

    public Map<String, String> getParamTypeOverrides() {
        return paramTypeOverrides;
    }

    public void setParamTypeOverrides(Map<String, String> paramTypeOverrides) {
        this.paramTypeOverrides.clear();
        if (paramTypeOverrides != null) {
            this.paramTypeOverrides.putAll(paramTypeOverrides);
        }
    }

    public boolean isForcePaginated() {
        return forcePaginated;
    }

    public void setForcePaginated(boolean forcePaginated) {
        this.forcePaginated = forcePaginated;
    }
}
