package com.coinbase.prime.model.portfolios;

public class GetPortfolioByIdRequest {
    private String portfolioId;

    public GetPortfolioByIdRequest() {
    }

    public GetPortfolioByIdRequest(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public GetPortfolioByIdRequest(Builder builder) {
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

        public GetPortfolioByIdRequest build() {
            return new GetPortfolioByIdRequest(this);
        }
    }
}
