package com.coinbase.prime.model;

import com.coinbase.prime.model.enums.AllocationStatus;
import com.coinbase.prime.model.DestinationAlloc;
import com.coinbase.prime.model.enums.OrderSide;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Allocation {
    /**
     * The ID that ties together an allocation and all of its legs.
     */
    private String rootId;

    /**
     * The ID of the allocation if this allocation is a reversal. In this case, the root_id would be the original allocation ID.
     */
    private String reversalId;

    /**
     * Time the final leg of the root allocation was completed.
     */
    private OffsetDateTime allocationCompletedAt;

    /**
     * The ID of the user that created the allocation.
     */
    private String userId;

    /**
     * The ID of the product of the orders allocated.
     */
    private String productId;

    private OrderSide side;

    /**
     * Price the allocation was done at.
     */
    private String avgPrice;

    /**
     * Amount allocated in base asset units.
     */
    private String baseQuantity;

    /**
     * Amount allocated in quote asset units.
     */
    private String quoteValue;

    /**
     * Fees from original trade execution allocated in quote asset units.
     */
    private String feesAllocated;

    private AllocationStatus status;

    /**
     * Portfolio ID of the source portfolio.
     */
    private String source;

    /**
     * All order IDs that were aggregated to calculate the avg_price, quantity to allocate in each leg. Each order_id should tie back to the single allocation root_id.
     */
    private List<String> orderIds;

    /**
     * Array of objects, each containing the leg ID, destination portfolio ID and amount in chosen units allocated to each portfolio: [{leg_id, portfolio_id, allocation_base, allocation_quote}, {leg_id, portfolio_id, allocation_base, allocation_quote}...]
     */
    private List<DestinationAlloc> destinations;

    /**
     * The netting ID of the allocation, not empty if the allocation was submitted as part of a net allocation
     */
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
    public OffsetDateTime getAllocationCompletedAt() {
        return allocationCompletedAt;
    }

    public void setAllocationCompletedAt(OffsetDateTime allocationCompletedAt) {
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
    public String getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(String avgPrice) {
        this.avgPrice = avgPrice;
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
    public List<String> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(List<String> orderIds) {
        this.orderIds = orderIds;
    }
    public List<DestinationAlloc> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<DestinationAlloc> destinations) {
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

        private OffsetDateTime allocationCompletedAt;

        private String userId;

        private String productId;

        private OrderSide side;

        private String avgPrice;

        private String baseQuantity;

        private String quoteValue;

        private String feesAllocated;

        private AllocationStatus status;

        private String source;

        private List<String> orderIds;

        private List<DestinationAlloc> destinations;

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

        public Builder status(AllocationStatus status) {
            this.status = status;
            return this;
        }

        public Builder source(String source) {
            this.source = source;
            return this;
        }

        public Builder orderIds(List<String> orderIds) {
            this.orderIds = orderIds;
            return this;
        }

        public Builder destinations(List<DestinationAlloc> destinations) {
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

