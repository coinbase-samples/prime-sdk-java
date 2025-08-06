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

package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Model representing the complete commission structure for a portfolio.
 */
public class CommissionStructure {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    
    @JsonProperty("commission_rates")
    private List<CommissionRate> commissionRates;
    
    @JsonProperty("volume_discounts")
    private List<VolumeDiscount> volumeDiscounts;
    
    @JsonProperty("default_commission")
    private Commission defaultCommission;
    
    @JsonProperty("created_at")
    private String createdAt;
    
    @JsonProperty("updated_at")
    private String updatedAt;

    public CommissionStructure() {
    }

    public CommissionStructure(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.commissionRates = builder.commissionRates;
        this.volumeDiscounts = builder.volumeDiscounts;
        this.defaultCommission = builder.defaultCommission;
        this.createdAt = builder.createdAt;
        this.updatedAt = builder.updatedAt;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public List<CommissionRate> getCommissionRates() {
        return commissionRates;
    }

    public void setCommissionRates(List<CommissionRate> commissionRates) {
        this.commissionRates = commissionRates;
    }

    public List<VolumeDiscount> getVolumeDiscounts() {
        return volumeDiscounts;
    }

    public void setVolumeDiscounts(List<VolumeDiscount> volumeDiscounts) {
        this.volumeDiscounts = volumeDiscounts;
    }

    public Commission getDefaultCommission() {
        return defaultCommission;
    }

    public void setDefaultCommission(Commission defaultCommission) {
        this.defaultCommission = defaultCommission;
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

    public static class Builder {
        private String portfolioId;
        private List<CommissionRate> commissionRates;
        private List<VolumeDiscount> volumeDiscounts;
        private Commission defaultCommission;
        private String createdAt;
        private String updatedAt;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder commissionRates(List<CommissionRate> commissionRates) {
            this.commissionRates = commissionRates;
            return this;
        }

        public Builder volumeDiscounts(List<VolumeDiscount> volumeDiscounts) {
            this.volumeDiscounts = volumeDiscounts;
            return this;
        }

        public Builder defaultCommission(Commission defaultCommission) {
            this.defaultCommission = defaultCommission;
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

        public CommissionStructure build() {
            return new CommissionStructure(this);
        }
    }
}