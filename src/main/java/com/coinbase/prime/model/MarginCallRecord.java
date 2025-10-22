package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class MarginCallRecord {
    /**
     * The unique ID of the margin call
     */
    private String marginCallId;

    /**
     * The initial margin call amount in notional value
     */
    private String initialNotionalAmount;

    /**
     * The outstanding margin call amount in notional value
     */
    private String outstandingNotionalAmount;

    /**
     * The time the margin call is created in RFC3330 format
     */
    private String createdAt;

    /**
     * The time the margin call is due in RFC3339 format
     */
    private String dueAt;

    public MarginCallRecord() {
    }

    public MarginCallRecord(Builder builder) {
        this.marginCallId = builder.marginCallId;
        this.initialNotionalAmount = builder.initialNotionalAmount;
        this.outstandingNotionalAmount = builder.outstandingNotionalAmount;
        this.createdAt = builder.createdAt;
        this.dueAt = builder.dueAt;
    }
    public String getMarginCallId() {
        return marginCallId;
    }

    public void setMarginCallId(String marginCallId) {
        this.marginCallId = marginCallId;
    }
    public String getInitialNotionalAmount() {
        return initialNotionalAmount;
    }

    public void setInitialNotionalAmount(String initialNotionalAmount) {
        this.initialNotionalAmount = initialNotionalAmount;
    }
    public String getOutstandingNotionalAmount() {
        return outstandingNotionalAmount;
    }

    public void setOutstandingNotionalAmount(String outstandingNotionalAmount) {
        this.outstandingNotionalAmount = outstandingNotionalAmount;
    }
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    public String getDueAt() {
        return dueAt;
    }

    public void setDueAt(String dueAt) {
        this.dueAt = dueAt;
    }
    public static class Builder {
        private String marginCallId;

        private String initialNotionalAmount;

        private String outstandingNotionalAmount;

        private String createdAt;

        private String dueAt;

        public Builder marginCallId(String marginCallId) {
            this.marginCallId = marginCallId;
            return this;
        }

        public Builder initialNotionalAmount(String initialNotionalAmount) {
            this.initialNotionalAmount = initialNotionalAmount;
            return this;
        }

        public Builder outstandingNotionalAmount(String outstandingNotionalAmount) {
            this.outstandingNotionalAmount = outstandingNotionalAmount;
            return this;
        }

        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder dueAt(String dueAt) {
            this.dueAt = dueAt;
            return this;
        }

        public MarginCallRecord build() {
            return new MarginCallRecord(this);
        }
    }
}

