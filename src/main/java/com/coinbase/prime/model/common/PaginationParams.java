package com.coinbase.prime.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaginationParams {
    private String cursor;

    @JsonProperty("sort_direction")
    private String sortDirection;
    private Integer limit;

    public PaginationParams() {}

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public String getSortDirection() {
        return sortDirection;
    }

    public void setSortDirection(String direction) {
        this.sortDirection = direction;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
