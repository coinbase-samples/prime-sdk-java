package com.coinbase.prime.model.transactions;

public class GetTransactionByTransactionIdResponse {
    private Transaction transaction;
    private GetTransactionByTransactionIdRequest request;

    public GetTransactionByTransactionIdResponse() {
    }

    public GetTransactionByTransactionIdResponse(Builder builder) {
        this.transaction = builder.transaction;
        this.request = builder.request;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public GetTransactionByTransactionIdRequest getRequest() {
        return request;
    }

    public void setRequest(GetTransactionByTransactionIdRequest request) {
        this.request = request;
    }

    public static class Builder {
        private Transaction transaction;
        private GetTransactionByTransactionIdRequest request;

        public Builder() {
        }

        public Builder transaction(Transaction transaction) {
            this.transaction = transaction;
            return this;
        }

        public Builder request(GetTransactionByTransactionIdRequest request) {
            this.request = request;
            return this;
        }

        public GetTransactionByTransactionIdResponse build() {
            return new GetTransactionByTransactionIdResponse(this);
        }
    }
}
