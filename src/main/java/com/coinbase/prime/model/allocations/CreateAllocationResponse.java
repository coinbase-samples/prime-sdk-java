package com.coinbase.prime.model.allocations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateAllocationResponse {
    private boolean success;
    @JsonProperty("allocation_id")
    private String allocationId;
    @JsonProperty("failure_reason")
    private String failureReason;
    @JsonProperty("netting_id")
    private String nettingId;
    private CreateAllocationRequest request;

    public CreateAllocationResponse() {
    }

    public CreateAllocationResponse(Builder builder) {
        this.success = builder.success;
        this.allocationId = builder.allocationId;
        this.failureReason = builder.failureReason;
        this.request = builder.request;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getAllocationId() {
        return allocationId;
    }

    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    public CreateAllocationRequest getRequest() {
        return request;
    }

    public void setRequest(CreateAllocationRequest request) {
        this.request = request;
    }

    public static class Builder {
        private boolean success;
        private String allocationId;
        private String failureReason;
        private CreateAllocationRequest request;

        public Builder() {
        }

        public Builder success(boolean success) {
            this.success = success;
            return this;
        }

        public Builder allocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }

        public Builder failureReason(String failureReason) {
            this.failureReason = failureReason;
            return this;
        }

        public Builder request(CreateAllocationRequest request) {
            this.request = request;
            return this;
        }

        public CreateAllocationResponse build() {
            return new CreateAllocationResponse(this);
        }
    }
}
