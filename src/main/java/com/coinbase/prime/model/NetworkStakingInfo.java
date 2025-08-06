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

public class NetworkStakingInfo {
    @JsonProperty("network_id")
    private String networkId;
    
    @JsonProperty("network_name")
    private String networkName;
    
    @JsonProperty("staking_supported")
    private Boolean stakingSupported;
    
    @JsonProperty("minimum_stake_amount")
    private String minimumStakeAmount;
    
    @JsonProperty("unbonding_period")
    private String unbondingPeriod;
    
    @JsonProperty("slashing_enabled")
    private Boolean slashingEnabled;
    
    @JsonProperty("reward_frequency")
    private String rewardFrequency;
    
    @JsonProperty("validator_fee")
    private String validatorFee;

    public NetworkStakingInfo() {
    }

    public NetworkStakingInfo(Builder builder) {
        this.networkId = builder.networkId;
        this.networkName = builder.networkName;
        this.stakingSupported = builder.stakingSupported;
        this.minimumStakeAmount = builder.minimumStakeAmount;
        this.unbondingPeriod = builder.unbondingPeriod;
        this.slashingEnabled = builder.slashingEnabled;
        this.rewardFrequency = builder.rewardFrequency;
        this.validatorFee = builder.validatorFee;
    }

    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public Boolean getStakingSupported() {
        return stakingSupported;
    }

    public void setStakingSupported(Boolean stakingSupported) {
        this.stakingSupported = stakingSupported;
    }

    public String getMinimumStakeAmount() {
        return minimumStakeAmount;
    }

    public void setMinimumStakeAmount(String minimumStakeAmount) {
        this.minimumStakeAmount = minimumStakeAmount;
    }

    public String getUnbondingPeriod() {
        return unbondingPeriod;
    }

    public void setUnbondingPeriod(String unbondingPeriod) {
        this.unbondingPeriod = unbondingPeriod;
    }

    public Boolean getSlashingEnabled() {
        return slashingEnabled;
    }

    public void setSlashingEnabled(Boolean slashingEnabled) {
        this.slashingEnabled = slashingEnabled;
    }

    public String getRewardFrequency() {
        return rewardFrequency;
    }

    public void setRewardFrequency(String rewardFrequency) {
        this.rewardFrequency = rewardFrequency;
    }

    public String getValidatorFee() {
        return validatorFee;
    }

    public void setValidatorFee(String validatorFee) {
        this.validatorFee = validatorFee;
    }

    public static class Builder {
        private String networkId;
        private String networkName;
        private Boolean stakingSupported;
        private String minimumStakeAmount;
        private String unbondingPeriod;
        private Boolean slashingEnabled;
        private String rewardFrequency;
        private String validatorFee;

        public Builder() {
        }

        public Builder networkId(String networkId) {
            this.networkId = networkId;
            return this;
        }

        public Builder networkName(String networkName) {
            this.networkName = networkName;
            return this;
        }

        public Builder stakingSupported(Boolean stakingSupported) {
            this.stakingSupported = stakingSupported;
            return this;
        }

        public Builder minimumStakeAmount(String minimumStakeAmount) {
            this.minimumStakeAmount = minimumStakeAmount;
            return this;
        }

        public Builder unbondingPeriod(String unbondingPeriod) {
            this.unbondingPeriod = unbondingPeriod;
            return this;
        }

        public Builder slashingEnabled(Boolean slashingEnabled) {
            this.slashingEnabled = slashingEnabled;
            return this;
        }

        public Builder rewardFrequency(String rewardFrequency) {
            this.rewardFrequency = rewardFrequency;
            return this;
        }

        public Builder validatorFee(String validatorFee) {
            this.validatorFee = validatorFee;
            return this;
        }

        public NetworkStakingInfo build() {
            return new NetworkStakingInfo(this);
        }
    }
}