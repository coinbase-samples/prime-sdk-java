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

import com.coinbase.prime.model.enums.FeeModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Comprehensive commission report model for detailed analysis and reporting.
 */
public class CommissionReport {
    @JsonProperty("report_id")
    private String reportId;
    
    @JsonProperty("portfolio_id")
    private String portfolioId;
    
    @JsonProperty("report_name")
    private String reportName;
    
    @JsonProperty("report_period_start")
    private String reportPeriodStart;
    
    @JsonProperty("report_period_end")
    private String reportPeriodEnd;
    
    @JsonProperty("report_generated_at")
    private String reportGeneratedAt;
    
    @JsonProperty("executive_summary")
    private ExecutiveSummary executiveSummary;
    
    @JsonProperty("detailed_breakdown")
    private List<CommissionCalculation> detailedBreakdown;
    
    @JsonProperty("performance_metrics")
    private PerformanceMetrics performanceMetrics;
    
    @JsonProperty("cost_analysis")
    private CostAnalysis costAnalysis;
    
    @JsonProperty("recommendations")
    private List<CommissionRecommendation> recommendations;
    
    @JsonProperty("compliance_notes")
    private List<String> complianceNotes;

    public CommissionReport() {
    }

    public CommissionReport(Builder builder) {
        this.reportId = builder.reportId;
        this.portfolioId = builder.portfolioId;
        this.reportName = builder.reportName;
        this.reportPeriodStart = builder.reportPeriodStart;
        this.reportPeriodEnd = builder.reportPeriodEnd;
        this.reportGeneratedAt = builder.reportGeneratedAt;
        this.executiveSummary = builder.executiveSummary;
        this.detailedBreakdown = builder.detailedBreakdown;
        this.performanceMetrics = builder.performanceMetrics;
        this.costAnalysis = builder.costAnalysis;
        this.recommendations = builder.recommendations;
        this.complianceNotes = builder.complianceNotes;
    }

    /**
     * Executive summary for high-level commission insights.
     */
    public static class ExecutiveSummary {
        @JsonProperty("total_commission_paid")
        private String totalCommissionPaid;
        
        @JsonProperty("total_trading_volume")
        private String totalTradingVolume;
        
        @JsonProperty("average_commission_rate")
        private String averageCommissionRate;
        
        @JsonProperty("period_over_period_change")
        private String periodOverPeriodChange;
        
        @JsonProperty("top_trading_pair")
        private String topTradingPair;
        
        @JsonProperty("current_fee_structure")
        private FeeModel currentFeeStructure;

        public ExecutiveSummary() {
        }

        // Getters and setters for ExecutiveSummary
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

        public String getAverageCommissionRate() {
            return averageCommissionRate;
        }

        public void setAverageCommissionRate(String averageCommissionRate) {
            this.averageCommissionRate = averageCommissionRate;
        }

        public String getPeriodOverPeriodChange() {
            return periodOverPeriodChange;
        }

        public void setPeriodOverPeriodChange(String periodOverPeriodChange) {
            this.periodOverPeriodChange = periodOverPeriodChange;
        }

        public String getTopTradingPair() {
            return topTradingPair;
        }

        public void setTopTradingPair(String topTradingPair) {
            this.topTradingPair = topTradingPair;
        }

        public FeeModel getCurrentFeeStructure() {
            return currentFeeStructure;
        }

        public void setCurrentFeeStructure(FeeModel currentFeeStructure) {
            this.currentFeeStructure = currentFeeStructure;
        }
    }

    /**
     * Performance metrics for commission analysis.
     */
    public static class PerformanceMetrics {
        @JsonProperty("commission_efficiency_score")
        private String commissionEfficiencyScore;
        
        @JsonProperty("cost_per_trade")
        private String costPerTrade;
        
        @JsonProperty("volume_tier_achieved")
        private String volumeTierAchieved;
        
        @JsonProperty("potential_tier_upgrade")
        private String potentialTierUpgrade;
        
