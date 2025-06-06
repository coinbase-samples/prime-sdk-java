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

public class GetOrderByOrderIdResponse {
    private Order order;

    public GetOrderByOrderIdResponse() {
    }

    public GetOrderByOrderIdResponse(Builder builder) {
        this.order = builder.order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public static class Builder {
        private Order order;

        public Builder() {
        }

        public Builder order(Order order) {
            this.order = order;
            return this;
        }

        public GetOrderByOrderIdResponse build() {
            return new GetOrderByOrderIdResponse(this);
        }
    }
}
