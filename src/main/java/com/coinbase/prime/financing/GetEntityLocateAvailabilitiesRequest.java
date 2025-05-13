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

public class GetEntityLocateAvailabilitiesRequest {
    @JsonIgnore
    @JsonProperty(required = true, value = "entity_id")
    private String entityId;

    @JsonProperty("conversion_date")
    private String conversionDate;

    @JsonProperty("locate_date")
    private String locateDate;

    public GetEntityLocateAvailabilitiesRequest() {
    }

    public GetEntityLocateAvailabilitiesRequest(Builder builder) {
        this.entityId = builder.entityId;
        this.conversionDate = builder.conversionDate;
        this.locateDate = builder.locateDate;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getConversionDate() {
        return conversionDate;
    }

    public void setConversionDate(String conversionDate) {
        this.conversionDate = conversionDate;
    }

    public String getLocateDate() {
        return locateDate;
    }

    public void setLocateDate(String locateDate) {
        this.locateDate = locateDate;
    }

    public static class Builder {
        private String entityId;
        private String conversionDate;
        private String locateDate;

        public Builder() {
        }

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder conversionDate(String conversionDate) {
            this.conversionDate = conversionDate;
            return this;
        }

        public Builder locateDate(String locateDate) {
            this.locateDate = locateDate;
            return this;
        }

        public GetEntityLocateAvailabilitiesRequest build() {
            return new GetEntityLocateAvailabilitiesRequest(this);
        }
    }
}
