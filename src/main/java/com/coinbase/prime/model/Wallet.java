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

import com.coinbase.prime.model.enums.WalletType;
import java.time.OffsetDateTime;

public class Wallet {
    /**
     * The unique UUID for the wallet
     */
    private String id;

    /**
     * The name of the wallet
     */
    private String name;

    /**
     * The asset stored in the wallet
     */
    private String symbol;

    private WalletType type;

    private OffsetDateTime createdAt;

    /**
     * The active address of the wallet
     */
    private String address;

    private Network network;

    public Wallet() {
    }

    public Wallet(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.symbol = builder.symbol;
        this.type = builder.type;
        this.createdAt = builder.createdAt;
        this.address = builder.address;
        this.network = builder.network;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public WalletType getType() {
        return type;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public String getAddress() {
        return address;
    }

    public Network getNetwork() {
        return network;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setType(WalletType type) {
        this.type = type;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public static class Builder {
        private String id;

        private String name;

        private String symbol;

        private WalletType type;

        private OffsetDateTime createdAt;

        private String address;

        private Network network;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder type(WalletType type) {
            this.type = type;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder network(Network network) {
            this.network = network;
            return this;
        }

        public Wallet build() {
            return new Wallet(this);
        }
    }
}
