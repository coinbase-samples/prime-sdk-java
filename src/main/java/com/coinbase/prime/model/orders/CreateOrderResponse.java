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

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateOrderResponse {
    @JsonProperty("order_id")
    private String orderId;

    public CreateOrderResponse() {
    }

    public CreateOrderResponse(Builder builder) {
        this.orderId = builder.orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public static class Builder {
        private String orderId;

        public Builder() {
        }

        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public CreateOrderResponse build() {
            return new CreateOrderResponse(this);
        }
    }
}
