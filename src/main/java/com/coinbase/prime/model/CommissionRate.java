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

import com.coinbase.prime.model.enums.FeeModel;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Model representing commission rate information for trading pairs.
 */
public class CommissionRate {
    @JsonProperty("product_id")
    private String productId;
    
    @JsonProperty("fee_model")
    private FeeModel feeModel;
    
    @JsonProperty("maker_rate")
    private String makerRate;
    
    @JsonProperty("taker_rate")
    private String takerRate;
    
    @JsonProperty("base_rate")
    private String baseRate;
    
    @JsonProperty("volume_tier")
    private String volumeTier;
    
    @JsonProperty("effective_date")
    private String effectiveDate;

    public CommissionRate() {
    }

    public CommissionRate(Builder builder) {
        this.productId = builder.productId;
        this.feeModel = builder.feeModel;
        this.makerRate = builder.makerRate;
        this.takerRate = builder.takerRate;
        this.baseRate = builder.baseRate;
        this.volumeTier = builder.volumeTier;
        this.effectiveDate = builder.effectiveDate;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public FeeModel getFeeModel() {
        return feeModel;
    }

    public void setFeeModel(FeeModel feeModel) {
        this.feeModel = feeModel;
    }

    public String getMakerRate() {
        return makerRate;
    }

    public void setMakerRate(String makerRate) {
        this.makerRate = makerRate;
    }

    public String getTakerRate() {
        return takerRate;
    }

    public void setTakerRate(String takerRate) {
        this.takerRate = takerRate;
    }

    public String getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(String baseRate) {
        this.baseRate = baseRate;
    }

    public String getVolumeTier() {
        return volumeTier;
    }

    public void setVolumeTier(String volumeTier) {
        this.volumeTier = volumeTier;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public static class Builder {
        private String productId;
        private FeeModel feeModel;
        private String makerRate;
        private String takerRate;
        private String baseRate;
        private String volumeTier;
        private String effectiveDate;

        public Builder() {
        }

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder feeModel(FeeModel feeModel) {
            this.feeModel = feeModel;
            return this;
        }

        public Builder makerRate(String makerRate) {
            this.makerRate = makerRate;
            return this;
        }

        public Builder takerRate(String takerRate) {
            this.takerRate = takerRate;
            return this;
        }

        public Builder baseRate(String baseRate) {
            this.baseRate = baseRate;
            return this;
        }

        public Builder volumeTier(String volumeTier) {
            this.volumeTier = volumeTier;
            return this;
        }

        public Builder effectiveDate(String effectiveDate) {
            this.effectiveDate = effectiveDate;
            return this;
        }

        public CommissionRate build() {
            return new CommissionRate(this);
        }
    }
}