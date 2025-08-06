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
import java.time.Instant;

public class StakingReward {
    @JsonProperty("reward_id")
    private String rewardId;
    
    @JsonProperty("amount")
    private String amount;
    
    @JsonProperty("symbol")
    private String symbol;
    
    @JsonProperty("earned_at")
    private Instant earnedAt;
    
    @JsonProperty("validator_address")
    private String validatorAddress;
    
    @JsonProperty("epoch")
    private String epoch;

    public StakingReward() {
    }

    public StakingReward(Builder builder) {
        this.rewardId = builder.rewardId;
        this.amount = builder.amount;
        this.symbol = builder.symbol;
        this.earnedAt = builder.earnedAt;
        this.validatorAddress = builder.validatorAddress;
        this.epoch = builder.epoch;
    }

    public String getRewardId() {
        return rewardId;
    }

    public void setRewardId(String rewardId) {
        this.rewardId = rewardId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Instant getEarnedAt() {
        return earnedAt;
    }

    public void setEarnedAt(Instant earnedAt) {
        this.earnedAt = earnedAt;
    }

    public String getValidatorAddress() {
        return validatorAddress;
    }

    public void setValidatorAddress(String validatorAddress) {
        this.validatorAddress = validatorAddress;
    }

    public String getEpoch() {
        return epoch;
    }

    public void setEpoch(String epoch) {
        this.epoch = epoch;
    }

    public static class Builder {
        private String rewardId;
        private String amount;
        private String symbol;
        private Instant earnedAt;
        private String validatorAddress;
        private String epoch;

        public Builder() {
        }

        public Builder rewardId(String rewardId) {
            this.rewardId = rewardId;
            return this;
        }

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder earnedAt(Instant earnedAt) {
            this.earnedAt = earnedAt;
            return this;
        }

        public Builder validatorAddress(String validatorAddress) {
            this.validatorAddress = validatorAddress;
            return this;
        }

        public Builder epoch(String epoch) {
            this.epoch = epoch;
            return this;
        }

        public StakingReward build() {
            return new StakingReward(this);
        }
    }
}