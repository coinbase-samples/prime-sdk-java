package com.coinbase.prime.model.orders;

import com.coinbase.prime.model.common.Pagination;

public class ListOrderFillsResponse {
    private OrderFill[] fills;
    private Pagination pagination;
    private ListOrderFillsRequest request;

    public ListOrderFillsResponse() {
    }

    public ListOrderFillsResponse(Builder builder) {
        this.fills = builder.fills;
        this.request = builder.request;
        this.pagination = builder.pagination;
    }

    public OrderFill[] getFills() {
        return fills;
    }

    public void setFills(OrderFill[] fills) {
        this.fills = fills;
    }

    public ListOrderFillsRequest getRequest() {
        return request;
    }

    public void setRequest(ListOrderFillsRequest request) {
        this.request = request;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public static class Builder {
        private OrderFill[] fills;
        private ListOrderFillsRequest request;
        private Pagination pagination;

        public Builder() {
        }

        public Builder fills(OrderFill[] fills) {
            this.fills = fills;
            return this;
        }

        public Builder request(ListOrderFillsRequest request) {
            this.request = request;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            this.pagination = pagination;
            return this;
        }

        public ListOrderFillsResponse build() {
            return new ListOrderFillsResponse(this);
        }
    }
}
