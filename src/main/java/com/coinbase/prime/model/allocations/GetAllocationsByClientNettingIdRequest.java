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

package com.coinbase.prime.model.allocations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetAllocationsByClientNettingIdRequest {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    @JsonProperty("netting_id")
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
        private String portfolioId;
        private String nettingId;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder nettingId(String nettingId) {
            this.nettingId = nettingId;
            return this;
        }

        public GetAllocationsByClientNettingIdRequest build() {
            return new GetAllocationsByClientNettingIdRequest(this);
        }
    }
}
