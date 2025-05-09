package com.coinbase.prime.financing;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListMarginCallSummariesRequest {
    @JsonIgnore
    @JsonProperty(required = true, value = "entity_id")
    private String entityId;

    @JsonProperty("start_date")
    private String startDate;

    @JsonProperty("end_date")
    private String endDate;

    public ListMarginCallSummariesRequest() {
    }

    public ListMarginCallSummariesRequest(Builder builder) {
        this.entityId = builder.entityId;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public static class Builder {
        private String entityId;
        private String startDate;
        private String endDate;

        public Builder() {
        }

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public ListMarginCallSummariesRequest build() {
            return new ListMarginCallSummariesRequest(this);
        }
    }
}
