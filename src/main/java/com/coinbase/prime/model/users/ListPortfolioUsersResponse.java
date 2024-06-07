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

import com.coinbase.prime.model.common.Pagination;

public class ListPortfolioUsersResponse {
    private User[] users;
    private Pagination pagination;
    private ListPortfolioUsersRequest request;

    public ListPortfolioUsersResponse() {
    }

    public ListPortfolioUsersResponse(Builder builder) {
        this.users = builder.users;
        this.pagination = builder.pagination;
        this.request = builder.request;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public ListPortfolioUsersRequest getRequest() {
        return request;
    }

    public void setRequest(ListPortfolioUsersRequest request) {
        this.request = request;
    }

    public static class Builder {
        private User[] users;
        private Pagination pagination;
        private ListPortfolioUsersRequest request;

        public Builder() {
        }

        public Builder users(User[] users) {
            this.users = users;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            this.pagination = pagination;
            return this;
        }

        public Builder request(ListPortfolioUsersRequest request) {
            this.request = request;
            return this;
        }

        public ListPortfolioUsersResponse build() {
            return new ListPortfolioUsersResponse(this);
        }
    }
}
