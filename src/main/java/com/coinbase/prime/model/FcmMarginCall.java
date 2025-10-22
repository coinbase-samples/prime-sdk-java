package com.coinbase.prime.model;

import com.coinbase.prime.model.enums.FcmMarginCallState;
import com.coinbase.prime.model.enums.FcmMarginCallType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Arrays;

public class FCMMarginCall {
    private FcmMarginCallType type;

    private FcmMarginCallState state;

    /**
     * Initial margin call amount to settle
     */
    private String initialAmount;

    /**
     * Remaining margin call amount to settle
     */
    private String remainingAmount;

    /**
     * Business date when the margin call was opened
     */
    private OffsetDateTime businessDate;

    /**
     * The deadline by which the margin call must be satisfied
     */
    private OffsetDateTime cureDeadline;

    public FCMMarginCall() {
    }

    public FCMMarginCall(Builder builder) {
        this.type = builder.type;
        this.state = builder.state;
        this.initialAmount = builder.initialAmount;
        this.remainingAmount = builder.remainingAmount;
        this.businessDate = builder.businessDate;
        this.cureDeadline = builder.cureDeadline;
    }
    public FcmMarginCallType getType() {
        return type;
    }

    public void setType(FcmMarginCallType type) {
        this.type = type;
    }
    public FcmMarginCallState getState() {
        return state;
    }

    public void setState(FcmMarginCallState state) {
        this.state = state;
    }
    public String getInitialAmount() {
        return initialAmount;
    }

    public void setInitialAmount(String initialAmount) {
        this.initialAmount = initialAmount;
    }
    public String getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(String remainingAmount) {
        this.remainingAmount = remainingAmount;
    }
    public OffsetDateTime getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(OffsetDateTime businessDate) {
        this.businessDate = businessDate;
    }
    public OffsetDateTime getCureDeadline() {
        return cureDeadline;
    }

    public void setCureDeadline(OffsetDateTime cureDeadline) {
        this.cureDeadline = cureDeadline;
    }
    public static class Builder {
        private FcmMarginCallType type;

        private FcmMarginCallState state;

        private String initialAmount;

        private String remainingAmount;

        private OffsetDateTime businessDate;

        private OffsetDateTime cureDeadline;

        public Builder type(FcmMarginCallType type) {
            this.type = type;
            return this;
        }

        public Builder state(FcmMarginCallState state) {
            this.state = state;
            return this;
        }

        public Builder initialAmount(String initialAmount) {
            this.initialAmount = initialAmount;
            return this;
        }

        public Builder remainingAmount(String remainingAmount) {
            this.remainingAmount = remainingAmount;
            return this;
        }

        public Builder businessDate(OffsetDateTime businessDate) {
            this.businessDate = businessDate;
            return this;
        }

        public Builder cureDeadline(OffsetDateTime cureDeadline) {
            this.cureDeadline = cureDeadline;
            return this;
        }

        public FCMMarginCall build() {
            return new FCMMarginCall(this);
        }
    }
}

