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

public class SetAutoSweepRequest {
    @JsonProperty(required = true, value = "entity_id")
    private String entityId;

    @JsonProperty("auto_sweep")
    private boolean autoSweep;

    public SetAutoSweepRequest() {
    }

    public SetAutoSweepRequest(Builder builder) {
        this.entityId = builder.entityId;
        this.autoSweep = builder.autoSweep;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public boolean getAutoSweep() {
        return autoSweep;
    }

    public void setAutoSweep(boolean autoSweep) {
        this.autoSweep = autoSweep;
    }

    public static class Builder {
        private String entityId;
        private boolean autoSweep;

        public Builder() {
        }

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder autoSweep(boolean autoSweep) {
            this.autoSweep = autoSweep;
            return this;
        }

        public SetAutoSweepRequest build() throws CoinbaseClientException {
            this.validate();
            return new SetAutoSweepRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.entityId)) {
                throw new CoinbaseClientException("Entity ID is required");
            }
        }
    }
}
