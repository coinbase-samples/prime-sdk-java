/*
 * Copyright 2024-present Coinbase Global, Inc.
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
 */

package com.coinbase.prime.model.orders;

import com.coinbase.core.http.CoinbaseGetRequest;
import com.coinbase.prime.model.common.PaginationParams;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

import static com.coinbase.core.utils.Utils.appendAllQueryParams;
import static com.coinbase.core.utils.Utils.appendQueryParams;

public class ListOpenOrdersRequest extends CoinbaseGetRequest {
    @JsonProperty(required = true, value = "portfolio_id")
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

    @Override
    public String getQueryString() {
        String queryString = this.getPaginationParams() != null ? this.getPaginationParams().generateQueryString("") : "";
        queryString = appendAllQueryParams(this.getProductIds(), "product_ids", queryString);
        queryString = appendQueryParams(queryString, "order_type", this.getOrderType().name());
        queryString = appendQueryParams(queryString, "start_date", this.getStartDate().toString());
        queryString = appendQueryParams(queryString, "order_side", this.getOrderSide().name());
        queryString = appendQueryParams(queryString, "end_date", this.getEndDate().toString());
        return queryString;
    }

    @Override
    public String getPath() {
        return String.format("/portfolios/%s/open_orders", this.getPortfolioId());
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
