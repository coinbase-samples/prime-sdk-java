package com.coinbase.prime.model.balances;

public class GetWalletBalanceResponse {
    private Balance balance;
    private GetWalletBalanceRequest request;

    public GetWalletBalanceResponse() {
    }

    public GetWalletBalanceResponse(Builder builder) {
        this.balance = builder.balance;
        this.request = builder.request;
    }

    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    public GetWalletBalanceRequest getRequest() {
        return request;
    }

    public void setRequest(GetWalletBalanceRequest request) {
        this.request = request;
    }

    public static class Builder {
        private Balance balance;
        private GetWalletBalanceRequest request;

        public Builder() {
        }

        public Builder balance(Balance balance) {
            this.balance = balance;
            return this;
        }

        public Builder request(GetWalletBalanceRequest request) {
            this.request = request;
            return this;
        }

        public GetWalletBalanceResponse build() {
            return new GetWalletBalanceResponse(this);
        }
    }
}
