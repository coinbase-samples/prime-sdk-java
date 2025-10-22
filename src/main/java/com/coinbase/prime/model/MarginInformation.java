package com.coinbase.prime.model;

import com.coinbase.prime.model.MarginCallRecord;
import com.coinbase.prime.model.MarginSummary;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MarginInformation {
    /**
     * The current margin call records
     */
    private List<MarginCallRecord> marginCallRecords;

    private MarginSummary marginSummary;

    public MarginInformation() {
    }

    public MarginInformation(Builder builder) {
        this.marginCallRecords = builder.marginCallRecords;
        this.marginSummary = builder.marginSummary;
    }
    public List<MarginCallRecord> getMarginCallRecords() {
        return marginCallRecords;
    }

    public void setMarginCallRecords(List<MarginCallRecord> marginCallRecords) {
        this.marginCallRecords = marginCallRecords;
    }
    public MarginSummary getMarginSummary() {
        return marginSummary;
    }

    public void setMarginSummary(MarginSummary marginSummary) {
        this.marginSummary = marginSummary;
    }
    public static class Builder {
        private List<MarginCallRecord> marginCallRecords;

        private MarginSummary marginSummary;

        public Builder marginCallRecords(List<MarginCallRecord> marginCallRecords) {
            this.marginCallRecords = marginCallRecords;
            return this;
        }

        public Builder marginSummary(MarginSummary marginSummary) {
            this.marginSummary = marginSummary;
            return this;
        }

        public MarginInformation build() {
            return new MarginInformation(this);
        }
    }
}

