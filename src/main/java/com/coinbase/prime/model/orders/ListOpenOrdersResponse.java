package com.coinbase.prime.model.orders;

import com.coinbase.prime.model.common.Pagination;

public class ListOpenOrdersResponse {
    private Order[] orders;
    private Pagination pagination;
    private ListOpenOrdersRequest request;

    public ListOpenOrdersResponse() {
    }

    public ListOpenOrdersResponse(Builder builder) {
        this.orders = builder.orders;
        this.pagination = builder.pagination;
        this.request = builder.request;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public ListOpenOrdersRequest getRequest() {
        return request;
    }

    public void setRequest(ListOpenOrdersRequest request) {
        this.request = request;
    }

    public static class Builder {
        private Order[] orders;
        private Pagination pagination;
        private ListOpenOrdersRequest request;

        public Builder() {
        }

        public Builder orders(Order[] orders) {
            this.orders = orders;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            this.pagination = pagination;
            return this;
        }

        public Builder request(ListOpenOrdersRequest request) {
            this.request = request;
            return this;
        }

        public ListOpenOrdersResponse build() {
            return new ListOpenOrdersResponse(this);
        }
    }
}
