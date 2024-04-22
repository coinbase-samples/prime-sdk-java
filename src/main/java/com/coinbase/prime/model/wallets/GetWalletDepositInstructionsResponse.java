package com.coinbase.prime.model.wallets;

public class GetWalletDepositInstructionsResponse {
    CryptoDepositInstructions cryptoDepositInstructions;
    FiatDepositInstructions fiatDepositInstructions;
    GetWalletDepositInstructionsRequest request;

    public GetWalletDepositInstructionsResponse() {
    }

    public GetWalletDepositInstructionsResponse(Builder builder) {
        this.cryptoDepositInstructions = builder.cryptoDepositInstructions;
        this.fiatDepositInstructions = builder.fiatDepositInstructions;
        this.request = builder.request;
    }

    public CryptoDepositInstructions getCryptoDepositInstructions() {
        return cryptoDepositInstructions;
    }

    public void setCryptoDepositInstructions(CryptoDepositInstructions cryptoDepositInstructions) {
        this.cryptoDepositInstructions = cryptoDepositInstructions;
    }

    public FiatDepositInstructions getFiatDepositInstructions() {
        return fiatDepositInstructions;
    }

    public void setFiatDepositInstructions(FiatDepositInstructions fiatDepositInstructions) {
        this.fiatDepositInstructions = fiatDepositInstructions;
    }

    public GetWalletDepositInstructionsRequest getRequest() {
        return request;
    }

    public void setRequest(GetWalletDepositInstructionsRequest request) {
        this.request = request;
    }

    public static class Builder {
        private CryptoDepositInstructions cryptoDepositInstructions;
        private FiatDepositInstructions fiatDepositInstructions;
        private GetWalletDepositInstructionsRequest request;

        public Builder() {
        }

        public Builder cryptoDepositInstructions(CryptoDepositInstructions cryptoDepositInstructions) {
            this.cryptoDepositInstructions = cryptoDepositInstructions;
            return this;
        }

        public Builder fiatDepositInstructions(FiatDepositInstructions fiatDepositInstructions) {
            this.fiatDepositInstructions = fiatDepositInstructions;
            return this;
        }

        public Builder request(GetWalletDepositInstructionsRequest request) {
            this.request = request;
            return this;
        }

        public GetWalletDepositInstructionsResponse build() {
            return new GetWalletDepositInstructionsResponse(this);
        }
    }
}
