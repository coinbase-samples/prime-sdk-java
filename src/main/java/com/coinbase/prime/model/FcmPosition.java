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

import com.coinbase.prime.model.enums.FcmPositionSide;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;

public class FcmPosition {
    @JsonProperty("product_id")
    private String productId;

    private FcmPositionSide side;

    @JsonProperty("number_of_contracts")
    private String numberOfContracts;

    @JsonProperty("daily_realized_pnl")
    private String dailyRealizedPnl;

    @JsonProperty("unrealized_pnl")
    private String unrealizedPnl;

    @JsonProperty("current_price")
    private String currentPrice;

    @JsonProperty("avg_entry_price")
    private String avgEntryPrice;

    @JsonProperty("expiration_time")
    private Instant expirationTime;

    public FcmPosition() {
    }

    public FcmPosition(Builder builder) {
        this.productId = builder.productId;
        this.side = builder.side;
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

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public FcmPositionSide getSide() {
        return side;
    }

    public void setSide(FcmPositionSide side) {
        this.side = side;
    }

    public String getNumberOfContracts() {
        return numberOfContracts;
    }

    public void setNumberOfContracts(String numberOfContracts) {
        this.numberOfContracts = numberOfContracts;
    }

    public String getDailyRealizedPnl() {
        return dailyRealizedPnl;
    }

    public void setDailyRealizedPnl(String dailyRealizedPnl) {
        this.dailyRealizedPnl = dailyRealizedPnl;
    }

    public String getUnrealizedPnl() {
        return unrealizedPnl;
    }

    public void setUnrealizedPnl(String unrealizedPnl) {
        this.unrealizedPnl = unrealizedPnl;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getAvgEntryPrice() {
        return avgEntryPrice;
    }

    public void setAvgEntryPrice(String avgEntryPrice) {
        this.avgEntryPrice = avgEntryPrice;
    }

    public Instant getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Instant expirationTime) {
        this.expirationTime = expirationTime;
    }

    public static class Builder {
        private String productId;
        private FcmPositionSide side;
        private String numberOfContracts;
        private String dailyRealizedPnl;
        private String unrealizedPnl;
        private String currentPrice;
        private String avgEntryPrice;
        private Instant expirationTime;

        public Builder() {
        }

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder side(FcmPositionSide side) {
            this.side = side;
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

        public Builder expirationTime(Instant expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        public FcmPosition build() {
            return new FcmPosition(this);
        }
    }
}
