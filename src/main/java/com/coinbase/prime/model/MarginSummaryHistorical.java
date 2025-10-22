package com.coinbase.prime.model;

import com.coinbase.prime.model.MarginSummary;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class MarginSummaryHistorical {
    /**
     * The UTC date time used for conversion
     */
    private String conversionDatetime;

    /**
     * The date used for conversion
     */
    private String conversionDate;

    private MarginSummary marginSummary;

    public MarginSummaryHistorical() {
    }

    public MarginSummaryHistorical(Builder builder) {
        this.conversionDatetime = builder.conversionDatetime;
        this.conversionDate = builder.conversionDate;
        this.marginSummary = builder.marginSummary;
    }
    public String getConversionDatetime() {
        return conversionDatetime;
    }

    public void setConversionDatetime(String conversionDatetime) {
        this.conversionDatetime = conversionDatetime;
    }
    public String getConversionDate() {
        return conversionDate;
    }

    public void setConversionDate(String conversionDate) {
        this.conversionDate = conversionDate;
    }
    public MarginSummary getMarginSummary() {
        return marginSummary;
    }

    public void setMarginSummary(MarginSummary marginSummary) {
        this.marginSummary = marginSummary;
    }
    public static class Builder {
        private String conversionDatetime;

        private String conversionDate;

        private MarginSummary marginSummary;

        public Builder conversionDatetime(String conversionDatetime) {
            this.conversionDatetime = conversionDatetime;
            return this;
        }

        public Builder conversionDate(String conversionDate) {
            this.conversionDate = conversionDate;
            return this;
        }

        public Builder marginSummary(MarginSummary marginSummary) {
            this.marginSummary = marginSummary;
            return this;
        }

        public MarginSummaryHistorical build() {
            return new MarginSummaryHistorical(this);
        }
    }
}

