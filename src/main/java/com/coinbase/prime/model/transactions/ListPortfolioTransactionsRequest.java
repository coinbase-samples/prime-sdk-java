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

package com.coinbase.prime.model.transactions;

import com.coinbase.core.http.CoinbaseGetRequest;
import com.coinbase.prime.model.common.PaginationParams;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.appendAllQueryParams;
import static com.coinbase.core.utils.Utils.appendQueryParams;

public class ListPortfolioTransactionsRequest extends CoinbaseGetRequest {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    private String[] symbols;
    private TransactionType[] types;
    @JsonProperty("start_time")
    private String startTime;
    @JsonProperty("end_time")
    private String endTime;
    private PaginationParams paginationParams;

    public ListPortfolioTransactionsRequest() {
    }

    public ListPortfolioTransactionsRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.symbols = builder.symbols;
        this.types = builder.types;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.paginationParams = builder.paginationParams;
    }

    @Override
    public String getQueryString() {
        String queryString = this.getPaginationParams() != null ? this.getPaginationParams().generateQueryString("") : "";
        appendAllQueryParams(this.getSymbols(), "symbols", queryString);
        appendAllQueryParams(this.getTypes(), "types", queryString);
        queryString = appendQueryParams(queryString, "start_time", this.getStartTime());
        queryString = appendQueryParams(queryString, "end_time", this.getEndTime());

        return queryString;
    }

    @Override
    public String getPath() {
        return String.format("/portfolios/%s/transactions", this.getPortfolioId());
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String[] getSymbols() {
        return symbols;
    }

    public void setSymbols(String[] symbols) {
        this.symbols = symbols;
    }

    public TransactionType[] getTypes() {
        return types;
    }

    public void setTypes(TransactionType[] types) {
        this.types = types;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public PaginationParams getPaginationParams() {
        return paginationParams;
    }

    public void setPaginationParams(PaginationParams paginationParams) {
        this.paginationParams = paginationParams;
    }

    public static class Builder {
        private String portfolioId;
        private String[] symbols;
        private TransactionType[] types;
        private String startTime;
        private String endTime;
        private PaginationParams paginationParams;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder symbols(String[] symbols) {
            this.symbols = symbols;
            return this;
        }

        public Builder types(TransactionType[] types) {
            this.types = types;
            return this;
        }

        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder paginationParams(PaginationParams paginationParams) {
            this.paginationParams = paginationParams;
            return this;
        }

        public ListPortfolioTransactionsRequest build() {
            return new ListPortfolioTransactionsRequest(this);
        }
    }
}
