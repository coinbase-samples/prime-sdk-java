/**
 * Copyright 2024-present Coinbase Global, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RFQ Product Details model representing request for quote product information.
 */
public class RfqProductDetails {
    
    /**
     * Whether the product is tradable via RFQ
     */
    @JsonProperty("tradable")
    private Boolean tradable;

    /**
     * Deprecated: Value will be an empty string
     */
    @JsonProperty("min_notional_size")
    private String minNotionalSize;

    /**
     * Maximum notional size for RFQ trading
     */
    @JsonProperty("max_notional_size")
    private String maxNotionalSize;

    public RfqProductDetails() {}

    private RfqProductDetails(Builder builder) {
        this.tradable = builder.tradable;
        this.minNotionalSize = builder.minNotionalSize;
        this.maxNotionalSize = builder.maxNotionalSize;
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

    @Override
    public String toString() {
        return "RfqProductDetails{" +
                "tradable=" + tradable +
                ", minNotionalSize='" + minNotionalSize + '\'' +
                ", maxNotionalSize='" + maxNotionalSize + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Boolean tradable;
        private String minNotionalSize;
        private String maxNotionalSize;

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

        public RfqProductDetails build() {
            return new RfqProductDetails(this);
        }
    }
}