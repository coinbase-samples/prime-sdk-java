package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class CounterpartyDestination {
    private String counterpartyId;

    public CounterpartyDestination() {
    }

    public CounterpartyDestination(Builder builder) {
        this.counterpartyId = builder.counterpartyId;
    }
    public String getCounterpartyId() {
        return counterpartyId;
    }

    public void setCounterpartyId(String counterpartyId) {
        this.counterpartyId = counterpartyId;
    }
    public static class Builder {
        private String counterpartyId;

        public Builder counterpartyId(String counterpartyId) {
            this.counterpartyId = counterpartyId;
            return this;
        }

        public CounterpartyDestination build() {
            return new CounterpartyDestination(this);
        }
    }
}

