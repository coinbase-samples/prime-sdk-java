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

package com.coinbase.prime.common;

import com.coinbase.prime.model.enums.SortDirection;
import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class PrimeListRequest {
    private String cursor;

    @JsonProperty("sort_direction")
    private SortDirection sortDirection;
    private Integer limit;

    public PrimeListRequest(String cursor, SortDirection sortDirection, Integer limit) {
        this.cursor = cursor;
        this.sortDirection = sortDirection;
        this.limit = limit;
    }

    public PrimeListRequest() {
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public SortDirection getSortDirection() {
        return sortDirection;
    }

    public void setSortDirection(SortDirection direction) {
        this.sortDirection = direction;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
