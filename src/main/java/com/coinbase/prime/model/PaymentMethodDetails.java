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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Detailed payment method information.
 */
public class PaymentMethodDetails {
    @JsonProperty("account_number")
    private String accountNumber;
    @JsonProperty("routing_number")
    private String routingNumber;
    @JsonProperty("bank_name")
    private String bankName;
    @JsonProperty("account_name")
    private String accountName;

    public PaymentMethodDetails() {
    }

    public PaymentMethodDetails(Builder builder) {
        this.accountNumber = builder.accountNumber;
        this.routingNumber = builder.routingNumber;
        this.bankName = builder.bankName;
        this.accountName = builder.accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public static class Builder {
        private String accountNumber;
        private String routingNumber;
        private String bankName;
        private String accountName;

        public Builder() {
        }

        public Builder accountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public Builder routingNumber(String routingNumber) {
            this.routingNumber = routingNumber;
            return this;
        }

        public Builder bankName(String bankName) {
            this.bankName = bankName;
            return this;
        }

        public Builder accountName(String accountName) {
            this.accountName = accountName;
            return this;
        }

        public PaymentMethodDetails build() {
            return new PaymentMethodDetails(this);
        }
    }
}