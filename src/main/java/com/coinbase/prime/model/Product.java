// Copyright 2024-present Coinbase Global, Inc.
//
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.
package com.coinbase.prime.model;

public class Product {
    private String id;

    private String baseIncrement;

    private String quoteIncrement;

    private String baseMinSize;

    private String quoteMinSize;

    private String baseMaxSize;

    private String quoteMaxSize;

    private String priceIncrement;

    private RFQProductDetails rfqProductDetails;

    public Product() {
    }

    public Product(Builder builder) {
        this.id = builder.id;
        this.baseIncrement = builder.baseIncrement;
        this.quoteIncrement = builder.quoteIncrement;
        this.baseMinSize = builder.baseMinSize;
        this.quoteMinSize = builder.quoteMinSize;
        this.baseMaxSize = builder.baseMaxSize;
        this.quoteMaxSize = builder.quoteMaxSize;
        this.priceIncrement = builder.priceIncrement;
        this.rfqProductDetails = builder.rfqProductDetails;
    }

    public String getId() {
        return id;
    }

    public String getBaseIncrement() {
        return baseIncrement;
    }

    public String getQuoteIncrement() {
        return quoteIncrement;
    }

    public String getBaseMinSize() {
        return baseMinSize;
    }

    public String getQuoteMinSize() {
        return quoteMinSize;
    }

    public String getBaseMaxSize() {
        return baseMaxSize;
    }

    public String getQuoteMaxSize() {
        return quoteMaxSize;
    }

    public String getPriceIncrement() {
        return priceIncrement;
    }

    public RFQProductDetails getRfqProductDetails() {
        return rfqProductDetails;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBaseIncrement(String baseIncrement) {
        this.baseIncrement = baseIncrement;
    }

    public void setQuoteIncrement(String quoteIncrement) {
        this.quoteIncrement = quoteIncrement;
    }

    public void setBaseMinSize(String baseMinSize) {
        this.baseMinSize = baseMinSize;
    }

    public void setQuoteMinSize(String quoteMinSize) {
        this.quoteMinSize = quoteMinSize;
    }

    public void setBaseMaxSize(String baseMaxSize) {
        this.baseMaxSize = baseMaxSize;
    }

    public void setQuoteMaxSize(String quoteMaxSize) {
        this.quoteMaxSize = quoteMaxSize;
    }

    public void setPriceIncrement(String priceIncrement) {
        this.priceIncrement = priceIncrement;
    }

    public void setRfqProductDetails(RFQProductDetails rfqProductDetails) {
        this.rfqProductDetails = rfqProductDetails;
    }

    public static class Builder {
        private String id;

        private String baseIncrement;

        private String quoteIncrement;

        private String baseMinSize;

        private String quoteMinSize;

        private String baseMaxSize;

        private String quoteMaxSize;

        private String priceIncrement;

        private RFQProductDetails rfqProductDetails;

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

        public Builder priceIncrement(String priceIncrement) {
            this.priceIncrement = priceIncrement;
            return this;
        }

        public Builder rfqProductDetails(RFQProductDetails rfqProductDetails) {
            this.rfqProductDetails = rfqProductDetails;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
