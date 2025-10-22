package com.coinbase.prime.model;

import com.coinbase.prime.model.MatchMetadata;
import com.coinbase.prime.model.OnchainTransactionMetadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class TransactionMetadata {
    private MatchMetadata matchMetadata;

    private OnchainTransactionMetadata onchainTransactionMetadata;

    public TransactionMetadata() {
    }

    public TransactionMetadata(Builder builder) {
        this.matchMetadata = builder.matchMetadata;
        this.onchainTransactionMetadata = builder.onchainTransactionMetadata;
    }
    public MatchMetadata getMatchMetadata() {
        return matchMetadata;
    }

    public void setMatchMetadata(MatchMetadata matchMetadata) {
        this.matchMetadata = matchMetadata;
    }
    public OnchainTransactionMetadata getWeb3TransactionMetadata() {
        return onchainTransactionMetadata;
    }

    public void setWeb3TransactionMetadata(OnchainTransactionMetadata onchainTransactionMetadata) {
        this.onchainTransactionMetadata = onchainTransactionMetadata;
    }
    public static class Builder {
        private MatchMetadata matchMetadata;

        private OnchainTransactionMetadata onchainTransactionMetadata;

        public Builder matchMetadata(MatchMetadata matchMetadata) {
            this.matchMetadata = matchMetadata;
            return this;
        }

        public Builder onchainTransactionMetadata(OnchainTransactionMetadata onchainTransactionMetadata) {
            this.onchainTransactionMetadata = onchainTransactionMetadata;
            return this;
        }

        public TransactionMetadata build() {
            return new TransactionMetadata(this);
        }
    }
}

