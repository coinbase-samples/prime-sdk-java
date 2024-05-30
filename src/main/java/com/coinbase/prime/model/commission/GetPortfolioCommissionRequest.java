package com.coinbase.prime.model.commission;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPortfolioCommissionRequest {
    @JsonProperty("portfolio_id")
    private String portfolioId;

    public GetPortfolioCommissionRequest() {
    }

    public GetPortfolioCommissionRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public static class Builder {
        private String portfolioId;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public GetPortfolioCommissionRequest build() {
            return new GetPortfolioCommissionRequest(this);
        }
    }
}
