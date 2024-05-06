package com.coinbase.prime.model.activities;

public class TransactionsMetadata {
    private Consensus consensus;

    public TransactionsMetadata() {
    }

    public TransactionsMetadata(Builder builder) {
        this.consensus = builder.consensus;
    }

    public Consensus getConsensus() {
        return consensus;
    }

    public void setConsensus(Consensus consensus) {
        this.consensus = consensus;
    }

    public static class Builder {
        private Consensus consensus;

        public Builder consensus(Consensus consensus) {
            this.consensus = consensus;
            return this;
        }

        public TransactionsMetadata build() {
            return new TransactionsMetadata(this);
        }
    }
}
