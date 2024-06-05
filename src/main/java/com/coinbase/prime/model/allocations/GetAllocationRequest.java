package com.coinbase.prime.model.allocations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetAllocationRequest {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    @JsonProperty("allocation_id")
    private String allocationId;

    public GetAllocationRequest() {
    }

    public GetAllocationRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.allocationId = builder.allocationId;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getAllocationId() {
        return allocationId;
    }

    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    public static class Builder {
        private String portfolioId;
        private String allocationId;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder allocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }

        public GetAllocationRequest build() {
            return new GetAllocationRequest(this);
        }
    }
}
