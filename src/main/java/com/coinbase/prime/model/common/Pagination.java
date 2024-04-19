package com.coinbase.prime.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pagination {
    @JsonProperty("next_cursor")
    private String nextCursor;

    @JsonProperty("sort_direction")
    private String sortDirection;

    @JsonProperty("has_next")
    private boolean hasNext;

    public Pagination() {}

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
}
