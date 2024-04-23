package com.coinbase.prime.model.allocations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreatePortfolioAllocationsRequest {
    @JsonProperty("allocation_id")
    private String allocationId;
    @JsonProperty("source_portfolio_id")
    private String sourcePortfolioId;
    @JsonProperty("product_id")
    private String productId;
    @JsonProperty("order_ids")
    private String[] orderIds;
    @JsonProperty("allocation_legs")
    private AllocationLeg[] allocationLegs;
    @JsonProperty("size_type")
    private String sizeType;
    @JsonProperty("remainder_destination_portfolio")
    private String remainderDestinationPortfolio;

    public CreatePortfolioAllocationsRequest() {
    }

    public CreatePortfolioAllocationsRequest(Builder builder) {
        this.allocationId = builder.allocationId;
        this.sourcePortfolioId = builder.sourcePortfolioId;
        this.productId = builder.productId;
        this.orderIds = builder.orderIds;
        this.allocationLegs = builder.allocationLegs;
        this.sizeType = builder.sizeType;
        this.remainderDestinationPortfolio = builder.remainderDestinationPortfolio;
    }

    public String getAllocationId() {
        return allocationId;
    }

    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    public String getSourcePortfolioId() {
        return sourcePortfolioId;
    }

    public void setSourcePortfolioId(String sourcePortfolioId) {
        this.sourcePortfolioId = sourcePortfolioId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String[] getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(String[] orderIds) {
        this.orderIds = orderIds;
    }

    public AllocationLeg[] getAllocationLegs() {
        return allocationLegs;
    }

    public void setAllocationLegs(AllocationLeg[] allocationLegs) {
        this.allocationLegs = allocationLegs;
    }

    public String getSizeType() {
        return sizeType;
    }

    public void setSizeType(String sizeType) {
        this.sizeType = sizeType;
    }

    public String getRemainderDestinationPortfolio() {
        return remainderDestinationPortfolio;
    }

    public void setRemainderDestinationPortfolio(String remainderDestinationPortfolio) {
        this.remainderDestinationPortfolio = remainderDestinationPortfolio;
    }

    public static class Builder {
        private String allocationId;
        private String sourcePortfolioId;
        private String productId;
        private String[] orderIds;
        private AllocationLeg[] allocationLegs;
        private String sizeType;
        private String remainderDestinationPortfolio;

        public Builder() {
        }

        public Builder allocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }

        public Builder sourcePortfolioId(String sourcePortfolioId) {
            this.sourcePortfolioId = sourcePortfolioId;
            return this;
        }

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder orderIds(String[] orderIds) {
            this.orderIds = orderIds;
            return this;
        }

        public Builder allocationLegs(AllocationLeg[] allocationLegs) {
            this.allocationLegs = allocationLegs;
            return this;
        }

        public Builder sizeType(String sizeType) {
            this.sizeType = sizeType;
            return this;
        }

        public Builder remainderDestinationPortfolio(String remainderDestinationPortfolio) {
            this.remainderDestinationPortfolio = remainderDestinationPortfolio;
            return this;
        }

        public CreatePortfolioAllocationsRequest build() {
            return new CreatePortfolioAllocationsRequest(this);
        }
    }
}
