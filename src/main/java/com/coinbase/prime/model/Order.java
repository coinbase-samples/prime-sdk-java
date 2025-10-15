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

import com.coinbase.prime.model.enums.OrderSide;
import com.coinbase.prime.model.enums.OrderStatus;
import com.coinbase.prime.model.enums.OrderType;
import com.coinbase.prime.model.enums.TimeInForceType;
import java.time.OffsetDateTime;

public class Order {
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

    private OffsetDateTime startTime;

    private OffsetDateTime expiryTime;

    private OrderStatus status;

    private TimeInForceType timeInForce;

    private OffsetDateTime createdAt;

    private String filledQuantity;

    private String filledValue;

    private String averageFilledPrice;

    private String commission;

    private String exchangeFee;

    private String historicalPov;

    private String stopPrice;

    private String netAverageFilledPrice;

    private String userContext;

    private String clientProductId;

    private Boolean postOnly;

    private Boolean isRaiseExact;

    private String displaySize;

    private String displayQuoteSize;

    private String displayBaseSize;

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
        this.startTime = builder.startTime;
        this.expiryTime = builder.expiryTime;
        this.status = builder.status;
        this.timeInForce = builder.timeInForce;
        this.createdAt = builder.createdAt;
        this.filledQuantity = builder.filledQuantity;
        this.filledValue = builder.filledValue;
        this.averageFilledPrice = builder.averageFilledPrice;
        this.commission = builder.commission;
        this.exchangeFee = builder.exchangeFee;
        this.historicalPov = builder.historicalPov;
        this.stopPrice = builder.stopPrice;
        this.netAverageFilledPrice = builder.netAverageFilledPrice;
        this.userContext = builder.userContext;
        this.clientProductId = builder.clientProductId;
        this.postOnly = builder.postOnly;
        this.isRaiseExact = builder.isRaiseExact;
        this.displaySize = builder.displaySize;
        this.displayQuoteSize = builder.displayQuoteSize;
        this.displayBaseSize = builder.displayBaseSize;
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public String getProductId() {
        return productId;
    }

    public OrderSide getSide() {
        return side;
    }

    public String getClientOrderId() {
        return clientOrderId;
    }

    public OrderType getType() {
        return type;
    }

    public String getBaseQuantity() {
        return baseQuantity;
    }

    public String getQuoteValue() {
        return quoteValue;
    }

    public String getLimitPrice() {
        return limitPrice;
    }

    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public OffsetDateTime getExpiryTime() {
        return expiryTime;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public TimeInForceType getTimeInForce() {
        return timeInForce;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public String getFilledQuantity() {
        return filledQuantity;
    }

    public String getFilledValue() {
        return filledValue;
    }

    public String getAverageFilledPrice() {
        return averageFilledPrice;
    }

    public String getCommission() {
        return commission;
    }

    public String getExchangeFee() {
        return exchangeFee;
    }

    public String getHistoricalPov() {
        return historicalPov;
    }

    public String getStopPrice() {
        return stopPrice;
    }

    public String getNetAverageFilledPrice() {
        return netAverageFilledPrice;
    }

    public String getUserContext() {
        return userContext;
    }

    public String getClientProductId() {
        return clientProductId;
    }

    public Boolean isPostOnly() {
        return postOnly;
    }

    public Boolean isIsRaiseExact() {
        return isRaiseExact;
    }

    public String getDisplaySize() {
        return displaySize;
    }

    public String getDisplayQuoteSize() {
        return displayQuoteSize;
    }

    public String getDisplayBaseSize() {
        return displayBaseSize;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setSide(OrderSide side) {
        this.side = side;
    }

    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public void setType(OrderType type) {
        this.type = type;
    }

    public void setBaseQuantity(String baseQuantity) {
        this.baseQuantity = baseQuantity;
    }

    public void setQuoteValue(String quoteValue) {
        this.quoteValue = quoteValue;
    }

    public void setLimitPrice(String limitPrice) {
        this.limitPrice = limitPrice;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public void setExpiryTime(OffsetDateTime expiryTime) {
        this.expiryTime = expiryTime;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void setTimeInForce(TimeInForceType timeInForce) {
        this.timeInForce = timeInForce;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setFilledQuantity(String filledQuantity) {
        this.filledQuantity = filledQuantity;
    }

    public void setFilledValue(String filledValue) {
        this.filledValue = filledValue;
    }

    public void setAverageFilledPrice(String averageFilledPrice) {
        this.averageFilledPrice = averageFilledPrice;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }

    public void setExchangeFee(String exchangeFee) {
        this.exchangeFee = exchangeFee;
    }

    public void setHistoricalPov(String historicalPov) {
        this.historicalPov = historicalPov;
    }

    public void setStopPrice(String stopPrice) {
        this.stopPrice = stopPrice;
    }

    public void setNetAverageFilledPrice(String netAverageFilledPrice) {
        this.netAverageFilledPrice = netAverageFilledPrice;
    }

    public void setUserContext(String userContext) {
        this.userContext = userContext;
    }

    public void setClientProductId(String clientProductId) {
        this.clientProductId = clientProductId;
    }

    public void setPostOnly(Boolean postOnly) {
        this.postOnly = postOnly;
    }

    public void setIsRaiseExact(Boolean isRaiseExact) {
        this.isRaiseExact = isRaiseExact;
    }

    public void setDisplaySize(String displaySize) {
        this.displaySize = displaySize;
    }

    public void setDisplayQuoteSize(String displayQuoteSize) {
        this.displayQuoteSize = displayQuoteSize;
    }

    public void setDisplayBaseSize(String displayBaseSize) {
        this.displayBaseSize = displayBaseSize;
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

        private OffsetDateTime startTime;

        private OffsetDateTime expiryTime;

        private OrderStatus status;

        private TimeInForceType timeInForce;

        private OffsetDateTime createdAt;

        private String filledQuantity;

        private String filledValue;

        private String averageFilledPrice;

        private String commission;

        private String exchangeFee;

        private String historicalPov;

        private String stopPrice;

        private String netAverageFilledPrice;

        private String userContext;

        private String clientProductId;

        private Boolean postOnly;

        private Boolean isRaiseExact;

        private String displaySize;

        private String displayQuoteSize;

        private String displayBaseSize;

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

        public Builder startTime(OffsetDateTime startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder expiryTime(OffsetDateTime expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }

        public Builder status(OrderStatus status) {
            this.status = status;
            return this;
        }

        public Builder timeInForce(TimeInForceType timeInForce) {
            this.timeInForce = timeInForce;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
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

        public Builder stopPrice(String stopPrice) {
            this.stopPrice = stopPrice;
            return this;
        }

        public Builder netAverageFilledPrice(String netAverageFilledPrice) {
            this.netAverageFilledPrice = netAverageFilledPrice;
            return this;
        }

        public Builder userContext(String userContext) {
            this.userContext = userContext;
            return this;
        }

        public Builder clientProductId(String clientProductId) {
            this.clientProductId = clientProductId;
            return this;
        }

        public Builder postOnly(Boolean postOnly) {
            this.postOnly = postOnly;
            return this;
        }

        public Builder isRaiseExact(Boolean isRaiseExact) {
            this.isRaiseExact = isRaiseExact;
            return this;
        }

        public Builder displaySize(String displaySize) {
            this.displaySize = displaySize;
            return this;
        }

        public Builder displayQuoteSize(String displayQuoteSize) {
            this.displayQuoteSize = displayQuoteSize;
            return this;
        }

        public Builder displayBaseSize(String displayBaseSize) {
            this.displayBaseSize = displayBaseSize;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
