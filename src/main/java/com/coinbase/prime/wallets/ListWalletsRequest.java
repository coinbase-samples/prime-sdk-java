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

package com.coinbase.prime.wallets;

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.common.PrimeListRequest;
import com.coinbase.prime.common.Pagination;
import com.coinbase.prime.model.enums.WalletType;
import com.coinbase.prime.model.enums.SortDirection;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.*;

public class ListWalletsRequest extends PrimeListRequest {
    @JsonProperty(required = true, value = "portfolio_id")
    @JsonIgnore
    private String portfolioId;

    private WalletType type;

    private String[] symbols;

    public ListWalletsRequest() {}

    public ListWalletsRequest(Builder builder) {
        super(builder.cursor, builder.sortDirection, builder.limit);
        this.portfolioId = builder.portfolioId;
        this.type = builder.type;
        this.symbols = builder.symbols;
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

    public static class Builder {
        private String portfolioId;
        private WalletType type;
        private String[] symbols;
        private String cursor;
        private SortDirection sortDirection;
        private Integer limit;

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

        public Builder pagination(Pagination pagination) {
            this.cursor = pagination.getNextCursor();
            this.sortDirection = pagination.getSortDirection();
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public ListWalletsRequest build() throws CoinbaseClientException {
            this.validate();
            return new ListWalletsRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.portfolioId)) {
                throw new CoinbaseClientException("PortfolioId is required");
            }
        }
    }
}
