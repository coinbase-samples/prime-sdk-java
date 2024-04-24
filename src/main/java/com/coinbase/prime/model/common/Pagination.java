package com.coinbase.prime.model.common;

import com.coinbase.prime.utils.Utils;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Pagination {
    @JsonProperty("next_cursor")
    private String nextCursor;

    @JsonProperty("sort_direction")
    private String sortDirection;

    @JsonProperty("has_next")
    private boolean hasNext;

    public Pagination() {}

    public Pagination(Builder builder) {
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

    public String getSortDirection() {
        return sortDirection;
    }

    public void setSortDirection(String sortDirection) {
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
        private String sortDirection;
        private boolean hasNext;

        public Builder() {}

        public Builder nextCursor(String nextCursor) {
            this.nextCursor = nextCursor;
            return this;
        }

        public Builder sortDirection(String sortDirection) {
            this.sortDirection = sortDirection;
            return this;
        }

        public Builder hasNext(boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }

        public Pagination build() {
            return new Pagination(this);
        }
    }
}
