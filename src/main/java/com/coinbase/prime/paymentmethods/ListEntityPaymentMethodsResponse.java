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

package com.coinbase.prime.paymentmethods;

import com.coinbase.prime.model.EntityPaymentMethod;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListEntityPaymentMethodsResponse {
    @JsonProperty("payment_methods")
    private EntityPaymentMethod[] paymentMethods;

    public ListEntityPaymentMethodsResponse() {
    }

    public ListEntityPaymentMethodsResponse(Builder builder) {
        this.paymentMethods = builder.paymentMethods;
    }

    public EntityPaymentMethod[] getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(EntityPaymentMethod[] paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public static class Builder {
        private EntityPaymentMethod[] paymentMethods;

        public Builder() {
        }

        public Builder paymentMethods(EntityPaymentMethod[] paymentMethods) {
            this.paymentMethods = paymentMethods;
            return this;
        }

        public ListEntityPaymentMethodsResponse build() {
            return new ListEntityPaymentMethodsResponse(this);
        }
    }
}
