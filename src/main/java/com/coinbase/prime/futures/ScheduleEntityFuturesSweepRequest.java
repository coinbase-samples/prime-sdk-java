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

package com.coinbase.prime.futures;

import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;

public class ScheduleEntityFuturesSweepRequest {
    @JsonProperty(required = true, value = "entity_id")
    private String entityId;

    private String amount;

    @JsonProperty(required = true)
    private String currency;

    public ScheduleEntityFuturesSweepRequest() {
    }

    public ScheduleEntityFuturesSweepRequest(Builder builder) {
        this.entityId = builder.entityId;
        this.amount = builder.amount;
        this.currency = builder.currency;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public static class Builder {
        private String entityId;
        private String amount;
        private String currency;

        public Builder() {
        }

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public ScheduleEntityFuturesSweepRequest build() throws CoinbaseClientException {
            this.validate();
            return new ScheduleEntityFuturesSweepRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.entityId)) {
                throw new CoinbaseClientException("Entity ID is required");
            }
            if (isNullOrEmpty(this.currency)) {
                throw new CoinbaseClientException("Currency is required");
            }
        }
    }
}
