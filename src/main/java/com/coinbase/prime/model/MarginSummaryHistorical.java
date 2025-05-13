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

public class MarginSummaryHistorical {
    @JsonProperty("conversion_datetime")
    private String conversionDatetime;

    @JsonProperty("conversion_date")
    private String conversionDate;

    @JsonProperty("margin_summary")
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

        public Builder() {
        }

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
