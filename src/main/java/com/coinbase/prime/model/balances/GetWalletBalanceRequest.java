package com.coinbase.prime.model.balances;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetWalletBalanceRequest {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    @JsonProperty("wallet_id")
    private String walletId;

    public GetWalletBalanceRequest() {
    }

    public GetWalletBalanceRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.walletId = builder.walletId;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public static class Builder {
        private String portfolioId;
        private String walletId;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder walletId(String walletId) {
            this.walletId = walletId;
            return this;
        }

        public GetWalletBalanceRequest build() {
            return new GetWalletBalanceRequest(this);
        }
    }
}
