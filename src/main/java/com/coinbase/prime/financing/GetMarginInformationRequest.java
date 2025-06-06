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

package com.coinbase.prime.financing;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetMarginInformationRequest {
    @JsonIgnore
    @JsonProperty(required = true, value = "entity_id")
    private String entityId;

    public GetMarginInformationRequest() {
    }

    public GetMarginInformationRequest(Builder builder) {
        this.entityId = builder.entityId;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public static class Builder {
        private String entityId;

        public Builder() {
        }

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public GetMarginInformationRequest build() {
            return new GetMarginInformationRequest(this);
        }
    }
}
