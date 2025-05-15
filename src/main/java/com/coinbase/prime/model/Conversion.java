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

public class Conversion {
    @JsonProperty("conversion_details")
    private ConversionDetails conversionDetails;

    @JsonProperty("short_collateral")
    private ShortCollateral shortCollateral;

    @JsonProperty("conversion_datetime")
    private String conversionDatetime;

    @JsonProperty("portfolio_id")
    private String portfolioId;

    public Conversion() {
    }

    public Conversion(Builder builder) {
        this.conversionDetails = builder.conversionDetails;
        this.shortCollateral = builder.shortCollateral;
        this.conversionDatetime = builder.conversionDatetime;
        this.portfolioId = builder.portfolioId;
    }

    public ConversionDetails getConversionDetails() {
        return conversionDetails;
    }

    public void setConversionDetails(ConversionDetails conversionDetails) {
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
        private ConversionDetails conversionDetails;
        private ShortCollateral shortCollateral;
        private String conversionDatetime;
        private String portfolioId;

        public Builder() {
        }

        public Builder conversionDetails(ConversionDetails conversionDetails) {
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
