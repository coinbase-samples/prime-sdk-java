package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EntityBalance {
    private String symbol;

    @JsonProperty("long_amount")
    private String longAmount;

    @JsonProperty("long_notional")
    private String longNotional;

    @JsonProperty("short_amount")
    private String shortAmount;

    @JsonProperty("short_notional")
    private String shortNotional;

    public EntityBalance() {
    }

    public EntityBalance(Builder builder) {
        this.symbol = builder.symbol;
        this.longAmount = builder.longAmount;
        this.longNotional = builder.longNotional;
        this.shortAmount = builder.shortAmount;
        this.shortNotional = builder.shortNotional;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getLongAmount() {
        return longAmount;
    }

    public void setLongAmount(String longAmount) {
        this.longAmount = longAmount;
    }

    public String getLongNotional() {
        return longNotional;
    }

    public void setLongNotional(String longNotional) {
        this.longNotional = longNotional;
    }

    public String getShortAmount() {
        return shortAmount;
    }

    public void setShortAmount(String shortAmount) {
        this.shortAmount = shortAmount;
    }

    public String getShortNotional() {
        return shortNotional;
    }

    public void setShortNotional(String shortNotional) {
        this.shortNotional = shortNotional;
    }

    public static class Builder {
        private String symbol;
        private String longAmount;
        private String longNotional;
        private String shortAmount;
        private String shortNotional;

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder longAmount(String longAmount) {
            this.longAmount = longAmount;
            return this;
        }

        public Builder longNotional(String longNotional) {
            this.longNotional = longNotional;
            return this;
        }

        public Builder shortAmount(String shortAmount) {
            this.shortAmount = shortAmount;
            return this;
        }

        public Builder shortNotional(String shortNotional) {
            this.shortNotional = shortNotional;
            return this;
        }

        public EntityBalance build() {
            return new EntityBalance(this);
        }
    }
}
