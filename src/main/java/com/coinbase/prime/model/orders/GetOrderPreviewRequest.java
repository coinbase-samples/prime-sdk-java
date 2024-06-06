/*
 *
 *  Copyright 2024-present Coinbase Global, Inc.
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
 *
 */

package com.coinbase.prime.model.orders;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetOrderPreviewRequest {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    @JsonProperty("product_id")
    private String productId;
    private OrderSide side;
    private OrderType type;
    @JsonProperty("base_quantity")
    private String baseQuantity;
    @JsonProperty("quote_value")
    private String quoteValue;
    @JsonProperty("limit_price")
    private String limitPrice;
    @JsonProperty("stop_price")
    private String stopPrice;
    @JsonProperty("time_in_force")
    private TimeInForce timeInForce;
    @JsonProperty("start_time")
    private String startTime;
    @JsonProperty("expiry_time")
    private String expiryTime;
    @JsonProperty("is_raise_exact")
    private boolean isRaiseExact;
    @JsonProperty("historical_pov")
    private String historicalPov;

    public GetOrderPreviewRequest() {
    }

    public GetOrderPreviewRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.productId = builder.productId;
        this.side = builder.side;
        this.type = builder.type;
        this.baseQuantity = builder.baseQuantity;
        this.quoteValue = builder.quoteValue;
        this.limitPrice = builder.limitPrice;
        this.stopPrice = builder.stopPrice;
        this.timeInForce = builder.timeInForce;
        this.startTime = builder.startTime;
        this.expiryTime = builder.expiryTime;
        this.isRaiseExact = builder.isRaiseExact;
        this.historicalPov = builder.historicalPov;
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

    public OrderType getType() {
        return type;
    }

    public void setType(OrderType type) {
        this.type = type;
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

    public String getLimitPrice() {
        return limitPrice;
    }

    public void setLimitPrice(String limitPrice) {
        this.limitPrice = limitPrice;
    }

    public String getStopPrice() {
        return stopPrice;
    }

    public void setStopPrice(String stopPrice) {
        this.stopPrice = stopPrice;
    }

    public TimeInForce getTimeInForce() {
        return timeInForce;
    }

    public void setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(String expiryTime) {
        this.expiryTime = expiryTime;
    }

    public boolean isRaiseExact() {
        return isRaiseExact;
    }

    public void setRaiseExact(boolean raiseExact) {
        isRaiseExact = raiseExact;
    }

    public String getHistoricalPov() {
        return historicalPov;
    }

    public void setHistoricalPov(String historicalPov) {
        this.historicalPov = historicalPov;
    }

    public static class Builder {
        private String portfolioId;
        private String productId;
        private OrderSide side;
        private OrderType type;
        private String baseQuantity;
        private String quoteValue;
        private String limitPrice;
        private String stopPrice;
        private TimeInForce timeInForce;
        private String startTime;
        private String expiryTime;
        private boolean isRaiseExact;
        private String historicalPov;

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

        public Builder type(OrderType type) {
            this.type = type;
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

        public Builder limitPrice(String limitPrice) {
            this.limitPrice = limitPrice;
            return this;
        }

        public Builder stopPrice(String stopPrice) {
            this.stopPrice = stopPrice;
            return this;
        }

        public Builder timeInForce(TimeInForce timeInForce) {
            this.timeInForce = timeInForce;
            return this;
        }

        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder expiryTime(String expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }

        public Builder isRaiseExact(boolean isRaiseExact) {
            this.isRaiseExact = isRaiseExact;
            return this;
        }

        public Builder historicalPov(String historicalPov) {
            this.historicalPov = historicalPov;
            return this;
        }

        public GetOrderPreviewRequest build() {
            return new GetOrderPreviewRequest(this);
        }
    }
}
