package com.coinbase.prime.model.users;

import com.coinbase.prime.model.common.PaginationParams;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListUsersRequest {
    @JsonProperty("entity_id")
    private String entityId;
    private PaginationParams paginationParams;

    public ListUsersRequest() {
    }

    public ListUsersRequest(Builder builder) {
        this.entityId = builder.entityId;
        this.paginationParams = builder.pagination;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public PaginationParams getPaginationParams() {
        return paginationParams;
    }

    public void setPaginationParams(PaginationParams paginationParams) {
        this.paginationParams = paginationParams;
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
