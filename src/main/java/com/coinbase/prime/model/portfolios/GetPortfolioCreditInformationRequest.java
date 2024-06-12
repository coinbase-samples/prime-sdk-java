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

package com.coinbase.prime.model.portfolios;

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.core.http.CoinbaseGetRequest;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;

public class GetPortfolioCreditInformationRequest extends CoinbaseGetRequest {
    @JsonProperty(required = true, value = "portfolio_id")
    private String portfolioId;

    public GetPortfolioCreditInformationRequest() {
    }

    public GetPortfolioCreditInformationRequest(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public GetPortfolioCreditInformationRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
    }

    @Override
    public String getQueryString() {
        return "";
    }

    @Override
    public String getPath() {
        return String.format("/portfolios/%s/credit", this.getPortfolioId());
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public static class Builder {
        private String portfolioId;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public GetPortfolioCreditInformationRequest build() throws CoinbaseClientException {
            this.validate();
            return new GetPortfolioCreditInformationRequest(this);
        }

        private void validate() {
            if (isNullOrEmpty(this.portfolioId)) {
                throw new CoinbaseClientException("PortfolioId cannot be null");
            }
        }
    }
}
