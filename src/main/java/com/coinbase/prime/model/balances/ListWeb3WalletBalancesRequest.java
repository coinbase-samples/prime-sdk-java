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

import com.coinbase.core.http.CoinbaseGetRequest;
import com.coinbase.prime.model.common.PaginationParams;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.appendAllQueryParams;

public class ListWeb3WalletBalancesRequest extends CoinbaseGetRequest {
    @JsonProperty(required = true, value = "portfolio_id")
    private String portfolioId;
    @JsonProperty(required = true, value = "wallet_id")
    private String walletId;
    @JsonProperty("visibility_statuses")
    private VisibilityStatus[] visibilityStatuses;
    private PaginationParams paginationParams;

    public ListWeb3WalletBalancesRequest() {
    }

    public ListWeb3WalletBalancesRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.walletId = builder.walletId;
        this.visibilityStatuses = builder.visibilityStatuses;
        this.paginationParams = builder.paginationParams;
    }

    @Override
    public String getQueryString() {
        String queryString = this.getPaginationParams() != null ? this.getPaginationParams().generateQueryString("") : "";
        queryString = appendAllQueryParams(this.getVisibilityStatuses(), "visibility_statuses", queryString);

        return queryString;
    }

    @Override
    public String getPath() {
        return String.format("/portfolios/%s/wallets/%s/web3_balances", this.getPortfolioId(), this.getWalletId());
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

    public VisibilityStatus[] getVisibilityStatuses() {
        return visibilityStatuses;
    }

    public void setVisibilityStatuses(VisibilityStatus[] visibilityStatuses) {
        this.visibilityStatuses = visibilityStatuses;
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
        private VisibilityStatus[] visibilityStatuses;
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

        public Builder visibilityStatuses(VisibilityStatus[] visibilityStatuses) {
            this.visibilityStatuses = visibilityStatuses;
            return this;
        }

        public Builder paginationParams(PaginationParams paginationParams) {
            this.paginationParams = paginationParams;
            return this;
        }

        public ListWeb3WalletBalancesRequest build() {
            return new ListWeb3WalletBalancesRequest(this);
        }
    }
}
