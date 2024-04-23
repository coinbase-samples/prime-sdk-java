package com.coinbase.prime.model.portfolio;

public class GetPortfolioCreditInformationRequest {
    private String portfolioId;

    public GetPortfolioCreditInformationRequest() {
    }

    public GetPortfolioCreditInformationRequest(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public GetPortfolioCreditInformationRequest(Builder builder) {
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

        public GetPortfolioCreditInformationRequest build() {
            return new GetPortfolioCreditInformationRequest(this);
        }
    }
}
