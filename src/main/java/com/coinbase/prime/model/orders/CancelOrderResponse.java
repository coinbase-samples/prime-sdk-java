package com.coinbase.prime.model.orders;

public class CancelOrderResponse {
    private String id;
    private CancelOrderRequest request;

    public CancelOrderResponse() {
    }

    public CancelOrderResponse(Builder builder) {
        this.id = builder.id;
        this.request = builder.request;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CancelOrderRequest getRequest() {
        return request;
    }

    public void setRequest(CancelOrderRequest request) {
        this.request = request;
    }

    public static class Builder {
        private String id;
        private CancelOrderRequest request;

        public Builder() {
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder request(CancelOrderRequest request) {
            this.request = request;
            return this;
        }

        public CancelOrderResponse build() {
            return new CancelOrderResponse(this);
        }
    }
}
