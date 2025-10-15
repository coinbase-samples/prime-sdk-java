/*
 * Copyright 2025-present Coinbase Global, Inc.
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

package com.coinbase.prime.orders;

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.common.PrimeListRequest;
import com.coinbase.prime.model.Pagination;
import com.coinbase.prime.model.enums.OrderSide;
import com.coinbase.prime.model.enums.OrderStatus;
import com.coinbase.prime.model.enums.OrderType;
import com.coinbase.prime.model.enums.SortDirection;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.*;

public class ListPortfolioOrdersRequest extends PrimeListRequest {
    @JsonProperty("portfolio_id")
    @JsonIgnore
    private String portfolioId;
    @JsonProperty("order_statuses")
    private OrderStatus[] orderStatuses;
    @JsonProperty("product_ids")
    private String[] productIds;
    @JsonProperty("order_type")
    private OrderType orderType;
    @JsonProperty("order_side")
    private OrderSide orderSide;
    @JsonProperty("start_date")
    private String startDate;
    @JsonProperty("end_date")
    private String endDate;

    public ListPortfolioOrdersRequest() {
    }

    public ListPortfolioOrdersRequest(Builder builder) {
        super(builder.cursor, builder.sortDirection, builder.limit);
        this.portfolioId = builder.portfolioId;
        this.orderStatuses = builder.orderStatuses;
        this.productIds = builder.productIds;
        this.orderType = builder.orderType;
        this.orderSide = builder.orderSide;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public OrderStatus[] getOrderStatuses() {
        return orderStatuses;
    }

    public void setOrderStatuses(OrderStatus[] orderStatuses) {
        this.orderStatuses = orderStatuses;
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

    public OrderSide getOrderSide() {
        return orderSide;
    }

    public void setOrderSide(OrderSide orderSide) {
        this.orderSide = orderSide;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public static class Builder {
        private String portfolioId;
        private OrderStatus[] orderStatuses;
        private String[] productIds;
        private OrderType orderType;
        private OrderSide orderSide;
        private String startDate;
        private String endDate;
        private String cursor;
        private SortDirection sortDirection;
        private Integer limit;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder orderStatuses(OrderStatus[] orderStatuses) {
            this.orderStatuses = orderStatuses;
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

        public Builder orderSide(OrderSide orderSide) {
            this.orderSide = orderSide;
            return this;
        }

        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            this.cursor = pagination.getNextCursor();
            this.sortDirection = pagination.getSortDirection() != null ? SortDirection.valueOf(pagination.getSortDirection()) : null;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public ListPortfolioOrdersRequest build() throws CoinbaseClientException {
            this.validate();
            return new ListPortfolioOrdersRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.portfolioId)) {
                throw new CoinbaseClientException("PortfolioId is required");
            }
        }
    }
}
