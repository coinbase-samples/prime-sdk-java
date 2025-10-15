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

public class RequestAmount {
    private String currency;
    private String amount;

    public RequestAmount() {
    }

    public RequestAmount(Builder builder) {
        this.currency = builder.currency;
        this.amount = builder.amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public static class Builder {
        private String currency;
        private String amount;

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public RequestAmount build() {
            return new RequestAmount(this);
        }
    }
}
