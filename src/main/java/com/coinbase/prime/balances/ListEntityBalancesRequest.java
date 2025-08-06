package com.coinbase.prime.balances;

import com.coinbase.prime.model.enums.BalanceType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListEntityBalancesRequest {
    @JsonProperty("entity_id")
    @JsonIgnore
    private String entityId;

    @JsonProperty("symbols")
    private String symbols;

    @JsonProperty("cursor")
    private String cursor;

    @JsonProperty("limit")
    private int limit;

    @JsonProperty("aggregation_type")
    private BalanceType aggregationType;

    public ListEntityBalancesRequest() {
    }

    public ListEntityBalancesRequest(Builder builder) {
        this.entityId = builder.entityId;
        this.symbols = builder.symbols;
        this.cursor = builder.cursor;
        this.limit = builder.limit;
        this.aggregationType = builder.aggregationType;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getSymbols() {
        return symbols;
    }

    public void setSymbols(String symbols) {
        this.symbols = symbols;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public BalanceType getAggregationType() {
        return aggregationType;
    }

    public void setAggregationType(BalanceType aggregationType) {
        this.aggregationType = aggregationType;
    }

    public static class Builder {
        private String entityId;
        private String symbols;
        private String cursor;
        private int limit;
        private BalanceType aggregationType;

        public Builder() {
        }

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder symbols(String symbols) {
            this.symbols = symbols;
            return this;
        }

        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder limit(int limit) {
            this.limit = limit;
            return this;
        }

        public Builder aggregationType(BalanceType aggregationType) {
            this.aggregationType = aggregationType;
            return this;
        }

        public ListEntityBalancesRequest build() {
            return new ListEntityBalancesRequest(this);
        }
    }
}
