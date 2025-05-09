package com.coinbase.prime.financing;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListExistingLocatesRequest {
    @JsonIgnore
    @JsonProperty(required = true, value = "portfolio_id")
    private String portfolioId;

    @JsonProperty("locate_ids")
    private String[] locateIds;

    @JsonProperty("locate_date")
    private String locateDate;

    @JsonProperty("conversion_date")
    private String conversionDate;

    public ListExistingLocatesRequest() {
    }

    public ListExistingLocatesRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.locateIds = builder.locateIds;
        this.locateDate = builder.locateDate;
        this.conversionDate = builder.conversionDate;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String[] getLocateIds() {
        return locateIds;
    }

    public void setLocateIds(String[] locateIds) {
        this.locateIds = locateIds;
    }

    public String getLocateDate() {
        return locateDate;
    }

    public void setLocateDate(String locateDate) {
        this.locateDate = locateDate;
    }

    public String getConversionDate() {
        return conversionDate;
    }

    public void setConversionDate(String conversionDate) {
        this.conversionDate = conversionDate;
    }

    public static class Builder {
        private String portfolioId;
        private String[] locateIds;
        private String locateDate;
        private String conversionDate;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder locateIds(String[] locateIds) {
            this.locateIds = locateIds;
            return this;
        }

        public Builder locateDate(String locateDate) {
            this.locateDate = locateDate;
            return this;
        }

        public Builder conversionDate(String conversionDate) {
            this.conversionDate = conversionDate;
            return this;
        }

        public ListExistingLocatesRequest build() {
            return new ListExistingLocatesRequest(this);
        }
    }
}
