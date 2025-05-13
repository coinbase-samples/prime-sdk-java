/*
 * Copyright 2024-present Coinbase Global, Inc.
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

import com.coinbase.prime.model.enums.OrderSide;
import com.coinbase.prime.model.enums.OrderStatus;
import com.coinbase.prime.model.enums.OrderType;
import com.coinbase.prime.model.enums.TimeInForce;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {
    private String id;
    @JsonProperty("user_id")
    private String userId;
    @JsonProperty("portfolio_id")
    private String portfolioId;
    @JsonProperty("product_id")
    private String productId;
    private OrderSide side;
    @JsonProperty("client_order_id")
    private String clientOrderId;
    private OrderType type;
    @JsonProperty("base_quantity")
    private String baseQuantity;
    @JsonProperty("quote_value")
    private String quoteValue;
    @JsonProperty("limit_price")
    private String limitPrice;
    @JsonProperty("stop_price")
    private String stopPrice;
    @JsonProperty("start_time")
    private String startTime;
    @JsonProperty("expiry_time")
    private String expiryTime;
    private OrderStatus status;
    @JsonProperty("time_in_force")
    private TimeInForce timeInForce;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("filled_quantity")
    private String filledQuantity;
    @JsonProperty("filled_value")
    private String filledValue;
    @JsonProperty("average_filled_price")
    private String averageFilledPrice;
    @JsonProperty("net_average_filled_price")
    private String netAverageFilledPrice;
    private String commission;
    @JsonProperty("exchange_fee")
    private String exchangeFee;
    @JsonProperty("historical_pov")
    private String historicalPov;
    @JsonProperty("user_context")
    private String userContext;

    public Order() {
    }

    public Order(Builder builder) {
        this.id = builder.id;
        this.userId = builder.userId;
        this.portfolioId = builder.portfolioId;
        this.productId = builder.productId;
        this.side = builder.side;
        this.clientOrderId = builder.clientOrderId;
        this.type = builder.type;
        this.baseQuantity = builder.baseQuantity;
        this.quoteValue = builder.quoteValue;
        this.limitPrice = builder.limitPrice;
        this.stopPrice = builder.stopPrice;
        this.startTime = builder.startTime;
        this.expiryTime = builder.expiryTime;
        this.status = builder.status;
        this.timeInForce = builder.timeInForce;
        this.createdAt = builder.createdAt;
        this.filledQuantity = builder.filledQuantity;
        this.filledValue = builder.filledValue;
        this.averageFilledPrice = builder.averageFilledPrice;
        this.netAverageFilledPrice = builder.netAverageFilledPrice;
        this.commission = builder.commission;
        this.exchangeFee = builder.exchangeFee;
        this.historicalPov = builder.historicalPov;
        this.userContext = builder.userContext;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public TimeInForce getTimeInForce() {
        return timeInForce;
    }

    public void setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getFilledQuantity() {
        return filledQuantity;
    }

    public void setFilledQuantity(String filledQuantity) {
        this.filledQuantity = filledQuantity;
    }

    public String getFilledValue() {
        return filledValue;
    }

    public void setFilledValue(String filledValue) {
        this.filledValue = filledValue;
    }

    public String getAverageFilledPrice() {
        return averageFilledPrice;
    }

    public void setAverageFilledPrice(String averageFilledPrice) {
        this.averageFilledPrice = averageFilledPrice;
    }

    public String getNetAverageFilledPrice() {
        return netAverageFilledPrice;
    }

    public void setNetAverageFilledPrice(String netAverageFilledPrice) {
        this.netAverageFilledPrice = netAverageFilledPrice;
    }

    public String getCommission() {
        return commission;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }

    public String getExchangeFee() {
        return exchangeFee;
    }

    public void setExchangeFee(String exchangeFee) {
        this.exchangeFee = exchangeFee;
    }

    public String getHistoricalPov() {
        return historicalPov;
    }

    public void setHistoricalPov(String historicalPov) {
        this.historicalPov = historicalPov;
    }

    public String getUserContext() {
        return userContext;
    }

    public void setUserContext(String userContext) {
        this.userContext = userContext;
    }

    public static class Builder {
        private String id;
        private String userId;
        private String portfolioId;
        private String productId;
        private OrderSide side;
        private String clientOrderId;
        private OrderType type;
        private String baseQuantity;
        private String quoteValue;
        private String limitPrice;
        private String stopPrice;
        private String startTime;
        private String expiryTime;
        private OrderStatus status;
        private TimeInForce timeInForce;
        private String createdAt;
        private String filledQuantity;
        private String filledValue;
        private String averageFilledPrice;
        private String netAverageFilledPrice;
        private String commission;
        private String exchangeFee;
        private String historicalPov;
        private String userContext;

        public Builder() {
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
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

        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder expiryTime(String expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }

        public Builder status(OrderStatus status) {
            this.status = status;
            return this;
        }

        public Builder timeInForce(TimeInForce timeInForce) {
            this.timeInForce = timeInForce;
            return this;
        }

        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder filledQuantity(String filledQuantity) {
            this.filledQuantity = filledQuantity;
            return this;
        }

        public Builder filledValue(String filledValue) {
            this.filledValue = filledValue;
            return this;
        }

        public Builder averageFilledPrice(String averageFilledPrice) {
            this.averageFilledPrice = averageFilledPrice;
            return this;
        }

        public Builder netAverageFilledPrice(String netAverageFilledPrice) {
            this.netAverageFilledPrice = netAverageFilledPrice;
            return this;
        }

        public Builder commission(String commission) {
            this.commission = commission;
            return this;
        }

        public Builder exchangeFee(String exchangeFee) {
            this.exchangeFee = exchangeFee;
            return this;
        }

        public Builder historicalPov(String historicalPov) {
            this.historicalPov = historicalPov;
            return this;
        }

        public Builder userContext(String userContext) {
            this.userContext = userContext;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