        @JsonProperty("commission_trend")
        private String commissionTrend;

        public PerformanceMetrics() {
        }

        // Getters and setters for PerformanceMetrics
        public String getCommissionEfficiencyScore() {
            return commissionEfficiencyScore;
        }

        public void setCommissionEfficiencyScore(String commissionEfficiencyScore) {
            this.commissionEfficiencyScore = commissionEfficiencyScore;
        }

        public String getCostPerTrade() {
            return costPerTrade;
        }

        public void setCostPerTrade(String costPerTrade) {
            this.costPerTrade = costPerTrade;
        }

        public String getVolumeTierAchieved() {
            return volumeTierAchieved;
        }

        public void setVolumeTierAchieved(String volumeTierAchieved) {
            this.volumeTierAchieved = volumeTierAchieved;
        }

        public String getPotentialTierUpgrade() {
            return potentialTierUpgrade;
        }

        public void setPotentialTierUpgrade(String potentialTierUpgrade) {
            this.potentialTierUpgrade = potentialTierUpgrade;
        }

        public String getCommissionTrend() {
            return commissionTrend;
        }

        public void setCommissionTrend(String commissionTrend) {
            this.commissionTrend = commissionTrend;
        }
    }

    /**
     * Cost analysis for different fee models.
     */
    public static class CostAnalysis {
        @JsonProperty("current_model_cost")
        private String currentModelCost;
        
        @JsonProperty("alternative_model_cost")
        private String alternativeModelCost;
        
        @JsonProperty("potential_savings")
        private String potentialSavings;
        
        @JsonProperty("break_even_volume")
        private String breakEvenVolume;
        
        @JsonProperty("roi_projection")
        private String roiProjection;

        public CostAnalysis() {
        }

        // Getters and setters for CostAnalysis
        public String getCurrentModelCost() {
            return currentModelCost;
        }

        public void setCurrentModelCost(String currentModelCost) {
            this.currentModelCost = currentModelCost;
        }

        public String getAlternativeModelCost() {
            return alternativeModelCost;
        }

        public void setAlternativeModelCost(String alternativeModelCost) {
            this.alternativeModelCost = alternativeModelCost;
        }

        public String getPotentialSavings() {
            return potentialSavings;
        }

        public void setPotentialSavings(String potentialSavings) {
            this.potentialSavings = potentialSavings;
        }

        public String getBreakEvenVolume() {
            return breakEvenVolume;
        }

        public void setBreakEvenVolume(String breakEvenVolume) {
            this.breakEvenVolume = breakEvenVolume;
        }

        public String getRoiProjection() {
            return roiProjection;
        }

        public void setRoiProjection(String roiProjection) {
            this.roiProjection = roiProjection;
        }
    }

    /**
     * Commission recommendation with detailed rationale.
     */
    public static class CommissionRecommendation {
        @JsonProperty("recommendation_type")
        private String recommendationType;
        
        @JsonProperty("description")
        private String description;
        
        @JsonProperty("expected_impact")
        private String expectedImpact;
        
        @JsonProperty("implementation_timeline")
        private String implementationTimeline;
        
        @JsonProperty("priority")
        private String priority;

        public CommissionRecommendation() {
        }

        // Getters and setters for CommissionRecommendation
        public String getRecommendationType() {
            return recommendationType;
        }

        public void setRecommendationType(String recommendationType) {
            this.recommendationType = recommendationType;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getExpectedImpact() {
            return expectedImpact;
        }

        public void setExpectedImpact(String expectedImpact) {
            this.expectedImpact = expectedImpact;
        }

        public String getImplementationTimeline() {
            return implementationTimeline;
        }

        public void setImplementationTimeline(String implementationTimeline) {
            this.implementationTimeline = implementationTimeline;
        }

        public String getPriority() {
            return priority;
        }

        public void setPriority(String priority) {
            this.priority = priority;
        }
    }

