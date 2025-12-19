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

package com.coinbase.prime.staking;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetUnstakingStatusRequest {
    @JsonIgnore
    @JsonProperty(required = true, value = "portfolio_id")
    private String portfolioId;

    @JsonIgnore
    @JsonProperty(required = true, value = "wallet_id")
    private String walletId;

    public GetUnstakingStatusRequest() {
    }

    public GetUnstakingStatusRequest(Builder builder) {
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

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder walletId(String walletId) {
            this.walletId = walletId;
            return this;
        }

        public GetUnstakingStatusRequest build() {
            return new GetUnstakingStatusRequest(this);
        }
    }
}
