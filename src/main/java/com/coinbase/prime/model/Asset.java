package com.coinbase.prime.model;

import com.coinbase.prime.model.NetworkDetails;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Asset {
    /**
     * The name of the asset
     */
    private String name;

    /**
     * The mutable series of letters used to identify the asset
     */
    private String symbol;

    /**
     * The number of decimals supported for the asset
     */
    private String decimalPrecision;

    /**
     * Indicates whether this asset can be traded
     */
    private Boolean tradingSupported;

    /**
     * Base URL to our recommended block explorer (crypto only)
     */
    private String explorerUrl;

    /**
     * List of networks supported by this asset
     */
    private List<NetworkDetails> networks;

    public Asset() {
    }

    public Asset(Builder builder) {
        this.name = builder.name;
        this.symbol = builder.symbol;
        this.decimalPrecision = builder.decimalPrecision;
        this.tradingSupported = builder.tradingSupported;
        this.explorerUrl = builder.explorerUrl;
        this.networks = builder.networks;
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
    public Boolean getTradingSupported() {
        return tradingSupported;
    }

    public void setTradingSupported(Boolean tradingSupported) {
        this.tradingSupported = tradingSupported;
    }
    public String getExplorerUrl() {
        return explorerUrl;
    }

    public void setExplorerUrl(String explorerUrl) {
        this.explorerUrl = explorerUrl;
    }
    public List<NetworkDetails> getNetworks() {
        return networks;
    }

    public void setNetworks(List<NetworkDetails> networks) {
        this.networks = networks;
    }
    public static class Builder {
        private String name;

        private String symbol;

        private String decimalPrecision;

        private Boolean tradingSupported;

        private String explorerUrl;

        private List<NetworkDetails> networks;

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

        public Builder tradingSupported(Boolean tradingSupported) {
            this.tradingSupported = tradingSupported;
            return this;
        }

        public Builder explorerUrl(String explorerUrl) {
            this.explorerUrl = explorerUrl;
            return this;
        }

        public Builder networks(List<NetworkDetails> networks) {
            this.networks = networks;
            return this;
        }

        public Asset build() {
            return new Asset(this);
        }
    }
}

