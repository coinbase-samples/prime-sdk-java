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

public class GetAllocationRequest {
    @JsonProperty(required = true, value = "portfolio_id")
    @JsonIgnore
    private String portfolioId;

    @JsonProperty(required = true, value = "allocation_id")
    @JsonIgnore
    private String allocationId;

    public GetAllocationRequest() {
    }

    public GetAllocationRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.allocationId = builder.allocationId;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getAllocationId() {
        return allocationId;
    }

    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    public static class Builder {
        private final String portfolioId;
        private final String allocationId;

        public Builder(String portfolioId, String allocationId) {
            this.portfolioId = portfolioId;
            this.allocationId = allocationId;
        }

        public GetAllocationRequest build() throws CoinbaseClientException {
            this.validate();
            return new GetAllocationRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.portfolioId)) {
                throw new CoinbaseClientException("PortfolioId is required");
            }

            if (isNullOrEmpty(this.allocationId)) {
                throw new CoinbaseClientException("AllocationId is required");
            }
        }
    }
}
