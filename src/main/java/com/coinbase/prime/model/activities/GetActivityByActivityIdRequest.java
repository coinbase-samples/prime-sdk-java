package com.coinbase.prime.model.activities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetActivityByActivityIdRequest {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    @JsonProperty("activity_id")
    private String activityId;

    public GetActivityByActivityIdRequest() {
    }

    public GetActivityByActivityIdRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.activityId = builder.activityId;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public static class Builder {
        private String portfolioId;
        private String activityId;

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder activityId(String activityId) {
            this.activityId = activityId;
            return this;
        }

        public GetActivityByActivityIdRequest build() {
            return new GetActivityByActivityIdRequest(this);
        }
    }
}
