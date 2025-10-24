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

package com.coinbase.prime.addressbook;

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.common.PrimeListRequest;
import com.coinbase.prime.common.Pagination;
import com.coinbase.prime.model.enums.SortDirection;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.*;

public class ListAddressBookRequest extends PrimeListRequest {
    @JsonProperty(required = true, value = "portfolio_id")
    @JsonIgnore
    private String portfolioId;
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    private String search;

    public ListAddressBookRequest() {
    }

    public ListAddressBookRequest(Builder builder) {
        super(builder.cursor, builder.sortDirection, builder.limit);
        this.portfolioId = builder.portfolioId;
        this.currencySymbol = builder.currencySymbol;
        this.search = builder.search;
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

    public static class Builder {
        private final String portfolioId;
        private String currencySymbol;
        private String search;
        private String cursor;
        private SortDirection sortDirection;
        private Integer limit;

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

        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            this.cursor = pagination.getNextCursor();
            this.sortDirection = pagination.getSortDirection();
            return this;
        }

        public ListAddressBookRequest build() throws CoinbaseClientException {
            this.validate();
            return new ListAddressBookRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.portfolioId)) {
                throw new CoinbaseClientException("PortfolioId is required");
            }
        }
    }
}
