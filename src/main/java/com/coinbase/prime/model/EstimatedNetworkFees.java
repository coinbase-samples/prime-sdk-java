package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class EstimatedNetworkFees {
    /**
     * Estimated lower bound for networks fees (in whole units)
     */
    private String lowerBound;

    /**
     * Estimated upper bound for network fees (in whole units)
     */
    private String upperBound;

    public EstimatedNetworkFees() {
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

