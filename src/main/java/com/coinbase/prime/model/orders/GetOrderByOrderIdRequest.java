package com.coinbase.prime.model.orders;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetOrderByOrderIdRequest {
    @JsonProperty("order_id")
    private String orderId;
    @JsonProperty("portfolio_id")
    private String portfolioId;

    public GetOrderByOrderIdRequest() {
    }

    public GetOrderByOrderIdRequest(Builder builder) {
        this.orderId = builder.orderId;
        this.portfolioId = builder.portfolioId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public static class Builder {
        private String orderId;
        private String portfolioId;

        public Builder() {
        }

        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public GetOrderByOrderIdRequest build() {
            return new GetOrderByOrderIdRequest(this);
        }
    }
}
