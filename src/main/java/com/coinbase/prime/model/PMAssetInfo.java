package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class PMAssetInfo {
    /**
     * The currency symbol
     */
    private String symbol;

    /**
     * Nominal amount of the currency
     */
    private String amount;

    /**
     * Spot price for the currency
     */
    private String price;

    /**
     * Notional amount of the currency
     */
    private String notionalAmount;

    /**
     * Asset tier of the currency
     */
    private String assetTier;

    /**
     * Whether the currency is margin eligible
     */
    private Boolean marginEligible;

    /**
     * Base margin requirement of the currency
     */
    private String baseMarginRequirement;

    /**
     * Notional amount of the currency&#39;s base margin requirement
     */
    private String baseMarginRequirementNotional;

    /**
     * The 30d adv of the currency
     */
    private String adv30d;

    /**
     * Historic 5d volatility of the currency
     */
    private String hist5dVol;

    /**
     * Historic 30d volatility of the currency
     */
    private String hist30dVol;

    /**
     * Historic 90d volatility of the currency
     */
    private String hist90dVol;

    /**
     * Volatility margin addon of the currency position
     */
    private String volatilityAddon;

    /**
     * Liquidity margin addon of the currency position
     */
    private String liquidityAddon;

    /**
     * Total position margin of the currency
     */
    private String totalPositionMargin;

    /**
     * Nominal short position of the currency
     */
    private String shortNominal;

    /**
     * Nominal long position of the currency
     */
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
    public Boolean getMarginEligible() {
        return marginEligible;
    }

    public void setMarginEligible(Boolean marginEligible) {
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

        private Boolean marginEligible;

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

        public Builder marginEligible(Boolean marginEligible) {
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

