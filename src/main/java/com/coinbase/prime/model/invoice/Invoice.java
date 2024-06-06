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

package com.coinbase.prime.model.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Invoice {
    private String id;
    @JsonProperty("billing_month")
    private Integer billingMonth;
    @JsonProperty("billing_year")
    private Integer billingYear;
    @JsonProperty("due_date")
    private String dueDate;
    @JsonProperty("invoice_number")
    private String invoiceNumber;
    private InvoiceState state;
    @JsonProperty("usd_amount_paid")
    private double usdAmountPaid;
    @JsonProperty("usd_amount_owed")
    private double usdAmountOwed;
    @JsonProperty("invoice_items")
    private InvoiceItem[] invoiceItems;

    public Invoice() {
    }
    public Invoice(Builder builder) {
        this.id = builder.id;
        this.billingMonth = builder.billingMonth;
        this.billingYear = builder.billingYear;
        this.dueDate = builder.dueDate;
        this.invoiceNumber = builder.invoiceNumber;
        this.state = builder.state;
        this.usdAmountPaid = builder.usdAmountPaid;
        this.usdAmountOwed = builder.usdAmountOwed;
        this.invoiceItems = builder.invoiceItemItems;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBillingMonth() {
        return billingMonth;
    }

    public void setBillingMonth(int billingMonth) {
        this.billingMonth = billingMonth;
    }

    public int getBillingYear() {
        return billingYear;
    }

    public void setBillingYear(int billingYear) {
        this.billingYear = billingYear;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public InvoiceState getState() {
        return state;
    }

    public void setState(InvoiceState state) {
        this.state = state;
    }

    public double getUsdAmountPaid() {
        return usdAmountPaid;
    }

    public void setUsdAmountPaid(double usdAmountPaid) {
        this.usdAmountPaid = usdAmountPaid;
    }

    public double getUsdAmountOwed() {
        return usdAmountOwed;
    }

    public void setUsdAmountOwed(double usdAmountOwed) {
        this.usdAmountOwed = usdAmountOwed;
    }

    public InvoiceItem[] getInvoiceItems() {
        return invoiceItems;
    }

    public void setInvoiceItems(InvoiceItem[] invoiceItemItems) {
        this.invoiceItems = invoiceItemItems;
    }

    public static class Builder {
        private String id;
        private Integer billingMonth;
        private Integer billingYear;
        private String dueDate;
        private String invoiceNumber;
        private InvoiceState state;
        private double usdAmountPaid;
        private double usdAmountOwed;
        private InvoiceItem[] invoiceItemItems;

        public Builder() {
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder billingMonth(int billingMonth) {
            this.billingMonth = billingMonth;
            return this;
        }

        public Builder billingYear(int billingYear) {
            this.billingYear = billingYear;
            return this;
        }

        public Builder dueDate(String dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public Builder invoiceNumber(String invoiceNumber) {
            this.invoiceNumber = invoiceNumber;
            return this;
        }

        public Builder state(InvoiceState state) {
            this.state = state;
            return this;
        }

        public Builder usdAmountPaid(double usdAmountPaid) {
            this.usdAmountPaid = usdAmountPaid;
            return this;
        }

        public Builder usdAmountOwed(double usdAmountOwed) {
            this.usdAmountOwed = usdAmountOwed;
            return this;
        }

        public Builder invoiceItems(InvoiceItem[] invoiceItemItems) {
            this.invoiceItemItems = invoiceItemItems;
            return this;
        }

        public Invoice build() {
            return new Invoice(this);
        }
    }
}
