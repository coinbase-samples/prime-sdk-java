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
 * Allocation strategy configuration for automated portfolio allocations
 */
public class AllocationStrategy {
    private String id;
    private String name;
    private String description;
    @JsonProperty("size_type")
    private AllocationSizeType sizeType;
    @JsonProperty("default_remainder_portfolio")
    private String defaultRemainderPortfolio;
    @JsonProperty("auto_allocate")
    private Boolean autoAllocate;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    private AllocationRule[] rules;

    public AllocationStrategy() {}

    public AllocationStrategy(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
        this.sizeType = builder.sizeType;
        this.defaultRemainderPortfolio = builder.defaultRemainderPortfolio;
        this.autoAllocate = builder.autoAllocate;
        this.createdAt = builder.createdAt;
        this.updatedAt = builder.updatedAt;
        this.rules = builder.rules;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AllocationSizeType getSizeType() {
        return sizeType;
    }

    public void setSizeType(AllocationSizeType sizeType) {
        this.sizeType = sizeType;
    }

    public String getDefaultRemainderPortfolio() {
        return defaultRemainderPortfolio;
    }

    public void setDefaultRemainderPortfolio(String defaultRemainderPortfolio) {
        this.defaultRemainderPortfolio = defaultRemainderPortfolio;
    }

    public Boolean getAutoAllocate() {
        return autoAllocate;
    }

    public void setAutoAllocate(Boolean autoAllocate) {
        this.autoAllocate = autoAllocate;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public AllocationRule[] getRules() {
        return rules;
    }

    public void setRules(AllocationRule[] rules) {
        this.rules = rules;
    }

    public static class Builder {
        private String id;
        private String name;
        private String description;
        private AllocationSizeType sizeType;
        private String defaultRemainderPortfolio;
        private Boolean autoAllocate;
        private String createdAt;
        private String updatedAt;
        private AllocationRule[] rules;

        public Builder() {}

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder sizeType(AllocationSizeType sizeType) {
            this.sizeType = sizeType;
            return this;
        }

        public Builder defaultRemainderPortfolio(String defaultRemainderPortfolio) {
            this.defaultRemainderPortfolio = defaultRemainderPortfolio;
            return this;
        }

        public Builder autoAllocate(Boolean autoAllocate) {
            this.autoAllocate = autoAllocate;
            return this;
        }

        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder rules(AllocationRule[] rules) {
            this.rules = rules;
            return this;
        }

        public AllocationStrategy build() {
            return new AllocationStrategy(this);
        }
    }
}