// Copyright 2025-present Coinbase Global, Inc.
//
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.
package com.coinbase.prime.model;

public class OnchainAsset {
    private String network;

    private String contractAddress;

    private String symbol;

    private String tokenId;

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

    public String getContractAddress() {
        return contractAddress;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getTokenId() {
        return tokenId;
    }

    public String getName() {
        return name;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
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
