package com.coinbase.prime.financing;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetTradeFinanceTieredPricingFeesRequest {
    @JsonIgnore
    @JsonProperty(required = true, value = "entity_id")
    private String entityId;

    @JsonProperty("effective_at")
    private String effectiveAt;

    public GetTradeFinanceTieredPricingFeesRequest() {
    }

    public GetTradeFinanceTieredPricingFeesRequest(Builder builder) {
        this.entityId = builder.entityId;
        this.effectiveAt = builder.effectiveAt;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getEffectiveAt() {
        return effectiveAt;
    }

    public void setEffectiveAt(String effectiveAt) {
        this.effectiveAt = effectiveAt;
    }

    public static class Builder {
        private String entityId;
        private String effectiveAt;

        public Builder() {
        }

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder effectiveAt(String effectiveAt) {
            this.effectiveAt = effectiveAt;
            return this;
        }

        public GetTradeFinanceTieredPricingFeesRequest build() {
            return new GetTradeFinanceTieredPricingFeesRequest(this);
        }
    }
}
