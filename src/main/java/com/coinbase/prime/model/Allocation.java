// Copyright 2025-present Coinbase Global, Inc.
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

import com.coinbase.prime.model.enums.OrderSide;
import java.time.OffsetDateTime;

public class Allocation {
    private String rootId;

    private String reversalId;

    private OffsetDateTime allocationCompletedAt;

    private String userId;

    private String productId;

    private OrderSide side;

    private String avgPrice;

    private String baseQuantity;

    private String quoteValue;

    private String feesAllocated;

    /**
     * Portfolio ID of the source portfolio.
     */
    private String source;

    private String nettingId;

    public Allocation() {
    }

    public Allocation(Builder builder) {
        this.rootId = builder.rootId;
        this.reversalId = builder.reversalId;
        this.allocationCompletedAt = builder.allocationCompletedAt;
        this.userId = builder.userId;
        this.productId = builder.productId;
        this.side = builder.side;
        this.avgPrice = builder.avgPrice;
        this.baseQuantity = builder.baseQuantity;
        this.quoteValue = builder.quoteValue;
        this.feesAllocated = builder.feesAllocated;
        this.source = builder.source;
        this.nettingId = builder.nettingId;
    }

    public String getRootId() {
        return rootId;
    }

    public String getReversalId() {
        return reversalId;
    }

    public OffsetDateTime getAllocationCompletedAt() {
        return allocationCompletedAt;
    }

    public String getUserId() {
        return userId;
    }

    public String getProductId() {
        return productId;
    }

    public OrderSide getSide() {
        return side;
    }

    public String getAvgPrice() {
        return avgPrice;
    }

    public String getBaseQuantity() {
        return baseQuantity;
    }

    public String getQuoteValue() {
        return quoteValue;
    }

    public String getFeesAllocated() {
        return feesAllocated;
    }

    public String getSource() {
        return source;
    }

    public String getNettingId() {
        return nettingId;
    }

    public void setRootId(String rootId) {
        this.rootId = rootId;
    }

    public void setReversalId(String reversalId) {
        this.reversalId = reversalId;
    }

    public void setAllocationCompletedAt(OffsetDateTime allocationCompletedAt) {
        this.allocationCompletedAt = allocationCompletedAt;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setSide(OrderSide side) {
        this.side = side;
    }

    public void setAvgPrice(String avgPrice) {
        this.avgPrice = avgPrice;
    }

    public void setBaseQuantity(String baseQuantity) {
        this.baseQuantity = baseQuantity;
    }

    public void setQuoteValue(String quoteValue) {
        this.quoteValue = quoteValue;
    }

    public void setFeesAllocated(String feesAllocated) {
        this.feesAllocated = feesAllocated;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setNettingId(String nettingId) {
        this.nettingId = nettingId;
    }

    public static class Builder {
        private String rootId;

        private String reversalId;

        private OffsetDateTime allocationCompletedAt;

        private String userId;

        private String productId;

        private OrderSide side;

        private String avgPrice;

        private String baseQuantity;

        private String quoteValue;

        private String feesAllocated;

        private String source;

        private String nettingId;

        public Builder rootId(String rootId) {
            this.rootId = rootId;
            return this;
        }

        public Builder reversalId(String reversalId) {
            this.reversalId = reversalId;
            return this;
        }

        public Builder allocationCompletedAt(OffsetDateTime allocationCompletedAt) {
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

        public Builder avgPrice(String avgPrice) {
            this.avgPrice = avgPrice;
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

        public Builder source(String source) {
            this.source = source;
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
