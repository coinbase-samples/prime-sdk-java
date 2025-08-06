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
import com.coinbase.prime.model.enums.StakingStatus;
import java.time.Instant;
import java.util.List;

public class StakingPosition {
    @JsonProperty("position_id")
    private String positionId;
    
    @JsonProperty("symbol")
    private String symbol;
    
    @JsonProperty("validator_address")
    private String validatorAddress;
    
    @JsonProperty("delegated_amount")
    private String delegatedAmount;
    
    @JsonProperty("status")
    private StakingStatus status;
    
    @JsonProperty("rewards_earned")
    private String rewardsEarned;
    
    @JsonProperty("annual_percentage_yield")
    private String annualPercentageYield;
    
    @JsonProperty("stake_date")
    private Instant stakeDate;
    
    @JsonProperty("unbonding_entries")
    private List<UnbondingEntry> unbondingEntries;

    public StakingPosition() {
    }

    public StakingPosition(Builder builder) {
        this.positionId = builder.positionId;
        this.symbol = builder.symbol;
        this.validatorAddress = builder.validatorAddress;
        this.delegatedAmount = builder.delegatedAmount;
        this.status = builder.status;
        this.rewardsEarned = builder.rewardsEarned;
        this.annualPercentageYield = builder.annualPercentageYield;
        this.stakeDate = builder.stakeDate;
        this.unbondingEntries = builder.unbondingEntries;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getValidatorAddress() {
        return validatorAddress;
    }

    public void setValidatorAddress(String validatorAddress) {
        this.validatorAddress = validatorAddress;
    }

    public String getDelegatedAmount() {
        return delegatedAmount;
    }

    public void setDelegatedAmount(String delegatedAmount) {
        this.delegatedAmount = delegatedAmount;
    }

    public StakingStatus getStatus() {
        return status;
    }

    public void setStatus(StakingStatus status) {
        this.status = status;
    }

    public String getRewardsEarned() {
        return rewardsEarned;
    }

    public void setRewardsEarned(String rewardsEarned) {
        this.rewardsEarned = rewardsEarned;
    }

    public String getAnnualPercentageYield() {
        return annualPercentageYield;
    }

    public void setAnnualPercentageYield(String annualPercentageYield) {
        this.annualPercentageYield = annualPercentageYield;
    }

    public Instant getStakeDate() {
        return stakeDate;
    }

    public void setStakeDate(Instant stakeDate) {
        this.stakeDate = stakeDate;
    }

    public List<UnbondingEntry> getUnbondingEntries() {
        return unbondingEntries;
    }

    public void setUnbondingEntries(List<UnbondingEntry> unbondingEntries) {
        this.unbondingEntries = unbondingEntries;
    }

    public static class Builder {
        private String positionId;
        private String symbol;
        private String validatorAddress;
        private String delegatedAmount;
        private StakingStatus status;
        private String rewardsEarned;
        private String annualPercentageYield;
        private Instant stakeDate;
        private List<UnbondingEntry> unbondingEntries;

        public Builder() {
        }

        public Builder positionId(String positionId) {
            this.positionId = positionId;
            return this;
        }

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder validatorAddress(String validatorAddress) {
            this.validatorAddress = validatorAddress;
            return this;
        }

        public Builder delegatedAmount(String delegatedAmount) {
            this.delegatedAmount = delegatedAmount;
            return this;
        }

        public Builder status(StakingStatus status) {
            this.status = status;
            return this;
        }

        public Builder rewardsEarned(String rewardsEarned) {
            this.rewardsEarned = rewardsEarned;
            return this;
        }

        public Builder annualPercentageYield(String annualPercentageYield) {
            this.annualPercentageYield = annualPercentageYield;
            return this;
        }

        public Builder stakeDate(Instant stakeDate) {
            this.stakeDate = stakeDate;
            return this;
        }

        public Builder unbondingEntries(List<UnbondingEntry> unbondingEntries) {
            this.unbondingEntries = unbondingEntries;
            return this;
        }

        public StakingPosition build() {
            return new StakingPosition(this);
        }
    }
}