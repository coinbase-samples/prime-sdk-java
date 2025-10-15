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
    /** The display symbol for the asset */
    private String symbol;
    
    /** The total amount in whole units with full precision */
    private String amount;
    
    /** Amount that is currently locked due to bonding/staking, potentially subject to an unbonding period, in whole units */
    @JsonProperty("bonded_amount")
    private String bondedAmount;
    
    /** Amount that is currently unbonding and subject to an unbonding period */
    @JsonProperty("unbonding_amount")
    private String unbondingAmount;
    
    /** Amount of pending staking rewards */
    @JsonProperty("pending_rewards_amount")
    private String pendingRewardsAmount;
    
    /** Amount of past staking rewards that have been earned */
    @JsonProperty("past_rewards_amount")
    private String pastRewardsAmount;
    
    /** Amount available for bonding/staking */
    @JsonProperty("bondable_amount")
    private String bondableAmount;

    public StakingBalance() {
    }

    public StakingBalance(Builder builder) {
        this.symbol = builder.symbol;
        this.amount = builder.amount;
        this.bondedAmount = builder.bondedAmount;
        this.unbondingAmount = builder.unbondingAmount;
        this.pendingRewardsAmount = builder.pendingRewardsAmount;
        this.pastRewardsAmount = builder.pastRewardsAmount;
        this.bondableAmount = builder.bondableAmount;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getBondedAmount() {
        return bondedAmount;
    }

    public void setBondedAmount(String bondedAmount) {
        this.bondedAmount = bondedAmount;
    }

    public String getUnbondingAmount() {
        return unbondingAmount;
    }

    public void setUnbondingAmount(String unbondingAmount) {
        this.unbondingAmount = unbondingAmount;
    }

    public String getPendingRewardsAmount() {
        return pendingRewardsAmount;
    }

    public void setPendingRewardsAmount(String pendingRewardsAmount) {
        this.pendingRewardsAmount = pendingRewardsAmount;
    }

    public String getPastRewardsAmount() {
        return pastRewardsAmount;
    }

    public void setPastRewardsAmount(String pastRewardsAmount) {
        this.pastRewardsAmount = pastRewardsAmount;
    }

    public String getBondableAmount() {
        return bondableAmount;
    }

    public void setBondableAmount(String bondableAmount) {
        this.bondableAmount = bondableAmount;
    }

    public static class Builder {
        private String symbol;
        private String amount;
        private String bondedAmount;
        private String unbondingAmount;
        private String pendingRewardsAmount;
        private String pastRewardsAmount;
        private String bondableAmount;

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder bondedAmount(String bondedAmount) {
            this.bondedAmount = bondedAmount;
            return this;
        }

        public Builder unbondingAmount(String unbondingAmount) {
            this.unbondingAmount = unbondingAmount;
            return this;
        }

        public Builder pendingRewardsAmount(String pendingRewardsAmount) {
            this.pendingRewardsAmount = pendingRewardsAmount;
            return this;
        }

        public Builder pastRewardsAmount(String pastRewardsAmount) {
            this.pastRewardsAmount = pastRewardsAmount;
            return this;
        }

        public Builder bondableAmount(String bondableAmount) {
            this.bondableAmount = bondableAmount;
            return this;
        }

        public StakingBalance build() {
            return new StakingBalance(this);
        }
    }
}