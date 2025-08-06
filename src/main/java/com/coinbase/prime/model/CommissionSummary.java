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

import com.coinbase.prime.model.enums.CommissionCategory;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Model representing a commission summary for a portfolio over a specific period.
 */
public class CommissionSummary {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    
    @JsonProperty("start_date")
    private String startDate;
    
    @JsonProperty("end_date")
    private String endDate;
    
    @JsonProperty("total_commission")
    private String totalCommission;
    
    @JsonProperty("total_exchange_fees")
    private String totalExchangeFees;
    
    @JsonProperty("total_volume")
    private String totalVolume;
    
    @JsonProperty("currency")
    private String currency;
    
    @JsonProperty("commission_by_category")
    private List<CategoryCommission> commissionByCategory;
    
    @JsonProperty("commission_by_product")
    private List<ProductCommission> commissionByProduct;
    
    @JsonProperty("average_commission_rate")
    private String averageCommissionRate;
    
    @JsonProperty("generated_at")
    private String generatedAt;

    public CommissionSummary() {
    }

    public CommissionSummary(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.totalCommission = builder.totalCommission;
        this.totalExchangeFees = builder.totalExchangeFees;
        this.totalVolume = builder.totalVolume;
        this.currency = builder.currency;
        this.commissionByCategory = builder.commissionByCategory;
        this.commissionByProduct = builder.commissionByProduct;
        this.averageCommissionRate = builder.averageCommissionRate;
        this.generatedAt = builder.generatedAt;
    }

    // Getters and setters
    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getTotalCommission() {
        return totalCommission;
    }

    public void setTotalCommission(String totalCommission) {
        this.totalCommission = totalCommission;
    }

    public String getTotalExchangeFees() {
        return totalExchangeFees;
    }

    public void setTotalExchangeFees(String totalExchangeFees) {
        this.totalExchangeFees = totalExchangeFees;
    }

    public String getTotalVolume() {
        return totalVolume;
    }

    public void setTotalVolume(String totalVolume) {
        this.totalVolume = totalVolume;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<CategoryCommission> getCommissionByCategory() {
        return commissionByCategory;
    }

    public void setCommissionByCategory(List<CategoryCommission> commissionByCategory) {
        this.commissionByCategory = commissionByCategory;
    }

    public List<ProductCommission> getCommissionByProduct() {
        return commissionByProduct;
    }

    public void setCommissionByProduct(List<ProductCommission> commissionByProduct) {
        this.commissionByProduct = commissionByProduct;
    }

    public String getAverageCommissionRate() {
        return averageCommissionRate;
    }

    public void setAverageCommissionRate(String averageCommissionRate) {
        this.averageCommissionRate = averageCommissionRate;
    }

    public String getGeneratedAt() {
        return generatedAt;
    }

    public void setGeneratedAt(String generatedAt) {
        this.generatedAt = generatedAt;
    }

    /**
     * Nested class for commission breakdown by category.
     */
    public static class CategoryCommission {
        @JsonProperty("category")
        private CommissionCategory category;
        
        @JsonProperty("commission_amount")
        private String commissionAmount;
        
        @JsonProperty("volume")
        private String volume;
        
        @JsonProperty("trade_count")
        private Integer tradeCount;

        public CategoryCommission() {
        }

        public CommissionCategory getCategory() {
            return category;
        }

        public void setCategory(CommissionCategory category) {
            this.category = category;
        }

        public String getCommissionAmount() {
            return commissionAmount;
        }

        public void setCommissionAmount(String commissionAmount) {
            this.commissionAmount = commissionAmount;
        }

        public String getVolume() {
            return volume;
        }

        public void setVolume(String volume) {
            this.volume = volume;
        }

        public Integer getTradeCount() {
            return tradeCount;
        }

        public void setTradeCount(Integer tradeCount) {
            this.tradeCount = tradeCount;
        }
    }

    /**
     * Nested class for commission breakdown by product.
     */
    public static class ProductCommission {
        @JsonProperty("product_id")
        private String productId;
        
        @JsonProperty("commission_amount")
        private String commissionAmount;
        
        @JsonProperty("volume")
        private String volume;
        
        @JsonProperty("trade_count")
        private Integer tradeCount;

        public ProductCommission() {
        }

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public String getCommissionAmount() {
            return commissionAmount;
        }

        public void setCommissionAmount(String commissionAmount) {
            this.commissionAmount = commissionAmount;
        }

        public String getVolume() {
            return volume;
        }

        public void setVolume(String volume) {
            this.volume = volume;
        }

        public Integer getTradeCount() {
            return tradeCount;
        }

        public void setTradeCount(Integer tradeCount) {
            this.tradeCount = tradeCount;
        }
    }

    public static class Builder {
        private String portfolioId;
        private String startDate;
        private String endDate;
        private String totalCommission;
        private String totalExchangeFees;
        private String totalVolume;
        private String currency;
        private List<CategoryCommission> commissionByCategory;
        private List<ProductCommission> commissionByProduct;
        private String averageCommissionRate;
        private String generatedAt;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder totalCommission(String totalCommission) {
            this.totalCommission = totalCommission;
            return this;
        }

        public Builder totalExchangeFees(String totalExchangeFees) {
            this.totalExchangeFees = totalExchangeFees;
            return this;
        }

        public Builder totalVolume(String totalVolume) {
            this.totalVolume = totalVolume;
            return this;
        }

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public Builder commissionByCategory(List<CategoryCommission> commissionByCategory) {
            this.commissionByCategory = commissionByCategory;
            return this;
        }

        public Builder commissionByProduct(List<ProductCommission> commissionByProduct) {
            this.commissionByProduct = commissionByProduct;
            return this;
        }

        public Builder averageCommissionRate(String averageCommissionRate) {
            this.averageCommissionRate = averageCommissionRate;
            return this;
        }

        public Builder generatedAt(String generatedAt) {
            this.generatedAt = generatedAt;
            return this;
        }

        public CommissionSummary build() {
            return new CommissionSummary(this);
        }
    }
}