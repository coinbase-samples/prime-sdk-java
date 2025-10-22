// Copyright 2025-present Coinbase Global, Inc.
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

public class LimitOrderEdit {
    /**
     * New price for the edited order
     */
    private String price;

    private String size;

    private String displaySize;

    private String stopPrice;

    private String stopLimitPrice;

    private OffsetDateTime endTime;

    private OffsetDateTime acceptTime;

    private String clientOrderId;

    public LimitOrderEdit() {
    }

    public LimitOrderEdit(Builder builder) {
        this.price = builder.price;
        this.size = builder.size;
        this.displaySize = builder.displaySize;
        this.stopPrice = builder.stopPrice;
        this.stopLimitPrice = builder.stopLimitPrice;
        this.endTime = builder.endTime;
        this.acceptTime = builder.acceptTime;
        this.clientOrderId = builder.clientOrderId;
    }

    public String getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public String getDisplaySize() {
        return displaySize;
    }

    public String getStopPrice() {
        return stopPrice;
    }

    public String getStopLimitPrice() {
        return stopLimitPrice;
    }

    public OffsetDateTime getEndTime() {
        return endTime;
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

    public void setSize(String size) {
        this.size = size;
    }

    public void setDisplaySize(String displaySize) {
        this.displaySize = displaySize;
    }

    public void setStopPrice(String stopPrice) {
        this.stopPrice = stopPrice;
    }

    public void setStopLimitPrice(String stopLimitPrice) {
        this.stopLimitPrice = stopLimitPrice;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public void setAcceptTime(OffsetDateTime acceptTime) {
        this.acceptTime = acceptTime;
    }

    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public static class Builder {
        private String price;

        private String size;

        private String displaySize;

        private String stopPrice;

        private String stopLimitPrice;

        private OffsetDateTime endTime;

        private OffsetDateTime acceptTime;

        private String clientOrderId;

        public Builder price(String price) {
            this.price = price;
            return this;
        }

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public Builder displaySize(String displaySize) {
            this.displaySize = displaySize;
            return this;
        }

        public Builder stopPrice(String stopPrice) {
            this.stopPrice = stopPrice;
            return this;
        }

        public Builder stopLimitPrice(String stopLimitPrice) {
            this.stopLimitPrice = stopLimitPrice;
            return this;
        }

        public Builder endTime(OffsetDateTime endTime) {
            this.endTime = endTime;
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

        public LimitOrderEdit build() {
            return new LimitOrderEdit(this);
        }
    }
}
