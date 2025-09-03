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

/**
 * Model representing volume-based commission discounts.
 */
public class VolumeDiscount {
    @JsonProperty("tier_name")
    private String tierName;
    
    @JsonProperty("min_volume")
    private String minVolume;
    
    @JsonProperty("max_volume")
    private String maxVolume;
    
    @JsonProperty("discount_rate")
    private String discountRate;
    
    @JsonProperty("period_days")
    private Integer periodDays;
    
    @JsonProperty("currency")
    private String currency;

    public VolumeDiscount() {
    }

    public VolumeDiscount(Builder builder) {
        this.tierName = builder.tierName;
        this.minVolume = builder.minVolume;
        this.maxVolume = builder.maxVolume;
        this.discountRate = builder.discountRate;
        this.periodDays = builder.periodDays;
        this.currency = builder.currency;
    }

    public String getTierName() {
        return tierName;
    }

    public void setTierName(String tierName) {
        this.tierName = tierName;
    }

    public String getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(String minVolume) {
        this.minVolume = minVolume;
    }

    public String getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(String maxVolume) {
        this.maxVolume = maxVolume;
    }

    public String getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(String discountRate) {
        this.discountRate = discountRate;
    }

    public Integer getPeriodDays() {
        return periodDays;
    }

    public void setPeriodDays(Integer periodDays) {
        this.periodDays = periodDays;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public static class Builder {
        private String tierName;
        private String minVolume;
        private String maxVolume;
        private String discountRate;
        private Integer periodDays;
        private String currency;

        public Builder() {
        }

        public Builder tierName(String tierName) {
            this.tierName = tierName;
            return this;
        }

        public Builder minVolume(String minVolume) {
            this.minVolume = minVolume;
            return this;
        }

        public Builder maxVolume(String maxVolume) {
            this.maxVolume = maxVolume;
            return this;
        }

        public Builder discountRate(String discountRate) {
            this.discountRate = discountRate;
            return this;
        }

        public Builder periodDays(Integer periodDays) {
            this.periodDays = periodDays;
            return this;
        }

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public VolumeDiscount build() {
            return new VolumeDiscount(this);
        }
    }
}