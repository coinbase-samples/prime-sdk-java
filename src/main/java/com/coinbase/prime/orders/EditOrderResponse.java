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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Edit an open order. This feature is in beta please reach out to your Coinbase Prime account manager for more information.
 */
public class EditOrderResponse {
    /** The ID of the order being edited */
    @JsonProperty("order_id")
    private String orderId;

    public EditOrderResponse() {
    }

    public EditOrderResponse(Builder builder) {
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

        public EditOrderResponse build() {
            return new EditOrderResponse(this);
        }
    }
}
