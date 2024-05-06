package com.coinbase.prime.model.users;

import com.coinbase.prime.model.common.PaginationParams;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListUsersRequest {
    @JsonProperty("entity_id")
    private String entityId;
    private PaginationParams pagination;

    public ListUsersRequest() {
    }

    public ListUsersRequest(Builder builder) {
        this.entityId = builder.entityId;
        this.pagination = builder.pagination;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public PaginationParams getPagination() {
        return pagination;
    }

    public void setPagination(PaginationParams pagination) {
        this.pagination = pagination;
    }

    public static class Builder {
        private String entityId;
        private PaginationParams pagination;

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder pagination(PaginationParams pagination) {
            this.pagination = pagination;
            return this;
        }

        public ListUsersRequest build() {
            return new ListUsersRequest(this);
        }
    }
}
