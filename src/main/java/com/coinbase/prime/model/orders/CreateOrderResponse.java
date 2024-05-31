package com.coinbase.prime.model.orders;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateOrderResponse {
    @JsonProperty("order_id")
    private String orderId;
    private CreateOrderRequest request;

    public CreateOrderResponse() {
    }

    public CreateOrderResponse(Builder builder) {
        this.orderId = builder.orderId;
        this.request = builder.request;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public CreateOrderRequest getRequest() {
        return request;
    }

    public void setRequest(CreateOrderRequest request) {
        this.request = request;
    }

    public static class Builder {
        private String orderId;
        private CreateOrderRequest request;

        public Builder() {
        }

        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder request(CreateOrderRequest request) {
            this.request = request;
            return this;
        }

        public CreateOrderResponse build() {
            return new CreateOrderResponse(this);
        }
    }
}
