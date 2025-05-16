package com.coinbase.prime.positions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListEntityPositionsRequest {
    @JsonProperty("entity_id")
    private String entityId;

    private String cursor;
    private Integer limit;

    public ListEntityPositionsRequest() {
    }

    public ListEntityPositionsRequest(Builder builder) {
        this.entityId = builder.entityId;
        this.cursor = builder.cursor;
        this.limit = builder.limit;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public static class Builder {
        private String entityId;
        private String cursor;
        private Integer limit;

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public ListEntityPositionsRequest build() {
            return new ListEntityPositionsRequest(this);
        }
    }
}
