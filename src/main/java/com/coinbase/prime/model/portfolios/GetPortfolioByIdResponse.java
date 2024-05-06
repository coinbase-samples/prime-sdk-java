package com.coinbase.prime.model.portfolios;

public class GetPortfolioByIdResponse {
    private Portfolio portfolio;
    private GetPortfolioByIdRequest request;

    public GetPortfolioByIdResponse(Portfolio portfolio, GetPortfolioByIdRequest request) {
        this.portfolio = portfolio;
        this.request = request;
    }

    public GetPortfolioByIdResponse(Builder builder) {
        this.portfolio = builder.portfolio;
        this.request = builder.request;
    }

    public GetPortfolioByIdResponse() {}

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public GetPortfolioByIdRequest getRequest() {
        return request;
    }

    public void setRequest(GetPortfolioByIdRequest request) {
        this.request = request;
    }

    public static class Builder {
        private Portfolio portfolio;
        private GetPortfolioByIdRequest request;

        public Builder() {
        }

        public Builder portfolio(Portfolio portfolio) {
            this.portfolio = portfolio;
            return this;
        }

        public Builder request(GetPortfolioByIdRequest request) {
            this.request = request;
            return this;
        }

        public GetPortfolioByIdResponse build() {
            return new GetPortfolioByIdResponse(this);
        }
    }
}
