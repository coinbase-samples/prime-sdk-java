package com.coinbase.prime.model.portfolio;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostTradeCredit {
    @JsonProperty("portfolio_id")
    private String portfolioId;

    public String getPortfolioId() {
        return this.portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }
}
