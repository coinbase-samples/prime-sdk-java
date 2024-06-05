package com.coinbase.prime.model.allocations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AllocationDestination {
    @JsonProperty("leg_id")
    private String legId;
    @JsonProperty("portfolio_id")
    private String portfolioId;
    @JsonProperty("allocation_base")
    private String allocationBase;
    @JsonProperty("allocation_quote")
    private String allocationQuote;
    @JsonProperty("fees_allocated_leg")
    private String feesAllocatedLeg;

    public AllocationDestination() {}
    public AllocationDestination(Builder builder) {
        this.legId = builder.legId;
        this.portfolioId = builder.portfolioId;
        this.allocationBase = builder.allocationBase;
        this.allocationQuote = builder.allocationQuote;
        this.feesAllocatedLeg = builder.feeAllocatedLeg;
    }

    public String getLegId() {
        return legId;
    }

    public void setLegId(String legId) {
        this.legId = legId;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getAllocationBase() {
        return allocationBase;
    }

    public void setAllocationBase(String allocationBase) {
        this.allocationBase = allocationBase;
    }

    public String getAllocationQuote() {
        return allocationQuote;
    }

    public void setAllocationQuote(String allocationQuote) {
        this.allocationQuote = allocationQuote;
    }

    public String getFeesAllocatedLeg() {
        return feesAllocatedLeg;
    }

    public void setFeesAllocatedLeg(String feesAllocatedLeg) {
        this.feesAllocatedLeg = feesAllocatedLeg;
    }

    public static class Builder {
        private String legId;
        private String portfolioId;
        private String allocationBase;
        private String allocationQuote;
        private String feeAllocatedLeg;

        public Builder() {}

        public Builder legId(String legId) {
            this.legId = legId;
            return this;
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder allocationBase(String allocationBase) {
            this.allocationBase = allocationBase;
            return this;
        }

        public Builder allocationQuote(String allocationQuote) {
            this.allocationQuote = allocationQuote;
            return this;
        }

        public Builder feeAllocatedLeg(String feeAllocatedLeg) {
            this.feeAllocatedLeg = feeAllocatedLeg;
            return this;
        }

        public AllocationDestination build() {
            return new AllocationDestination(this);
        }
    }
}
