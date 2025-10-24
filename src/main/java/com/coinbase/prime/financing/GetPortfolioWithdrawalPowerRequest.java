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

package com.coinbase.prime.financing;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPortfolioWithdrawalPowerRequest {
    @JsonIgnore
    @JsonProperty(required = true, value = "portfolio_id")
    private String portfolioId;

    @JsonProperty(required = true)
    private String symbol;

    public GetPortfolioWithdrawalPowerRequest() {
    }

    public GetPortfolioWithdrawalPowerRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.symbol = builder.symbol;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public static class Builder {
        private String portfolioId;
        private String symbol;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public GetPortfolioWithdrawalPowerRequest build() {
            return new GetPortfolioWithdrawalPowerRequest(this);
        }
    }
}
