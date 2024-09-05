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

package com.coinbase.prime.model.orders;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetOrderPreviewResponse {
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
    @JsonProperty("start_time")
    private String startTime;
    @JsonProperty("expiry_time")
    private String expiryTime;
    @JsonProperty("time_in_force")
    private TimeInForce timeInForce;
    private String commission;
    private String slippage;
    @JsonProperty("best_bid")
    private String bestBid;
    @JsonProperty("best_ask")
    private String bestAsk;
    @JsonProperty("average_filled_price")
    private String averageFilledPrice;
    @JsonProperty("order_total")
    private String orderTotal;

    public GetOrderPreviewResponse() {
    }

    public GetOrderPreviewResponse(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.productId = builder.productId;
        this.side = builder.side;
        this.type = builder.type;
        this.baseQuantity = builder.baseQuantity;
        this.quoteValue = builder.quoteValue;
        this.limitPrice = builder.limitPrice;
        this.startTime = builder.startTime;
        this.expiryTime = builder.expiryTime;
        this.timeInForce = builder.timeInForce;
        this.commission = builder.commission;
        this.slippage = builder.slippage;
        this.bestBid = builder.bestBid;
        this.bestAsk = builder.bestAsk;
        this.averageFilledPrice = builder.averageFilledPrice;
        this.orderTotal = builder.orderTotal;
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

    public TimeInForce getTimeInForce() {
        return timeInForce;
    }

    public void setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
    }

    public String getCommission() {
        return commission;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }

    public String getSlippage() {
        return slippage;
    }

    public void setSlippage(String slippage) {
        this.slippage = slippage;
    }

    public String getBestBid() {
        return bestBid;
    }

    public void setBestBid(String bestBid) {
        this.bestBid = bestBid;
    }

    public String getBestAsk() {
        return bestAsk;
    }

    public void setBestAsk(String bestAsk) {
        this.bestAsk = bestAsk;
    }

    public String getAverageFilledPrice() {
        return averageFilledPrice;
    }

    public void setAverageFilledPrice(String averageFilledPrice) {
        this.averageFilledPrice = averageFilledPrice;
    }

    public String getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(String orderTotal) {
        this.orderTotal = orderTotal;
    }

    public static class Builder {
        private String portfolioId;
        private String productId;
        private OrderSide side;
        private OrderType type;
        private String baseQuantity;
        private String quoteValue;
        private String limitPrice;
        private String startTime;
        private String expiryTime;
        private TimeInForce timeInForce;
        private String commission;
        private String slippage;
        private String bestBid;
        private String bestAsk;
        private String averageFilledPrice;
        private String orderTotal;

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

        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder expiryTime(String expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }

        public Builder timeInForce(TimeInForce timeInForce) {
            this.timeInForce = timeInForce;
            return this;
        }

        public Builder commission(String commission) {
            this.commission = commission;
            return this;
        }

        public Builder slippage(String slippage) {
            this.slippage = slippage;
            return this;
        }

        public Builder bestBid(String bestBid) {
            this.bestBid = bestBid;
            return this;
        }

        public Builder bestAsk(String bestAsk) {
            this.bestAsk = bestAsk;
            return this;
        }

        public Builder averageFilledPrice(String averageFilledPrice) {
            this.averageFilledPrice = averageFilledPrice;
            return this;
        }

        public Builder orderTotal(String orderTotal) {
            this.orderTotal = orderTotal;
            return this;
        }

        public GetOrderPreviewResponse build() {
            return new GetOrderPreviewResponse(this);
        }
    }
}
