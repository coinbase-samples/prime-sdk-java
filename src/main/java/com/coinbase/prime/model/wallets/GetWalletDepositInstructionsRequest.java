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

import com.coinbase.core.http.CoinbaseGetRequest;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetWalletDepositInstructionsRequest extends CoinbaseGetRequest {
    @JsonProperty("portfolio_id")
    private String portfolioId;

    @JsonProperty("wallet_id")
    private String walletId;

    public GetWalletDepositInstructionsRequest() {
    }

    public GetWalletDepositInstructionsRequest(GetWalletDepositInstructionsRequest.Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.walletId = builder.walletId;
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

    public static class Builder {
        private String portfolioId;
        private String walletId;

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

        public GetWalletDepositInstructionsRequest build() {
            return new GetWalletDepositInstructionsRequest(this);
        }
    }
}
