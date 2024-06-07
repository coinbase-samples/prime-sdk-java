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

import com.coinbase.prime.model.common.PaginationParams;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.prime.utils.Utils.appendAllQueryParams;
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
    private PaginationParams paginationParams;

    public ListActivitiesRequest() {
    }

    public ListActivitiesRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.symbols = builder.symbols;
        this.categories = builder.categories;
        this.statuses = builder.statuses;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.paginationParams = builder.paginationParams;
    }

    public String getQueryString() {
        String queryString = this.paginationParams != null ? this.paginationParams.generateQueryString("") : "";
        queryString = appendAllQueryParams(this.symbols, "symbols", queryString);
        queryString = appendAllQueryParams(this.categories, "categories", queryString);
        queryString = appendAllQueryParams(this.statuses, "statuses", queryString);
        queryString = appendQueryParams(queryString, "start_time", this.startTime);
        queryString = appendQueryParams(queryString, "end_time", this.endTime);
        return queryString;
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

    public PaginationParams getPaginationParams() {
        return paginationParams;
    }

    public void setPaginationParams(PaginationParams paginationParams) {
        this.paginationParams = paginationParams;
    }

    public static class Builder {
        private String portfolioId;
        private String[] symbols;
        private String[] categories;
        private String[] statuses;
        private String startTime;
        private String endTime;
        private PaginationParams paginationParams;

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
            this.paginationParams = pagination;
            return this;
        }

        public ListActivitiesRequest build() {
            return new ListActivitiesRequest(this);
        }
    }
}