    // Main class getters and setters
    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getReportPeriodStart() {
        return reportPeriodStart;
    }

    public void setReportPeriodStart(String reportPeriodStart) {
        this.reportPeriodStart = reportPeriodStart;
    }

    public String getReportPeriodEnd() {
        return reportPeriodEnd;
    }

    public void setReportPeriodEnd(String reportPeriodEnd) {
        this.reportPeriodEnd = reportPeriodEnd;
    }

    public String getReportGeneratedAt() {
        return reportGeneratedAt;
    }

    public void setReportGeneratedAt(String reportGeneratedAt) {
        this.reportGeneratedAt = reportGeneratedAt;
    }

    public ExecutiveSummary getExecutiveSummary() {
        return executiveSummary;
    }

    public void setExecutiveSummary(ExecutiveSummary executiveSummary) {
        this.executiveSummary = executiveSummary;
    }

    public List<CommissionCalculation> getDetailedBreakdown() {
        return detailedBreakdown;
    }

    public void setDetailedBreakdown(List<CommissionCalculation> detailedBreakdown) {
        this.detailedBreakdown = detailedBreakdown;
    }

    public PerformanceMetrics getPerformanceMetrics() {
        return performanceMetrics;
    }

    public void setPerformanceMetrics(PerformanceMetrics performanceMetrics) {
        this.performanceMetrics = performanceMetrics;
    }

    public CostAnalysis getCostAnalysis() {
        return costAnalysis;
    }

    public void setCostAnalysis(CostAnalysis costAnalysis) {
        this.costAnalysis = costAnalysis;
    }

    public List<CommissionRecommendation> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(List<CommissionRecommendation> recommendations) {
        this.recommendations = recommendations;
    }

    public List<String> getComplianceNotes() {
        return complianceNotes;
    }

    public void setComplianceNotes(List<String> complianceNotes) {
        this.complianceNotes = complianceNotes;
    }

    public static class Builder {
        private String reportId;
        private String portfolioId;
        private String reportName;
        private String reportPeriodStart;
        private String reportPeriodEnd;
        private String reportGeneratedAt;
        private ExecutiveSummary executiveSummary;
        private List<CommissionCalculation> detailedBreakdown;
        private PerformanceMetrics performanceMetrics;
        private CostAnalysis costAnalysis;
        private List<CommissionRecommendation> recommendations;
        private List<String> complianceNotes;

        public Builder() {
        }

        public Builder reportId(String reportId) {
            this.reportId = reportId;
            return this;
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder reportName(String reportName) {
            this.reportName = reportName;
            return this;
        }

        public Builder reportPeriodStart(String reportPeriodStart) {
            this.reportPeriodStart = reportPeriodStart;
            return this;
        }

        public Builder reportPeriodEnd(String reportPeriodEnd) {
            this.reportPeriodEnd = reportPeriodEnd;
            return this;
        }

        public Builder reportGeneratedAt(String reportGeneratedAt) {
            this.reportGeneratedAt = reportGeneratedAt;
            return this;
        }

        public Builder executiveSummary(ExecutiveSummary executiveSummary) {
            this.executiveSummary = executiveSummary;
            return this;
        }

        public Builder detailedBreakdown(List<CommissionCalculation> detailedBreakdown) {
            this.detailedBreakdown = detailedBreakdown;
            return this;
        }

        public Builder performanceMetrics(PerformanceMetrics performanceMetrics) {
            this.performanceMetrics = performanceMetrics;
            return this;
        }

        public Builder costAnalysis(CostAnalysis costAnalysis) {
            this.costAnalysis = costAnalysis;
            return this;
        }

        public Builder recommendations(List<CommissionRecommendation> recommendations) {
            this.recommendations = recommendations;
            return this;
        }

        public Builder complianceNotes(List<String> complianceNotes) {
            this.complianceNotes = complianceNotes;
            return this;
        }

        public CommissionReport build() {
            return new CommissionReport(this);
        }
    }
}