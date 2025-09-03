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

/**
 * RFQ product details for trading products.
 */
public class RfqProductDetails {
    private Boolean tradable;
    
    @JsonProperty("min_notional_size")
    private String minNotionalSize;
    
    @JsonProperty("max_notional_size")
    private String maxNotionalSize;
    
    @JsonProperty("min_base_size")
    private String minBaseSize;
    
    @JsonProperty("max_base_size")
    private String maxBaseSize;
    
    @JsonProperty("min_quote_size")
    private String minQuoteSize;
    
    @JsonProperty("max_quote_size")
    private String maxQuoteSize;

    public RfqProductDetails() {}

    public RfqProductDetails(Builder builder) {
        this.tradable = builder.tradable;
        this.minNotionalSize = builder.minNotionalSize;
        this.maxNotionalSize = builder.maxNotionalSize;
        this.minBaseSize = builder.minBaseSize;
        this.maxBaseSize = builder.maxBaseSize;
        this.minQuoteSize = builder.minQuoteSize;
        this.maxQuoteSize = builder.maxQuoteSize;
    }

    public Boolean getTradable() {
        return tradable;
    }

    public void setTradable(Boolean tradable) {
        this.tradable = tradable;
    }

    public String getMinNotionalSize() {
        return minNotionalSize;
    }

    public void setMinNotionalSize(String minNotionalSize) {
        this.minNotionalSize = minNotionalSize;
    }

    public String getMaxNotionalSize() {
        return maxNotionalSize;
    }

    public void setMaxNotionalSize(String maxNotionalSize) {
        this.maxNotionalSize = maxNotionalSize;
    }

    public String getMinBaseSize() {
        return minBaseSize;
    }

    public void setMinBaseSize(String minBaseSize) {
        this.minBaseSize = minBaseSize;
    }

    public String getMaxBaseSize() {
        return maxBaseSize;
    }

    public void setMaxBaseSize(String maxBaseSize) {
        this.maxBaseSize = maxBaseSize;
    }

    public String getMinQuoteSize() {
        return minQuoteSize;
    }

    public void setMinQuoteSize(String minQuoteSize) {
        this.minQuoteSize = minQuoteSize;
    }

    public String getMaxQuoteSize() {
        return maxQuoteSize;
    }

    public void setMaxQuoteSize(String maxQuoteSize) {
        this.maxQuoteSize = maxQuoteSize;
    }

    public static class Builder {
        private Boolean tradable;
        private String minNotionalSize;
        private String maxNotionalSize;
        private String minBaseSize;
        private String maxBaseSize;
        private String minQuoteSize;
        private String maxQuoteSize;

        public Builder() {}

        public Builder tradable(Boolean tradable) {
            this.tradable = tradable;
            return this;
        }

        public Builder minNotionalSize(String minNotionalSize) {
            this.minNotionalSize = minNotionalSize;
            return this;
        }

        public Builder maxNotionalSize(String maxNotionalSize) {
            this.maxNotionalSize = maxNotionalSize;
            return this;
        }

        public Builder minBaseSize(String minBaseSize) {
            this.minBaseSize = minBaseSize;
            return this;
        }

        public Builder maxBaseSize(String maxBaseSize) {
            this.maxBaseSize = maxBaseSize;
            return this;
        }

        public Builder minQuoteSize(String minQuoteSize) {
            this.minQuoteSize = minQuoteSize;
            return this;
        }

        public Builder maxQuoteSize(String maxQuoteSize) {
            this.maxQuoteSize = maxQuoteSize;
            return this;
        }

        public RfqProductDetails build() {
            return new RfqProductDetails(this);
        }
    }
}