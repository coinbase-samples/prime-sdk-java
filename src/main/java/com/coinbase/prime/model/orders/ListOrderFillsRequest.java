package com.coinbase.prime.model.orders;

import com.coinbase.prime.model.common.PaginationParams;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListOrderFillsRequest {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    @JsonProperty("order_id")
    private String orderId;
    private PaginationParams paginationParams;

    public ListOrderFillsRequest() {
    }

    public ListOrderFillsRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.orderId = builder.orderId;
        this.paginationParams = builder.paginationParams;
    }

    public String getQueryString() {
        return paginationParams != null ? paginationParams.generateQueryString("") : "";
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

    public PaginationParams getPaginationParams() {
        return paginationParams;
    }

    public void setPaginationParams(PaginationParams paginationParams) {
        this.paginationParams = paginationParams;
    }

    public static class Builder {
        private String portfolioId;
        private String orderId;
        private PaginationParams paginationParams;

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

        public Builder paginationParams(PaginationParams paginationParams) {
            this.paginationParams = paginationParams;
            return this;
        }

        public ListOrderFillsRequest build() {
            return new ListOrderFillsRequest(this);
        }
    }
}
