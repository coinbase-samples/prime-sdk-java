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
import com.coinbase.prime.model.enums.FeeModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Model for tracking commission metrics and performance over time.
 */
public class CommissionTracker {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    
    @JsonProperty("tracking_period_start")
    private String trackingPeriodStart;
    
    @JsonProperty("tracking_period_end")
    private String trackingPeriodEnd;
    
    @JsonProperty("current_fee_model")
    private FeeModel currentFeeModel;
    
    @JsonProperty("total_commission_paid")
    private String totalCommissionPaid;
    
    @JsonProperty("total_trading_volume")
    private String totalTradingVolume;
    
    @JsonProperty("effective_commission_rate")
    private String effectiveCommissionRate;
    
    @JsonProperty("commission_breakdown")
    private List<CommissionBreakdown> commissionBreakdown;
    
    @JsonProperty("monthly_trends")
    private List<MonthlyCommissionTrend> monthlyTrends;
    
    @JsonProperty("cost_savings_analysis")
    private CostSavingsAnalysis costSavingsAnalysis;
    
    @JsonProperty("recommendations")
    private List<String> recommendations;
    
    @JsonProperty("last_updated")
    private String lastUpdated;

    public CommissionTracker() {
    }

    public CommissionTracker(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.trackingPeriodStart = builder.trackingPeriodStart;
        this.trackingPeriodEnd = builder.trackingPeriodEnd;
        this.currentFeeModel = builder.currentFeeModel;
        this.totalCommissionPaid = builder.totalCommissionPaid;
        this.totalTradingVolume = builder.totalTradingVolume;
        this.effectiveCommissionRate = builder.effectiveCommissionRate;
        this.commissionBreakdown = builder.commissionBreakdown;
        this.monthlyTrends = builder.monthlyTrends;
        this.costSavingsAnalysis = builder.costSavingsAnalysis;
        this.recommendations = builder.recommendations;
        this.lastUpdated = builder.lastUpdated;
    }

    // Getters and setters
    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getTrackingPeriodStart() {
        return trackingPeriodStart;
    }

    public void setTrackingPeriodStart(String trackingPeriodStart) {
        this.trackingPeriodStart = trackingPeriodStart;
    }

    public String getTrackingPeriodEnd() {
        return trackingPeriodEnd;
    }

    public void setTrackingPeriodEnd(String trackingPeriodEnd) {
        this.trackingPeriodEnd = trackingPeriodEnd;
    }

    public FeeModel getCurrentFeeModel() {
        return currentFeeModel;
    }

    public void setCurrentFeeModel(FeeModel currentFeeModel) {
        this.currentFeeModel = currentFeeModel;
    }

    public String getTotalCommissionPaid() {
        return totalCommissionPaid;
    }

    public void setTotalCommissionPaid(String totalCommissionPaid) {
        this.totalCommissionPaid = totalCommissionPaid;
    }

    public String getTotalTradingVolume() {
        return totalTradingVolume;
    }

    public void setTotalTradingVolume(String totalTradingVolume) {
        this.totalTradingVolume = totalTradingVolume;
    }

    public String getEffectiveCommissionRate() {
        return effectiveCommissionRate;
    }

    public void setEffectiveCommissionRate(String effectiveCommissionRate) {
        this.effectiveCommissionRate = effectiveCommissionRate;
    }

    public List<CommissionBreakdown> getCommissionBreakdown() {
        return commissionBreakdown;
    }

    public void setCommissionBreakdown(List<CommissionBreakdown> commissionBreakdown) {
        this.commissionBreakdown = commissionBreakdown;
    }

    public List<MonthlyCommissionTrend> getMonthlyTrends() {
        return monthlyTrends;
    }

    public void setMonthlyTrends(List<MonthlyCommissionTrend> monthlyTrends) {
        this.monthlyTrends = monthlyTrends;
    }

    public CostSavingsAnalysis getCostSavingsAnalysis() {
        return costSavingsAnalysis;
    }

    public void setCostSavingsAnalysis(CostSavingsAnalysis costSavingsAnalysis) {
        this.costSavingsAnalysis = costSavingsAnalysis;
    }

