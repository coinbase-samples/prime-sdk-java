package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class CreateAllocationResponseBody {
    /**
     * The success boolean for the post allocation
     */
    private Boolean success;

    /**
     * The allocation id for the post allocation
     */
    private String allocationId;

    /**
     * The failure reason for the post allocation
     */
    private String failureReason;

    public CreateAllocationResponseBody() {
    }

    public CreateAllocationResponseBody(Builder builder) {
        this.success = builder.success;
        this.allocationId = builder.allocationId;
        this.failureReason = builder.failureReason;
    }
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
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
    public static class Builder {
        private Boolean success;

        private String allocationId;

        private String failureReason;

        public Builder success(Boolean success) {
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

        public CreateAllocationResponseBody build() {
            return new CreateAllocationResponseBody(this);
        }
    }
}

