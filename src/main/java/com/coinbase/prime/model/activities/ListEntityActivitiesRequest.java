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

package com.coinbase.prime.model.activities;

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.common.PrimeListRequest;
import com.coinbase.prime.model.common.Pagination;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;

public class ListEntityActivitiesRequest extends PrimeListRequest {
    @JsonProperty(required = true, value = "entity_id")
    @JsonIgnore
    private String entityId;
    private String[] symbols;
    private String[] categories;
    private String[] statuses;
    @JsonProperty("start_time")
    private String startTime;
    @JsonProperty("end_time")
    private String endTime;

    public ListEntityActivitiesRequest(String entityId) {
        this.entityId = entityId;
    }

    public ListEntityActivitiesRequest(Builder builder) {
        super(builder.cursor, builder.sortDirection, builder.limit);
        this.entityId = builder.entityId;
        this.symbols = builder.symbols;
        this.categories = builder.categories;
        this.statuses = builder.statuses;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
    }

    public String getEntityId() {
        return this.entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String[] getSymbols() {
        return this.symbols;
    }

    public void setSymbols(String[] symbols) {
        this.symbols = symbols;
    }

    public String[] getCategories() {
        return this.categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    public String[] getStatuses() {
        return this.statuses;
    }

    public void setStatuses(String[] statuses) {
        this.statuses = statuses;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public static class Builder {
        private final String entityId;
        private String[] symbols;
        private String[] categories;
        private String[] statuses;
        private String startTime;
        private String endTime;
        private String cursor;
        private String sortDirection;
        private Integer limit;

        public Builder(String entityId) {
            this.entityId = entityId;
        }

        public ListEntityActivitiesRequest.Builder symbols(String[] symbols) {
            this.symbols = symbols;
            return this;
        }

        public ListEntityActivitiesRequest.Builder categories(String[] categories) {
            this.categories = categories;
            return this;
        }

        public ListEntityActivitiesRequest.Builder statuses(String[] statuses) {
            this.statuses = statuses;
            return this;
        }

        public ListEntityActivitiesRequest.Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public ListEntityActivitiesRequest.Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        public ListEntityActivitiesRequest.Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public ListEntityActivitiesRequest.Builder pagination(Pagination pagination) {
            this.cursor = pagination.getNextCursor();
            this.sortDirection = pagination.getSortDirection();
            return this;
        }

        public ListEntityActivitiesRequest build() throws CoinbaseClientException {
            this.validate();
            return new ListEntityActivitiesRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.entityId)) {
                throw new CoinbaseClientException("PortfolioId is required");
            }
        }
    }
}
