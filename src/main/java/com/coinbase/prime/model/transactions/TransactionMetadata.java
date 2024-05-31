package com.coinbase.prime.model.transactions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionMetadata {
    @JsonProperty("match_metadata")
    private MatchMetadata matchMetadata;

    public TransactionMetadata() {
    }

    public TransactionMetadata(MatchMetadata matchMetadata) {
        this.matchMetadata = matchMetadata;
    }

    public TransactionMetadata(Builder builder) {
        this.matchMetadata = builder.matchMetadata;
    }

    public MatchMetadata getMatchMetadata() {
        return matchMetadata;
    }

    public void setMatchMetadata(MatchMetadata matchMetadata) {
        this.matchMetadata = matchMetadata;
    }

    public static class Builder {
        private MatchMetadata matchMetadata;

        public Builder() {
        }

        public Builder matchMetadata(MatchMetadata matchMetadata) {
            this.matchMetadata = matchMetadata;
            return this;
        }

        public TransactionMetadata build() {
            return new TransactionMetadata(this);
        }
    }
}
