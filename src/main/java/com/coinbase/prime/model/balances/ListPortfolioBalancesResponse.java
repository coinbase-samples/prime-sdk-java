package com.coinbase.prime.model.balances;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListPortfolioBalancesResponse {
    private Balance[] balances;
    private BalancesType type;
    @JsonProperty("trading_balances")
    private TotalBalance tradingBalances;
    @JsonProperty("vault_balances")
    private TotalBalance vaultBalances;
    private ListPortfolioBalancesRequest request;

    public ListPortfolioBalancesResponse() {
    }

    public ListPortfolioBalancesResponse(Builder builder) {
        this.balances = builder.balances;
        this.type = builder.type;
        this.tradingBalances = builder.tradingBalances;
        this.vaultBalances = builder.vaultBalances;
        this.request = builder.request;
    }

    public Balance[] getBalances() {
        return balances;
    }

    public void setBalances(Balance[] balances) {
        this.balances = balances;
    }

    public BalancesType getType() {
        return type;
    }

    public void setType(BalancesType type) {
        this.type = type;
    }

    public TotalBalance getTradingBalances() {
        return tradingBalances;
    }

    public void setTradingBalances(TotalBalance tradingBalances) {
        this.tradingBalances = tradingBalances;
    }

    public TotalBalance getVaultBalances() {
        return vaultBalances;
    }

    public void setVaultBalances(TotalBalance vaultBalances) {
        this.vaultBalances = vaultBalances;
    }

    public ListPortfolioBalancesRequest getRequest() {
        return request;
    }

    public void setRequest(ListPortfolioBalancesRequest request) {
        this.request = request;
    }

    public static class Builder {
        private Balance[] balances;
        private BalancesType type;
        private TotalBalance tradingBalances;
        private TotalBalance vaultBalances;
        private ListPortfolioBalancesRequest request;

        public Builder balances(Balance[] balances) {
            this.balances = balances;
            return this;
        }

        public Builder type(BalancesType type) {
            this.type = type;
            return this;
        }

        public Builder tradingBalances(TotalBalance tradingBalances) {
            this.tradingBalances = tradingBalances;
            return this;
        }

        public Builder vaultBalances(TotalBalance vaultBalances) {
            this.vaultBalances = vaultBalances;
            return this;
        }

        public Builder request(ListPortfolioBalancesRequest request) {
            this.request = request;
            return this;
        }

        public ListPortfolioBalancesResponse build() {
            return new ListPortfolioBalancesResponse(this);
        }
    }
}
