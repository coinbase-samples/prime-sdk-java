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

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class StakingSummary {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    
    @JsonProperty("total_staked_amount")
    private String totalStakedAmount;
    
    @JsonProperty("total_unstaking_amount")
    private String totalUnstakingAmount;
    
    @JsonProperty("total_rewards_earned")
    private String totalRewardsEarned;
    
    @JsonProperty("total_pending_rewards")
    private String totalPendingRewards;
    
    @JsonProperty("active_positions")
    private List<StakingPosition> activePositions;
    
    @JsonProperty("network_breakdown")
    private List<StakingBalance> networkBreakdown;

    public StakingSummary() {
    }

    public StakingSummary(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.totalStakedAmount = builder.totalStakedAmount;
        this.totalUnstakingAmount = builder.totalUnstakingAmount;
        this.totalRewardsEarned = builder.totalRewardsEarned;
        this.totalPendingRewards = builder.totalPendingRewards;
        this.activePositions = builder.activePositions;
        this.networkBreakdown = builder.networkBreakdown;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getTotalStakedAmount() {
        return totalStakedAmount;
    }

    public void setTotalStakedAmount(String totalStakedAmount) {
        this.totalStakedAmount = totalStakedAmount;
    }

    public String getTotalUnstakingAmount() {
        return totalUnstakingAmount;
    }

    public void setTotalUnstakingAmount(String totalUnstakingAmount) {
        this.totalUnstakingAmount = totalUnstakingAmount;
    }

    public String getTotalRewardsEarned() {
        return totalRewardsEarned;
    }

    public void setTotalRewardsEarned(String totalRewardsEarned) {
        this.totalRewardsEarned = totalRewardsEarned;
    }

    public String getTotalPendingRewards() {
        return totalPendingRewards;
    }

    public void setTotalPendingRewards(String totalPendingRewards) {
        this.totalPendingRewards = totalPendingRewards;
    }

    public List<StakingPosition> getActivePositions() {
        return activePositions;
    }

    public void setActivePositions(List<StakingPosition> activePositions) {
        this.activePositions = activePositions;
    }

    public List<StakingBalance> getNetworkBreakdown() {
        return networkBreakdown;
    }

    public void setNetworkBreakdown(List<StakingBalance> networkBreakdown) {
        this.networkBreakdown = networkBreakdown;
    }

    public static class Builder {
        private String portfolioId;
        private String totalStakedAmount;
        private String totalUnstakingAmount;
        private String totalRewardsEarned;
        private String totalPendingRewards;
        private List<StakingPosition> activePositions;
        private List<StakingBalance> networkBreakdown;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder totalStakedAmount(String totalStakedAmount) {
            this.totalStakedAmount = totalStakedAmount;
            return this;
        }

        public Builder totalUnstakingAmount(String totalUnstakingAmount) {
            this.totalUnstakingAmount = totalUnstakingAmount;
            return this;
        }

        public Builder totalRewardsEarned(String totalRewardsEarned) {
            this.totalRewardsEarned = totalRewardsEarned;
            return this;
        }

        public Builder totalPendingRewards(String totalPendingRewards) {
            this.totalPendingRewards = totalPendingRewards;
            return this;
        }

        public Builder activePositions(List<StakingPosition> activePositions) {
            this.activePositions = activePositions;
            return this;
        }

        public Builder networkBreakdown(List<StakingBalance> networkBreakdown) {
            this.networkBreakdown = networkBreakdown;
            return this;
        }

        public StakingSummary build() {
            return new StakingSummary(this);
        }
    }
}