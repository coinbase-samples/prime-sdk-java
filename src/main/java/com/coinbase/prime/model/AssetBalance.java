package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class AssetBalance {
    /**
     * The unique ID of the portfolio
     */
    private String portfolioId;

    /**
     * The currency symbol
     */
    private String symbol;

    /**
     * Balance amount
     */
    private String amount;

    /**
     * Notional balance amount
     */
    private String notionalAmount;

    /**
     * Conversion rate
     */
    private String conversionRate;

    public AssetBalance() {
    }

    public AssetBalance(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.symbol = builder.symbol;
        this.amount = builder.amount;
        this.notionalAmount = builder.notionalAmount;
        this.conversionRate = builder.conversionRate;
    }
    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
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
    public String getNotionalAmount() {
        return notionalAmount;
    }

    public void setNotionalAmount(String notionalAmount) {
        this.notionalAmount = notionalAmount;
    }
    public String getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(String conversionRate) {
        this.conversionRate = conversionRate;
    }
    public static class Builder {
        private String portfolioId;

        private String symbol;

        private String amount;

        private String notionalAmount;

        private String conversionRate;

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder notionalAmount(String notionalAmount) {
            this.notionalAmount = notionalAmount;
            return this;
        }

        public Builder conversionRate(String conversionRate) {
            this.conversionRate = conversionRate;
            return this;
        }

        public AssetBalance build() {
            return new AssetBalance(this);
        }
    }
}

