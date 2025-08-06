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

public class StakingYield {
    @JsonProperty("symbol")
    private String symbol;
    
    @JsonProperty("annual_percentage_yield")
    private String annualPercentageYield;
    
    @JsonProperty("annual_percentage_rate")
    private String annualPercentageRate;
    
    @JsonProperty("daily_yield")
    private String dailyYield;
    
    @JsonProperty("weekly_yield")
    private String weeklyYield;
    
    @JsonProperty("monthly_yield")
    private String monthlyYield;
    
    @JsonProperty("calculated_at")
    private Instant calculatedAt;
    
    @JsonProperty("validator_address")
    private String validatorAddress;

    public StakingYield() {
    }

    public StakingYield(Builder builder) {
        this.symbol = builder.symbol;
        this.annualPercentageYield = builder.annualPercentageYield;
        this.annualPercentageRate = builder.annualPercentageRate;
        this.dailyYield = builder.dailyYield;
        this.weeklyYield = builder.weeklyYield;
        this.monthlyYield = builder.monthlyYield;
        this.calculatedAt = builder.calculatedAt;
        this.validatorAddress = builder.validatorAddress;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getAnnualPercentageYield() {
        return annualPercentageYield;
    }

    public void setAnnualPercentageYield(String annualPercentageYield) {
        this.annualPercentageYield = annualPercentageYield;
    }

    public String getAnnualPercentageRate() {
        return annualPercentageRate;
    }

    public void setAnnualPercentageRate(String annualPercentageRate) {
        this.annualPercentageRate = annualPercentageRate;
    }

    public String getDailyYield() {
        return dailyYield;
    }

    public void setDailyYield(String dailyYield) {
        this.dailyYield = dailyYield;
    }

    public String getWeeklyYield() {
        return weeklyYield;
    }

    public void setWeeklyYield(String weeklyYield) {
        this.weeklyYield = weeklyYield;
    }

    public String getMonthlyYield() {
        return monthlyYield;
    }

    public void setMonthlyYield(String monthlyYield) {
        this.monthlyYield = monthlyYield;
    }

    public Instant getCalculatedAt() {
        return calculatedAt;
    }

    public void setCalculatedAt(Instant calculatedAt) {
        this.calculatedAt = calculatedAt;
    }

    public String getValidatorAddress() {
        return validatorAddress;
    }

    public void setValidatorAddress(String validatorAddress) {
        this.validatorAddress = validatorAddress;
    }

    public static class Builder {
        private String symbol;
        private String annualPercentageYield;
        private String annualPercentageRate;
        private String dailyYield;
        private String weeklyYield;
        private String monthlyYield;
        private Instant calculatedAt;
        private String validatorAddress;

        public Builder() {
        }

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder annualPercentageYield(String annualPercentageYield) {
            this.annualPercentageYield = annualPercentageYield;
            return this;
        }

        public Builder annualPercentageRate(String annualPercentageRate) {
            this.annualPercentageRate = annualPercentageRate;
            return this;
        }

        public Builder dailyYield(String dailyYield) {
            this.dailyYield = dailyYield;
            return this;
        }

        public Builder weeklyYield(String weeklyYield) {
            this.weeklyYield = weeklyYield;
            return this;
        }

        public Builder monthlyYield(String monthlyYield) {
            this.monthlyYield = monthlyYield;
            return this;
        }

        public Builder calculatedAt(Instant calculatedAt) {
            this.calculatedAt = calculatedAt;
            return this;
        }

        public Builder validatorAddress(String validatorAddress) {
            this.validatorAddress = validatorAddress;
            return this;
        }

        public StakingYield build() {
            return new StakingYield(this);
        }
    }
}