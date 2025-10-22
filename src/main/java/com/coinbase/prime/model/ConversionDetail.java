package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class ConversionDetail {
    /**
     * The currency symbol
     */
    private String symbol;

    /**
     * Trade finance balance after the conversion
     */
    private String tfBalance;

    /**
     * Notional trade finance balance after the conversion
     */
    private String notionalTfBalance;

    /**
     * Converted balance
     */
    private String convertedBalance;

    /**
     * Notional converted balance
     */
    private String notionalConvertedBalance;

    /**
     * Interest rate
     */
    private String interestRate;

    /**
     * Conversion rate
     */
    private String conversionRate;

    public ConversionDetail() {
    }

    public ConversionDetail(Builder builder) {
        this.symbol = builder.symbol;
        this.tfBalance = builder.tfBalance;
        this.notionalTfBalance = builder.notionalTfBalance;
        this.convertedBalance = builder.convertedBalance;
        this.notionalConvertedBalance = builder.notionalConvertedBalance;
        this.interestRate = builder.interestRate;
        this.conversionRate = builder.conversionRate;
    }
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public String getTfBalance() {
        return tfBalance;
    }

    public void setTfBalance(String tfBalance) {
        this.tfBalance = tfBalance;
    }
    public String getNotionalTfBalance() {
        return notionalTfBalance;
    }

    public void setNotionalTfBalance(String notionalTfBalance) {
        this.notionalTfBalance = notionalTfBalance;
    }
    public String getConvertedBalance() {
        return convertedBalance;
    }

    public void setConvertedBalance(String convertedBalance) {
        this.convertedBalance = convertedBalance;
    }
    public String getNotionalConvertedBalance() {
        return notionalConvertedBalance;
    }

    public void setNotionalConvertedBalance(String notionalConvertedBalance) {
        this.notionalConvertedBalance = notionalConvertedBalance;
    }
    public String getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }
    public String getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(String conversionRate) {
        this.conversionRate = conversionRate;
    }
    public static class Builder {
        private String symbol;

        private String tfBalance;

        private String notionalTfBalance;

        private String convertedBalance;

        private String notionalConvertedBalance;

        private String interestRate;

        private String conversionRate;

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder tfBalance(String tfBalance) {
            this.tfBalance = tfBalance;
            return this;
        }

        public Builder notionalTfBalance(String notionalTfBalance) {
            this.notionalTfBalance = notionalTfBalance;
            return this;
        }

        public Builder convertedBalance(String convertedBalance) {
            this.convertedBalance = convertedBalance;
            return this;
        }

        public Builder notionalConvertedBalance(String notionalConvertedBalance) {
            this.notionalConvertedBalance = notionalConvertedBalance;
            return this;
        }

        public Builder interestRate(String interestRate) {
            this.interestRate = interestRate;
            return this;
        }

        public Builder conversionRate(String conversionRate) {
            this.conversionRate = conversionRate;
            return this;
        }

        public ConversionDetail build() {
            return new ConversionDetail(this);
        }
    }
}

