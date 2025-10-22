/*
 * Copyright 2025-present Coinbase Global, Inc.
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

package com.coinbase.prime.allocations;

import com.coinbase.prime.model.AllocationLeg;
import com.coinbase.prime.model.enums.AllocationSizeType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateAllocationRequest {
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
    private SizeType sizeType;
    @JsonProperty("remainder_destination_portfolio")
    private String remainderDestinationPortfolio;
    @JsonProperty("netting_id")
    private String nettingId;

    public CreateAllocationRequest() {
    }

    public CreateAllocationRequest(Builder builder) {
        this.allocationId = builder.allocationId;
        this.sourcePortfolioId = builder.sourcePortfolioId;
        this.productId = builder.productId;
        this.orderIds = builder.orderIds;
        this.allocationLegs = builder.allocationLegs;
        this.sizeType = builder.sizeType;
        this.remainderDestinationPortfolio = builder.remainderDestinationPortfolio;
        this.nettingId = builder.nettingId;
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

    public SizeType getSizeType() {
        return sizeType;
    }

    public void setSizeType(SizeType sizeType) {
        this.sizeType = sizeType;
    }

    public String getRemainderDestinationPortfolio() {
        return remainderDestinationPortfolio;
    }

    public void setRemainderDestinationPortfolio(String remainderDestinationPortfolio) {
        this.remainderDestinationPortfolio = remainderDestinationPortfolio;
    }

    public String getNettingId() {
        return nettingId;
    }

    public void setNettingId(String nettingId) {
        this.nettingId = nettingId;
    }

    public static class Builder {
        private String allocationId;
        private String sourcePortfolioId;
        private String productId;
        private String[] orderIds;
        private AllocationLeg[] allocationLegs;
        private SizeType sizeType;
        private String remainderDestinationPortfolio;
        private String nettingId;

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

        public Builder sizeType(SizeType sizeType) {
            this.sizeType = sizeType;
            return this;
        }

        public Builder remainderDestinationPortfolio(String remainderDestinationPortfolio) {
            this.remainderDestinationPortfolio = remainderDestinationPortfolio;
            return this;
        }

        public Builder nettingId(String nettingId) {
            this.nettingId = nettingId;
            return this;
        }

        public CreateAllocationRequest build() {
            return new CreateAllocationRequest(this);
        }
    }
}
