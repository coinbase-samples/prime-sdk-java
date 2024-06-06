/*
 *
 *  Copyright 2024-present Coinbase Global, Inc.
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
 *
 */

package com.coinbase.prime.model.orders;

import com.coinbase.prime.model.common.PaginationParams;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

import static com.coinbase.prime.utils.Utils.appendQueryParams;

public class ListOpenOrdersRequest {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    @JsonProperty("product_ids")
    private String[] productIds;
    @JsonProperty("order_type")
    private OrderType orderType;
    @JsonProperty("start_date")
    private Date startDate;
    @JsonProperty("order_side")
    private OrderSide orderSide;
    @JsonProperty("end_date")
    private Date endDate;
    private PaginationParams paginationParams;

    public ListOpenOrdersRequest() {
    }

    public ListOpenOrdersRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.productIds = builder.productIds;
        this.orderType = builder.orderType;
        this.startDate = builder.startDate;
        this.orderSide = builder.orderSide;
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
        if (this.getOrderType() != null) {
            queryParams = appendQueryParams(queryParams, "order_type", this.getOrderType().name());
        }

        if (this.getStartDate() != null) {
            queryParams = appendQueryParams(queryParams, "start_date", this.getStartDate().toString());
        }

        if (this.getOrderSide() != null) {
            queryParams = appendQueryParams(queryParams, "order_side", this.getOrderSide().name());
        }

        if (this.getEndDate() != null) {
            queryParams = appendQueryParams(queryParams, "end_date", this.getEndDate().toString());
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

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public OrderSide getOrderSide() {
        return orderSide;
    }

    public void setOrderSide(OrderSide orderSide) {
        this.orderSide = orderSide;
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
        private OrderType orderType;
        private Date startDate;
        private OrderSide orderSide;
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

        public Builder orderType(OrderType orderType) {
            this.orderType = orderType;
            return this;
        }

        public Builder startDate(Date startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder orderSide(OrderSide orderSide) {
            this.orderSide = orderSide;
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

        public ListOpenOrdersRequest build() {
            return new ListOpenOrdersRequest(this);
        }
    }
}
