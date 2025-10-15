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

package com.coinbase.prime.onchainaddressbook;

import com.coinbase.prime.common.PrimeListRequest;
import com.coinbase.prime.model.enums.SortDirection;

/**
 * Request for listing onchain address groups for a portfolio.
 */
public class ListOnchainAddressGroupsRequest extends PrimeListRequest {
    private String portfolioId;

    public ListOnchainAddressGroupsRequest() {
    }

    private ListOnchainAddressGroupsRequest(Builder builder) {
        super(builder.cursor, builder.sortDirection != null ? SortDirection.valueOf(builder.sortDirection) : null, builder.limit);
        this.portfolioId = builder.portfolioId;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getPath() {
        return String.format("/v1/portfolios/%s/onchain_address_groups", this.portfolioId);
    }

    public static class Builder {
        private String portfolioId;
        private String cursor;
        private String sortDirection;
        private Integer limit;

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder sortDirection(String sortDirection) {
            this.sortDirection = sortDirection;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public ListOnchainAddressGroupsRequest build() {
            return new ListOnchainAddressGroupsRequest(this);
        }
    }
}

