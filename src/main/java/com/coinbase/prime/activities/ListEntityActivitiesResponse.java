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
 * Response object for listing all activities associated with a given entity.
 * 
 * Supports filtering by activity level (portfolio, entity, or all) and various criteria.
 */
public class ListEntityActivitiesResponse {
    /** List of activities associated with the entity */
    private Activity[] activities;
    
    /** Pagination information for the response */
    private Pagination pagination;

    public ListEntityActivitiesResponse() {
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

}
