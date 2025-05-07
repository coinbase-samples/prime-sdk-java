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

public class MarginSummary {
    @JsonProperty("entity_id")
    private String entityId;

    @JsonProperty("margin_equity")
    private String marginEquity;

    @JsonProperty("margin_requirement")
    private String marginRequirement;

    @JsonProperty("excess_deficit")
    private String excessDeficit;

    @JsonProperty("pm_credit_consumed")
    private String pmCreditConsumed;

    @JsonProperty("tf_credit_limit")
    private String tfCreditLimit;

    @JsonProperty("tf_credit_consumed")
    private String tfCreditConsumed;

    @JsonProperty("tf_adjusted_asset_value")
    private String tfAdjustedAssetValue;

    @JsonProperty("tf_adjusted_liability_value")
    private String tfAdjustedLiabilityValue;

    @JsonProperty("tf_adjusted_credit_consumed")
    private String tfAdjustedCreditConsumed;

    @JsonProperty("tf_adjusted_equity")
    private String tfAdjustedEquity;

    private boolean frozen;

    @JsonProperty("frozen_reason")
    private String frozenReason;

    @JsonProperty("tf_enabled")
    private boolean tfEnabled;

    @JsonProperty("pm_enabled")
    private boolean pmEnabled;

    @JsonProperty("market_rates")
    private MarketRate[] marketRates;

    @JsonProperty("asset_balances")
    private AssetBalance[] assetBalances;

    @JsonProperty("tf_loans")
    private LoanInfo[] tfLoans;

    @JsonProperty("pm_loans")
    private LoanInfo[] pmLoans;

    @JsonProperty("short_collateral")
    private LoanInfo[] shortCollateral;

    @JsonProperty("gross_market_value")
    private String grossMarketValue;

    @JsonProperty("net_market_value")
    private String netMarketValue;

    @JsonProperty("long_market_value")
    private String longMarketValue;

    @JsonProperty("non_marginable_long_market_value")
    private String nonMarginableLongMarketValue;

    @JsonProperty("short_market_value")
    private String shortMarketValue;

    @JsonProperty("gross_leverage")
    private String grossLeverage;

    @JsonProperty("net_exposure")
    private String netExposure;

    @JsonProperty("portfolio_stress_triggered")
    private MarginAddOn portfolioStressTriggered;

    @JsonProperty("pm_asset_info")
    private PMAssetInfo pmAssetInfo;

    @JsonProperty("pm_credit_limit")
    private String pmCreditLimit;

    @JsonProperty("pm_margin_limit")
    private String pmMarginLimit;

    @JsonProperty("pm_margin_consumed")
    private String pmMarginConsumed;

    public MarginSummary() {}

