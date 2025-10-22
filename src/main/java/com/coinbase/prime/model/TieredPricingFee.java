package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class TieredPricingFee {
    /**
     * Asset symbol
     */
    private String symbol;

    /**
     * The fee in bps
     */
    private String fee;

    public TieredPricingFee() {
    }

    public TieredPricingFee(Builder builder) {
        this.symbol = builder.symbol;
        this.fee = builder.fee;
    }
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }
    public static class Builder {
        private String symbol;

        private String fee;

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder fee(String fee) {
            this.fee = fee;
            return this;
        }

        public TieredPricingFee build() {
            return new TieredPricingFee(this);
        }
    }
}

