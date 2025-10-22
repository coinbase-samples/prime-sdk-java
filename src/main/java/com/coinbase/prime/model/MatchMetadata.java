package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class MatchMetadata {
    /**
     * The reference id of the match
     */
    private String referenceId;

    /**
     * The settlement date of the match
     */
    private String settlementDate;

    public MatchMetadata() {
    }

    public MatchMetadata(Builder builder) {
        this.referenceId = builder.referenceId;
        this.settlementDate = builder.settlementDate;
    }
    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }
    public String getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(String settlementDate) {
        this.settlementDate = settlementDate;
    }
    public static class Builder {
        private String referenceId;

        private String settlementDate;

        public Builder referenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }

        public Builder settlementDate(String settlementDate) {
            this.settlementDate = settlementDate;
            return this;
        }

        public MatchMetadata build() {
            return new MatchMetadata(this);
        }
    }
}

