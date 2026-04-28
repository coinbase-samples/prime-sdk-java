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

package com.coinbase.prime.orders;

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.model.enums.OrderSide;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;

/**
 * Accept Quote
 */
public class AcceptQuoteRequest {
    @JsonProperty(required = true, value = "portfolio_id")
    @JsonIgnore
    private String portfolioId;

    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("side")
    private OrderSide side;

    @JsonProperty("client_order_id")
    private String clientOrderId;

    @JsonProperty("quote_id")
    private String quoteId;

    @JsonProperty("settl_currency")
    private String settlCurrency;

    public AcceptQuoteRequest() {
    }

    public AcceptQuoteRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.productId = builder.productId;
        this.side = builder.side;
        this.clientOrderId = builder.clientOrderId;
        this.quoteId = builder.quoteId;
        this.settlCurrency = builder.settlCurrency;
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

    public OrderSide getSide() {
        return side;
    }

    public void setSide(OrderSide side) {
        this.side = side;
    }

    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public String getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }

    public String getSettlCurrency() {
        return settlCurrency;
    }

    public void setSettlCurrency(String settlCurrency) {
        this.settlCurrency = settlCurrency;
    }

    public static class Builder {
        private String portfolioId;
        private String productId;
        private OrderSide side;
        private String clientOrderId;
        private String quoteId;
        private String settlCurrency;

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

        public Builder side(OrderSide side) {
            this.side = side;
            return this;
        }

        public Builder clientOrderId(String clientOrderId) {
            this.clientOrderId = clientOrderId;
            return this;
        }

        public Builder quoteId(String quoteId) {
            this.quoteId = quoteId;
            return this;
        }

        public Builder settlCurrency(String settlCurrency) {
            this.settlCurrency = settlCurrency;
            return this;
        }

        public AcceptQuoteRequest build() throws CoinbaseClientException {
            validate();
            return new AcceptQuoteRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.portfolioId)) {
                throw new CoinbaseClientException("PortfolioId is required");
            }
        }
    }
}
