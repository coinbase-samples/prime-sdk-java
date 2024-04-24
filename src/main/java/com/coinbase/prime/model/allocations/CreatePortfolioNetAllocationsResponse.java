package com.coinbase.prime.model.allocations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreatePortfolioNetAllocationsResponse {
    private boolean success;
    @JsonProperty("netting_id")
    private String nettingId;
    @JsonProperty("buy_allocation_id")
    private String buyAllocationId;
    @JsonProperty("sell_allocation_id")
    private String sellAllocationId;
    @JsonProperty("failure_reason")
    private String failureReason;

    private CreatePortfolioAllocationsRequest request;

    public CreatePortfolioNetAllocationsResponse() {
    }

    public CreatePortfolioNetAllocationsResponse(Builder builder) {
        this.success = builder.success;
        this.nettingId = builder.nettingId;
        this.buyAllocationId = builder.buyAllocationId;
        this.sellAllocationId = builder.sellAllocationId;
        this.failureReason = builder.failureReason;
        this.request = builder.request;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
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

    public CreatePortfolioAllocationsRequest getRequest() {
        return request;
    }

    public void setRequest(CreatePortfolioAllocationsRequest request) {
        this.request = request;
    }

    public static class Builder {
        private boolean success;
        private String nettingId;
        private String buyAllocationId;
        private String sellAllocationId;
        private String failureReason;

        private CreatePortfolioAllocationsRequest request;

        public Builder() {
        }

        public Builder success(boolean success) {
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

        public Builder request(CreatePortfolioAllocationsRequest request) {
            this.request = request;
            return this;
        }

        public CreatePortfolioNetAllocationsResponse build() {
            return new CreatePortfolioNetAllocationsResponse(this);
        }
    }
}
