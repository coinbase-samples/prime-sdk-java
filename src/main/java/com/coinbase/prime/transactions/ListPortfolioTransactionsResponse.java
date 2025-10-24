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

import com.coinbase.prime.common.Pagination;
import com.coinbase.prime.model.Transaction;

/**
 * Response object for listing transactions for a given portfolio.
 * 
 * Contains an array of transactions and pagination information. Only transactions 
 * that affect balances are accessible.
 */
public class ListPortfolioTransactionsResponse {
    /** Array of transactions for the portfolio */
    private Transaction[] transactions;
    /** Pagination information for the transaction listing */
    private Pagination pagination;

    public ListPortfolioTransactionsResponse() {
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

}
