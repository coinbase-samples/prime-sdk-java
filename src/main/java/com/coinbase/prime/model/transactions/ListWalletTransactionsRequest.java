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

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.core.http.CoinbaseGetRequest;
import com.coinbase.prime.model.common.PaginationParams;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.appendQueryParams;
import static com.coinbase.core.utils.Utils.isNullOrEmpty;

public class ListWalletTransactionsRequest extends CoinbaseGetRequest {
    @JsonProperty(required = true, value = "portfolio_id")
    private String portfolioId;
    @JsonProperty(required = true, value = "wallet_id")
    private String walletId;
    private TransactionType type;
    @JsonProperty("start_time")
    private String startTime;
    @JsonProperty("end_time")
    private String endTime;
    private PaginationParams paginationParams;

    public ListWalletTransactionsRequest() {
    }

    public ListWalletTransactionsRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.walletId = builder.walletId;
        this.type = builder.type;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.paginationParams = builder.paginationParams;
    }

    @Override
    public String getQueryString() {
        String queryString = "";

        queryString = appendQueryParams(queryString, "type", this.getType().name());
        queryString = appendQueryParams(queryString, "start_time", this.getStartTime());
        queryString = appendQueryParams(queryString, "end_time", this.getEndTime());
        if (this.getPaginationParams() != null) {
            queryString = this.getPaginationParams().generateQueryString(queryString);
        }

        return queryString;
    }

    @Override
    public String getPath() {
        return String.format("/portfolios/%s/wallets/%s/transactions", this.getPortfolioId(), this.getWalletId());
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
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
        private String walletId;
        private TransactionType type;
        private String startTime;
        private String endTime;
        private PaginationParams paginationParams;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder walletId(String walletId) {
            this.walletId = walletId;
            return this;
        }

        public Builder type(TransactionType type) {
            this.type = type;
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

        public ListWalletTransactionsRequest build() throws CoinbaseClientException {
            this.validate();
            return new ListWalletTransactionsRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.portfolioId)) {
                throw new CoinbaseClientException("PortfolioId is required");
            }

            if (isNullOrEmpty(this.walletId)) {
                throw new CoinbaseClientException("WalletId is required");
            }
        }
    }
}
