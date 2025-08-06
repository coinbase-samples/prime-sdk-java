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

public class OrderEdit {
    private String price;
    @JsonProperty("base_quantity")
    private String baseQuantity;
    @JsonProperty("quote_value")
    private String quoteValue;
    @JsonProperty("display_base_size")
    private String displayBaseSize;
    @JsonProperty("display_quote_size")
    private String displayQuoteSize;
    @JsonProperty("stop_price")
    private String stopPrice;
    @JsonProperty("expiry_time")
    private String expiryTime;
    @JsonProperty("accept_time")
    private String acceptTime;
    @JsonProperty("client_order_id")
    private String clientOrderId;

    public OrderEdit() {
    }

    public OrderEdit(Builder builder) {
        this.price = builder.price;
        this.baseQuantity = builder.baseQuantity;
        this.quoteValue = builder.quoteValue;
        this.displayBaseSize = builder.displayBaseSize;
        this.displayQuoteSize = builder.displayQuoteSize;
        this.stopPrice = builder.stopPrice;
        this.expiryTime = builder.expiryTime;
        this.acceptTime = builder.acceptTime;
        this.clientOrderId = builder.clientOrderId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBaseQuantity() {
        return baseQuantity;
    }

    public void setBaseQuantity(String baseQuantity) {
        this.baseQuantity = baseQuantity;
    }

    public String getQuoteValue() {
        return quoteValue;
    }

    public void setQuoteValue(String quoteValue) {
        this.quoteValue = quoteValue;
    }

    public String getDisplayBaseSize() {
        return displayBaseSize;
    }

    public void setDisplayBaseSize(String displayBaseSize) {
        this.displayBaseSize = displayBaseSize;
    }

    public String getDisplayQuoteSize() {
        return displayQuoteSize;
    }

    public void setDisplayQuoteSize(String displayQuoteSize) {
        this.displayQuoteSize = displayQuoteSize;
    }

    public String getStopPrice() {
        return stopPrice;
    }

    public void setStopPrice(String stopPrice) {
        this.stopPrice = stopPrice;
    }

    public String getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(String expiryTime) {
        this.expiryTime = expiryTime;
    }

    public String getAcceptTime() {
        return acceptTime;
    }

    public void setAcceptTime(String acceptTime) {
        this.acceptTime = acceptTime;
    }

    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public static class Builder {
        private String price;
        private String baseQuantity;
        private String quoteValue;
        private String displayBaseSize;
        private String displayQuoteSize;
        private String stopPrice;
        private String expiryTime;
        private String acceptTime;
        private String clientOrderId;

        public Builder() {
        }

        public Builder price(String price) {
            this.price = price;
            return this;
        }

        public Builder baseQuantity(String baseQuantity) {
            this.baseQuantity = baseQuantity;
            return this;
        }

        public Builder quoteValue(String quoteValue) {
            this.quoteValue = quoteValue;
            return this;
        }

        public Builder displayBaseSize(String displayBaseSize) {
            this.displayBaseSize = displayBaseSize;
            return this;
        }

        public Builder displayQuoteSize(String displayQuoteSize) {
            this.displayQuoteSize = displayQuoteSize;
            return this;
        }

        public Builder stopPrice(String stopPrice) {
            this.stopPrice = stopPrice;
            return this;
        }

        public Builder expiryTime(String expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }

        public Builder acceptTime(String acceptTime) {
            this.acceptTime = acceptTime;
            return this;
        }

        public Builder clientOrderId(String clientOrderId) {
            this.clientOrderId = clientOrderId;
            return this;
        }

        public OrderEdit build() {
            return new OrderEdit(this);
        }
    }
}