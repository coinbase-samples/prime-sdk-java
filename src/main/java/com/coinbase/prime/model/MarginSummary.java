// Copyright 2024-present Coinbase Global, Inc.
//
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.
package com.coinbase.prime.model;

public class MarginSummary {
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

    private Boolean frozen;

    private String frozenReason;

    private Boolean tfEnabled;

    private Boolean pmEnabled;

    private String grossMarketValue;

    private String netMarketValue;

    private String longMarketValue;

    private String nonMarginableLongMarketValue;

    private String shortMarketValue;

    private String grossLeverage;

    private String netExposure;

    private MarginAddOn portfolioStressTriggered;

    private String pmCreditLimit;

    private String pmMarginLimit;

    private String pmMarginConsumed;

    public MarginSummary() {
    }

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
        this.grossMarketValue = builder.grossMarketValue;
        this.netMarketValue = builder.netMarketValue;
        this.longMarketValue = builder.longMarketValue;
        this.nonMarginableLongMarketValue = builder.nonMarginableLongMarketValue;
        this.shortMarketValue = builder.shortMarketValue;
        this.grossLeverage = builder.grossLeverage;
        this.netExposure = builder.netExposure;
        this.portfolioStressTriggered = builder.portfolioStressTriggered;
        this.pmCreditLimit = builder.pmCreditLimit;
        this.pmMarginLimit = builder.pmMarginLimit;
        this.pmMarginConsumed = builder.pmMarginConsumed;
    }

    public String getEntityId() {
        return entityId;
    }

    public String getMarginEquity() {
        return marginEquity;
    }

    public String getMarginRequirement() {
        return marginRequirement;
    }

    public String getExcessDeficit() {
        return excessDeficit;
    }

    public String getPmCreditConsumed() {
        return pmCreditConsumed;
    }

    public String getTfCreditLimit() {
        return tfCreditLimit;
    }

    public String getTfCreditConsumed() {
        return tfCreditConsumed;
    }

    public String getTfAdjustedAssetValue() {
        return tfAdjustedAssetValue;
    }

    public String getTfAdjustedLiabilityValue() {
        return tfAdjustedLiabilityValue;
    }

    public String getTfAdjustedCreditConsumed() {
        return tfAdjustedCreditConsumed;
    }

    public String getTfAdjustedEquity() {
        return tfAdjustedEquity;
    }

    public Boolean isFrozen() {
        return frozen;
    }

    public String getFrozenReason() {
        return frozenReason;
    }

    public Boolean isTfEnabled() {
        return tfEnabled;
    }

    public Boolean isPmEnabled() {
        return pmEnabled;
    }

    public String getGrossMarketValue() {
        return grossMarketValue;
    }

    public String getNetMarketValue() {
        return netMarketValue;
    }

    public String getLongMarketValue() {
        return longMarketValue;
    }

    public String getNonMarginableLongMarketValue() {
        return nonMarginableLongMarketValue;
    }

    public String getShortMarketValue() {
        return shortMarketValue;
    }

    public String getGrossLeverage() {
        return grossLeverage;
    }

    public String getNetExposure() {
        return netExposure;
    }

    public MarginAddOn getPortfolioStressTriggered() {
        return portfolioStressTriggered;
    }

    public String getPmCreditLimit() {
        return pmCreditLimit;
    }

    public String getPmMarginLimit() {
        return pmMarginLimit;
    }

    public String getPmMarginConsumed() {
        return pmMarginConsumed;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public void setMarginEquity(String marginEquity) {
        this.marginEquity = marginEquity;
    }

    public void setMarginRequirement(String marginRequirement) {
        this.marginRequirement = marginRequirement;
    }

    public void setExcessDeficit(String excessDeficit) {
        this.excessDeficit = excessDeficit;
    }

    public void setPmCreditConsumed(String pmCreditConsumed) {
        this.pmCreditConsumed = pmCreditConsumed;
    }

    public void setTfCreditLimit(String tfCreditLimit) {
        this.tfCreditLimit = tfCreditLimit;
    }

    public void setTfCreditConsumed(String tfCreditConsumed) {
        this.tfCreditConsumed = tfCreditConsumed;
    }

    public void setTfAdjustedAssetValue(String tfAdjustedAssetValue) {
        this.tfAdjustedAssetValue = tfAdjustedAssetValue;
    }

    public void setTfAdjustedLiabilityValue(String tfAdjustedLiabilityValue) {
        this.tfAdjustedLiabilityValue = tfAdjustedLiabilityValue;
    }

    public void setTfAdjustedCreditConsumed(String tfAdjustedCreditConsumed) {
        this.tfAdjustedCreditConsumed = tfAdjustedCreditConsumed;
    }

    public void setTfAdjustedEquity(String tfAdjustedEquity) {
        this.tfAdjustedEquity = tfAdjustedEquity;
    }

    public void setFrozen(Boolean frozen) {
        this.frozen = frozen;
    }

    public void setFrozenReason(String frozenReason) {
        this.frozenReason = frozenReason;
    }

    public void setTfEnabled(Boolean tfEnabled) {
        this.tfEnabled = tfEnabled;
    }

    public void setPmEnabled(Boolean pmEnabled) {
        this.pmEnabled = pmEnabled;
    }

    public void setGrossMarketValue(String grossMarketValue) {
        this.grossMarketValue = grossMarketValue;
    }

    public void setNetMarketValue(String netMarketValue) {
        this.netMarketValue = netMarketValue;
    }

    public void setLongMarketValue(String longMarketValue) {
        this.longMarketValue = longMarketValue;
    }

    public void setNonMarginableLongMarketValue(String nonMarginableLongMarketValue) {
        this.nonMarginableLongMarketValue = nonMarginableLongMarketValue;
    }

    public void setShortMarketValue(String shortMarketValue) {
        this.shortMarketValue = shortMarketValue;
    }

    public void setGrossLeverage(String grossLeverage) {
        this.grossLeverage = grossLeverage;
    }

    public void setNetExposure(String netExposure) {
        this.netExposure = netExposure;
    }

    public void setPortfolioStressTriggered(MarginAddOn portfolioStressTriggered) {
        this.portfolioStressTriggered = portfolioStressTriggered;
    }

    public void setPmCreditLimit(String pmCreditLimit) {
        this.pmCreditLimit = pmCreditLimit;
    }

    public void setPmMarginLimit(String pmMarginLimit) {
        this.pmMarginLimit = pmMarginLimit;
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

        private Boolean frozen;

        private String frozenReason;

        private Boolean tfEnabled;

        private Boolean pmEnabled;

        private String grossMarketValue;

        private String netMarketValue;

        private String longMarketValue;

        private String nonMarginableLongMarketValue;

        private String shortMarketValue;

        private String grossLeverage;

        private String netExposure;

        private MarginAddOn portfolioStressTriggered;

        private String pmCreditLimit;

        private String pmMarginLimit;

        private String pmMarginConsumed;

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

        public Builder frozen(Boolean frozen) {
            this.frozen = frozen;
            return this;
        }

        public Builder frozenReason(String frozenReason) {
            this.frozenReason = frozenReason;
            return this;
        }

        public Builder tfEnabled(Boolean tfEnabled) {
            this.tfEnabled = tfEnabled;
            return this;
        }

        public Builder pmEnabled(Boolean pmEnabled) {
            this.pmEnabled = pmEnabled;
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
