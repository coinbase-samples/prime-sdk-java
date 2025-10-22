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

import com.coinbase.prime.model.enums.WalletDepositInstructionType;

public class WalletCryptoDepositInstructions {
    /**
     * The ID of the wallet
     */
    private String id;

    /**
     * The name of the wallet
     */
    private String name;

    private WalletDepositInstructionType type;

    /**
     * The address of the wallet
     */
    private String address;

    private String accountIdentifier;

    private String accountIdentifierName;

    private Network network;

    public WalletCryptoDepositInstructions() {
    }

    public WalletCryptoDepositInstructions(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.type = builder.type;
        this.address = builder.address;
        this.accountIdentifier = builder.accountIdentifier;
        this.accountIdentifierName = builder.accountIdentifierName;
        this.network = builder.network;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public WalletDepositInstructionType getType() {
        return type;
    }

    public String getAddress() {
        return address;
    }

    public String getAccountIdentifier() {
        return accountIdentifier;
    }

    public String getAccountIdentifierName() {
        return accountIdentifierName;
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

    public void setType(WalletDepositInstructionType type) {
        this.type = type;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAccountIdentifier(String accountIdentifier) {
        this.accountIdentifier = accountIdentifier;
    }

    public void setAccountIdentifierName(String accountIdentifierName) {
        this.accountIdentifierName = accountIdentifierName;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public static class Builder {
        private String id;

        private String name;

        private WalletDepositInstructionType type;

        private String address;

        private String accountIdentifier;

        private String accountIdentifierName;

        private Network network;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder type(WalletDepositInstructionType type) {
            this.type = type;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder accountIdentifier(String accountIdentifier) {
            this.accountIdentifier = accountIdentifier;
            return this;
        }

        public Builder accountIdentifierName(String accountIdentifierName) {
            this.accountIdentifierName = accountIdentifierName;
            return this;
        }

        public Builder network(Network network) {
            this.network = network;
            return this;
        }

        public WalletCryptoDepositInstructions build() {
            return new WalletCryptoDepositInstructions(this);
        }
    }
}
