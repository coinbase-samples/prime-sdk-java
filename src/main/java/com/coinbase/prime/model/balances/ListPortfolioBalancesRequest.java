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

package com.coinbase.prime.model.balances;

import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.prime.utils.Utils.appendAllQueryParams;
import static com.coinbase.prime.utils.Utils.appendQueryParams;

public class ListPortfolioBalancesRequest {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    private String[] symbols;
    @JsonProperty("balance_type")
    private String balanceType;

    public ListPortfolioBalancesRequest() {
    }

    public ListPortfolioBalancesRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.symbols = builder.symbols;
        this.balanceType = builder.balanceType;
    }

    public String getQueryString() {
        String queryString = appendAllQueryParams(this.getSymbols(), "symbols", "");
        queryString = appendQueryParams(queryString, "balance_type", this.getBalanceType());
        return queryString;
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

    public String getBalanceType() {
        return balanceType;
    }

    public void setBalanceType(String balanceType) {
        this.balanceType = balanceType;
    }

    public static class Builder {
        private String portfolioId;
        private String[] symbols;
        private String balanceType;

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder symbols(String[] symbols) {
            this.symbols = symbols;
            return this;
        }

        public Builder balanceType(String balanceType) {
            this.balanceType = balanceType;
            return this;
        }

        public ListPortfolioBalancesRequest build() {
            return new ListPortfolioBalancesRequest(this);
        }
    }
}
