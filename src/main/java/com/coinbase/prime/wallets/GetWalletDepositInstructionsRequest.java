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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;

public class GetWalletDepositInstructionsRequest {
    @JsonProperty(required = true, value = "portfolio_id")
    @JsonIgnore
    private String portfolioId;

    @JsonProperty(required = true, value = "wallet_id")
    @JsonIgnore
    private String walletId;

    @JsonProperty(required = true, value = "deposit_type")
    private String depositType;

    @JsonProperty("network.id")
    private String networkId;

    @JsonProperty("network.type")
    private String networkType;

    public GetWalletDepositInstructionsRequest() {
    }

    public GetWalletDepositInstructionsRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.walletId = builder.walletId;
        this.depositType = builder.depositType;
        this.networkId = builder.networkId;
        this.networkType = builder.networkType;
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

    public String getDepositType() {
        return depositType;
    }

    public void setDepositType(String depositType) {
        this.depositType = depositType;
    }

    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public static class Builder {
        private String portfolioId;
        private String walletId;
        private String depositType;
        private String networkId;
        private String networkType;

        public Builder() {
        }

        public GetWalletDepositInstructionsRequest.Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public GetWalletDepositInstructionsRequest.Builder walletId(String walletId) {
            this.walletId = walletId;
            return this;
        }

        public GetWalletDepositInstructionsRequest.Builder depositType(String depositType) {
            this.depositType = depositType;
            return this;
        }

        public GetWalletDepositInstructionsRequest.Builder networkId(String networkId) {
            this.networkId = networkId;
            return this;
        }

        public GetWalletDepositInstructionsRequest.Builder networkType(String networkType) {
            this.networkType = networkType;
            return this;
        }

        public GetWalletDepositInstructionsRequest build() throws CoinbaseClientException {
            this.validate();
            return new GetWalletDepositInstructionsRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.portfolioId)) {
                throw new CoinbaseClientException("PortfolioId cannot be null");
            }

            if (isNullOrEmpty(this.walletId)) {
                throw new CoinbaseClientException("WalletId cannot be null");
            }

            if (isNullOrEmpty(this.depositType)) {
                throw new CoinbaseClientException("DepositType cannot be null");
            }
        }
    }
}
