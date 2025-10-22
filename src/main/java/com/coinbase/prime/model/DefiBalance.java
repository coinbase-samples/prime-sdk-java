package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class DefiBalance {
    private String network;

    private String protocol;

    private String netUsdValue;

    public DefiBalance() {
    }

    public DefiBalance(Builder builder) {
        this.network = builder.network;
        this.protocol = builder.protocol;
        this.netUsdValue = builder.netUsdValue;
    }
    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }
    public String getNetUsdValue() {
        return netUsdValue;
    }

    public void setNetUsdValue(String netUsdValue) {
        this.netUsdValue = netUsdValue;
    }
    public static class Builder {
        private String network;

        private String protocol;

        private String netUsdValue;

        public Builder network(String network) {
            this.network = network;
            return this;
        }

        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder netUsdValue(String netUsdValue) {
            this.netUsdValue = netUsdValue;
            return this;
        }

        public DefiBalance build() {
            return new DefiBalance(this);
        }
    }
}

