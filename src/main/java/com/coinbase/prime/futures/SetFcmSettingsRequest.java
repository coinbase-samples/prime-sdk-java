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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;

/**
 * Set FCM Settings
 */
public class SetFcmSettingsRequest {
    @JsonProperty(required = true, value = "entity_id")
    @JsonIgnore
    private String entityId;

    @JsonProperty("target_derivatives_excess")
    private String targetDerivativesExcess;

    public SetFcmSettingsRequest() {
    }

    public SetFcmSettingsRequest(Builder builder) {
        this.entityId = builder.entityId;
        this.targetDerivativesExcess = builder.targetDerivativesExcess;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getTargetDerivativesExcess() {
        return targetDerivativesExcess;
    }

    public void setTargetDerivativesExcess(String targetDerivativesExcess) {
        this.targetDerivativesExcess = targetDerivativesExcess;
    }

    public static class Builder {
        private String entityId;
        private String targetDerivativesExcess;

        public Builder() {
        }

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder targetDerivativesExcess(String targetDerivativesExcess) {
            this.targetDerivativesExcess = targetDerivativesExcess;
            return this;
        }

        public SetFcmSettingsRequest build() throws CoinbaseClientException {
            validate();
            return new SetFcmSettingsRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.entityId)) {
                throw new CoinbaseClientException("EntityId is required");
            }
        }
    }
}