    public List<String> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(List<String> recommendations) {
        this.recommendations = recommendations;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * Nested class for commission breakdown by category and product.
     */
    public static class CommissionBreakdown {
        @JsonProperty("category")
        private CommissionCategory category;
        
        @JsonProperty("product_id")
        private String productId;
        
        @JsonProperty("commission_paid")
        private String commissionPaid;
        
        @JsonProperty("volume")
        private String volume;
        
        @JsonProperty("trade_count")
        private Integer tradeCount;
        
        @JsonProperty("percentage_of_total")
        private String percentageOfTotal;

        public CommissionBreakdown() {
        }

        // Getters and setters for CommissionBreakdown
        public CommissionCategory getCategory() {
            return category;
        }

        public void setCategory(CommissionCategory category) {
            this.category = category;
        }

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public String getCommissionPaid() {
            return commissionPaid;
        }

        public void setCommissionPaid(String commissionPaid) {
            this.commissionPaid = commissionPaid;
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

        public String getPercentageOfTotal() {
            return percentageOfTotal;
        }

        public void setPercentageOfTotal(String percentageOfTotal) {
            this.percentageOfTotal = percentageOfTotal;
        }
    }

    /**
     * Nested class for monthly commission trends.
     */
    public static class MonthlyCommissionTrend {
        @JsonProperty("month")
        private String month;
        
        @JsonProperty("year")
        private Integer year;
        
        @JsonProperty("commission_paid")
        private String commissionPaid;
        
        @JsonProperty("trading_volume")
        private String tradingVolume;
        
        @JsonProperty("average_rate")
        private String averageRate;
        
        @JsonProperty("month_over_month_change")
        private String monthOverMonthChange;

        public MonthlyCommissionTrend() {
        }

        // Getters and setters for MonthlyCommissionTrend
        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public Integer getYear() {
            return year;
        }

        public void setYear(Integer year) {
            this.year = year;
        }

        public String getCommissionPaid() {
            return commissionPaid;
        }

        public void setCommissionPaid(String commissionPaid) {
            this.commissionPaid = commissionPaid;
        }

        public String getTradingVolume() {
            return tradingVolume;
        }

        public void setTradingVolume(String tradingVolume) {
            this.tradingVolume = tradingVolume;
        }

        public String getAverageRate() {
            return averageRate;
        }

        public void setAverageRate(String averageRate) {
            this.averageRate = averageRate;
        }

        public String getMonthOverMonthChange() {
            return monthOverMonthChange;
        }

        public void setMonthOverMonthChange(String monthOverMonthChange) {
            this.monthOverMonthChange = monthOverMonthChange;
        }
    }

    /**
     * Nested class for cost savings analysis.
     */
    public static class CostSavingsAnalysis {
        @JsonProperty("potential_savings_all_in")
        private String potentialSavingsAllIn;
        
        @JsonProperty("potential_savings_cost_plus")
        private String potentialSavingsCostPlus;
        
        @JsonProperty("recommended_fee_model")
        private FeeModel recommendedFeeModel;
        
        @JsonProperty("annual_projected_savings")
        private String annualProjectedSavings;

        public CostSavingsAnalysis() {
        }

        // Getters and setters for CostSavingsAnalysis
        public String getPotentialSavingsAllIn() {
            return potentialSavingsAllIn;
        }

        public void setPotentialSavingsAllIn(String potentialSavingsAllIn) {
            this.potentialSavingsAllIn = potentialSavingsAllIn;
        }

        public String getPotentialSavingsCostPlus() {
            return potentialSavingsCostPlus;
        }

        public void setPotentialSavingsCostPlus(String potentialSavingsCostPlus) {
            this.potentialSavingsCostPlus = potentialSavingsCostPlus;
        }

        public FeeModel getRecommendedFeeModel() {
            return recommendedFeeModel;
        }

        public void setRecommendedFeeModel(FeeModel recommendedFeeModel) {
            this.recommendedFeeModel = recommendedFeeModel;
        }

        public String getAnnualProjectedSavings() {
            return annualProjectedSavings;
        }

        public void setAnnualProjectedSavings(String annualProjectedSavings) {
            this.annualProjectedSavings = annualProjectedSavings;
        }
    }

    public static class Builder {
        private String portfolioId;
        private String trackingPeriodStart;
        private String trackingPeriodEnd;
        private FeeModel currentFeeModel;
        private String totalCommissionPaid;
        private String totalTradingVolume;
        private String effectiveCommissionRate;
        private List<CommissionBreakdown> commissionBreakdown;
        private List<MonthlyCommissionTrend> monthlyTrends;
        private CostSavingsAnalysis costSavingsAnalysis;
        private List<String> recommendations;
        private String lastUpdated;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder trackingPeriodStart(String trackingPeriodStart) {
            this.trackingPeriodStart = trackingPeriodStart;
            return this;
        }

        public Builder trackingPeriodEnd(String trackingPeriodEnd) {
            this.trackingPeriodEnd = trackingPeriodEnd;
            return this;
        }

        public Builder currentFeeModel(FeeModel currentFeeModel) {
            this.currentFeeModel = currentFeeModel;
            return this;
        }

        public Builder totalCommissionPaid(String totalCommissionPaid) {
            this.totalCommissionPaid = totalCommissionPaid;
            return this;
        }

        public Builder totalTradingVolume(String totalTradingVolume) {
            this.totalTradingVolume = totalTradingVolume;
            return this;
        }

        public Builder effectiveCommissionRate(String effectiveCommissionRate) {
            this.effectiveCommissionRate = effectiveCommissionRate;
            return this;
        }

        public Builder commissionBreakdown(List<CommissionBreakdown> commissionBreakdown) {
            this.commissionBreakdown = commissionBreakdown;
            return this;
        }

        public Builder monthlyTrends(List<MonthlyCommissionTrend> monthlyTrends) {
            this.monthlyTrends = monthlyTrends;
            return this;
        }

        public Builder costSavingsAnalysis(CostSavingsAnalysis costSavingsAnalysis) {
            this.costSavingsAnalysis = costSavingsAnalysis;
            return this;
        }

        public Builder recommendations(List<String> recommendations) {
            this.recommendations = recommendations;
            return this;
        }

        public Builder lastUpdated(String lastUpdated) {
            this.lastUpdated = lastUpdated;
            return this;
        }

        public CommissionTracker build() {
            return new CommissionTracker(this);
        }
    }
}