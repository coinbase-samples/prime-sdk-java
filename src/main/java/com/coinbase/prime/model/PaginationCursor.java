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

package com.coinbase.prime.model;

import com.coinbase.prime.model.enums.SortDirection;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PaginationCursor {
    /** Cursor to navigate to next page */
    @JsonProperty("next_cursor")
    private String nextCursor;
    
    @JsonProperty("sort_direction")
    private SortDirection sortDirection;
    
    /** A boolean value indicating whether there are more items to */
    @JsonProperty("has_next")
    private boolean hasNext;

    public PaginationCursor() {
    }

    public PaginationCursor(Builder builder) {
        this.nextCursor = builder.nextCursor;
        this.sortDirection = builder.sortDirection;
        this.hasNext = builder.hasNext;
    }

    public String getNextCursor() {
        return nextCursor;
    }

    public void setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
    }

    public SortDirection getSortDirection() {
        return sortDirection;
    }

    public void setSortDirection(SortDirection sortDirection) {
        this.sortDirection = sortDirection;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    public static class Builder {
        private String nextCursor;
        private SortDirection sortDirection;
        private boolean hasNext;

        public Builder nextCursor(String nextCursor) {
            this.nextCursor = nextCursor;
            return this;
        }

        public Builder sortDirection(SortDirection sortDirection) {
            this.sortDirection = sortDirection;
            return this;
        }

        public Builder hasNext(boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }

        public PaginationCursor build() {
            return new PaginationCursor(this);
        }
    }
}