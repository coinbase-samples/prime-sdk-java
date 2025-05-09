package com.coinbase.prime.financing;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetMarginInformationRequest {
    @JsonIgnore
    @JsonProperty(required = true, value = "entity_id")
    private String entityId;

    public GetMarginInformationRequest() {
    }

    public GetMarginInformationRequest(Builder builder) {
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

        public Builder() {
        }

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public GetMarginInformationRequest build() {
            return new GetMarginInformationRequest(this);
        }
    }
}
