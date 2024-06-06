/*
 *
 *  Copyright 2024-present Coinbase Global, Inc.
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
 *
 */

package com.coinbase.prime.model.products;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {
    private String id;
    @JsonProperty("base_increment")
    private String baseIncrement;
    @JsonProperty("quote_increment")
    private String quoteIncrement;
    @JsonProperty("price_increment")
    private String priceIncrement;
    @JsonProperty("base_min_size")
    private String baseMinSize;
    @JsonProperty("quote_min_size")
    private String quoteMinSize;
    @JsonProperty("base_max_size")
    private String baseMaxSize;
    @JsonProperty("quote_max_size")
    private String quoteMaxSize;
    private String[] permissions;

    public Product() {
    }

    public Product(Builder builder) {
        this.id = builder.id;
        this.baseIncrement = builder.baseIncrement;
        this.quoteIncrement = builder.quoteIncrement;
        this.priceIncrement = builder.priceIncrement;
        this.baseMinSize = builder.baseMinSize;
        this.quoteMinSize = builder.quoteMinSize;
        this.baseMaxSize = builder.baseMaxSize;
        this.quoteMaxSize = builder.quoteMaxSize;
        this.permissions = builder.permissions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBaseIncrement() {
        return baseIncrement;
    }

    public void setBaseIncrement(String baseIncrement) {
        this.baseIncrement = baseIncrement;
    }

    public String getQuoteIncrement() {
        return quoteIncrement;
    }

    public void setQuoteIncrement(String quoteIncrement) {
        this.quoteIncrement = quoteIncrement;
    }

    public String getPriceIncrement() {
        return priceIncrement;
    }

    public void setPriceIncrement(String priceIncrement) {
        this.priceIncrement = priceIncrement;
    }

    public String getBaseMinSize() {
        return baseMinSize;
    }

    public void setBaseMinSize(String baseMinSize) {
        this.baseMinSize = baseMinSize;
    }

    public String getQuoteMinSize() {
        return quoteMinSize;
    }

    public void setQuoteMinSize(String quoteMinSize) {
        this.quoteMinSize = quoteMinSize;
    }

    public String getBaseMaxSize() {
        return baseMaxSize;
    }

    public void setBaseMaxSize(String baseMaxSize) {
        this.baseMaxSize = baseMaxSize;
    }

    public String getQuoteMaxSize() {
        return quoteMaxSize;
    }

    public void setQuoteMaxSize(String quoteMaxSize) {
        this.quoteMaxSize = quoteMaxSize;
    }

    public String[] getPermissions() {
        return permissions;
    }

    public void setPermissions(String[] permissions) {
        this.permissions = permissions;
    }

    public static class Builder {
        private String id;
        private String baseIncrement;
        private String quoteIncrement;
        private String priceIncrement;
        private String baseMinSize;
        private String quoteMinSize;
        private String baseMaxSize;
        private String quoteMaxSize;
        private String[] permissions;

        public Builder() {
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder baseIncrement(String baseIncrement) {
            this.baseIncrement = baseIncrement;
            return this;
        }

        public Builder quoteIncrement(String quoteIncrement) {
            this.quoteIncrement = quoteIncrement;
            return this;
        }

        public Builder priceIncrement(String priceIncrement) {
            this.priceIncrement = priceIncrement;
            return this;
        }

        public Builder baseMinSize(String baseMinSize) {
            this.baseMinSize = baseMinSize;
            return this;
        }

        public Builder quoteMinSize(String quoteMinSize) {
            this.quoteMinSize = quoteMinSize;
            return this;
        }

        public Builder baseMaxSize(String baseMaxSize) {
            this.baseMaxSize = baseMaxSize;
            return this;
        }

        public Builder quoteMaxSize(String quoteMaxSize) {
            this.quoteMaxSize = quoteMaxSize;
            return this;
        }

        public Builder permissions(String[] permissions) {
            this.permissions = permissions;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
