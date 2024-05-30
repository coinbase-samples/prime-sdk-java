package com.coinbase.prime.model.balances;

import com.coinbase.prime.model.common.Pagination;

public class ListWeb3WalletBalancesResponse {
    private Web3WalletBalance[] balances;
    private Pagination pagination;
    private ListWeb3WalletBalancesRequest request;

    public ListWeb3WalletBalancesResponse() {
    }

    public ListWeb3WalletBalancesResponse(Builder builder) {
        this.balances = builder.balances;
        this.pagination = builder.pagination;
        this.request = builder.request;
    }

    public Web3WalletBalance[] getBalances() {
        return balances;
    }

    public void setBalances(Web3WalletBalance[] balances) {
        this.balances = balances;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public ListWeb3WalletBalancesRequest getRequest() {
        return request;
    }

    public void setRequest(ListWeb3WalletBalancesRequest request) {
        this.request = request;
    }

    public static class Builder {
        private Web3WalletBalance[] balances;
        private Pagination pagination;
        private ListWeb3WalletBalancesRequest request;

        public Builder() {
        }

        public Builder balances(Web3WalletBalance[] balances) {
            this.balances = balances;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            this.pagination = pagination;
            return this;
        }

        public Builder request(ListWeb3WalletBalancesRequest request) {
            this.request = request;
            return this;
        }

        public ListWeb3WalletBalancesResponse build() {
            return new ListWeb3WalletBalancesResponse(this);
        }
    }
}
