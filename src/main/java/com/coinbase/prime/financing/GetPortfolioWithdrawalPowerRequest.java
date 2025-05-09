package com.coinbase.prime.financing;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPortfolioWithdrawalPowerRequest {
    @JsonIgnore
    @JsonProperty(required = true, value = "portfolio_id")
    private String portfolioId;

    @JsonProperty(required = true)
    private String symbol;

    public GetPortfolioWithdrawalPowerRequest() {
    }

    public GetPortfolioWithdrawalPowerRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.symbol = builder.symbol;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public static class Builder {
        private String portfolioId;
        private String symbol;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public GetPortfolioWithdrawalPowerRequest build() {
            return new GetPortfolioWithdrawalPowerRequest(this);
        }
    }
}
