/*
 * Copyright 2026-present Coinbase Global, Inc.
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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CrossMarginRiskParameters {
    @JsonProperty("asset_tier")
    private String assetTier;

    @JsonProperty("base_ratio_long")
    private String baseRatioLong;

    @JsonProperty("base_ratio_short")
    private String baseRatioShort;

    @JsonProperty("volatility_rate_long")
    private String volatilityRateLong;

    @JsonProperty("volatility_rate_short")
    private String volatilityRateShort;

    @JsonProperty("volatility_low_threshold")
    private String volatilityLowThreshold;

    @JsonProperty("volatility_high_threshold")
    private String volatilityHighThreshold;

    @JsonProperty("liquidity_a_long")
    private String liquidityALong;

    @JsonProperty("liquidity_a_short")
    private String liquidityAShort;

    @JsonProperty("liquidity_b_short")
    private String liquidityBShort;

    @JsonProperty("liquidity_threshold")
    private String liquidityThreshold;

    @JsonProperty("basis_offset_credit_rate")
    private String basisOffsetCreditRate;

    public String getAssetTier() { return assetTier; }
    public void setAssetTier(String assetTier) { this.assetTier = assetTier; }

    public String getBaseRatioLong() { return baseRatioLong; }
    public void setBaseRatioLong(String baseRatioLong) { this.baseRatioLong = baseRatioLong; }

    public String getBaseRatioShort() { return baseRatioShort; }
    public void setBaseRatioShort(String baseRatioShort) { this.baseRatioShort = baseRatioShort; }

    public String getVolatilityRateLong() { return volatilityRateLong; }
    public void setVolatilityRateLong(String volatilityRateLong) { this.volatilityRateLong = volatilityRateLong; }

    public String getVolatilityRateShort() { return volatilityRateShort; }
    public void setVolatilityRateShort(String volatilityRateShort) { this.volatilityRateShort = volatilityRateShort; }

    public String getVolatilityLowThreshold() { return volatilityLowThreshold; }
    public void setVolatilityLowThreshold(String volatilityLowThreshold) { this.volatilityLowThreshold = volatilityLowThreshold; }

    public String getVolatilityHighThreshold() { return volatilityHighThreshold; }
    public void setVolatilityHighThreshold(String volatilityHighThreshold) { this.volatilityHighThreshold = volatilityHighThreshold; }

    public String getLiquidityALong() { return liquidityALong; }
    public void setLiquidityALong(String liquidityALong) { this.liquidityALong = liquidityALong; }

    public String getLiquidityAShort() { return liquidityAShort; }
    public void setLiquidityAShort(String liquidityAShort) { this.liquidityAShort = liquidityAShort; }

    public String getLiquidityBShort() { return liquidityBShort; }
    public void setLiquidityBShort(String liquidityBShort) { this.liquidityBShort = liquidityBShort; }

    public String getLiquidityThreshold() { return liquidityThreshold; }
    public void setLiquidityThreshold(String liquidityThreshold) { this.liquidityThreshold = liquidityThreshold; }

    public String getBasisOffsetCreditRate() { return basisOffsetCreditRate; }
    public void setBasisOffsetCreditRate(String basisOffsetCreditRate) { this.basisOffsetCreditRate = basisOffsetCreditRate; }
}
