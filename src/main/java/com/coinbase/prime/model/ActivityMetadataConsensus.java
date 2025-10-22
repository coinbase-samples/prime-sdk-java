package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class ActivityMetadataConsensus {
    /**
     * Deadline for approval of an activity
     */
    private String approvalDeadline;

    /**
     * If activity has passed consensus threshold
     */
    private Boolean hasPassedConsensus;

    public ActivityMetadataConsensus() {
    }

    public ActivityMetadataConsensus(Builder builder) {
        this.approvalDeadline = builder.approvalDeadline;
        this.hasPassedConsensus = builder.hasPassedConsensus;
    }
    public String getApprovalDeadline() {
        return approvalDeadline;
    }

    public void setApprovalDeadline(String approvalDeadline) {
        this.approvalDeadline = approvalDeadline;
    }
    public Boolean getHasPassedConsensus() {
        return hasPassedConsensus;
    }

    public void setHasPassedConsensus(Boolean hasPassedConsensus) {
        this.hasPassedConsensus = hasPassedConsensus;
    }
    public static class Builder {
        private String approvalDeadline;

        private Boolean hasPassedConsensus;

        public Builder approvalDeadline(String approvalDeadline) {
            this.approvalDeadline = approvalDeadline;
            return this;
        }

        public Builder hasPassedConsensus(Boolean hasPassedConsensus) {
            this.hasPassedConsensus = hasPassedConsensus;
            return this;
        }

        public ActivityMetadataConsensus build() {
            return new ActivityMetadataConsensus(this);
        }
    }
}

