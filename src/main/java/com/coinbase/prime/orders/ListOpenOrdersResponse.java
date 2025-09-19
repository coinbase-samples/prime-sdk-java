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

package com.coinbase.prime.orders;

import com.coinbase.prime.model.Order;
import com.coinbase.prime.model.Pagination;

/**
 * Response object for listing all open orders.
 * 
 * List all open orders.
 * Caution: The maximum number of orders returned is 1000. If a client has more than 1000 open orders,
 * an error is returned prompting the user to use Websocket API, or FIX API to stream open orders.
 */
public class ListOpenOrdersResponse {
    /** Array of open orders */
    private Order[] orders;
    /** Pagination information for the response */
    private Pagination pagination;

    public ListOpenOrdersResponse() {
    }

    public ListOpenOrdersResponse(Builder builder) {
        this.orders = builder.orders;
        this.pagination = builder.pagination;
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

    public static class Builder {
        private Order[] orders;
        private Pagination pagination;

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

        public ListOpenOrdersResponse build() {
            return new ListOpenOrdersResponse(this);
        }
    }
}
