package com.coinbase.prime.model;

import com.coinbase.prime.model.ConversionDetail;
import com.coinbase.prime.model.ShortCollateral;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conversion {
    /**
     * Conversion details
     */
    private List<ConversionDetail> conversionDetails;

    private ShortCollateral shortCollateral;

    /**
     * The UTC date time used for conversion
     */
    private String conversionDatetime;

    /**
     * Portfolio Id
     */
    private String portfolioId;

    public Conversion() {
    }

    public Conversion(Builder builder) {
        this.conversionDetails = builder.conversionDetails;
        this.shortCollateral = builder.shortCollateral;
        this.conversionDatetime = builder.conversionDatetime;
        this.portfolioId = builder.portfolioId;
    }
    public List<ConversionDetail> getConversionDetails() {
        return conversionDetails;
    }

    public void setConversionDetails(List<ConversionDetail> conversionDetails) {
        this.conversionDetails = conversionDetails;
    }
    public ShortCollateral getShortCollateral() {
        return shortCollateral;
    }

    public void setShortCollateral(ShortCollateral shortCollateral) {
        this.shortCollateral = shortCollateral;
    }
    public String getConversionDatetime() {
        return conversionDatetime;
    }

    public void setConversionDatetime(String conversionDatetime) {
        this.conversionDatetime = conversionDatetime;
    }
    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }
    public static class Builder {
        private List<ConversionDetail> conversionDetails;

        private ShortCollateral shortCollateral;

        private String conversionDatetime;

        private String portfolioId;

        public Builder conversionDetails(List<ConversionDetail> conversionDetails) {
            this.conversionDetails = conversionDetails;
            return this;
        }

        public Builder shortCollateral(ShortCollateral shortCollateral) {
            this.shortCollateral = shortCollateral;
            return this;
        }

        public Builder conversionDatetime(String conversionDatetime) {
            this.conversionDatetime = conversionDatetime;
            return this;
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Conversion build() {
            return new Conversion(this);
        }
    }
}

