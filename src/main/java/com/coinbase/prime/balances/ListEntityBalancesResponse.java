package com.coinbase.prime.balances;

import com.coinbase.prime.model.EntityBalance;
import com.coinbase.prime.model.Pagination;

public class ListEntityBalancesResponse {
    private EntityBalance[] balances;

    private Pagination pagination;

    public ListEntityBalancesResponse() {
    }

    public ListEntityBalancesResponse(EntityBalance[] balances, Pagination pagination) {
        this.balances = balances;
        this.pagination = pagination;
    }

    public ListEntityBalancesResponse(Builder builder) {
        this.balances = builder.balances;
        this.pagination = builder.pagination;
    }

    public EntityBalance[] getBalances() {
        return balances;
    }

    public void setBalances(EntityBalance[] balances) {
        this.balances = balances;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public static class Builder {
        private EntityBalance[] balances;
        private Pagination pagination;

        public Builder() {
        }

        public Builder balances(EntityBalance[] balances) {
            this.balances = balances;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            this.pagination = pagination;
            return this;
        }

        public ListEntityBalancesResponse build() {
            return new ListEntityBalancesResponse(this);
        }
    }
}
