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

public class ValidatorInfo {
    @JsonProperty("validator_address")
    private String validatorAddress;
    
    @JsonProperty("validator_name")
    private String validatorName;
    
    @JsonProperty("commission_rate")
    private String commissionRate;
    
    @JsonProperty("annual_percentage_yield")
    private String annualPercentageYield;
    
    @JsonProperty("vote_account")
    private String voteAccount;
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    @JsonProperty("total_stake")
    private String totalStake;

    public ValidatorInfo() {
    }

    public ValidatorInfo(Builder builder) {
        this.validatorAddress = builder.validatorAddress;
        this.validatorName = builder.validatorName;
        this.commissionRate = builder.commissionRate;
        this.annualPercentageYield = builder.annualPercentageYield;
        this.voteAccount = builder.voteAccount;
        this.isActive = builder.isActive;
        this.totalStake = builder.totalStake;
    }

    public String getValidatorAddress() {
        return validatorAddress;
    }

    public void setValidatorAddress(String validatorAddress) {
        this.validatorAddress = validatorAddress;
    }

    public String getValidatorName() {
        return validatorName;
    }

    public void setValidatorName(String validatorName) {
        this.validatorName = validatorName;
    }

    public String getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(String commissionRate) {
        this.commissionRate = commissionRate;
    }

    public String getAnnualPercentageYield() {
        return annualPercentageYield;
    }

    public void setAnnualPercentageYield(String annualPercentageYield) {
        this.annualPercentageYield = annualPercentageYield;
    }

    public String getVoteAccount() {
        return voteAccount;
    }

    public void setVoteAccount(String voteAccount) {
        this.voteAccount = voteAccount;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getTotalStake() {
        return totalStake;
    }

    public void setTotalStake(String totalStake) {
        this.totalStake = totalStake;
    }

    public static class Builder {
        private String validatorAddress;
        private String validatorName;
        private String commissionRate;
        private String annualPercentageYield;
        private String voteAccount;
        private Boolean isActive;
        private String totalStake;

        public Builder() {
        }

        public Builder validatorAddress(String validatorAddress) {
            this.validatorAddress = validatorAddress;
            return this;
        }

        public Builder validatorName(String validatorName) {
            this.validatorName = validatorName;
            return this;
        }

        public Builder commissionRate(String commissionRate) {
            this.commissionRate = commissionRate;
            return this;
        }

        public Builder annualPercentageYield(String annualPercentageYield) {
            this.annualPercentageYield = annualPercentageYield;
            return this;
        }

        public Builder voteAccount(String voteAccount) {
            this.voteAccount = voteAccount;
            return this;
        }

        public Builder isActive(Boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        public Builder totalStake(String totalStake) {
            this.totalStake = totalStake;
            return this;
        }

        public ValidatorInfo build() {
            return new ValidatorInfo(this);
        }
    }
}