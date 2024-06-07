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

import com.coinbase.prime.model.common.PaginationParams;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListUsersRequest {
    @JsonProperty("entity_id")
    private String entityId;
    private PaginationParams paginationParams;

    public ListUsersRequest() {
    }

    public ListUsersRequest(Builder builder) {
        this.entityId = builder.entityId;
        this.paginationParams = builder.pagination;
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
        private String entityId;
        private PaginationParams pagination;

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder pagination(PaginationParams pagination) {
            this.pagination = pagination;
            return this;
        }

        public ListUsersRequest build() {
            return new ListUsersRequest(this);
        }
    }
}
