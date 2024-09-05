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

package com.coinbase.prime.model.users;

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.core.http.CoinbaseGetRequest;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;

public class ListUsersRequest extends CoinbaseGetRequest {
    @JsonProperty(required = true, value = "entity_id")
    private String entityId;
    private PaginationParams paginationParams;

    public ListUsersRequest() {
    }

    public ListUsersRequest(Builder builder) {
        this.entityId = builder.entityId;
        this.paginationParams = builder.pagination;
    }

    @Override
    public String getQueryString() {
        if (this.getPaginationParams() == null) {
            return "";
        }

        return this.getPaginationParams().generateQueryString("");
    }

    @Override
    public String getPath() {
        return String.format("/entities/%s/users", this.getEntityId());
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public PaginationParams getPaginationParams() {
        return paginationParams;
    }

    public void setPaginationParams(PaginationParams paginationParams) {
        this.paginationParams = paginationParams;
    }

    public static class Builder {
        private final String entityId;
        private PaginationParams pagination;

        public Builder(String entityId) {
            this.entityId = entityId;
        }

        public Builder pagination(PaginationParams pagination) {
            this.pagination = pagination;
            return this;
        }

        public ListUsersRequest build() throws CoinbaseClientException {
            this.validate();
            return new ListUsersRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.entityId)) {
                throw new CoinbaseClientException("EntityId is required");
            }
        }
    }
}
