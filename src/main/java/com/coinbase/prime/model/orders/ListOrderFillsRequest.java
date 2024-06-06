/*
 *
 *  Copyright 2024-present Coinbase Global, Inc.
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
 *
 */

package com.coinbase.prime.model.orders;

import com.coinbase.prime.model.common.PaginationParams;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListOrderFillsRequest {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    @JsonProperty("order_id")
    private String orderId;
    private PaginationParams paginationParams;

    public ListOrderFillsRequest() {
    }

    public ListOrderFillsRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.orderId = builder.orderId;
        this.paginationParams = builder.paginationParams;
    }

    public String getQueryString() {
        return paginationParams != null ? paginationParams.generateQueryString("") : "";
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public PaginationParams getPaginationParams() {
        return paginationParams;
    }

    public void setPaginationParams(PaginationParams paginationParams) {
        this.paginationParams = paginationParams;
    }

    public static class Builder {
        private String portfolioId;
        private String orderId;
        private PaginationParams paginationParams;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder paginationParams(PaginationParams paginationParams) {
            this.paginationParams = paginationParams;
            return this;
        }

        public ListOrderFillsRequest build() {
            return new ListOrderFillsRequest(this);
        }
    }
}
