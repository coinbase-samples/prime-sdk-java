package com.coinbase.prime.model.wallets;

public class GetWalletByIdResponse {
    private Wallet wallet;
    private GetWalletByIdRequest request;

    public GetWalletByIdResponse() {}
    public GetWalletByIdResponse(Builder builder) {
        this.wallet = builder.wallet;
        this.request = builder.request;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public GetWalletByIdRequest getRequest() {
        return request;
    }

    public void setRequest(GetWalletByIdRequest request) {
        this.request = request;
    }

    public static class Builder {
        private Wallet wallet;
        private GetWalletByIdRequest request;

        public Builder() {}

        public Builder wallet(Wallet wallet) {
            this.wallet = wallet;
            return this;
        }

        public Builder request(GetWalletByIdRequest request) {
            this.request = request;
            return this;
        }

        public GetWalletByIdResponse build() {
            return new GetWalletByIdResponse(this);
        }
    }
}
