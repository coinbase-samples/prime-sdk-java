package com.coinbase.prime.activities;

import com.coinbase.prime.common.PrimeListRequest;

/**
 * Request for getting a portfolio activity by activity ID.
 */
public class GetPortfolioActivityRequest extends PrimeListRequest {
    private String portfolioId;
    private String activityId;

    public GetPortfolioActivityRequest() {
    }

    private GetPortfolioActivityRequest(Builder builder) {
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

    public String getPath() {
        return String.format("/v1/portfolios/%s/activities/%s", this.portfolioId, this.activityId);
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

        public GetPortfolioActivityRequest build() {
            return new GetPortfolioActivityRequest(this);
        }
    }
}