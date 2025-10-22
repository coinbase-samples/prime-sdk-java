package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class DestinationAlloc {
    /**
     * The ID unique to each leg of an allocation.
     */
    private String legId;

    /**
     * Portfolio ID of the source portfolio.
     */
    private String portfolioId;

    /**
     * Amount allocated in base asset units.
     */
    private String allocationBase;

    /**
     * Amount allocated in quote asset units.
     */
    private String allocationQuote;

    /**
     * Pro rata fees for each leg. Adding up the fees for each leg will sum up to equal the total allocation level fees.
     */
    private String feesAllocatedLeg;

    public DestinationAlloc() {
    }

    public DestinationAlloc(Builder builder) {
        this.legId = builder.legId;
        this.portfolioId = builder.portfolioId;
        this.allocationBase = builder.allocationBase;
        this.allocationQuote = builder.allocationQuote;
        this.feesAllocatedLeg = builder.feesAllocatedLeg;
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

        private String feesAllocatedLeg;

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

        public Builder feesAllocatedLeg(String feesAllocatedLeg) {
            this.feesAllocatedLeg = feesAllocatedLeg;
            return this;
        }

        public DestinationAlloc build() {
            return new DestinationAlloc(this);
        }
    }
}

