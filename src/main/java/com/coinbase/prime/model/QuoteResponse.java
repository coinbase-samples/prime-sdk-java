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

package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuoteResponse {
    @JsonProperty("quote_id")
    private String quoteId;
    @JsonProperty("expiration_time")
    private String expirationTime;
    @JsonProperty("best_price")
    private String bestPrice;
    @JsonProperty("order_total")
    private String orderTotal;
    @JsonProperty("price_inclusive_of_fees")
    private String priceInclusiveOfFees;

    public QuoteResponse() {
    }

    public QuoteResponse(Builder builder) {
        this.quoteId = builder.quoteId;
        this.expirationTime = builder.expirationTime;
        this.bestPrice = builder.bestPrice;
        this.orderTotal = builder.orderTotal;
        this.priceInclusiveOfFees = builder.priceInclusiveOfFees;
    }

    public String getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }

    public String getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    public String getBestPrice() {
        return bestPrice;
    }

    public void setBestPrice(String bestPrice) {
        this.bestPrice = bestPrice;
    }

    public String getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(String orderTotal) {
        this.orderTotal = orderTotal;
    }

    public String getPriceInclusiveOfFees() {
        return priceInclusiveOfFees;
    }

    public void setPriceInclusiveOfFees(String priceInclusiveOfFees) {
        this.priceInclusiveOfFees = priceInclusiveOfFees;
    }

    public static class Builder {
        private String quoteId;
        private String expirationTime;
        private String bestPrice;
        private String orderTotal;
        private String priceInclusiveOfFees;

        public Builder() {
        }

        public Builder quoteId(String quoteId) {
            this.quoteId = quoteId;
            return this;
        }

        public Builder expirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        public Builder bestPrice(String bestPrice) {
            this.bestPrice = bestPrice;
            return this;
        }

        public Builder orderTotal(String orderTotal) {
            this.orderTotal = orderTotal;
            return this;
        }

        public Builder priceInclusiveOfFees(String priceInclusiveOfFees) {
            this.priceInclusiveOfFees = priceInclusiveOfFees;
            return this;
        }

        public QuoteResponse build() {
            return new QuoteResponse(this);
        }
    }
}