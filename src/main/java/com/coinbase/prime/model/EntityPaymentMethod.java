/*
 * Copyright 2025-present Coinbase Global, Inc.
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

public class EntityPaymentMethod {
    private String id;
    private String symbol;
    @JsonProperty("payment_method_type")
    private PaymentMethodType paymentMethodType;
    @JsonProperty("bank_name")
    private String bankName;
    @JsonProperty("account_number")
    private String accountNumber;
    @JsonProperty("bank_name_2")
    private String bankName2;

    public EntityPaymentMethod() {
    }

    public EntityPaymentMethod(Builder builder) {
        this.id = builder.id;
        this.symbol = builder.symbol;
        this.paymentMethodType = builder.paymentMethodType;
        this.bankName = builder.bankName;
        this.accountNumber = builder.accountNumber;
        this.bankName2 = builder.bankName2;
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

    public String getBankName2() {
        return bankName2;
    }

    public void setBankName2(String bankName2) {
        this.bankName2 = bankName2;
    }

    public static class Builder {
        private String id;
        private String symbol;
        private PaymentMethodType paymentMethodType;
        private String bankName;
        private String accountNumber;
        private String bankName2;

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

        public Builder bankName(String bankName) {
            this.bankName = bankName;
            return this;
        }

        public Builder accountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public Builder bankName2(String bankName2) {
            this.bankName2 = bankName2;
            return this;
        }

        public EntityPaymentMethod build() {
            return new EntityPaymentMethod(this);
        }
    }
}
