package com.coinbase.prime.model.activities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Consensus {
    @JsonProperty("approval_deadline")
    private String approvalDeadline;
    @JsonProperty("has_passed_consensus")
    private boolean hasPassedConsensus;

    public Consensus() {
    }

    public Consensus(Builder builder) {
        this.approvalDeadline = builder.approvalDeadline;
        this.hasPassedConsensus = builder.hasPassedConsensus;
    }

    public String getApprovalDeadline() {
        return approvalDeadline;
    }

    public void setApprovalDeadline(String approvalDeadline) {
        this.approvalDeadline = approvalDeadline;
    }

    public boolean isHasPassedConsensus() {
        return hasPassedConsensus;
    }

    public void setHasPassedConsensus(boolean hasPassedConsensus) {
        this.hasPassedConsensus = hasPassedConsensus;
    }

    public static class Builder {
        private String approvalDeadline;
        private boolean hasPassedConsensus;

        public Builder approvalDeadline(String approvalDeadline) {
            this.approvalDeadline = approvalDeadline;
            return this;
        }

        public Builder hasPassedConsensus(boolean hasPassedConsensus) {
            this.hasPassedConsensus = hasPassedConsensus;
            return this;
        }

        public Consensus build() {
            return new Consensus(this);
        }
    }
}
