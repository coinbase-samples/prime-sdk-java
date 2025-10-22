package com.coinbase.prime.model;

import com.coinbase.prime.model.Network;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class BlockchainAddress {
    /**
     * The address on the network
     */
    private String address;

    /**
     * The account identifier (used on some chains to distinguish accounts using the same address)
     */
    private String accountIdentifier;

    private Network network;

    public BlockchainAddress() {
    }

    public BlockchainAddress(Builder builder) {
        this.address = builder.address;
        this.accountIdentifier = builder.accountIdentifier;
        this.network = builder.network;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAccountIdentifier() {
        return accountIdentifier;
    }

    public void setAccountIdentifier(String accountIdentifier) {
        this.accountIdentifier = accountIdentifier;
    }
    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }
    public static class Builder {
        private String address;

        private String accountIdentifier;

        private Network network;

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder accountIdentifier(String accountIdentifier) {
            this.accountIdentifier = accountIdentifier;
            return this;
        }

        public Builder network(Network network) {
            this.network = network;
            return this;
        }

        public BlockchainAddress build() {
            return new BlockchainAddress(this);
        }
    }
}

