package com.coinbase.prime.model.transactions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetTransactionByTransactionIdRequest {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    @JsonProperty("transaction_id")
    private String transactionId;

    public GetTransactionByTransactionIdRequest() {
    }

    public GetTransactionByTransactionIdRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.transactionId = builder.transactionId;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public static class Builder {
        private String portfolioId;
        private String transactionId;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder transactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        public GetTransactionByTransactionIdRequest build() {
            return new GetTransactionByTransactionIdRequest(this);
        }
    }
}
