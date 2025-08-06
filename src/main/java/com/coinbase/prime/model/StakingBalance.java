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

public class StakingBalance {
    @JsonProperty("symbol")
    private String symbol;
    
    @JsonProperty("staked_amount")
    private String stakedAmount;
    
    @JsonProperty("unstaking_amount")
    private String unstakingAmount;
    
    @JsonProperty("claimable_amount")
    private String claimableAmount;
    
    @JsonProperty("pending_rewards")
    private String pendingRewards;
    
    @JsonProperty("earned_rewards")
    private String earnedRewards;
    
    @JsonProperty("validator_address")
    private String validatorAddress;

    public StakingBalance() {
    }

    public StakingBalance(Builder builder) {
        this.symbol = builder.symbol;
        this.stakedAmount = builder.stakedAmount;
        this.unstakingAmount = builder.unstakingAmount;
        this.claimableAmount = builder.claimableAmount;
        this.pendingRewards = builder.pendingRewards;
        this.earnedRewards = builder.earnedRewards;
        this.validatorAddress = builder.validatorAddress;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getStakedAmount() {
        return stakedAmount;
    }

    public void setStakedAmount(String stakedAmount) {
        this.stakedAmount = stakedAmount;
    }

    public String getUnstakingAmount() {
        return unstakingAmount;
    }

    public void setUnstakingAmount(String unstakingAmount) {
        this.unstakingAmount = unstakingAmount;
    }

    public String getClaimableAmount() {
        return claimableAmount;
    }

    public void setClaimableAmount(String claimableAmount) {
        this.claimableAmount = claimableAmount;
    }

    public String getPendingRewards() {
        return pendingRewards;
    }

    public void setPendingRewards(String pendingRewards) {
        this.pendingRewards = pendingRewards;
    }

    public String getEarnedRewards() {
        return earnedRewards;
    }

    public void setEarnedRewards(String earnedRewards) {
        this.earnedRewards = earnedRewards;
    }

    public String getValidatorAddress() {
        return validatorAddress;
    }

    public void setValidatorAddress(String validatorAddress) {
        this.validatorAddress = validatorAddress;
    }

    public static class Builder {
        private String symbol;
        private String stakedAmount;
        private String unstakingAmount;
        private String claimableAmount;
        private String pendingRewards;
        private String earnedRewards;
        private String validatorAddress;

        public Builder() {
        }

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder stakedAmount(String stakedAmount) {
            this.stakedAmount = stakedAmount;
            return this;
        }

        public Builder unstakingAmount(String unstakingAmount) {
            this.unstakingAmount = unstakingAmount;
            return this;
        }

        public Builder claimableAmount(String claimableAmount) {
            this.claimableAmount = claimableAmount;
            return this;
        }

        public Builder pendingRewards(String pendingRewards) {
            this.pendingRewards = pendingRewards;
            return this;
        }

        public Builder earnedRewards(String earnedRewards) {
            this.earnedRewards = earnedRewards;
            return this;
        }

        public Builder validatorAddress(String validatorAddress) {
            this.validatorAddress = validatorAddress;
            return this;
        }

        public StakingBalance build() {
            return new StakingBalance(this);
        }
    }
}