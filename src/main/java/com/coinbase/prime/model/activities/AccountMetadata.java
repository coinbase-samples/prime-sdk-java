package com.coinbase.prime.model.activities;

public class AccountMetadata {
    private Consensus consensus;

    public AccountMetadata() {
    }

    public AccountMetadata(Builder builder) {
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

        public AccountMetadata build() {
            return new AccountMetadata(this);
        }
    }
}
