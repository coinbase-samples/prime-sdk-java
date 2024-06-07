/*
 * Copyright 2024-present Coinbase Global, Inc.
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

package com.coinbase.prime.model.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InvoiceItem {
    private String description;
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    @JsonProperty("invoice_type")
    private InvoiceType invoiceType;
    private double rate;
    private double quantity;
    private double price;
    @JsonProperty("average_auc")
    private double averageAuc;
    private double total;

    public InvoiceItem() {
    }
    public InvoiceItem(Builder builder) {
        this.description = builder.description;
        this.currencySymbol = builder.currencySymbol;
        this.invoiceType = builder.invoiceType;
        this.rate = builder.rate;
        this.quantity = builder.quantity;
        this.price = builder.price;
        this.averageAuc = builder.averageAuc;
        this.total = builder.total;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public InvoiceType getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(InvoiceType invoiceType) {
        this.invoiceType = invoiceType;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAverageAuc() {
        return averageAuc;
    }

    public void setAverageAuc(double averageAuc) {
        this.averageAuc = averageAuc;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public static class Builder {
        private String description;
        private String currencySymbol;
        private InvoiceType invoiceType;
        private double rate;
        private double quantity;
        private double price;
        private double averageAuc;
        private double total;

        public Builder() {
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder currencySymbol(String currencySymbol) {
            this.currencySymbol = currencySymbol;
            return this;
        }

        public Builder invoiceType(InvoiceType invoiceType) {
            this.invoiceType = invoiceType;
            return this;
        }

        public Builder rate(double rate) {
            this.rate = rate;
            return this;
        }

        public Builder quantity(double quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Builder averageAuc(double averageAuc) {
            this.averageAuc = averageAuc;
            return this;
        }

        public Builder total(double total) {
            this.total = total;
            return this;
        }

        public InvoiceItem build() {
            return new InvoiceItem(this);
        }
    }
}
