package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class BuyingPower {
    /**
     * The unique ID of the portfolio
     */
    private String portfolioId;

    /**
     * The symbol for the base currency
     */
    private String baseCurrency;

    /**
     * The symbol for the quote currency
     */
    private String quoteCurrency;

    /**
     * The buying power for the base currency
     */
    private String baseBuyingPower;

    /**
     * The buying power for the quote currency
     */
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

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder baseCurrency(String baseCurrency) {
            this.baseCurrency = baseCurrency;
            return this;
        }

        public Builder quoteCurrency(String quoteCurrency) {
            this.quoteCurrency = quoteCurrency;
            return this;
        }

        public Builder baseBuyingPower(String baseBuyingPower) {
            this.baseBuyingPower = baseBuyingPower;
            return this;
        }

        public Builder quoteBuyingPower(String quoteBuyingPower) {
            this.quoteBuyingPower = quoteBuyingPower;
            return this;
        }

        public BuyingPower build() {
            return new BuyingPower(this);
        }
    }
}

