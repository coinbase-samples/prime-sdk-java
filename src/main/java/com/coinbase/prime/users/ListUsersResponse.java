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

package com.coinbase.prime.users;

import com.coinbase.prime.model.EntityUser;
import com.coinbase.prime.model.Pagination;

public class ListUsersResponse {
    private EntityUser[] users;
    private Pagination pagination;

    public ListUsersResponse() {
    }

    public ListUsersResponse(Builder builder) {
        this.users = builder.users;
        this.pagination = builder.pagination;
    }

    public EntityUser[] getUsers() {
        return users;
    }

    public void setUsers(EntityUser[] users) {
        this.users = users;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public static class Builder {
        private EntityUser[] users;
        private Pagination pagination;

        public Builder() {
        }

        public Builder users(EntityUser[] users) {
            this.users = users;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            this.pagination = pagination;
            return this;
        }

        public ListUsersResponse build() {
            return new ListUsersResponse(this);
        }
    }
}
