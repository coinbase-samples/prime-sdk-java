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

package com.coinbase.prime.paymentmethods;

import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;

public class GetEntityPaymentMethodDetailsRequest {
    @JsonProperty(required = true, value = "entity_id")
    @JsonIgnore
    private String entityId;
    @JsonProperty(required = true, value = "payment_method_id")
    @JsonIgnore
    private String paymentMethodId;

    public GetEntityPaymentMethodDetailsRequest() {
    }

    public GetEntityPaymentMethodDetailsRequest(Builder builder) {
        this.entityId = builder.entityId;
        this.paymentMethodId = builder.paymentMethodId;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public static class Builder {
        private String entityId;
        private String paymentMethodId;

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder paymentMethodId(String paymentMethodId) {
            this.paymentMethodId = paymentMethodId;
            return this;
        }

        public GetEntityPaymentMethodDetailsRequest build() throws CoinbaseClientException {
            this.validate();
            return new GetEntityPaymentMethodDetailsRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.entityId)) {
                throw new CoinbaseClientException("EntityId is required");
            }
            if (isNullOrEmpty(this.paymentMethodId)) {
                throw new CoinbaseClientException("PaymentMethodId is required");
            }
        }
    }
}
