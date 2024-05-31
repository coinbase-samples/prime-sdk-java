package com.coinbase.prime.model.transactions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateConversionRequest {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    @JsonProperty("wallet_id")
    private String walletId;
    private String amount;
    private String destination;
    @JsonProperty("idempotency_key")
    private String idempotencyKey;
    @JsonProperty("source_symbol")
    private String sourceSymbol;
    @JsonProperty("destination_symbol")
    private String destinationSymbol;

    public CreateConversionRequest() {
    }

    public CreateConversionRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.walletId = builder.walletId;
        this.amount = builder.amount;
        this.destination = builder.destination;
        this.idempotencyKey = builder.idempotencyKey;
        this.sourceSymbol = builder.sourceSymbol;
        this.destinationSymbol = builder.destinationSymbol;
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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    public void setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
    }

    public String getSourceSymbol() {
        return sourceSymbol;
    }

    public void setSourceSymbol(String sourceSymbol) {
        this.sourceSymbol = sourceSymbol;
    }

    public String getDestinationSymbol() {
        return destinationSymbol;
    }

    public void setDestinationSymbol(String destinationSymbol) {
        this.destinationSymbol = destinationSymbol;
    }

    public static class Builder {
        private String portfolioId;
        private String walletId;
        private String amount;
        private String destination;
        private String idempotencyKey;
        private String sourceSymbol;
        private String destinationSymbol;

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

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder destination(String destination) {
            this.destination = destination;
            return this;
        }

        public Builder idempotencyKey(String idempotencyKey) {
            this.idempotencyKey = idempotencyKey;
            return this;
        }

        public Builder sourceSymbol(String sourceSymbol) {
            this.sourceSymbol = sourceSymbol;
            return this;
        }

        public Builder destinationSymbol(String destinationSymbol) {
            this.destinationSymbol = destinationSymbol;
            return this;
        }

        public CreateConversionRequest build() {
            return new CreateConversionRequest(this);
        }
    }
}
