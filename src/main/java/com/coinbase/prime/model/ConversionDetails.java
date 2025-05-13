/*
 * Copyright 2025-present Coinbase Global, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConversionDetails {
    private String symbol;

    @JsonProperty("tf_balance")
    private String tfBalance;

    @JsonProperty("notional_tf_balance")
    private String notionalTfBalance;

    @JsonProperty("converted_balance")
    private String convertedBalance;

    @JsonProperty("notional_converted_balance")
    private String notionalConvertedBalance;

    @JsonProperty("interest_rate")
    private String interestRate;

    @JsonProperty("conversion_rate")
    private String conversionRate;

    public ConversionDetails() {

    }

    public ConversionDetails(Builder builder) {
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

        public Builder() {

        }

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

        public ConversionDetails build() {
            return new ConversionDetails(this);
        }
    }
}
