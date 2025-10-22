package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class XMPosition {
    /**
     * Position currency
     */
    private String currency;

    /**
     * Current market price
     */
    private String marketPrice;

    /**
     * True if margin eligible, false otherwise
     */
    private Boolean marginEligible;

    /**
     * Total market capitalization
     */
    private String marketCap;

    /**
     * Average daily volume calculated over a 30-day period
     */
    private String adv30Days;

    /**
     * Historic volatility calculated over a 5-day period
     */
    private String hist5dVol;

    /**
     * Historic volatility calculated over a 30-day period
     */
    private String hist30dVol;

    /**
     * Historic volatility calculated over a 90-day period
     */
    private String hist90dVol;

    /**
     * Base margin requirement for the specific asset
     */
    private String marginRequirement;

    /**
     * XM spot balance nominal
     */
    private String spotBalance;

    /**
     * XM spot balance notional
     */
    private String spotBalanceNotional;

    /**
     * Pre-netted spot total position margin
     */
    private String spotTotalPositionMargin;

    /**
     * XM futures balance nominal
     */
    private String futuresBalance;

    /**
     * XM futures balance notional
     */
    private String futuresBalanceNotional;

    /**
     * Pre-netted futures total position margin
     */
    private String futuresTotalPositionMargin;

    /**
     * Basis GMV &#x3D; |futures| + |spot| - |unnetted position|
     */
    private String gmvBasis;

    /**
     * Base margin requirement notional
     */
    private String baseRequirement;

    /**
     * Effective liquidity add-on for the short positions
     */
    private String liqShortsAddOn;

    /**
     * Effective liquidity add-on for the long positions
     */
    private String liqLongsAddOn;

    /**
     * Effective volatility add-on for the short positions
     */
    private String volShortsAddOn;

    /**
     * Effective volatility add-on for the long positions
     */
    private String volLongsAddOn;

    /**
     * 5-day volatility add-on
     */
    private String vol5daysAddOn;

    /**
     * 30-day volatility add-on
     */
    private String vol30daysAddOn;

    /**
     * 90-day volatility add-on
     */
    private String vol90daysAddOn;

    /**
     * Total margin required
     */
    private String totalPositionMargin;

    public XMPosition() {
    }

    public XMPosition(Builder builder) {
        this.currency = builder.currency;
        this.marketPrice = builder.marketPrice;
        this.marginEligible = builder.marginEligible;
        this.marketCap = builder.marketCap;
        this.adv30Days = builder.adv30Days;
        this.hist5dVol = builder.hist5dVol;
        this.hist30dVol = builder.hist30dVol;
        this.hist90dVol = builder.hist90dVol;
        this.marginRequirement = builder.marginRequirement;
        this.spotBalance = builder.spotBalance;
        this.spotBalanceNotional = builder.spotBalanceNotional;
        this.spotTotalPositionMargin = builder.spotTotalPositionMargin;
        this.futuresBalance = builder.futuresBalance;
        this.futuresBalanceNotional = builder.futuresBalanceNotional;
        this.futuresTotalPositionMargin = builder.futuresTotalPositionMargin;
        this.gmvBasis = builder.gmvBasis;
        this.baseRequirement = builder.baseRequirement;
        this.liqShortsAddOn = builder.liqShortsAddOn;
        this.liqLongsAddOn = builder.liqLongsAddOn;
        this.volShortsAddOn = builder.volShortsAddOn;
        this.volLongsAddOn = builder.volLongsAddOn;
        this.vol5daysAddOn = builder.vol5daysAddOn;
        this.vol30daysAddOn = builder.vol30daysAddOn;
        this.vol90daysAddOn = builder.vol90daysAddOn;
        this.totalPositionMargin = builder.totalPositionMargin;
    }
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(String marketPrice) {
        this.marketPrice = marketPrice;
    }
    public Boolean getMarginEligible() {
        return marginEligible;
    }

    public void setMarginEligible(Boolean marginEligible) {
        this.marginEligible = marginEligible;
    }
    public String getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(String marketCap) {
        this.marketCap = marketCap;
    }
    public String getAdv30Days() {
        return adv30Days;
    }

    public void setAdv30Days(String adv30Days) {
        this.adv30Days = adv30Days;
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
    public String getMarginRequirement() {
        return marginRequirement;
    }

    public void setMarginRequirement(String marginRequirement) {
        this.marginRequirement = marginRequirement;
    }
    public String getSpotBalance() {
        return spotBalance;
    }

    public void setSpotBalance(String spotBalance) {
        this.spotBalance = spotBalance;
    }
    public String getSpotBalanceNotional() {
        return spotBalanceNotional;
    }

    public void setSpotBalanceNotional(String spotBalanceNotional) {
        this.spotBalanceNotional = spotBalanceNotional;
    }
    public String getSpotTotalPositionMargin() {
        return spotTotalPositionMargin;
    }

    public void setSpotTotalPositionMargin(String spotTotalPositionMargin) {
        this.spotTotalPositionMargin = spotTotalPositionMargin;
    }
    public String getFuturesBalance() {
        return futuresBalance;
    }

    public void setFuturesBalance(String futuresBalance) {
        this.futuresBalance = futuresBalance;
    }
    public String getFuturesBalanceNotional() {
        return futuresBalanceNotional;
    }

    public void setFuturesBalanceNotional(String futuresBalanceNotional) {
        this.futuresBalanceNotional = futuresBalanceNotional;
    }
    public String getFuturesTotalPositionMargin() {
        return futuresTotalPositionMargin;
    }

    public void setFuturesTotalPositionMargin(String futuresTotalPositionMargin) {
        this.futuresTotalPositionMargin = futuresTotalPositionMargin;
    }
    public String getGmvBasis() {
        return gmvBasis;
    }

    public void setGmvBasis(String gmvBasis) {
        this.gmvBasis = gmvBasis;
    }
    public String getBaseRequirement() {
        return baseRequirement;
    }

    public void setBaseRequirement(String baseRequirement) {
        this.baseRequirement = baseRequirement;
    }
    public String getLiqShortsAddOn() {
        return liqShortsAddOn;
    }

    public void setLiqShortsAddOn(String liqShortsAddOn) {
        this.liqShortsAddOn = liqShortsAddOn;
    }
    public String getLiqLongsAddOn() {
        return liqLongsAddOn;
    }

    public void setLiqLongsAddOn(String liqLongsAddOn) {
        this.liqLongsAddOn = liqLongsAddOn;
    }
    public String getVolShortsAddOn() {
        return volShortsAddOn;
    }

    public void setVolShortsAddOn(String volShortsAddOn) {
        this.volShortsAddOn = volShortsAddOn;
    }
    public String getVolLongsAddOn() {
        return volLongsAddOn;
    }

    public void setVolLongsAddOn(String volLongsAddOn) {
        this.volLongsAddOn = volLongsAddOn;
    }
    public String getVol5daysAddOn() {
        return vol5daysAddOn;
    }

    public void setVol5daysAddOn(String vol5daysAddOn) {
        this.vol5daysAddOn = vol5daysAddOn;
    }
    public String getVol30daysAddOn() {
        return vol30daysAddOn;
    }

    public void setVol30daysAddOn(String vol30daysAddOn) {
        this.vol30daysAddOn = vol30daysAddOn;
    }
    public String getVol90daysAddOn() {
        return vol90daysAddOn;
    }

    public void setVol90daysAddOn(String vol90daysAddOn) {
        this.vol90daysAddOn = vol90daysAddOn;
    }
    public String getTotalPositionMargin() {
        return totalPositionMargin;
    }

    public void setTotalPositionMargin(String totalPositionMargin) {
        this.totalPositionMargin = totalPositionMargin;
    }
    public static class Builder {
        private String currency;

        private String marketPrice;

        private Boolean marginEligible;

        private String marketCap;

        private String adv30Days;

        private String hist5dVol;

        private String hist30dVol;

        private String hist90dVol;

        private String marginRequirement;

        private String spotBalance;

        private String spotBalanceNotional;

        private String spotTotalPositionMargin;

        private String futuresBalance;

        private String futuresBalanceNotional;

        private String futuresTotalPositionMargin;

        private String gmvBasis;

        private String baseRequirement;

        private String liqShortsAddOn;

        private String liqLongsAddOn;

        private String volShortsAddOn;

        private String volLongsAddOn;

        private String vol5daysAddOn;

        private String vol30daysAddOn;

        private String vol90daysAddOn;

        private String totalPositionMargin;

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public Builder marketPrice(String marketPrice) {
            this.marketPrice = marketPrice;
            return this;
        }

        public Builder marginEligible(Boolean marginEligible) {
            this.marginEligible = marginEligible;
            return this;
        }

        public Builder marketCap(String marketCap) {
            this.marketCap = marketCap;
            return this;
        }

        public Builder adv30Days(String adv30Days) {
            this.adv30Days = adv30Days;
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

        public Builder marginRequirement(String marginRequirement) {
            this.marginRequirement = marginRequirement;
            return this;
        }

        public Builder spotBalance(String spotBalance) {
            this.spotBalance = spotBalance;
            return this;
        }

        public Builder spotBalanceNotional(String spotBalanceNotional) {
            this.spotBalanceNotional = spotBalanceNotional;
            return this;
        }

        public Builder spotTotalPositionMargin(String spotTotalPositionMargin) {
            this.spotTotalPositionMargin = spotTotalPositionMargin;
            return this;
        }

        public Builder futuresBalance(String futuresBalance) {
            this.futuresBalance = futuresBalance;
            return this;
        }

        public Builder futuresBalanceNotional(String futuresBalanceNotional) {
            this.futuresBalanceNotional = futuresBalanceNotional;
            return this;
        }

        public Builder futuresTotalPositionMargin(String futuresTotalPositionMargin) {
            this.futuresTotalPositionMargin = futuresTotalPositionMargin;
            return this;
        }

        public Builder gmvBasis(String gmvBasis) {
            this.gmvBasis = gmvBasis;
            return this;
        }

        public Builder baseRequirement(String baseRequirement) {
            this.baseRequirement = baseRequirement;
            return this;
        }

        public Builder liqShortsAddOn(String liqShortsAddOn) {
            this.liqShortsAddOn = liqShortsAddOn;
            return this;
        }

        public Builder liqLongsAddOn(String liqLongsAddOn) {
            this.liqLongsAddOn = liqLongsAddOn;
            return this;
        }

        public Builder volShortsAddOn(String volShortsAddOn) {
            this.volShortsAddOn = volShortsAddOn;
            return this;
        }

        public Builder volLongsAddOn(String volLongsAddOn) {
            this.volLongsAddOn = volLongsAddOn;
            return this;
        }

        public Builder vol5daysAddOn(String vol5daysAddOn) {
            this.vol5daysAddOn = vol5daysAddOn;
            return this;
        }

        public Builder vol30daysAddOn(String vol30daysAddOn) {
            this.vol30daysAddOn = vol30daysAddOn;
            return this;
        }

        public Builder vol90daysAddOn(String vol90daysAddOn) {
            this.vol90daysAddOn = vol90daysAddOn;
            return this;
        }

        public Builder totalPositionMargin(String totalPositionMargin) {
            this.totalPositionMargin = totalPositionMargin;
            return this;
        }

        public XMPosition build() {
            return new XMPosition(this);
        }
    }
}

