package com.coinbase.prime.model.assets;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListAssetsRequest {
    @JsonProperty("entity_id")
    private String entityId;

    public ListAssetsRequest() {
    }

    public ListAssetsRequest(Builder builder) {
        this.entityId = builder.entityId;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public static class Builder {
        private String entityId;

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public ListAssetsRequest build() {
            return new ListAssetsRequest(this);
        }
    }
}
