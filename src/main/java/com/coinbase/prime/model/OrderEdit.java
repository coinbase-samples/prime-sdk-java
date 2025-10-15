// Copyright 2024-present Coinbase Global, Inc.
//
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.
package com.coinbase.prime.model;

import java.time.OffsetDateTime;

public class OrderEdit {
    private String price;

    private String baseQuantity;

    private String quoteValue;

    private String displayBaseSize;

    private String displayQuoteSize;

    private String stopPrice;

    private OffsetDateTime expiryTime;

    private OffsetDateTime acceptTime;

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

    public String getBaseQuantity() {
        return baseQuantity;
    }

    public String getQuoteValue() {
        return quoteValue;
    }

    public String getDisplayBaseSize() {
        return displayBaseSize;
    }

    public String getDisplayQuoteSize() {
        return displayQuoteSize;
    }

    public String getStopPrice() {
        return stopPrice;
    }

    public OffsetDateTime getExpiryTime() {
        return expiryTime;
    }

    public OffsetDateTime getAcceptTime() {
        return acceptTime;
    }

    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setBaseQuantity(String baseQuantity) {
        this.baseQuantity = baseQuantity;
    }

    public void setQuoteValue(String quoteValue) {
        this.quoteValue = quoteValue;
    }

    public void setDisplayBaseSize(String displayBaseSize) {
        this.displayBaseSize = displayBaseSize;
    }

    public void setDisplayQuoteSize(String displayQuoteSize) {
        this.displayQuoteSize = displayQuoteSize;
    }

    public void setStopPrice(String stopPrice) {
        this.stopPrice = stopPrice;
    }

    public void setExpiryTime(OffsetDateTime expiryTime) {
        this.expiryTime = expiryTime;
    }

    public void setAcceptTime(OffsetDateTime acceptTime) {
        this.acceptTime = acceptTime;
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

        private OffsetDateTime expiryTime;

        private OffsetDateTime acceptTime;

        private String clientOrderId;

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

        public Builder expiryTime(OffsetDateTime expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }

        public Builder acceptTime(OffsetDateTime acceptTime) {
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
