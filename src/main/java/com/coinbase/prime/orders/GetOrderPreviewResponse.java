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

package com.coinbase.prime.orders;

import com.coinbase.prime.model.enums.OrderSide;
import com.coinbase.prime.model.enums.OrderType;
import com.coinbase.prime.model.enums.TimeInForce;
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
    @JsonProperty("historical_pov")
    private String historicalPov;

    public GetOrderPreviewResponse() {
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

    public String getHistoricalPov() {
        return historicalPov;
    }

    public void setHistoricalPov(String historicalPov) {
        this.historicalPov = historicalPov;
    }

}
