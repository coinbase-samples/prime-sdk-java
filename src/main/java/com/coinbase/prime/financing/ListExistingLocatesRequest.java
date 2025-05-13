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
