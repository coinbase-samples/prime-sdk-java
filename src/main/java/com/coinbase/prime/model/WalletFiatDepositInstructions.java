// Copyright 2024-present Coinbase Global, Inc.
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

public class WalletFiatDepositInstructions {
    private String id;

    private String name;

    private WalletDepositInstructionType type;

    private String accountNumber;

    private String routingNumber;

    private String referenceCode;

    public WalletFiatDepositInstructions() {
    }

    public WalletFiatDepositInstructions(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.type = builder.type;
        this.accountNumber = builder.accountNumber;
        this.routingNumber = builder.routingNumber;
        this.referenceCode = builder.referenceCode;
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

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public String getReferenceCode() {
        return referenceCode;
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

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public void setReferenceCode(String referenceCode) {
        this.referenceCode = referenceCode;
    }

    public static class Builder {
        private String id;

        private String name;

        private WalletDepositInstructionType type;

        private String accountNumber;

        private String routingNumber;

        private String referenceCode;

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

        public Builder accountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public Builder routingNumber(String routingNumber) {
            this.routingNumber = routingNumber;
            return this;
        }

        public Builder referenceCode(String referenceCode) {
            this.referenceCode = referenceCode;
            return this;
        }

        public WalletFiatDepositInstructions build() {
            return new WalletFiatDepositInstructions(this);
        }
    }
}
