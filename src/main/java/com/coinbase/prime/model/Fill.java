// Copyright 2024-present Coinbase Global, Inc.
//
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.
package com.coinbase.prime.model;

import java.time.OffsetDateTime;
import com.coinbase.prime.model.enums.OrderSide;

public class Fill {
    private String id;

    private String orderId;

    private String productId;

    private String clientProductId;

    private OrderSide side;

    private String filledQuantity;

    private String filledValue;

    private String price;

    private OffsetDateTime time;

    private String commission;

    private String venue;

    private String venueFees;

    private String cesCommission;

    public Fill() {
    }

    public Fill(Builder builder) {
        this.id = builder.id;
        this.orderId = builder.orderId;
        this.productId = builder.productId;
        this.clientProductId = builder.clientProductId;
        this.side = builder.side;
        this.filledQuantity = builder.filledQuantity;
        this.filledValue = builder.filledValue;
        this.price = builder.price;
        this.time = builder.time;
        this.commission = builder.commission;
        this.venue = builder.venue;
        this.venueFees = builder.venueFees;
        this.cesCommission = builder.cesCommission;
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

    public String getClientProductId() {
        return clientProductId;
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

    public OffsetDateTime getTime() {
        return time;
    }

    public String getCommission() {
        return commission;
    }

    public String getVenue() {
        return venue;
    }

    public String getVenueFees() {
        return venueFees;
    }

    public String getCesCommission() {
        return cesCommission;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setClientProductId(String clientProductId) {
        this.clientProductId = clientProductId;
    }

    public void setSide(OrderSide side) {
        this.side = side;
    }

    public void setFilledQuantity(String filledQuantity) {
        this.filledQuantity = filledQuantity;
    }

    public void setFilledValue(String filledValue) {
        this.filledValue = filledValue;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setTime(OffsetDateTime time) {
        this.time = time;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public void setVenueFees(String venueFees) {
        this.venueFees = venueFees;
    }

    public void setCesCommission(String cesCommission) {
        this.cesCommission = cesCommission;
    }

    public static class Builder {
        private String id;

        private String orderId;

        private String productId;

        private String clientProductId;

        private OrderSide side;

        private String filledQuantity;

        private String filledValue;

        private String price;

        private OffsetDateTime time;

        private String commission;

        private String venue;

        private String venueFees;

        private String cesCommission;

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

        public Builder clientProductId(String clientProductId) {
            this.clientProductId = clientProductId;
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

        public Builder time(OffsetDateTime time) {
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

        public Builder venueFees(String venueFees) {
            this.venueFees = venueFees;
            return this;
        }

        public Builder cesCommission(String cesCommission) {
            this.cesCommission = cesCommission;
            return this;
        }

        public Fill build() {
            return new Fill(this);
        }
    }
}
