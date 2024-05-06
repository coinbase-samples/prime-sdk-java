package com.coinbase.prime.model.paymentmethods;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EntityPaymentMethod {
    private String id;
    private String symbol;
    @JsonProperty("payment_method_type")
    private EntityPaymentMethod paymentMethodType;
    @JsonProperty("bank_name")
    private String bankName;
    @JsonProperty("account_number")
    private String accountNumber;

    public EntityPaymentMethod() {
    }

    public EntityPaymentMethod(Builder builder) {
        this.id = builder.id;
        this.symbol = builder.symbol;
        this.paymentMethodType = builder.paymentMethodType;
        this.bankName = builder.bankName;
        this.accountNumber = builder.accountNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public EntityPaymentMethod getPaymentMethodType() {
        return paymentMethodType;
    }

    public void setPaymentMethodType(EntityPaymentMethod paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public static class Builder {
        private String id;
        private String symbol;
        private EntityPaymentMethod paymentMethodType;
        private String bankName;
        private String accountNumber;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder paymentMethodType(EntityPaymentMethod paymentMethodType) {
            this.paymentMethodType = paymentMethodType;
            return this;
        }

        public Builder bankName(String bankName) {
            this.bankName = bankName;
            return this;
        }

        public Builder accountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public EntityPaymentMethod build() {
            return new EntityPaymentMethod(this);
        }
    }
}
