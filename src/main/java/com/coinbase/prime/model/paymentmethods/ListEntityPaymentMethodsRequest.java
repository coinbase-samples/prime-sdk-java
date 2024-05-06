package com.coinbase.prime.model.paymentmethods;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListEntityPaymentMethodsRequest {
    @JsonProperty("entity_id")
    private String entityId;

    public ListEntityPaymentMethodsRequest() {
    }

    public ListEntityPaymentMethodsRequest(Builder builder) {
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

        public ListEntityPaymentMethodsRequest build() {
            return new ListEntityPaymentMethodsRequest(this);
        }
    }
}
