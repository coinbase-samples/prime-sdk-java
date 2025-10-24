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

package com.coinbase.prime.portfolios;

import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.*;

public class GetPortfolioRequest {
    @JsonProperty(required = true, value = "portfolio_id")
    @JsonIgnore
    private String portfolioId;

    public GetPortfolioRequest() {
    }

    public GetPortfolioRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public static class Builder {
        private final String portfolioId;

        public Builder(String portfolioId) {
            this.portfolioId = portfolioId;
        }

        public GetPortfolioRequest build() throws CoinbaseClientException {
            this.validate();
            return new GetPortfolioRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.portfolioId)) {
                throw new CoinbaseClientException("PortfolioId is required");
            }
        }
    }
}
