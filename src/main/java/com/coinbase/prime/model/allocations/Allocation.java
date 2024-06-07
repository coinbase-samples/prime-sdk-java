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

package com.coinbase.prime.model.allocations;

import com.coinbase.prime.model.orders.OrderSide;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Allocation {
    @JsonProperty("root_id")
    private String rootId;
    @JsonProperty("reversal_id")
    private String reversalId;
    @JsonProperty("allocation_completed_at")
    private String allocationCompletedAt;
    @JsonProperty("user_id")
    private String userId;
    @JsonProperty("product_id")
    private String productId;
    private OrderSide side;
    @JsonProperty("avg_price")
    private String averagePrice;
    @JsonProperty("base_quantity")
    private String baseQuantity;
    @JsonProperty("quote_value")
    private String quoteValue;
    @JsonProperty("fees_allocated")
    private String feesAllocated;
    private AllocationStatus status;
    private String source;
    @JsonProperty("order_ids")
    private String[] orderIds;
    @JsonProperty("netting_id")
    private String nettingId;
    private AllocationDestination[] destinations;

    public Allocation() {
    }

    public Allocation(Builder builder) {
        this.rootId = builder.rootId;
        this.reversalId = builder.reversalId;
        this.allocationCompletedAt = builder.allocationCompletedAt;
        this.userId = builder.userId;
        this.productId = builder.productId;
        this.side = builder.side;
        this.averagePrice = builder.averagePrice;
        this.baseQuantity = builder.baseQuantity;
        this.quoteValue = builder.quoteValue;
        this.feesAllocated = builder.feesAllocated;
        this.status = builder.status;
        this.source = builder.source;
        this.orderIds = builder.orderIds;
        this.destinations = builder.destinations;
        this.nettingId = builder.nettingId;
    }

    public String getRootId() {
        return rootId;
    }

    public void setRootId(String rootId) {
        this.rootId = rootId;
    }

    public String getReversalId() {
        return reversalId;
    }

    public void setReversalId(String reversalId) {
        this.reversalId = reversalId;
    }

    public String getAllocationCompletedAt() {
        return allocationCompletedAt;
    }

    public void setAllocationCompletedAt(String allocationCompletedAt) {
        this.allocationCompletedAt = allocationCompletedAt;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public OrderSide getSide() {
        return side;
    }

    public void setSide(OrderSide side) {
        this.side = side;
    }

    public String getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(String averagePrice) {
        this.averagePrice = averagePrice;
    }

    public String getBaseQuantity() {
        return baseQuantity;
    }

    public void setBaseQuantity(String baseQuantity) {
        this.baseQuantity = baseQuantity;
    }

    public String getQuoteValue() {
        return quoteValue;
    }

    public void setQuoteValue(String quoteValue) {
        this.quoteValue = quoteValue;
    }

    public String getFeesAllocated() {
        return feesAllocated;
    }

    public void setFeesAllocated(String feesAllocated) {
        this.feesAllocated = feesAllocated;
    }

    public AllocationStatus getStatus() {
        return status;
    }

    public void setStatus(AllocationStatus status) {
        this.status = status;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String[] getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(String[] orderIds) {
        this.orderIds = orderIds;
    }

    public AllocationDestination[] getDestinations() {
        return destinations;
    }

    public void setDestinations(AllocationDestination[] destinations) {
        this.destinations = destinations;
    }

    public String getNettingId() {
        return nettingId;
    }

    public void setNettingId(String nettingId) {
        this.nettingId = nettingId;
    }

    public static class Builder {
        private String rootId;
        private String reversalId;
        private String allocationCompletedAt;
        private String userId;
        private String productId;
        private OrderSide side;
        private String averagePrice;
        private String baseQuantity;
        private String quoteValue;
        private String feesAllocated;
        private AllocationStatus status;
        private String source;
        private String[] orderIds;
        private AllocationDestination[] destinations;
        private String nettingId;

        public Builder() {
        }

        public Builder rootId(String rootId) {
            this.rootId = rootId;
            return this;
        }

        public Builder reversalId(String reversalId) {
            this.reversalId = reversalId;
            return this;
        }

        public Builder allocationCompletedAt(String allocationCompletedAt) {
            this.allocationCompletedAt = allocationCompletedAt;
            return this;
        }

        public Builder userId(String userId) {
            this.userId = userId;
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

        public Builder averagePrice(String averagePrice) {
            this.averagePrice = averagePrice;
            return this;
        }

        public Builder baseQuantity(String baseQuantity) {
            this.baseQuantity = baseQuantity;
            return this;
        }

        public Builder quoteValue(String quoteValue) {
            this.quoteValue = quoteValue;
            return this;
        }

        public Builder feesAllocated(String feesAllocated) {
            this.feesAllocated = feesAllocated;
            return this;
        }

        public Builder status(AllocationStatus status) {
            this.status = status;
            return this;
        }

        public Builder source(String source) {
            this.source = source;
            return this;
        }

        public Builder orderIds(String[] orderIds) {
            this.orderIds = orderIds;
            return this;
        }

        public Builder destinations(AllocationDestination[] destinations) {
            this.destinations = destinations;
            return this;
        }

        public Builder nettingId(String nettingId) {
            this.nettingId = nettingId;
            return this;
        }

        public Allocation build() {
            return new Allocation(this);
        }
    }
}
