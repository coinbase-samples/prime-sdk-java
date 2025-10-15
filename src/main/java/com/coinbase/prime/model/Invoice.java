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

public class Invoice {
    private String id;

    private Integer billingMonth;

    private Integer billingYear;

    private String dueDate;

    private String invoiceNumber;

    private Double usdAmountPaid;

    private Double usdAmountOwed;

    public Invoice() {
    }

    public Invoice(Builder builder) {
        this.id = builder.id;
        this.billingMonth = builder.billingMonth;
        this.billingYear = builder.billingYear;
        this.dueDate = builder.dueDate;
        this.invoiceNumber = builder.invoiceNumber;
        this.usdAmountPaid = builder.usdAmountPaid;
        this.usdAmountOwed = builder.usdAmountOwed;
    }

    public String getId() {
        return id;
    }

    public Integer getBillingMonth() {
        return billingMonth;
    }

    public Integer getBillingYear() {
        return billingYear;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public Double getUsdAmountPaid() {
        return usdAmountPaid;
    }

    public Double getUsdAmountOwed() {
        return usdAmountOwed;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBillingMonth(Integer billingMonth) {
        this.billingMonth = billingMonth;
    }

    public void setBillingYear(Integer billingYear) {
        this.billingYear = billingYear;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setUsdAmountPaid(Double usdAmountPaid) {
        this.usdAmountPaid = usdAmountPaid;
    }

    public void setUsdAmountOwed(Double usdAmountOwed) {
        this.usdAmountOwed = usdAmountOwed;
    }

    public static class Builder {
        private String id;

        private Integer billingMonth;

        private Integer billingYear;

        private String dueDate;

        private String invoiceNumber;

        private Double usdAmountPaid;

        private Double usdAmountOwed;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder billingMonth(Integer billingMonth) {
            this.billingMonth = billingMonth;
            return this;
        }

        public Builder billingYear(Integer billingYear) {
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

        public Builder usdAmountPaid(Double usdAmountPaid) {
            this.usdAmountPaid = usdAmountPaid;
            return this;
        }

        public Builder usdAmountOwed(Double usdAmountOwed) {
            this.usdAmountOwed = usdAmountOwed;
            return this;
        }

        public Invoice build() {
            return new Invoice(this);
        }
    }
}
