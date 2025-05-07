package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Network {
    private NetworkDetails network;
    private String name;
    @JsonProperty("max_decimals")
    private String maxDecimals;
    @JsonProperty("default")
    private boolean isDefault;
    @JsonProperty("trading_supported")
    private boolean tradingSupported;
    @JsonProperty("vault_supported")
    private boolean vaultSupported;
    @JsonProperty("prime_custody_supported")
    private boolean primeCustodySupported;
    @JsonProperty("destination_tag_required")
    private boolean destinationTagRequired;
    @JsonProperty("network_link")
    private String networkLink;

    public Network() {}

    public Network(Builder builder) {
        this.network = builder.network;
        this.name = builder.name;
        this.maxDecimals = builder.maxDecimals;
        this.isDefault = builder.isDefault;
        this.tradingSupported = builder.tradingSupported;
        this.vaultSupported = builder.vaultSupported;
        this.primeCustodySupported = builder.primeCustodySupported;
        this.destinationTagRequired = builder.destinationTagRequired;
        this.networkLink = builder.networkLink;
    }

    public NetworkDetails getNetwork() {
        return network;
    }

    public void setNetwork(NetworkDetails network) {
        this.network = network;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaxDecimals() {
        return maxDecimals;
    }

    public void setMaxDecimals(String maxDecimals) {
        this.maxDecimals = maxDecimals;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    public boolean isTradingSupported() {
        return tradingSupported;
    }

    public void setTradingSupported(boolean tradingSupported) {
        this.tradingSupported = tradingSupported;
    }

    public boolean isVaultSupported() {
        return vaultSupported;
    }

    public void setVaultSupported(boolean vaultSupported) {
        this.vaultSupported = vaultSupported;
    }

    public boolean isPrimeCustodySupported() {
        return primeCustodySupported;
    }

    public void setPrimeCustodySupported(boolean primeCustodySupported) {
        this.primeCustodySupported = primeCustodySupported;
    }

    public boolean isDestinationTagRequired() {
        return destinationTagRequired;
    }

    public void setDestinationTagRequired(boolean destinationTagRequired) {
        this.destinationTagRequired = destinationTagRequired;
    }

    public String getNetworkLink() {
        return networkLink;
    }

    public void setNetworkLink(String networkLink) {
        this.networkLink = networkLink;
    }

    public static class Builder {
        private NetworkDetails network;
        private String name;
        private String maxDecimals;
        private boolean isDefault;
        private boolean tradingSupported;
        private boolean vaultSupported;
        private boolean primeCustodySupported;
        private boolean destinationTagRequired;
        private String networkLink;

        public Builder() {}

        public Builder network(NetworkDetails network) {
            this.network = network;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder maxDecimals(String maxDecimals) {
            this.maxDecimals = maxDecimals;
            return this;
        }

        public Builder isDefault(boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        public Builder tradingSupported(boolean tradingSupported) {
            this.tradingSupported = tradingSupported;
            return this;
        }

        public Builder vaultSupported(boolean vaultSupported) {
            this.vaultSupported = vaultSupported;
            return this;
        }

        public Builder primeCustodySupported(boolean primeCustodySupported) {
            this.primeCustodySupported = primeCustodySupported;
            return this;
        }

        public Builder destinationTagRequired(boolean destinationTagRequired) {
            this.destinationTagRequired = destinationTagRequired;
            return this;
        }

        public Builder networkLink(String networkLink) {
            this.networkLink = networkLink;
            return this;
        }

        public Network build() {
            return new Network(this);
        }
    }
} 