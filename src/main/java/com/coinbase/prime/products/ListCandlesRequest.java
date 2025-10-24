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

package com.coinbase.prime.products;

import com.coinbase.prime.model.enums.CandlesGranularity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request object for listing public product candles.
 */
public class ListCandlesRequest {
    @JsonIgnore
    @JsonProperty(required = true, value = "portfolio_id")
    private String portfolioId;

    @JsonProperty(required = true, value = "product_id")
    private String productId;

    @JsonProperty("start_time")
    private String startTime;

    @JsonProperty("end_time")
    private String endTime;

    @JsonProperty(required = true, value = "granularity")
    private CandlesGranularity granularity;

    public ListCandlesRequest() {
    }

    public ListCandlesRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.productId = builder.productId;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.granularity = builder.granularity;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public CandlesGranularity getGranularity() {
        return granularity;
    }

    public void setGranularity(CandlesGranularity granularity) {
        this.granularity = granularity;
    }

    public static class Builder {
        private String portfolioId;
        private String productId;
        private String startTime;
        private String endTime;
        private CandlesGranularity granularity;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder granularity(CandlesGranularity granularity) {
            this.granularity = granularity;
            return this;
        }

        public ListCandlesRequest build() {
            return new ListCandlesRequest(this);
        }
    }
}

