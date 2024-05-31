package com.coinbase.prime.model.transactions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EstimatedNetworkFees {
    @JsonProperty("lower_bound")
    private String lowerBound;
    @JsonProperty("upper_bound")
    private String upperBound;

    public EstimatedNetworkFees() {
    }

    public EstimatedNetworkFees(String lowerBound, String upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public EstimatedNetworkFees(Builder builder) {
        this.lowerBound = builder.lowerBound;
        this.upperBound = builder.upperBound;
    }

    public String getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(String lowerBound) {
        this.lowerBound = lowerBound;
    }

    public String getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(String upperBound) {
        this.upperBound = upperBound;
    }

    public static class Builder {
        private String lowerBound;
        private String upperBound;

        public Builder() {
        }

        public Builder lowerBound(String lowerBound) {
            this.lowerBound = lowerBound;
            return this;
        }

        public Builder upperBound(String upperBound) {
            this.upperBound = upperBound;
            return this;
        }

        public EstimatedNetworkFees build() {
            return new EstimatedNetworkFees(this);
        }
    }
}
