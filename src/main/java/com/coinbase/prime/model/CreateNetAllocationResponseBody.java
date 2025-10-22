package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class CreateNetAllocationResponseBody {
    /**
     * The success boolean for the post net allocation
     */
    private Boolean success;

    /**
     * The netting_id for the post net allocation
     */
    private String nettingId;

    /**
     * The allocation id of the buy allocation in net allocation
     */
    private String buyAllocationId;

    /**
     * The allocation id of the sell allocation in net allocation
     */
    private String sellAllocationId;

    /**
     * The failure reason for the post net allocation
     */
    private String failureReason;

    public CreateNetAllocationResponseBody() {
    }

    public CreateNetAllocationResponseBody(Builder builder) {
        this.success = builder.success;
        this.nettingId = builder.nettingId;
        this.buyAllocationId = builder.buyAllocationId;
        this.sellAllocationId = builder.sellAllocationId;
        this.failureReason = builder.failureReason;
    }
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
    public String getNettingId() {
        return nettingId;
    }

    public void setNettingId(String nettingId) {
        this.nettingId = nettingId;
    }
    public String getBuyAllocationId() {
        return buyAllocationId;
    }

    public void setBuyAllocationId(String buyAllocationId) {
        this.buyAllocationId = buyAllocationId;
    }
    public String getSellAllocationId() {
        return sellAllocationId;
    }

    public void setSellAllocationId(String sellAllocationId) {
        this.sellAllocationId = sellAllocationId;
    }
    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }
    public static class Builder {
        private Boolean success;

        private String nettingId;

        private String buyAllocationId;

        private String sellAllocationId;

        private String failureReason;

        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public Builder nettingId(String nettingId) {
            this.nettingId = nettingId;
            return this;
        }

        public Builder buyAllocationId(String buyAllocationId) {
            this.buyAllocationId = buyAllocationId;
            return this;
        }

        public Builder sellAllocationId(String sellAllocationId) {
            this.sellAllocationId = sellAllocationId;
            return this;
        }

        public Builder failureReason(String failureReason) {
            this.failureReason = failureReason;
            return this;
        }

        public CreateNetAllocationResponseBody build() {
            return new CreateNetAllocationResponseBody(this);
        }
    }
}

