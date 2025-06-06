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

package com.coinbase.prime.transactions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateOnchainTransactionResponse {
    @JsonProperty("transaction_id")
    private String transactionId;

    public CreateOnchainTransactionResponse() {
    }

    public CreateOnchainTransactionResponse(Builder builder) {
        this.transactionId = builder.transactionId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public static class Builder {
        private String transactionId;

        public Builder() {
        }

        public Builder transactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        public CreateOnchainTransactionResponse build() {
            return new CreateOnchainTransactionResponse(this);
        }
    }
}
