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

/**
 * Represents a position summary with aggregated position information.
 */
public class PositionSummary {
    private String symbol;

    @JsonProperty("net_position")
    private String netPosition;

    @JsonProperty("total_long")
    private String totalLong;

    @JsonProperty("total_short")
    private String totalShort;

    @JsonProperty("market_value")
    private String marketValue;

    @JsonProperty("average_cost")
    private String averageCost;

    @JsonProperty("unrealized_pnl")
    private String unrealizedPnl;

    @JsonProperty("realized_pnl")
    private String realizedPnl;

    public PositionSummary() {
    }

    public PositionSummary(Builder builder) {
        this.symbol = builder.symbol;
        this.netPosition = builder.netPosition;
        this.totalLong = builder.totalLong;
        this.totalShort = builder.totalShort;
        this.marketValue = builder.marketValue;
        this.averageCost = builder.averageCost;
        this.unrealizedPnl = builder.unrealizedPnl;
        this.realizedPnl = builder.realizedPnl;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getNetPosition() {
        return netPosition;
    }

    public void setNetPosition(String netPosition) {
        this.netPosition = netPosition;
    }

    public String getTotalLong() {
        return totalLong;
    }

    public void setTotalLong(String totalLong) {
        this.totalLong = totalLong;
    }

    public String getTotalShort() {
        return totalShort;
    }

    public void setTotalShort(String totalShort) {
        this.totalShort = totalShort;
    }

    public String getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(String marketValue) {
        this.marketValue = marketValue;
    }

    public String getAverageCost() {
        return averageCost;
    }

    public void setAverageCost(String averageCost) {
        this.averageCost = averageCost;
    }

    public String getUnrealizedPnl() {
        return unrealizedPnl;
    }

    public void setUnrealizedPnl(String unrealizedPnl) {
        this.unrealizedPnl = unrealizedPnl;
    }

    public String getRealizedPnl() {
        return realizedPnl;
    }

    public void setRealizedPnl(String realizedPnl) {
        this.realizedPnl = realizedPnl;
    }

    public static class Builder {
        private String symbol;
        private String netPosition;
        private String totalLong;
        private String totalShort;
        private String marketValue;
        private String averageCost;
        private String unrealizedPnl;
        private String realizedPnl;

        public Builder() {
        }

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder netPosition(String netPosition) {
            this.netPosition = netPosition;
            return this;
        }

        public Builder totalLong(String totalLong) {
            this.totalLong = totalLong;
            return this;
        }

        public Builder totalShort(String totalShort) {
            this.totalShort = totalShort;
            return this;
        }

        public Builder marketValue(String marketValue) {
            this.marketValue = marketValue;
            return this;
        }

        public Builder averageCost(String averageCost) {
            this.averageCost = averageCost;
            return this;
        }

        public Builder unrealizedPnl(String unrealizedPnl) {
            this.unrealizedPnl = unrealizedPnl;
            return this;
        }

        public Builder realizedPnl(String realizedPnl) {
            this.realizedPnl = realizedPnl;
            return this;
        }

        public PositionSummary build() {
            return new PositionSummary(this);
        }
    }
}