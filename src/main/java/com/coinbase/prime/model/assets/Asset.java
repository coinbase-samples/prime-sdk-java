package com.coinbase.prime.model.assets;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Asset {
    private String name;
    private String symbol;
    @JsonProperty("decimal_precision")
    private String decimalPrecision;
    @JsonProperty("trading_supported")
    private boolean tradingSupported;
    @JsonProperty("explorer_url")
    private String explorerUrl;

    public Asset() {}

    public Asset(Builder builder) {
        this.name = builder.name;
        this.symbol = builder.symbol;
        this.decimalPrecision = builder.decimalPrecision;
        this.tradingSupported = builder.tradingSupported;
        this.explorerUrl = builder.explorerUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getDecimalPrecision() {
        return decimalPrecision;
    }

    public void setDecimalPrecision(String decimalPrecision) {
        this.decimalPrecision = decimalPrecision;
    }

    public boolean isTradingSupported() {
        return tradingSupported;
    }

    public void setTradingSupported(boolean tradingSupported) {
        this.tradingSupported = tradingSupported;
    }

    public String getExplorerUrl() {
        return explorerUrl;
    }

    public void setExplorerUrl(String explorerUrl) {
        this.explorerUrl = explorerUrl;
    }

    public static class Builder {
        private String name;
        private String symbol;
        private String decimalPrecision;
        private boolean tradingSupported;
        private String explorerUrl;

        public Builder() {}

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder decimalPrecision(String decimalPrecision) {
            this.decimalPrecision = decimalPrecision;
            return this;
        }

        public Builder tradingSupported(boolean tradingSupported) {
            this.tradingSupported = tradingSupported;
            return this;
        }

        public Builder explorerUrl(String explorerUrl) {
            this.explorerUrl = explorerUrl;
            return this;
        }

        public Asset build() {
            return new Asset(this);
        }
    }
}
