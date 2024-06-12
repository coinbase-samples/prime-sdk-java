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

package com.coinbase.prime.model.wallets;

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.core.http.CoinbaseGetRequest;
import com.coinbase.prime.model.common.PaginationParams;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.*;

public class ListWalletsRequest extends CoinbaseGetRequest {
    @JsonProperty(required = true, value = "portfolio_id")
    private String portfolioId;

    private WalletType type;

    private String[] symbols;

    @JsonProperty("pagination_params")
    private PaginationParams paginationParams;

    public ListWalletsRequest() {}

    public ListWalletsRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.type = builder.type;
        this.symbols = builder.symbols;
        this.paginationParams = builder.paginationParams;
    }

    @Override
    public String getPath() {
        return String.format("/portfolios/%s/wallets", this.getPortfolioId());
    }

    @Override
    public String getQueryString() {
        String queryString = this.getPaginationParams() != null ? this.getPaginationParams().generateQueryString("") : "";
        queryString = appendAllQueryParams(this.getSymbols(), "symbols", queryString);
        queryString = appendQueryParams(queryString, "type", this.getType().name());
        return queryString;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public WalletType getType() {
        return type;
    }

    public void setType(WalletType type) {
        this.type = type;
    }

    public String[] getSymbols() {
        return symbols;
    }

    public void setSymbols(String[] symbols) {
        this.symbols = symbols;
    }

    public PaginationParams getPaginationParams() {
        return paginationParams;
    }

    public void setPaginationParams(PaginationParams paginationParams) {
        this.paginationParams = paginationParams;
    }

    public static class Builder {
        private String portfolioId;
        private WalletType type;
        private String[] symbols;
        private PaginationParams paginationParams;

        public Builder() {}

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder type(WalletType type) {
            this.type = type;
            return this;
        }

        public Builder symbols(String[] symbols) {
            this.symbols = symbols;
            return this;
        }

        public Builder paginationParams(PaginationParams paginationParams) {
            this.paginationParams = paginationParams;
            return this;
        }

        public ListWalletsRequest build() throws CoinbaseClientException {
            this.validate();
            return new ListWalletsRequest(this);
        }

        private void validate() {
            if (isNullOrEmpty(this.portfolioId)) {
                throw new CoinbaseClientException("PortfolioId is required");
            }
        }
    }
}
