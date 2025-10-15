// Copyright 2025-present Coinbase Global, Inc.
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

public class InvoiceItem {
    private String description;

    private String currencySymbol;

    private Double rate;

    private Double quantity;

    private Double price;

    private Double averageAuc;

    private Double total;

    public InvoiceItem() {
    }

    public InvoiceItem(Builder builder) {
        this.description = builder.description;
        this.currencySymbol = builder.currencySymbol;
        this.rate = builder.rate;
        this.quantity = builder.quantity;
        this.price = builder.price;
        this.averageAuc = builder.averageAuc;
        this.total = builder.total;
    }

    public String getDescription() {
        return description;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public Double getRate() {
        return rate;
    }

    public Double getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public Double getAverageAuc() {
        return averageAuc;
    }

    public Double getTotal() {
        return total;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setAverageAuc(Double averageAuc) {
        this.averageAuc = averageAuc;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public static class Builder {
        private String description;

        private String currencySymbol;

        private Double rate;

        private Double quantity;

        private Double price;

        private Double averageAuc;

        private Double total;

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder currencySymbol(String currencySymbol) {
            this.currencySymbol = currencySymbol;
            return this;
        }

        public Builder rate(Double rate) {
            this.rate = rate;
            return this;
        }

        public Builder quantity(Double quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder price(Double price) {
            this.price = price;
            return this;
        }

        public Builder averageAuc(Double averageAuc) {
            this.averageAuc = averageAuc;
            return this;
        }

        public Builder total(Double total) {
            this.total = total;
            return this;
        }

        public InvoiceItem build() {
            return new InvoiceItem(this);
        }
    }
}
