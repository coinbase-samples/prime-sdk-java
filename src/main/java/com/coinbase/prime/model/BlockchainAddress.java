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

public class BlockchainAddress {
    /**
     * The address on the network
     */
    private String address;

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

    public String getAccountIdentifier() {
        return accountIdentifier;
    }

    public Network getNetwork() {
        return network;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAccountIdentifier(String accountIdentifier) {
        this.accountIdentifier = accountIdentifier;
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
