package com.coinbase.prime.model.balances;

import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.prime.utils.Utils.appendQueryParams;

public class ListPortfolioBalancesRequest {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    private String[] symbols;
    @JsonProperty("balance_type")
    private String balanceType;

    public ListPortfolioBalancesRequest() {
    }

    public ListPortfolioBalancesRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.symbols = builder.symbols;
        this.balanceType = builder.balanceType;
    }

    public String getQueryString() {
        String queryParams = "";
        if (this.getSymbols() != null) {
            for (String symbol : this.getSymbols()) {
                queryParams = appendQueryParams(queryParams, "symbols", symbol);
            }
        }
        if (this.getBalanceType() != null) {
            queryParams = appendQueryParams(queryParams, "balance_type", this.getBalanceType());
        }
        return queryParams;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String[] getSymbols() {
        return symbols;
    }

    public void setSymbols(String[] symbols) {
        this.symbols = symbols;
    }

    public String getBalanceType() {
        return balanceType;
    }

    public void setBalanceType(String balanceType) {
        this.balanceType = balanceType;
    }

    public static class Builder {
        private String portfolioId;
        private String[] symbols;
        private String balanceType;

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder symbols(String[] symbols) {
            this.symbols = symbols;
            return this;
        }

        public Builder balanceType(String balanceType) {
            this.balanceType = balanceType;
            return this;
        }

        public ListPortfolioBalancesRequest build() {
            return new ListPortfolioBalancesRequest(this);
        }
    }
}
