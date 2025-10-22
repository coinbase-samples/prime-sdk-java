package com.coinbase.prime.model;

import com.coinbase.prime.model.enums.InvoiceType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class InvoiceItem {
    private String description;

    private String currencySymbol;

    private InvoiceType invoiceType;

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
    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public Double getAverageAuc() {
        return averageAuc;
    }

    public void setAverageAuc(Double averageAuc) {
        this.averageAuc = averageAuc;
    }
    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    public static class Builder {
        private String description;

        private String currencySymbol;

        private InvoiceType invoiceType;

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

        public Builder invoiceType(InvoiceType invoiceType) {
            this.invoiceType = invoiceType;
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

