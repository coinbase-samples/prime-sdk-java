/*
 * Copyright 2025-present Coinbase Global, Inc.
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

public class WithdrawalPower {
    private String symbol;

    private String amount;

    public WithdrawalPower() {
    }

    public WithdrawalPower(WithdrawalPower.Builder builder) {
        this.symbol = builder.symbol;
        this.amount = builder.amount;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public static class Builder {
        private String symbol;
        private String amount;

        public Builder() {
        }

        public WithdrawalPower.Builder withSymbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public WithdrawalPower.Builder withAmount(String amount) {
            this.amount = amount;
            return this;
        }

        public WithdrawalPower build() {
            return new WithdrawalPower(this);
        }
    }
}
