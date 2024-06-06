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

package com.coinbase.prime.model.allocations;

import com.coinbase.prime.model.orders.OrderSide;
import com.coinbase.prime.model.common.PaginationParams;
import com.coinbase.prime.utils.Utils;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

import static com.coinbase.prime.utils.Utils.appendAllQueryParams;
import static com.coinbase.prime.utils.Utils.appendQueryParams;

public class GetPortfolioAllocationsRequest {
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

    public GetPortfolioAllocationsRequest() {
    }

    public GetPortfolioAllocationsRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.productIds = builder.productIds;
        this.orderSide = builder.orderSide;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.paginationParams = builder.paginationParams;
    }

    public String getQueryString() {
        String queryString = this.getPaginationParams() != null ? this.getPaginationParams().generateQueryString("") : "";
        queryString = appendAllQueryParams(this.getProductIds(), "product_ids", queryString);
        queryString = appendQueryParams(queryString, "order_side", this.getOrderSide().toString());
        queryString = appendQueryParams(queryString, "start_date", Utils.formatDate(this.getStartDate()));
        queryString = appendQueryParams(queryString, "start_date", Utils.formatDate(this.getEndDate()));

        return queryString;
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

        public GetPortfolioAllocationsRequest build() {
            return new GetPortfolioAllocationsRequest(this);
        }
    }
}
