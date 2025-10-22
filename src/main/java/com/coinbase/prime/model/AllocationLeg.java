package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class AllocationLeg {
    /**
     * The ID of the portfolio of the allocation leg
     */
    private String allocationLegId;

    /**
     * The ID of the destination portfolio of the allocation leg
     */
    private String destinationPortfolioId;

    /**
     * The amount size for the allocation leg
     */
    private String amount;

    public AllocationLeg() {
    }

    public AllocationLeg(Builder builder) {
        this.allocationLegId = builder.allocationLegId;
        this.destinationPortfolioId = builder.destinationPortfolioId;
        this.amount = builder.amount;
    }
    public String getAllocationLegId() {
        return allocationLegId;
    }

    public void setAllocationLegId(String allocationLegId) {
        this.allocationLegId = allocationLegId;
    }
    public String getDestinationPortfolioId() {
        return destinationPortfolioId;
    }

    public void setDestinationPortfolioId(String destinationPortfolioId) {
        this.destinationPortfolioId = destinationPortfolioId;
    }
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
    public static class Builder {
        private String allocationLegId;

        private String destinationPortfolioId;

        private String amount;

        public Builder allocationLegId(String allocationLegId) {
            this.allocationLegId = allocationLegId;
            return this;
        }

        public Builder destinationPortfolioId(String destinationPortfolioId) {
            this.destinationPortfolioId = destinationPortfolioId;
            return this;
        }

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public AllocationLeg build() {
            return new AllocationLeg(this);
        }
    }
}

