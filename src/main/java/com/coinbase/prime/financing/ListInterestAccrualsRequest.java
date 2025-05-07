package com.coinbase.prime.financing;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListInterestAccrualsRequest {
    @JsonIgnore
    @JsonProperty(required = true, value = "entity_id")
    private String entityId;

    @JsonProperty("portfolio_id")
    private String portfolioId;

    @JsonProperty("start_date")
    private String startDate;

    @JsonProperty("end_date")
    private String endDate;

    public ListInterestAccrualsRequest() {
    }

    public ListInterestAccrualsRequest(Builder builder) {
        this.entityId = builder.entityId;
        this.portfolioId = builder.portfolioId;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
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
        private String portfolioId;
        private String startDate;
        private String endDate;

        public Builder() {
        }

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
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

        public ListInterestAccrualsRequest build() {
            return new ListInterestAccrualsRequest(this);
        }
    }
}
