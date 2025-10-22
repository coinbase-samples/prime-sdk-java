package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class Locate {
    /**
     * The currency symbol
     */
    private String symbol;

    /**
     * The available quantity located
     */
    private String quantity;

    /**
     * The interest rate for located symbol
     */
    private String rate;

    public Locate() {
    }

    public Locate(Builder builder) {
        this.symbol = builder.symbol;
        this.quantity = builder.quantity;
        this.rate = builder.rate;
    }
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
    public static class Builder {
        private String symbol;

        private String quantity;

        private String rate;

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder quantity(String quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder rate(String rate) {
            this.rate = rate;
            return this;
        }

        public Locate build() {
            return new Locate(this);
        }
    }
}

