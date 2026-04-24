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

package com.coinbase.prime.users;

import com.coinbase.prime.common.Pagination;
import com.coinbase.prime.model.PortfolioUser;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * List Portfolio Users
 */
public class ListPortfolioUsersResponse {
    @JsonProperty("users")
    private PortfolioUser[] users;

    @JsonProperty("pagination")
    private Pagination pagination;

    public ListPortfolioUsersResponse() {
    }

    public PortfolioUser[] getUsers() {
        return users;
    }

    public void setUsers(PortfolioUser[] users) {
        this.users = users;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

}
