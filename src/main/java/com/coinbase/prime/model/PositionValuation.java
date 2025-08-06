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
import java.time.Instant;

/**
 * Represents position valuation details including mark-to-market calculations.
 */
public class PositionValuation {
    private String symbol;

    @JsonProperty("market_price")
    private String marketPrice;

    @JsonProperty("mark_price")
    private String markPrice;

    @JsonProperty("book_value")
    private String bookValue;

    @JsonProperty("market_value")
    private String marketValue;

    @JsonProperty("unrealized_gain_loss")
    private String unrealizedGainLoss;

    @JsonProperty("unrealized_gain_loss_percentage")
    private String unrealizedGainLossPercentage;

    @JsonProperty("valuation_timestamp")
    private Instant valuationTimestamp;

    @JsonProperty("price_source")
    private String priceSource;

    public PositionValuation() {
    }

    public PositionValuation(Builder builder) {
        this.symbol = builder.symbol;
        this.marketPrice = builder.marketPrice;
        this.markPrice = builder.markPrice;
        this.bookValue = builder.bookValue;
        this.marketValue = builder.marketValue;
        this.unrealizedGainLoss = builder.unrealizedGainLoss;
        this.unrealizedGainLossPercentage = builder.unrealizedGainLossPercentage;
        this.valuationTimestamp = builder.valuationTimestamp;
        this.priceSource = builder.priceSource;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(String marketPrice) {
        this.marketPrice = marketPrice;
    }

    public String getMarkPrice() {
        return markPrice;
    }

    public void setMarkPrice(String markPrice) {
        this.markPrice = markPrice;
    }

    public String getBookValue() {
        return bookValue;
    }

    public void setBookValue(String bookValue) {
        this.bookValue = bookValue;
    }

    public String getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(String marketValue) {
        this.marketValue = marketValue;
    }

    public String getUnrealizedGainLoss() {
        return unrealizedGainLoss;
    }

    public void setUnrealizedGainLoss(String unrealizedGainLoss) {
        this.unrealizedGainLoss = unrealizedGainLoss;
    }

    public String getUnrealizedGainLossPercentage() {
        return unrealizedGainLossPercentage;
    }

    public void setUnrealizedGainLossPercentage(String unrealizedGainLossPercentage) {
        this.unrealizedGainLossPercentage = unrealizedGainLossPercentage;
    }

    public Instant getValuationTimestamp() {
        return valuationTimestamp;
    }

    public void setValuationTimestamp(Instant valuationTimestamp) {
        this.valuationTimestamp = valuationTimestamp;
    }

    public String getPriceSource() {
        return priceSource;
    }

    public void setPriceSource(String priceSource) {
        this.priceSource = priceSource;
    }

    public static class Builder {
        private String symbol;
        private String marketPrice;
        private String markPrice;
        private String bookValue;
        private String marketValue;
        private String unrealizedGainLoss;
        private String unrealizedGainLossPercentage;
        private Instant valuationTimestamp;
        private String priceSource;

        public Builder() {
        }

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder marketPrice(String marketPrice) {
            this.marketPrice = marketPrice;
            return this;
        }

        public Builder markPrice(String markPrice) {
            this.markPrice = markPrice;
            return this;
        }

        public Builder bookValue(String bookValue) {
            this.bookValue = bookValue;
            return this;
        }

        public Builder marketValue(String marketValue) {
            this.marketValue = marketValue;
            return this;
        }

        public Builder unrealizedGainLoss(String unrealizedGainLoss) {
            this.unrealizedGainLoss = unrealizedGainLoss;
            return this;
        }

        public Builder unrealizedGainLossPercentage(String unrealizedGainLossPercentage) {
            this.unrealizedGainLossPercentage = unrealizedGainLossPercentage;
            return this;
        }

        public Builder valuationTimestamp(Instant valuationTimestamp) {
            this.valuationTimestamp = valuationTimestamp;
            return this;
        }

        public Builder priceSource(String priceSource) {
            this.priceSource = priceSource;
            return this;
        }

        public PositionValuation build() {
            return new PositionValuation(this);
        }
    }
}