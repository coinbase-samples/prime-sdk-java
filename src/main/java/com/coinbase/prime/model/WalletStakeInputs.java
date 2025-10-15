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

public class WalletStakeInputs {
    private String amount;

    private String validatorAddress;

    public WalletStakeInputs() {
    }

    public WalletStakeInputs(Builder builder) {
        this.amount = builder.amount;
        this.validatorAddress = builder.validatorAddress;
    }

    public String getAmount() {
        return amount;
    }

    public String getValidatorAddress() {
        return validatorAddress;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setValidatorAddress(String validatorAddress) {
        this.validatorAddress = validatorAddress;
    }

    public static class Builder {
        private String amount;

        private String validatorAddress;

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder validatorAddress(String validatorAddress) {
            this.validatorAddress = validatorAddress;
            return this;
        }

        public WalletStakeInputs build() {
            return new WalletStakeInputs(this);
        }
    }
}
