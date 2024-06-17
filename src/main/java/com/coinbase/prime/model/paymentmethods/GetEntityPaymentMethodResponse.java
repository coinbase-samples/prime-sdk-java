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

package com.coinbase.prime.model.paymentmethods;

public class GetEntityPaymentMethodResponse {
    private EntityPaymentMethod paymentMethod;
    private GetEntityPaymentMethodRequest request;

    public GetEntityPaymentMethodResponse() {
    }

    public GetEntityPaymentMethodResponse(Builder builder) {
        this.paymentMethod = builder.paymentMethod;
        this.request = builder.request;
    }

    public EntityPaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(EntityPaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public GetEntityPaymentMethodRequest getRequest() {
        return request;
    }

    public void setRequest(GetEntityPaymentMethodRequest request) {
        this.request = request;
    }

    public static class Builder {
        private EntityPaymentMethod paymentMethod;
        private GetEntityPaymentMethodRequest request;

        public Builder() {
        }

        public Builder paymentMethod(EntityPaymentMethod paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Builder request(GetEntityPaymentMethodRequest request) {
            this.request = request;
            return this;
        }

        public GetEntityPaymentMethodResponse build() {
            return new GetEntityPaymentMethodResponse(this);
        }
    }
}
