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

package com.coinbase.prime.model;

import com.coinbase.prime.model.enums.AllocationSizeType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Individual allocation rule within an allocation strategy
 */
public class AllocationRule {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    @JsonProperty("allocation_percentage")
    private String allocationPercentage;
    @JsonProperty("size_type")
    private AllocationSizeType sizeType;
    private String priority;
    @JsonProperty("min_allocation")
    private String minAllocation;
    @JsonProperty("max_allocation")
    private String maxAllocation;

    public AllocationRule() {}

    public AllocationRule(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.allocationPercentage = builder.allocationPercentage;
        this.sizeType = builder.sizeType;
        this.priority = builder.priority;
        this.minAllocation = builder.minAllocation;
        this.maxAllocation = builder.maxAllocation;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getAllocationPercentage() {
        return allocationPercentage;
    }

    public void setAllocationPercentage(String allocationPercentage) {
        this.allocationPercentage = allocationPercentage;
    }

    public AllocationSizeType getSizeType() {
        return sizeType;
    }

    public void setSizeType(AllocationSizeType sizeType) {
        this.sizeType = sizeType;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getMinAllocation() {
        return minAllocation;
    }

    public void setMinAllocation(String minAllocation) {
        this.minAllocation = minAllocation;
    }

    public String getMaxAllocation() {
        return maxAllocation;
    }

    public void setMaxAllocation(String maxAllocation) {
        this.maxAllocation = maxAllocation;
    }

    public static class Builder {
        private String portfolioId;
        private String allocationPercentage;
        private AllocationSizeType sizeType;
        private String priority;
        private String minAllocation;
        private String maxAllocation;

        public Builder() {}

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder allocationPercentage(String allocationPercentage) {
            this.allocationPercentage = allocationPercentage;
            return this;
        }

        public Builder sizeType(AllocationSizeType sizeType) {
            this.sizeType = sizeType;
            return this;
        }

        public Builder priority(String priority) {
            this.priority = priority;
            return this;
        }

        public Builder minAllocation(String minAllocation) {
            this.minAllocation = minAllocation;
            return this;
        }

        public Builder maxAllocation(String maxAllocation) {
            this.maxAllocation = maxAllocation;
            return this;
        }

        public AllocationRule build() {
            return new AllocationRule(this);
        }
    }
}