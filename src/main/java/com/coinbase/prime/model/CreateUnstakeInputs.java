/*
 * Copyright 2024-present Coinbase Global, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.coinbase.prime.model;

/**
 * Custom inputs for unstaking operations on a wallet. Requirements and supported fields vary by asset type.
 */
public class CreateUnstakeInputs {
    /** Optional amount to unstake (ETH only). If omitted, the wallet will unstake the maximum amount available */
    private String amount;

    public CreateUnstakeInputs() {
    }

    public CreateUnstakeInputs(Builder builder) {
        this.amount = builder.amount;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public static class Builder {
        private String amount;

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public CreateUnstakeInputs build() {
            return new CreateUnstakeInputs(this);
        }
    }
}