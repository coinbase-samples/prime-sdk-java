package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class Counterparty {
    /**
     * The unique counterparty ID for the portfolio
     */
    private String counterpartyId;

    public Counterparty() {
    }

    public Counterparty(Builder builder) {
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

        public Counterparty build() {
            return new Counterparty(this);
        }
    }
}

