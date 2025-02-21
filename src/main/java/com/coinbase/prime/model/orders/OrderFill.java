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

import com.coinbase.prime.model.enums.OrderSide;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderFill {
    private String id;
    @JsonProperty("order_id")
    private String orderId;
    @JsonProperty("product_id")
    private String productId;
    private OrderSide side;
    @JsonProperty("filled_quantity")
    private String filledQuantity;
    @JsonProperty("filled_value")
    private String filledValue;
    private String price;
    private String time;
    private String commission;
    private String venue;

    public OrderFill() {
    }

    public OrderFill(Builder builder) {
        this.id = builder.id;
        this.orderId = builder.orderId;
        this.productId = builder.productId;
        this.side = builder.side;
        this.filledQuantity = builder.filledQuantity;
        this.filledValue = builder.filledValue;
        this.price = builder.price;
        this.time = builder.time;
        this.commission = builder.commission;
        this.venue = builder.venue;
    }

    public String getId() {
        return id;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getProductId() {
        return productId;
    }

    public OrderSide getSide() {
        return side;
    }

    public String getFilledQuantity() {
        return filledQuantity;
    }

    public String getFilledValue() {
        return filledValue;
    }

    public String getPrice() {
        return price;
    }

    public String getTime() {
        return time;
    }

    public String getCommission() {
        return commission;
    }

    public String getVenue() {
        return venue;
    }

    public static class Builder {
        private String id;
        private String orderId;
        private String productId;
        private OrderSide side;
        private String filledQuantity;
        private String filledValue;
        private String price;
        private String time;
        private String commission;
        private String venue;

        public Builder() {
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder side(OrderSide side) {
            this.side = side;
            return this;
        }

        public Builder filledQuantity(String filledQuantity) {
            this.filledQuantity = filledQuantity;
            return this;
        }

        public Builder filledValue(String filledValue) {
            this.filledValue = filledValue;
            return this;
        }

        public Builder price(String price) {
            this.price = price;
            return this;
        }

        public Builder time(String time) {
            this.time = time;
            return this;
        }

        public Builder commission(String commission) {
            this.commission = commission;
            return this;
        }

        public Builder venue(String venue) {
            this.venue = venue;
            return this;
        }

        public OrderFill build() {
            return new OrderFill(this);
        }
    }
}
