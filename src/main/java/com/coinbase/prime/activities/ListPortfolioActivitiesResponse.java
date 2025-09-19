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

package com.coinbase.prime.activities;

import com.coinbase.prime.model.Activity;
import com.coinbase.prime.model.Pagination;

/**
 * Response object for listing all activities associated with a given portfolio.
 * 
 * Supports filtering by currencies, activity categories, activity statuses, and date ranges.
 */
public class ListPortfolioActivitiesResponse {
    /** List of activities associated with the portfolio */
    private Activity[] activities;
    
    /** Pagination information for the response */
    private Pagination pagination;

    public ListPortfolioActivitiesResponse() {
    }

    public ListPortfolioActivitiesResponse(Builder builder) {
        this.activities = builder.activities;
        this.pagination = builder.pagination;
    }

    public Activity[] getActivities() {
        return activities;
    }

    public void setActivities(Activity[] activities) {
        this.activities = activities;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public static class Builder {
        /** List of activities */
        private Activity[] activities;
        
        /** Pagination information */
        private Pagination pagination;

        public Builder activities(Activity[] activities) {
            this.activities = activities;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            this.pagination = pagination;
            return this;
        }

        public ListPortfolioActivitiesResponse build() {
            return new ListPortfolioActivitiesResponse(this);
        }
    }
}
