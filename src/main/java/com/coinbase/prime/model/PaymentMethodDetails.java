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

package com.coinbase.prime.model;

import com.coinbase.prime.model.enums.PaymentMethodType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Detailed payment method information.
 */
public class PaymentMethodDetails {
    private String id;
    private String symbol;
    @JsonProperty("payment_method_type")
    private PaymentMethodType paymentMethodType;
    private String name;
    @JsonProperty("account_number")
    private String accountNumber;
    @JsonProperty("bank_code")
    private String bankCode;

    public PaymentMethodDetails() {
    }

    public PaymentMethodDetails(Builder builder) {
        this.id = builder.id;
        this.symbol = builder.symbol;
        this.paymentMethodType = builder.paymentMethodType;
        this.name = builder.name;
        this.accountNumber = builder.accountNumber;
        this.bankCode = builder.bankCode;
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

    public PaymentMethodType getPaymentMethodType() {
        return paymentMethodType;
    }

    public void setPaymentMethodType(PaymentMethodType paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public static class Builder {
        private String id;
        private String symbol;
        private PaymentMethodType paymentMethodType;
        private String name;
        private String accountNumber;
        private String bankCode;

        public Builder() {
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder paymentMethodType(PaymentMethodType paymentMethodType) {
            this.paymentMethodType = paymentMethodType;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder accountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public Builder bankCode(String bankCode) {
            this.bankCode = bankCode;
            return this;
        }

        public PaymentMethodDetails build() {
            return new PaymentMethodDetails(this);
        }
    }
}