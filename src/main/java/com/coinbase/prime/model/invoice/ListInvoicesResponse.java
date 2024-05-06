package com.coinbase.prime.model.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListInvoicesResponse {
    private String id;
    @JsonProperty("billing_month")
    private int billingMonth;
    @JsonProperty("billing_year")
    private int billingYear;
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
    private Invoice[] invoiceItems;

    private ListInvoicesRequest request;

    public ListInvoicesResponse() {
    }
    public ListInvoicesResponse(Builder builder) {
        this.id = builder.id;
        this.billingMonth = builder.billingMonth;
        this.billingYear = builder.billingYear;
        this.dueDate = builder.dueDate;
        this.invoiceNumber = builder.invoiceNumber;
        this.state = builder.state;
        this.usdAmountPaid = builder.usdAmountPaid;
        this.usdAmountOwed = builder.usdAmountOwed;
        this.invoiceItems = builder.invoiceItems;
        this.request = builder.request;
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

    public Invoice[] getInvoiceItems() {
        return invoiceItems;
    }

    public void setInvoiceItems(Invoice[] invoiceItems) {
        this.invoiceItems = invoiceItems;
    }

    public ListInvoicesRequest getRequest() {
        return request;
    }

    public void setRequest(ListInvoicesRequest request) {
        this.request = request;
    }

    public static class Builder {
        private String id;
        private int billingMonth;
        private int billingYear;
        private String dueDate;
        private String invoiceNumber;
        private InvoiceState state;
        private double usdAmountPaid;
        private double usdAmountOwed;
        private Invoice[] invoiceItems;
        private ListInvoicesRequest request;

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

        public Builder invoiceItems(Invoice[] invoiceItems) {
            this.invoiceItems = invoiceItems;
            return this;
        }

        public Builder request(ListInvoicesRequest request) {
            this.request = request;
            return this;
        }

        public ListInvoicesResponse build() {
            return new ListInvoicesResponse(this);
        }
    }
}
