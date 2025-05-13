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

import com.coinbase.prime.model.Pagination;
import com.coinbase.prime.model.Transaction;

public class ListWalletTransactionsResponse {
    private Transaction[] transactions;
    private Pagination pagination;
    private ListWalletTransactionsRequest request;

    public ListWalletTransactionsResponse() {
    }

    public ListWalletTransactionsResponse(Builder builder) {
        this.transactions = builder.transactions;
        this.pagination = builder.pagination;
        this.request = builder.request;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }

    public void setTransactions(Transaction[] transactions) {
        this.transactions = transactions;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public ListWalletTransactionsRequest getRequest() {
        return request;
    }

    public void setRequest(ListWalletTransactionsRequest request) {
        this.request = request;
    }

    public static class Builder {
        private Transaction[] transactions;
        private Pagination pagination;
        private ListWalletTransactionsRequest request;

        public Builder() {
        }

        public Builder transactions(Transaction[] transactions) {
            this.transactions = transactions;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            this.pagination = pagination;
            return this;
        }

        public Builder request(ListWalletTransactionsRequest request) {
            this.request = request;
            return this;
        }

        public ListWalletTransactionsResponse build() {
            return new ListWalletTransactionsResponse(this);
        }
    }
}
