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
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetTransactionByTransactionIdRequest extends CoinbaseGetRequest {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    @JsonProperty("transaction_id")
    private String transactionId;

    public GetTransactionByTransactionIdRequest() {
    }

    public GetTransactionByTransactionIdRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.transactionId = builder.transactionId;
    }

    @Override
    public String getQueryString() {
        return "";
    }

    @Override
    public String getPath() {
        return String.format("/portfolios/%s/transactions/%s", this.getPortfolioId(), this.getTransactionId());
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public static class Builder {
        private String portfolioId;
        private String transactionId;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder transactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        public GetTransactionByTransactionIdRequest build() {
            return new GetTransactionByTransactionIdRequest(this);
        }
    }
}
