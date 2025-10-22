package com.coinbase.prime.model;

import com.coinbase.prime.model.FcmFuturesSweepRequestAmount;
import com.coinbase.prime.model.enums.FcmFuturesSweepStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Arrays;

public class FcmFuturesSweep {
    /**
     * Sweep ID
     */
    private String id;

    private FcmFuturesSweepRequestAmount requestedAmount;

    /**
     * Should sweep all
     */
    private Boolean shouldSweepAll;

    private FcmFuturesSweepStatus status;

    /**
     * Scheduled time
     */
    private OffsetDateTime scheduledTime;

    public FcmFuturesSweep() {
    }

    public FcmFuturesSweep(Builder builder) {
        this.id = builder.id;
        this.requestedAmount = builder.requestedAmount;
        this.shouldSweepAll = builder.shouldSweepAll;
        this.status = builder.status;
        this.scheduledTime = builder.scheduledTime;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public FcmFuturesSweepRequestAmount getRequestedAmount() {
        return requestedAmount;
    }

    public void setRequestedAmount(FcmFuturesSweepRequestAmount requestedAmount) {
        this.requestedAmount = requestedAmount;
    }
    public Boolean getShouldSweepAll() {
        return shouldSweepAll;
    }

    public void setShouldSweepAll(Boolean shouldSweepAll) {
        this.shouldSweepAll = shouldSweepAll;
    }
    public FcmFuturesSweepStatus getStatus() {
        return status;
    }

    public void setStatus(FcmFuturesSweepStatus status) {
        this.status = status;
    }
    public OffsetDateTime getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(OffsetDateTime scheduledTime) {
        this.scheduledTime = scheduledTime;
    }
    public static class Builder {
        private String id;

        private FcmFuturesSweepRequestAmount requestedAmount;

        private Boolean shouldSweepAll;

        private FcmFuturesSweepStatus status;

        private OffsetDateTime scheduledTime;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder requestedAmount(FcmFuturesSweepRequestAmount requestedAmount) {
            this.requestedAmount = requestedAmount;
            return this;
        }

        public Builder shouldSweepAll(Boolean shouldSweepAll) {
            this.shouldSweepAll = shouldSweepAll;
            return this;
        }

        public Builder status(FcmFuturesSweepStatus status) {
            this.status = status;
            return this;
        }

        public Builder scheduledTime(OffsetDateTime scheduledTime) {
            this.scheduledTime = scheduledTime;
            return this;
        }

        public FcmFuturesSweep build() {
            return new FcmFuturesSweep(this);
        }
    }
}

