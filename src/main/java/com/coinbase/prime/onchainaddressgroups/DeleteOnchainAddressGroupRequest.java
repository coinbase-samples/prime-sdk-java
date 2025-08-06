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

package com.coinbase.prime.onchainaddressgroups;

/**
 * Request for deleting an onchain address group.
 */
public class DeleteOnchainAddressGroupRequest {
    private String portfolioId;
    private String addressGroupId;

    public DeleteOnchainAddressGroupRequest() {
    }

    private DeleteOnchainAddressGroupRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.addressGroupId = builder.addressGroupId;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getAddressGroupId() {
        return addressGroupId;
    }

    public void setAddressGroupId(String addressGroupId) {
        this.addressGroupId = addressGroupId;
    }

    public String getPath() {
        return String.format("/v1/portfolios/%s/onchain_address_group/%s", this.portfolioId, this.addressGroupId);
    }

    public static class Builder {
        private String portfolioId;
        private String addressGroupId;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder addressGroupId(String addressGroupId) {
            this.addressGroupId = addressGroupId;
            return this;
        }

        public DeleteOnchainAddressGroupRequest build() {
            return new DeleteOnchainAddressGroupRequest(this);
        }
    }
}