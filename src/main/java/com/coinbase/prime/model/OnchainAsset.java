package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class OnchainAsset {
    private String network;

    /**
     * Contract Address of this asset (empty for native assets).
     */
    private String contractAddress;

    /**
     * Symbol of this asset.
     */
    private String symbol;

    /**
     * Token ID of this asset (empty for non  NFT assets).
     */
    private String tokenId;

    /**
     * Name of this asset, either the name of the crypto token or the NFT collection name.
     */
    private String name;

    public OnchainAsset() {
    }

    public OnchainAsset(Builder builder) {
        this.network = builder.network;
        this.contractAddress = builder.contractAddress;
        this.symbol = builder.symbol;
        this.tokenId = builder.tokenId;
        this.name = builder.name;
    }
    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }
    public String getContractAddress() {
        return contractAddress;
    }

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static class Builder {
        private String network;

        private String contractAddress;

        private String symbol;

        private String tokenId;

        private String name;

        public Builder network(String network) {
            this.network = network;
            return this;
        }

        public Builder contractAddress(String contractAddress) {
            this.contractAddress = contractAddress;
            return this;
        }

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder tokenId(String tokenId) {
            this.tokenId = tokenId;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public OnchainAsset build() {
            return new OnchainAsset(this);
        }
    }
}

