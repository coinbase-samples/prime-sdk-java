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

public class FcmPosition {
    private String productId;

    private String numberOfContracts;

    private String dailyRealizedPnl;

    private String unrealizedPnl;

    private String currentPrice;

    private String avgEntryPrice;

    private OffsetDateTime expirationTime;

    public FcmPosition() {
    }

    public FcmPosition(Builder builder) {
        this.productId = builder.productId;
        this.numberOfContracts = builder.numberOfContracts;
        this.dailyRealizedPnl = builder.dailyRealizedPnl;
        this.unrealizedPnl = builder.unrealizedPnl;
        this.currentPrice = builder.currentPrice;
        this.avgEntryPrice = builder.avgEntryPrice;
        this.expirationTime = builder.expirationTime;
    }

    public String getProductId() {
        return productId;
    }

    public String getNumberOfContracts() {
        return numberOfContracts;
    }

    public String getDailyRealizedPnl() {
        return dailyRealizedPnl;
    }

    public String getUnrealizedPnl() {
        return unrealizedPnl;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public String getAvgEntryPrice() {
        return avgEntryPrice;
    }

    public OffsetDateTime getExpirationTime() {
        return expirationTime;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setNumberOfContracts(String numberOfContracts) {
        this.numberOfContracts = numberOfContracts;
    }

    public void setDailyRealizedPnl(String dailyRealizedPnl) {
        this.dailyRealizedPnl = dailyRealizedPnl;
    }

    public void setUnrealizedPnl(String unrealizedPnl) {
        this.unrealizedPnl = unrealizedPnl;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void setAvgEntryPrice(String avgEntryPrice) {
        this.avgEntryPrice = avgEntryPrice;
    }

    public void setExpirationTime(OffsetDateTime expirationTime) {
        this.expirationTime = expirationTime;
    }

    public static class Builder {
        private String productId;

        private String numberOfContracts;

        private String dailyRealizedPnl;

        private String unrealizedPnl;

        private String currentPrice;

        private String avgEntryPrice;

        private OffsetDateTime expirationTime;

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder numberOfContracts(String numberOfContracts) {
            this.numberOfContracts = numberOfContracts;
            return this;
        }

        public Builder dailyRealizedPnl(String dailyRealizedPnl) {
            this.dailyRealizedPnl = dailyRealizedPnl;
            return this;
        }

        public Builder unrealizedPnl(String unrealizedPnl) {
            this.unrealizedPnl = unrealizedPnl;
            return this;
        }

        public Builder currentPrice(String currentPrice) {
            this.currentPrice = currentPrice;
            return this;
        }

        public Builder avgEntryPrice(String avgEntryPrice) {
            this.avgEntryPrice = avgEntryPrice;
            return this;
        }

        public Builder expirationTime(OffsetDateTime expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        public FcmPosition build() {
            return new FcmPosition(this);
        }
    }
}
