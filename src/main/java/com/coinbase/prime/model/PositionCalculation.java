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
 * Represents position calculation details for risk management and P&L tracking.
 */
public class PositionCalculation {
    private String symbol;

    @JsonProperty("quantity")
    private String quantity;

    @JsonProperty("average_cost_basis")
    private String averageCostBasis;

    @JsonProperty("total_cost")
    private String totalCost;

    @JsonProperty("current_market_value")
    private String currentMarketValue;

    @JsonProperty("unrealized_pnl")
    private String unrealizedPnl;

    @JsonProperty("realized_pnl")
    private String realizedPnl;

    @JsonProperty("total_pnl")
    private String totalPnl;

    @JsonProperty("percentage_change")
    private String percentageChange;

    @JsonProperty("day_change")
    private String dayChange;

    @JsonProperty("day_change_percentage")
    private String dayChangePercentage;

    public PositionCalculation() {
    }

    public PositionCalculation(Builder builder) {
        this.symbol = builder.symbol;
        this.quantity = builder.quantity;
        this.averageCostBasis = builder.averageCostBasis;
        this.totalCost = builder.totalCost;
        this.currentMarketValue = builder.currentMarketValue;
        this.unrealizedPnl = builder.unrealizedPnl;
        this.realizedPnl = builder.realizedPnl;
        this.totalPnl = builder.totalPnl;
        this.percentageChange = builder.percentageChange;
        this.dayChange = builder.dayChange;
        this.dayChangePercentage = builder.dayChangePercentage;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getAverageCostBasis() {
        return averageCostBasis;
    }

    public void setAverageCostBasis(String averageCostBasis) {
        this.averageCostBasis = averageCostBasis;
    }

    public String getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    public String getCurrentMarketValue() {
        return currentMarketValue;
    }

    public void setCurrentMarketValue(String currentMarketValue) {
        this.currentMarketValue = currentMarketValue;
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

    public String getTotalPnl() {
        return totalPnl;
    }

    public void setTotalPnl(String totalPnl) {
        this.totalPnl = totalPnl;
    }

    public String getPercentageChange() {
        return percentageChange;
    }

    public void setPercentageChange(String percentageChange) {
        this.percentageChange = percentageChange;
    }

    public String getDayChange() {
        return dayChange;
    }

    public void setDayChange(String dayChange) {
        this.dayChange = dayChange;
    }

    public String getDayChangePercentage() {
        return dayChangePercentage;
    }

    public void setDayChangePercentage(String dayChangePercentage) {
        this.dayChangePercentage = dayChangePercentage;
    }

    public static class Builder {
        private String symbol;
        private String quantity;
        private String averageCostBasis;
        private String totalCost;
        private String currentMarketValue;
        private String unrealizedPnl;
        private String realizedPnl;
        private String totalPnl;
        private String percentageChange;
        private String dayChange;
        private String dayChangePercentage;

        public Builder() {
        }

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder quantity(String quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder averageCostBasis(String averageCostBasis) {
            this.averageCostBasis = averageCostBasis;
            return this;
        }

        public Builder totalCost(String totalCost) {
            this.totalCost = totalCost;
            return this;
        }

        public Builder currentMarketValue(String currentMarketValue) {
            this.currentMarketValue = currentMarketValue;
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

        public Builder totalPnl(String totalPnl) {
            this.totalPnl = totalPnl;
            return this;
        }

        public Builder percentageChange(String percentageChange) {
            this.percentageChange = percentageChange;
            return this;
        }

        public Builder dayChange(String dayChange) {
            this.dayChange = dayChange;
            return this;
        }

        public Builder dayChangePercentage(String dayChangePercentage) {
            this.dayChangePercentage = dayChangePercentage;
            return this;
        }

        public PositionCalculation build() {
            return new PositionCalculation(this);
        }
    }
}