    public MarginSummary(Builder builder) {
        this.entityId = builder.entityId;
        this.marginEquity = builder.marginEquity;
        this.marginRequirement = builder.marginRequirement;
        this.excessDeficit = builder.excessDeficit;
        this.pmCreditConsumed = builder.pmCreditConsumed;
        this.tfCreditLimit = builder.tfCreditLimit;
        this.tfCreditConsumed = builder.tfCreditConsumed;
        this.tfAdjustedAssetValue = builder.tfAdjustedAssetValue;
        this.tfAdjustedLiabilityValue = builder.tfAdjustedLiabilityValue;
        this.tfAdjustedCreditConsumed = builder.tfAdjustedCreditConsumed;
        this.tfAdjustedEquity = builder.tfAdjustedEquity;
        this.frozen = builder.frozen;
        this.frozenReason = builder.frozenReason;
        this.tfEnabled = builder.tfEnabled;
        this.pmEnabled = builder.pmEnabled;
        this.marketRates = builder.marketRates;
        this.assetBalances = builder.assetBalances;
        this.tfLoans = builder.tfLoans;
        this.pmLoans = builder.pmLoans;
        this.shortCollateral = builder.shortCollateral;
        this.grossMarketValue = builder.grossMarketValue;
        this.netMarketValue = builder.netMarketValue;
        this.longMarketValue = builder.longMarketValue;
        this.nonMarginableLongMarketValue = builder.nonMarginableLongMarketValue;
        this.shortMarketValue = builder.shortMarketValue;
        this.grossLeverage = builder.grossLeverage;
        this.netExposure = builder.netExposure;
        this.portfolioStressTriggered = builder.portfolioStressTriggered;
        this.pmAssetInfo = builder.pmAssetInfo;
        this.pmCreditLimit = builder.pmCreditLimit;
        this.pmMarginLimit = builder.pmMarginLimit;
        this.pmMarginConsumed = builder.pmMarginConsumed;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getMarginEquity() {
        return marginEquity;
    }

    public void setMarginEquity(String marginEquity) {
        this.marginEquity = marginEquity;
    }

    public String getMarginRequirement() {
        return marginRequirement;
    }

    public void setMarginRequirement(String marginRequirement) {
        this.marginRequirement = marginRequirement;
    }

    public String getExcessDeficit() {
        return excessDeficit;
    }

    public void setExcessDeficit(String excessDeficit) {
        this.excessDeficit = excessDeficit;
    }

    public String getPmCreditConsumed() {
        return pmCreditConsumed;
    }

    public void setPmCreditConsumed(String pmCreditConsumed) {
        this.pmCreditConsumed = pmCreditConsumed;
    }

    public String getTfCreditLimit() {
        return tfCreditLimit;
    }

    public void setTfCreditLimit(String tfCreditLimit) {
        this.tfCreditLimit = tfCreditLimit;
    }

    public String getTfCreditConsumed() {
        return tfCreditConsumed;
    }

    public void setTfCreditConsumed(String tfCreditConsumed) {
        this.tfCreditConsumed = tfCreditConsumed;
    }

    public String getTfAdjustedAssetValue() {
        return tfAdjustedAssetValue;
    }

    public void setTfAdjustedAssetValue(String tfAdjustedAssetValue) {
        this.tfAdjustedAssetValue = tfAdjustedAssetValue;
    }

    public String getTfAdjustedLiabilityValue() {
        return tfAdjustedLiabilityValue;
    }

    public void setTfAdjustedLiabilityValue(String tfAdjustedLiabilityValue) {
        this.tfAdjustedLiabilityValue = tfAdjustedLiabilityValue;
    }

    public String getTfAdjustedCreditConsumed() {
        return tfAdjustedCreditConsumed;
    }

    public void setTfAdjustedCreditConsumed(String tfAdjustedCreditConsumed) {
        this.tfAdjustedCreditConsumed = tfAdjustedCreditConsumed;
    }

    public String getTfAdjustedEquity() {
        return tfAdjustedEquity;
    }

    public void setTfAdjustedEquity(String tfAdjustedEquity) {
        this.tfAdjustedEquity = tfAdjustedEquity;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }

    public String getFrozenReason() {
        return frozenReason;
    }

    public void setFrozenReason(String frozenReason) {
        this.frozenReason = frozenReason;
    }

    public boolean isTfEnabled() {
        return tfEnabled;
    }

    public void setTfEnabled(boolean tfEnabled) {
        this.tfEnabled = tfEnabled;
    }

    public boolean isPmEnabled() {
        return pmEnabled;
    }

    public void setPmEnabled(boolean pmEnabled) {
        this.pmEnabled = pmEnabled;
    }

    public MarketRate[] getMarketRates() {
        return marketRates;
    }

    public void setMarketRates(MarketRate[] marketRates) {
        this.marketRates = marketRates;
    }

    public AssetBalance[] getAssetBalances() {
        return assetBalances;
    }

    public void setAssetBalances(AssetBalance[] assetBalances) {
        this.assetBalances = assetBalances;
    }

    public LoanInfo[] getTfLoans() {
        return tfLoans;
    }

    public void setTfLoans(LoanInfo[] tfLoans) {
        this.tfLoans = tfLoans;
    }

    public LoanInfo[] getPmLoans() {
        return pmLoans;
    }

    public void setPmLoans(LoanInfo[] pmLoans) {
        this.pmLoans = pmLoans;
    }

    public LoanInfo[] getShortCollateral() {
        return shortCollateral;
    }

    public void setShortCollateral(LoanInfo[] shortCollateral) {
        this.shortCollateral = shortCollateral;
    }

    public String getGrossMarketValue() {
        return grossMarketValue;
    }

    public void setGrossMarketValue(String grossMarketValue) {
        this.grossMarketValue = grossMarketValue;
    }

    public String getNetMarketValue() {
        return netMarketValue;
    }

    public void setNetMarketValue(String netMarketValue) {
        this.netMarketValue = netMarketValue;
    }

    public String getLongMarketValue() {
        return longMarketValue;
    }

    public void setLongMarketValue(String longMarketValue) {
        this.longMarketValue = longMarketValue;
    }

    public String getNonMarginableLongMarketValue() {
        return nonMarginableLongMarketValue;
    }

    public void setNonMarginableLongMarketValue(String nonMarginableLongMarketValue) {
        this.nonMarginableLongMarketValue = nonMarginableLongMarketValue;
    }

    public String getShortMarketValue() {
        return shortMarketValue;
    }

    public void setShortMarketValue(String shortMarketValue) {
        this.shortMarketValue = shortMarketValue;
    }

    public String getGrossLeverage() {
        return grossLeverage;
    }

    public void setGrossLeverage(String grossLeverage) {
        this.grossLeverage = grossLeverage;
    }

    public String getNetExposure() {
        return netExposure;
    }

    public void setNetExposure(String netExposure) {
        this.netExposure = netExposure;
    }

    public MarginAddOn getPortfolioStressTriggered() {
        return portfolioStressTriggered;
    }

    public void setPortfolioStressTriggered(MarginAddOn portfolioStressTriggered) {
        this.portfolioStressTriggered = portfolioStressTriggered;
    }

    public PMAssetInfo getPmAssetInfo() {
        return pmAssetInfo;
    }

    public void setPmAssetInfo(PMAssetInfo pmAssetInfo) {
        this.pmAssetInfo = pmAssetInfo;
    }

    public String getPmCreditLimit() {
        return pmCreditLimit;
    }

    public void setPmCreditLimit(String pmCreditLimit) {
        this.pmCreditLimit = pmCreditLimit;
    }

    public String getPmMarginLimit() {
        return pmMarginLimit;
    }

    public void setPmMarginLimit(String pmMarginLimit) {
        this.pmMarginLimit = pmMarginLimit;
    }

    public String getPmMarginConsumed() {
        return pmMarginConsumed;
    }

    public void setPmMarginConsumed(String pmMarginConsumed) {
        this.pmMarginConsumed = pmMarginConsumed;
    }

    public static class Builder {
        private String entityId;
        private String marginEquity;
        private String marginRequirement;
        private String excessDeficit;
        private String pmCreditConsumed;
        private String tfCreditLimit;
        private String tfCreditConsumed;
        private String tfAdjustedAssetValue;
        private String tfAdjustedLiabilityValue;
        private String tfAdjustedCreditConsumed;
        private String tfAdjustedEquity;
        private boolean frozen;
        private String frozenReason;
        private boolean tfEnabled;
        private boolean pmEnabled;
        private MarketRate[] marketRates;
        private AssetBalance[] assetBalances;
        private LoanInfo[] tfLoans;
        private LoanInfo[] pmLoans;
        private LoanInfo[] shortCollateral;
        private String grossMarketValue;
        private String netMarketValue;
        private String longMarketValue;
        private String nonMarginableLongMarketValue;
        private String shortMarketValue;
        private String grossLeverage;
        private String netExposure;
        private MarginAddOn portfolioStressTriggered;
        private PMAssetInfo pmAssetInfo;
        private String pmCreditLimit;
        private String pmMarginLimit;
        private String pmMarginConsumed;

        public Builder() {
        }

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder marginEquity(String marginEquity) {
            this.marginEquity = marginEquity;
            return this;
        }

        public Builder marginRequirement(String marginRequirement) {
            this.marginRequirement = marginRequirement;
            return this;
        }

        public Builder excessDeficit(String excessDeficit) {
            this.excessDeficit = excessDeficit;
            return this;
        }

        public Builder pmCreditConsumed(String pmCreditConsumed) {
            this.pmCreditConsumed = pmCreditConsumed;
            return this;
        }

        public Builder tfCreditLimit(String tfCreditLimit) {
            this.tfCreditLimit = tfCreditLimit;
            return this;
        }

        public Builder tfCreditConsumed(String tfCreditConsumed) {
            this.tfCreditConsumed = tfCreditConsumed;
            return this;
        }

        public Builder tfAdjustedAssetValue(String tfAdjustedAssetValue) {
            this.tfAdjustedAssetValue = tfAdjustedAssetValue;
            return this;
        }

        public Builder tfAdjustedLiabilityValue(String tfAdjustedLiabilityValue) {
            this.tfAdjustedLiabilityValue = tfAdjustedLiabilityValue;
            return this;
        }

        public Builder tfAdjustedCreditConsumed(String tfAdjustedCreditConsumed) {
            this.tfAdjustedCreditConsumed = tfAdjustedCreditConsumed;
            return this;
        }

        public Builder tfAdjustedEquity(String tfAdjustedEquity) {
            this.tfAdjustedEquity = tfAdjustedEquity;
            return this;
        }

        public Builder frozen(boolean frozen) {
            this.frozen = frozen;
            return this;
        }

        public Builder frozenReason(String frozenReason) {
            this.frozenReason = frozenReason;
            return this;
        }

        public Builder tfEnabled(boolean tfEnabled) {
            this.tfEnabled = tfEnabled;
            return this;
        }

        public Builder pmEnabled(boolean pmEnabled) {
            this.pmEnabled = pmEnabled;
            return this;
        }

        public Builder marketRates(MarketRate[] marketRates) {
            this.marketRates = marketRates;
            return this;
        }

        public Builder assetBalances(AssetBalance[] assetBalances) {
            this.assetBalances = assetBalances;
            return this;
        }

        public Builder tfLoans(LoanInfo[] tfLoans) {
            this.tfLoans = tfLoans;
            return this;
        }

        public Builder pmLoans(LoanInfo[] pmLoans) {
            this.pmLoans = pmLoans;
            return this;
        }

        public Builder shortCollateral(LoanInfo[] shortCollateral) {
            this.shortCollateral = shortCollateral;
            return this;
        }

        public Builder grossMarketValue(String grossMarketValue) {
            this.grossMarketValue = grossMarketValue;
            return this;
        }

        public Builder netMarketValue(String netMarketValue) {
            this.netMarketValue = netMarketValue;
            return this;
        }

        public Builder longMarketValue(String longMarketValue) {
            this.longMarketValue = longMarketValue;
            return this;
        }

        public Builder nonMarginableLongMarketValue(String nonMarginableLongMarketValue) {
            this.nonMarginableLongMarketValue = nonMarginableLongMarketValue;
            return this;
        }

        public Builder shortMarketValue(String shortMarketValue) {
            this.shortMarketValue = shortMarketValue;
            return this;
        }

        public Builder grossLeverage(String grossLeverage) {
            this.grossLeverage = grossLeverage;
            return this;
        }

        public Builder netExposure(String netExposure) {
            this.netExposure = netExposure;
            return this;
        }

        public Builder portfolioStressTriggered(MarginAddOn portfolioStressTriggered) {
            this.portfolioStressTriggered = portfolioStressTriggered;
            return this;
        }

        public Builder pmAssetInfo(PMAssetInfo pmAssetInfo) {
            this.pmAssetInfo = pmAssetInfo;
            return this;
        }

        public Builder pmCreditLimit(String pmCreditLimit) {
            this.pmCreditLimit = pmCreditLimit;
            return this;
        }

        public Builder pmMarginLimit(String pmMarginLimit) {
            this.pmMarginLimit = pmMarginLimit;
            return this;
        }

        public Builder pmMarginConsumed(String pmMarginConsumed) {
            this.pmMarginConsumed = pmMarginConsumed;
            return this;
        }

        public MarginSummary build() {
            return new MarginSummary(this);
        }
    }
}
