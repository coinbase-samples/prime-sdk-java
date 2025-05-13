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

public class PMAssetInfo {
    private String symbol;

    private String amount;

    private String price;

    @JsonProperty("notional_amount")
    private String notionalAmount;

    @JsonProperty("asset_tier")
    private String assetTier;

    @JsonProperty("margin_eligible")
    private boolean marginEligible;

    @JsonProperty("base_margin_requirement")
    private String baseMarginRequirement;

    @JsonProperty("base_margin_requirement_notional")
    private String baseMarginRequirementNotional;

    @JsonProperty("adv_30d")
    private String adv30d;

    @JsonProperty("hist_5d_vol")
    private String hist5dVol;

    @JsonProperty("hist_30d_vol")
    private String hist30dVol;

    @JsonProperty("hist_90d_vol")
    private String hist90dVol;

    @JsonProperty("volatility_addon")
    private String volatilityAddon;

    @JsonProperty("liquidity_addon")
    private String liquidityAddon;

    @JsonProperty("total_position_margin")
    private String totalPositionMargin;

    @JsonProperty("short_nominal")
    private String shortNominal;

    @JsonProperty("long_nominal")
    private String longNominal;

    public PMAssetInfo() {
    }

    public PMAssetInfo(Builder builder) {
        this.symbol = builder.symbol;
        this.amount = builder.amount;
        this.price = builder.price;
        this.notionalAmount = builder.notionalAmount;
        this.assetTier = builder.assetTier;
        this.marginEligible = builder.marginEligible;
        this.baseMarginRequirement = builder.baseMarginRequirement;
        this.baseMarginRequirementNotional = builder.baseMarginRequirementNotional;
        this.adv30d = builder.adv30d;
        this.hist5dVol = builder.hist5dVol;
        this.hist30dVol = builder.hist30dVol;
        this.hist90dVol = builder.hist90dVol;
        this.volatilityAddon = builder.volatilityAddon;
        this.liquidityAddon = builder.liquidityAddon;
        this.totalPositionMargin = builder.totalPositionMargin;
        this.shortNominal = builder.shortNominal;
        this.longNominal = builder.longNominal;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNotionalAmount() {
        return notionalAmount;
    }

    public void setNotionalAmount(String notionalAmount) {
        this.notionalAmount = notionalAmount;
    }

    public String getAssetTier() {
        return assetTier;
    }

    public void setAssetTier(String assetTier) {
        this.assetTier = assetTier;
    }

    public boolean isMarginEligible() {
        return marginEligible;
    }

    public void setMarginEligible(boolean marginEligible) {
        this.marginEligible = marginEligible;
    }

    public String getBaseMarginRequirement() {
        return baseMarginRequirement;
    }

    public void setBaseMarginRequirement(String baseMarginRequirement) {
        this.baseMarginRequirement = baseMarginRequirement;
    }

    public String getBaseMarginRequirementNotional() {
        return baseMarginRequirementNotional;
    }

    public void setBaseMarginRequirementNotional(String baseMarginRequirementNotional) {
        this.baseMarginRequirementNotional = baseMarginRequirementNotional;
    }

    public String getAdv30d() {
        return adv30d;
    }

    public void setAdv30d(String adv30d) {
        this.adv30d = adv30d;
    }

    public String getHist5dVol() {
        return hist5dVol;
    }

    public void setHist5dVol(String hist5dVol) {
        this.hist5dVol = hist5dVol;
    }

    public String getHist30dVol() {
        return hist30dVol;
    }

    public void setHist30dVol(String hist30dVol) {
        this.hist30dVol = hist30dVol;
    }

    public String getHist90dVol() {
        return hist90dVol;
    }

    public void setHist90dVol(String hist90dVol) {
        this.hist90dVol = hist90dVol;
    }

    public String getVolatilityAddon() {
        return volatilityAddon;
    }

    public void setVolatilityAddon(String volatilityAddon) {
        this.volatilityAddon = volatilityAddon;
    }

    public String getLiquidityAddon() {
        return liquidityAddon;
    }

    public void setLiquidityAddon(String liquidityAddon) {
        this.liquidityAddon = liquidityAddon;
    }

    public String getTotalPositionMargin() {
        return totalPositionMargin;
    }

    public void setTotalPositionMargin(String totalPositionMargin) {
        this.totalPositionMargin = totalPositionMargin;
    }

    public String getShortNominal() {
        return shortNominal;
    }

    public void setShortNominal(String shortNominal) {
        this.shortNominal = shortNominal;
    }

    public String getLongNominal() {
        return longNominal;
    }

    public void setLongNominal(String longNominal) {
        this.longNominal = longNominal;
    }

    public static class Builder {
        private String symbol;
        private String amount;
        private String price;
        private String notionalAmount;
        private String assetTier;
        private boolean marginEligible;
        private String baseMarginRequirement;
        private String baseMarginRequirementNotional;
        private String adv30d;
        private String hist5dVol;
        private String hist30dVol;
        private String hist90dVol;
        private String volatilityAddon;
        private String liquidityAddon;
        private String totalPositionMargin;
        private String shortNominal;
        private String longNominal;

        public Builder() {
        }

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder price(String price) {
            this.price = price;
            return this;
        }

        public Builder notionalAmount(String notionalAmount) {
            this.notionalAmount = notionalAmount;
            return this;
        }

        public Builder assetTier(String assetTier) {
            this.assetTier = assetTier;
            return this;
        }

        public Builder marginEligible(boolean marginEligible) {
            this.marginEligible = marginEligible;
            return this;
        }

        public Builder baseMarginRequirement(String baseMarginRequirement) {
            this.baseMarginRequirement = baseMarginRequirement;
            return this;
        }

        public Builder baseMarginRequirementNotional(String baseMarginRequirementNotional) {
            this.baseMarginRequirementNotional = baseMarginRequirementNotional;
            return this;
        }

        public Builder adv30d(String adv30d) {
            this.adv30d = adv30d;
            return this;
        }

        public Builder hist5dVol(String hist5dVol) {
            this.hist5dVol = hist5dVol;
            return this;
        }

        public Builder hist30dVol(String hist30dVol) {
            this.hist30dVol = hist30dVol;
            return this;
        }

        public Builder hist90dVol(String hist90dVol) {
            this.hist90dVol = hist90dVol;
            return this;
        }

        public Builder volatilityAddon(String volatilityAddon) {
            this.volatilityAddon = volatilityAddon;
            return this;
        }

        public Builder liquidityAddon(String liquidityAddon) {
            this.liquidityAddon = liquidityAddon;
            return this;
        }

        public Builder totalPositionMargin(String totalPositionMargin) {
            this.totalPositionMargin = totalPositionMargin;
            return this;
        }

        public Builder shortNominal(String shortNominal) {
            this.shortNominal = shortNominal;
            return this;
        }

        public Builder longNominal(String longNominal) {
            this.longNominal = longNominal;
            return this;
        }

        public PMAssetInfo build() {
            return new PMAssetInfo(this);
        }
    }
}
