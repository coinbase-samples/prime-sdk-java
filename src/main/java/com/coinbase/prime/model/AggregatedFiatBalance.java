package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class AggregatedFiatBalance {
    private String total;

    private String holds;

    public AggregatedFiatBalance() {
    }

    public AggregatedFiatBalance(Builder builder) {
        this.total = builder.total;
        this.holds = builder.holds;
    }
    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    public String getHolds() {
        return holds;
    }

    public void setHolds(String holds) {
        this.holds = holds;
    }
    public static class Builder {
        private String total;

        private String holds;

        public Builder total(String total) {
            this.total = total;
            return this;
        }

        public Builder holds(String holds) {
            this.holds = holds;
            return this;
        }

        public AggregatedFiatBalance build() {
            return new AggregatedFiatBalance(this);
        }
    }
}

