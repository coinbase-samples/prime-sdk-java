package com.coinbase.prime.model.common;

import com.coinbase.prime.utils.Utils;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PaginationParams {
    private String cursor;

    @JsonProperty("sort_direction")
    private String sortDirection;
    private Integer limit;

    public PaginationParams() {}

    public PaginationParams(Builder builder) {
        this.cursor = builder.cursor;
        this.sortDirection = builder.sortDirection;
        this.limit = builder.limit;
    }

    public String generateQueryString(String queryParams) {
        if (this.getCursor() != null) {
            queryParams = Utils.appendQueryParams(queryParams, "cursor", this.getCursor());
        }

        if (this.getSortDirection() != null) {
            queryParams = Utils.appendQueryParams(queryParams, "sort_direction", this.getSortDirection());
        }

        if (this.limit != null) {
            queryParams = Utils.appendQueryParams(queryParams, "limit", this.getLimit().toString());
        }

        return queryParams;
    }

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

    public static class Builder {
        private String cursor;
        private String sortDirection;
        private Integer limit;

        public Builder() {}

        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder sortDirection(String sortDirection) {
            this.sortDirection = sortDirection;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public PaginationParams build() {
            return new PaginationParams(this);
        }
    }
}
