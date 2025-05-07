package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BuyingPower {
    @JsonProperty("portfolio_id")
    private String portfolioId;

    @JsonProperty("base_currency")
    private String baseCurrency;

    @JsonProperty("quote_currency")
    private String quoteCurrency;

    @JsonProperty("base_buying_power")
    private String baseBuyingPower;

    @JsonProperty("quote_buying_power")
    private String quoteBuyingPower;

    public BuyingPower() {
    }

    public BuyingPower(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.baseCurrency = builder.baseCurrency;
        this.quoteCurrency = builder.quoteCurrency;
        this.baseBuyingPower = builder.baseBuyingPower;
        this.quoteBuyingPower = builder.quoteBuyingPower;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getQuoteCurrency() {
        return quoteCurrency;
    }

    public void setQuoteCurrency(String quoteCurrency) {
        this.quoteCurrency = quoteCurrency;
    }

    public String getBaseBuyingPower() {
        return baseBuyingPower;
    }

    public void setBaseBuyingPower(String baseBuyingPower) {
        this.baseBuyingPower = baseBuyingPower;
    }

    public String getQuoteBuyingPower() {
        return quoteBuyingPower;
    }

    public void setQuoteBuyingPower(String quoteBuyingPower) {
        this.quoteBuyingPower = quoteBuyingPower;
    }

    public static class Builder {
        private String portfolioId;
        private String baseCurrency;
        private String quoteCurrency;
        private String baseBuyingPower;
        private String quoteBuyingPower;

        public Builder() {
        }

        public Builder withPortfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder withBaseCurrency(String baseCurrency) {
            this.baseCurrency = baseCurrency;
            return this;
        }

        public Builder withQuoteCurrency(String quoteCurrency) {
            this.quoteCurrency = quoteCurrency;
            return this;
        }

        public Builder withBaseBuyingPower(String baseBuyingPower) {
            this.baseBuyingPower = baseBuyingPower;
            return this;
        }

        public Builder withQuoteBuyingPower(String quoteBuyingPower) {
            this.quoteBuyingPower = quoteBuyingPower;
            return this;
        }
    }
}
