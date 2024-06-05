/*
 * *
 *  * Copyright 2024-present Coinbase Global, Inc.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *  http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.coinbase.prime.model.activities;

import com.coinbase.prime.model.common.PaginationParams;
import com.coinbase.prime.utils.Utils;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.prime.utils.Utils.appendQueryParams;

public class ListActivitiesRequest {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    private String[] symbols;
    private String[] categories;
    private String[] statuses;
    @JsonProperty("start_time")
    private String startTime;
    @JsonProperty("end_time")
    private String endTime;
    private PaginationParams pagination;

    public ListActivitiesRequest() {
    }

    public ListActivitiesRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.symbols = builder.symbols;
        this.categories = builder.categories;
        this.statuses = builder.statuses;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.pagination = builder.pagination;
    }

    public String getQueryString() {
        String queryParams = "";
        if (this.getSymbols() != null) {
            for (String symbol : this.getSymbols()) {
                queryParams = appendQueryParams(queryParams, "symbols", symbol);
            }
        }
        if (this.getCategories() != null) {
            for (String category : this.getCategories()) {
                queryParams = appendQueryParams(queryParams, "categories", category);
            }
        }
        if (this.getStatuses() != null) {
            for (String status : this.getStatuses()) {
                queryParams = appendQueryParams(queryParams, "statuses", status);
            }
        }
        if (this.getStartTime() != null) {
            queryParams = appendQueryParams(queryParams, "start_time", this.getStartTime());
        }
        if (this.getEndTime() != null) {
            queryParams = appendQueryParams(queryParams, "end_time", this.getEndTime());
        }
        if (this.getPagination() != null) {
            queryParams = this.getPagination().generateQueryString(queryParams);
        }
        return queryParams;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String[] getSymbols() {
        return symbols;
    }

    public void setSymbols(String[] symbols) {
        this.symbols = symbols;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    public String[] getStatuses() {
        return statuses;
    }

    public void setStatuses(String[] statuses) {
        this.statuses = statuses;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public PaginationParams getPagination() {
        return pagination;
    }

    public void setPagination(PaginationParams pagination) {
        this.pagination = pagination;
    }

    public static class Builder {
        private String portfolioId;
        private String[] symbols;
        private String[] categories;
        private String[] statuses;
        private String startTime;
        private String endTime;
        private PaginationParams pagination;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder symbols(String[] symbols) {
            this.symbols = symbols;
            return this;
        }

        public Builder categories(String[] categories) {
            this.categories = categories;
            return this;
        }

        public Builder statuses(String[] statuses) {
            this.statuses = statuses;
            return this;
        }

        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder pagination(PaginationParams pagination) {
            this.pagination = pagination;
            return this;
        }

        public ListActivitiesRequest build() {
            return new ListActivitiesRequest(this);
        }
    }
}
