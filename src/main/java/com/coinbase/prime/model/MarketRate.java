package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class MarketRate {
    /**
     * The currency symbol
     */
    private String symbol;

    /**
     * The current market rate of currency
     */
    private String rate;

    public MarketRate() {
    }

    public MarketRate(Builder builder) {
        this.symbol = builder.symbol;
        this.rate = builder.rate;
    }
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
    public static class Builder {
        private String symbol;

        private String rate;

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder rate(String rate) {
            this.rate = rate;
            return this;
        }

        public MarketRate build() {
            return new MarketRate(this);
        }
    }
}

