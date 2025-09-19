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

public class RewardsSummary {
    /** The currency symbol */
    private String symbol;
    
    /** Total amount of rewards earned */
    @JsonProperty("total_earned")
    private String totalEarned;
    
    /** Amount of rewards available to claim */
    @JsonProperty("claimable_amount")
    private String claimableAmount;
    
    /** Amount of rewards pending */
    @JsonProperty("pending_amount")
    private String pendingAmount;

    public RewardsSummary() {
    }

    public RewardsSummary(Builder builder) {
        this.symbol = builder.symbol;
        this.totalEarned = builder.totalEarned;
        this.claimableAmount = builder.claimableAmount;
        this.pendingAmount = builder.pendingAmount;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getTotalEarned() {
        return totalEarned;
    }

    public void setTotalEarned(String totalEarned) {
        this.totalEarned = totalEarned;
    }

    public String getClaimableAmount() {
        return claimableAmount;
    }

    public void setClaimableAmount(String claimableAmount) {
        this.claimableAmount = claimableAmount;
    }

    public String getPendingAmount() {
        return pendingAmount;
    }

    public void setPendingAmount(String pendingAmount) {
        this.pendingAmount = pendingAmount;
    }

    public static class Builder {
        private String symbol;
        private String totalEarned;
        private String claimableAmount;
        private String pendingAmount;

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder totalEarned(String totalEarned) {
            this.totalEarned = totalEarned;
            return this;
        }

        public Builder claimableAmount(String claimableAmount) {
            this.claimableAmount = claimableAmount;
            return this;
        }

        public Builder pendingAmount(String pendingAmount) {
            this.pendingAmount = pendingAmount;
            return this;
        }

        public RewardsSummary build() {
            return new RewardsSummary(this);
        }
    }
}