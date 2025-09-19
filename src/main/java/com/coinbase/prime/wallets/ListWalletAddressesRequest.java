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

package com.coinbase.prime.wallets;

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.common.PrimeListRequest;
import com.coinbase.prime.model.enums.SortDirection;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;

public class ListWalletAddressesRequest extends PrimeListRequest {
    @JsonProperty("portfolio_id")
    @JsonIgnore
    private String portfolioId;
    @JsonProperty("wallet_id")
    @JsonIgnore
    private String walletId;
    @JsonProperty("network_id")
    private String networkId;

    public ListWalletAddressesRequest() {
    }

    public ListWalletAddressesRequest(Builder builder) {
        super(builder.cursor, builder.sortDirection, builder.limit);
        this.portfolioId = builder.portfolioId;
        this.walletId = builder.walletId;
        this.networkId = builder.networkId;
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

    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }


    public static class Builder {
        private String portfolioId;
        private String walletId;
        private String networkId;
        private String cursor;
        private Integer limit;
        private SortDirection sortDirection;

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

        public Builder networkId(String networkId) {
            this.networkId = networkId;
            return this;
        }


        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder sortDirection(SortDirection sortDirection) {
            this.sortDirection = sortDirection;
            return this;
        }

        public ListWalletAddressesRequest build() throws CoinbaseClientException {
            this.validate();
            return new ListWalletAddressesRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.portfolioId)) {
                throw new CoinbaseClientException("Portfolio ID is required");
            }
            if (isNullOrEmpty(this.walletId)) {
                throw new CoinbaseClientException("Wallet ID is required");
            }
            if (isNullOrEmpty(this.networkId)) {
                throw new CoinbaseClientException("Network ID is required");
            }
        }
    }
}