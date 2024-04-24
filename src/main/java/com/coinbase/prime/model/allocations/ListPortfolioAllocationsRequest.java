package com.coinbase.prime.model.allocations;

import com.coinbase.prime.model.common.OrderSide;
import com.coinbase.prime.model.common.PaginationParams;
import com.coinbase.prime.utils.Utils;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

import static com.coinbase.prime.utils.Utils.appendQueryParams;

public class ListPortfolioAllocationsRequest {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    @JsonProperty("product_ids")
    private String[] productIds;
    @JsonProperty("order_side")
    private OrderSide orderSide;
    @JsonProperty("start_date")
    private Date startDate;
    @JsonProperty("end_date")
    private Date endDate;
    private PaginationParams paginationParams;

    public ListPortfolioAllocationsRequest() {
    }

    public ListPortfolioAllocationsRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.productIds = builder.productIds;
        this.orderSide = builder.orderSide;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.paginationParams = builder.paginationParams;
    }

    public String getQueryString() {
        String queryParams = "";
        if (this.getProductIds() != null) {
            for (String productId : this.getProductIds()) {
                queryParams = appendQueryParams(queryParams, "product_ids", productId);
            }
        }
        if (this.getOrderSide() != null) {
            queryParams = appendQueryParams(queryParams, "order_side", this.getOrderSide().toString());
        }
        if (this.getStartDate() != null) {
            queryParams = appendQueryParams(queryParams, "start_date", Utils.formatDate(this.getStartDate()));
        }
        if (this.getEndDate() != null) {
            queryParams = appendQueryParams(queryParams, "start_date", Utils.formatDate(this.getEndDate()));
        }
        if (this.getPaginationParams() != null) {
            queryParams = this.getPaginationParams().generateQueryString(queryParams);
        }
        return queryParams;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String[] getProductIds() {
        return productIds;
    }

    public void setProductIds(String[] productIds) {
        this.productIds = productIds;
    }

    public OrderSide getOrderSide() {
        return orderSide;
    }

    public void setOrderSide(OrderSide orderSide) {
        this.orderSide = orderSide;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public PaginationParams getPaginationParams() {
        return paginationParams;
    }

    public void setPaginationParams(PaginationParams paginationParams) {
        this.paginationParams = paginationParams;
    }

    public static class Builder {
        private String portfolioId;
        private String[] productIds;
        private OrderSide orderSide;
        private Date startDate;
        private Date endDate;
        private PaginationParams paginationParams;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder productIds(String[] productIds) {
            this.productIds = productIds;
            return this;
        }

        public Builder orderSide(OrderSide orderSide) {
            this.orderSide = orderSide;
            return this;
        }

        public Builder startDate(Date startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder endDate(Date endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder paginationParams(PaginationParams paginationParams) {
            this.paginationParams = paginationParams;
            return this;
        }

        public ListPortfolioAllocationsRequest build() {
            return new ListPortfolioAllocationsRequest(this);
        }
    }
}
