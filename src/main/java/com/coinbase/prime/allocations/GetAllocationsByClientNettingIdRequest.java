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

package com.coinbase.prime.allocations;

import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;

public class GetAllocationsByClientNettingIdRequest {
    @JsonProperty(required = true, value = "portfolio_id")
    @JsonIgnore
    private String portfolioId;
    @JsonProperty(required = true, value = "netting_id")
    @JsonIgnore
    private String nettingId;

    public GetAllocationsByClientNettingIdRequest() {
    }

    public GetAllocationsByClientNettingIdRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.nettingId = builder.nettingId;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getNettingId() {
        return nettingId;
    }

    public void setNettingId(String nettingId) {
        this.nettingId = nettingId;
    }

    public static class Builder {
        private final String portfolioId;
        private final String nettingId;

        public Builder(String portfolioId, String nettingId) {
            this.portfolioId = portfolioId;
            this.nettingId = nettingId;
        }

        public GetAllocationsByClientNettingIdRequest build() throws CoinbaseClientException {
            this.validate();
            return new GetAllocationsByClientNettingIdRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.portfolioId)) {
                throw new CoinbaseClientException("PortfolioId is required");
            }

            if (isNullOrEmpty(this.nettingId)) {
                throw new CoinbaseClientException("NettingId is required");
            }
        }
    }
}
