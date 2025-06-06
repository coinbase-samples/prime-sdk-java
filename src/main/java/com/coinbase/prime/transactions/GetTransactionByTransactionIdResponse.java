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

package com.coinbase.prime.transactions;

import com.coinbase.prime.model.Transaction;

public class GetTransactionByTransactionIdResponse {
    private Transaction transaction;

    public GetTransactionByTransactionIdResponse() {
    }

    public GetTransactionByTransactionIdResponse(Builder builder) {
        this.transaction = builder.transaction;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public static class Builder {
        private Transaction transaction;

        public Builder() {
        }

        public Builder transaction(Transaction transaction) {
            this.transaction = transaction;
            return this;
        }

        public GetTransactionByTransactionIdResponse build() {
            return new GetTransactionByTransactionIdResponse(this);
        }
    }
}
