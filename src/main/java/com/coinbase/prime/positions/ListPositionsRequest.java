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

package com.coinbase.prime.positions;

import com.coinbase.prime.common.PrimeListRequest;
import com.coinbase.prime.model.enums.SortDirection;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.coinbase.core.errors.CoinbaseClientException;
import static com.coinbase.core.utils.Utils.isNullOrEmpty;

public class ListPositionsRequest extends PrimeListRequest {
    @JsonProperty("entity_id")
    @JsonIgnore
    private String entityId;

    public ListPositionsRequest() {
    }

    public ListPositionsRequest(Builder builder) {
        super(builder.cursor, builder.sortDirection, builder.limit);
        this.entityId = builder.entityId;
    }

    public String getId() {
        return entityId;
    }

    public void setId(String entityId) {
        this.entityId = entityId;
    }

    public static class Builder {
        private String entityId;
        private String cursor;
        private Integer limit;
        private SortDirection sortDirection;

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder sortDirection(SortDirection sortDirection) {
            this.sortDirection = sortDirection;
            return this;
        }

        public ListPositionsRequest build() {
            this.validate();
            return new ListPositionsRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.entityId)) {
                throw new CoinbaseClientException("EntityId is required");
            }
        }
    }
}
