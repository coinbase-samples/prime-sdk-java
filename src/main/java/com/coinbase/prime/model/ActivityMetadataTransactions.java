package com.coinbase.prime.model;

import com.coinbase.prime.model.ActivityMetadataConsensus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class ActivityMetadataTransactions {
    private ActivityMetadataConsensus consensus;

    public ActivityMetadataTransactions() {
    }

    public ActivityMetadataTransactions(Builder builder) {
        this.consensus = builder.consensus;
    }
    public ActivityMetadataConsensus getConsensus() {
        return consensus;
    }

    public void setConsensus(ActivityMetadataConsensus consensus) {
        this.consensus = consensus;
    }
    public static class Builder {
        private ActivityMetadataConsensus consensus;

        public Builder consensus(ActivityMetadataConsensus consensus) {
            this.consensus = consensus;
            return this;
        }

        public ActivityMetadataTransactions build() {
            return new ActivityMetadataTransactions(this);
        }
    }
}

