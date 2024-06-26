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

package com.coinbase.prime.model.addressbook;

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.core.http.CoinbaseGetRequest;
import com.coinbase.prime.model.common.PaginationParams;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.appendQueryParams;

public class GetPortfolioAddressBookRequest extends CoinbaseGetRequest {
    @JsonProperty(required = true, value = "portfolio_id")
    private String portfolioId;
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    private String search;
    private PaginationParams paginationParams;

    public GetPortfolioAddressBookRequest() {
    }

    public GetPortfolioAddressBookRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.currencySymbol = builder.currencySymbol;
        this.search = builder.search;
        this.paginationParams = builder.paginationParams;
    }

    @Override
    public String getQueryString() {
        String queryParams = "";
        if (this.getCurrencySymbol() != null) {
            queryParams = appendQueryParams(queryParams, "currency_symbol", this.getCurrencySymbol());
        }
        if (this.getSearch() != null) {
            queryParams = appendQueryParams(queryParams, "search", this.getSearch());
        }
        if (this.getPaginationParams() != null) {
            queryParams = this.getPaginationParams().generateQueryString(queryParams);
        }
        return queryParams;
    }

    @Override
    public String getPath() {
        return String.format("/portfolios/%s/address_book", this.getPortfolioId());
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public PaginationParams getPaginationParams() {
        return paginationParams;
    }

    public void setPaginationParams(PaginationParams paginationParams) {
        this.paginationParams = paginationParams;
    }

    public static class Builder {
        private final String portfolioId;
        private String currencySymbol;
        private String search;
        private PaginationParams paginationParams;

        public Builder(String portfolioId) {
            this.portfolioId = portfolioId;
        }

        public Builder currencySymbol(String currencySymbol) {
            this.currencySymbol = currencySymbol;
            return this;
        }

        public Builder search(String search) {
            this.search = search;
            return this;
        }

        public Builder paginationParams(PaginationParams paginationParams) {
            this.paginationParams = paginationParams;
            return this;
        }

        public GetPortfolioAddressBookRequest build() throws CoinbaseClientException {
            this.validate();
            return new GetPortfolioAddressBookRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (this.portfolioId == null) {
                throw new CoinbaseClientException("PortfolioId is required");
            }
        }
    }
}
