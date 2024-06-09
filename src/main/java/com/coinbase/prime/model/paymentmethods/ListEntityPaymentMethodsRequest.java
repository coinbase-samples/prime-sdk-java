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

import com.coinbase.core.http.CoinbaseGetRequest;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListEntityPaymentMethodsRequest extends CoinbaseGetRequest {
    @JsonProperty(required = true, value = "entity_id")
    private String entityId;

    public ListEntityPaymentMethodsRequest() {
    }

    public ListEntityPaymentMethodsRequest(Builder builder) {
        this.entityId = builder.entityId;
    }

    @Override
    public String getQueryString() {
        return "";
    }

    @Override
    public String getPath() {
        return String.format("/entities/%s/payment-methods", this.getEntityId());
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public static class Builder {
        private final String entityId;

        public Builder (String entityId) {
            this.entityId = entityId;
        }

        public ListEntityPaymentMethodsRequest build() {
            return new ListEntityPaymentMethodsRequest(this);
        }
    }
}
