package com.coinbase.prime.model.transactions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MatchMetadata {
    @JsonProperty("reference_id")
    private String referenceId;
    @JsonProperty("settlement_date")
    private String settlementDate;

    public MatchMetadata() {
    }

    public MatchMetadata(String referenceId, String settlementDate) {
        this.referenceId = referenceId;
        this.settlementDate = settlementDate;
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

        public Builder() {
        }

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
