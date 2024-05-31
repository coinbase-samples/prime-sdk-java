package com.coinbase.prime.model.orders;

public class GetOrderByOrderIdResponse {
    private Order order;
    private GetOrderByOrderIdRequest request;

    public GetOrderByOrderIdResponse() {
    }

    public GetOrderByOrderIdResponse(Builder builder) {
        this.order = builder.order;
        this.request = builder.request;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public GetOrderByOrderIdRequest getRequest() {
        return request;
    }

    public void setRequest(GetOrderByOrderIdRequest request) {
        this.request = request;
    }

    public static class Builder {
        private Order order;
        private GetOrderByOrderIdRequest request;

        public Builder() {
        }

        public Builder order(Order order) {
            this.order = order;
            return this;
        }

        public Builder request(GetOrderByOrderIdRequest request) {
            this.request = request;
            return this;
        }

        public GetOrderByOrderIdResponse build() {
            return new GetOrderByOrderIdResponse(this);
        }
    }
}
