package com.coinbase.prime.model.orders;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CancelOrderRequest {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    @JsonProperty("order_id")
    private String orderId;

    public CancelOrderRequest() {
    }

    public CancelOrderRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.orderId = builder.orderId;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public static class Builder {
        private String portfolioId;
        private String orderId;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public CancelOrderRequest build() {
            return new CancelOrderRequest(this);
        }
    }
}
