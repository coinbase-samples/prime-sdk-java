package com.coinbase.prime.model.allocations;

import com.coinbase.prime.model.common.Pagination;

public class ListPorfolioAllocationsResponse {
    private Allocation[] allocations;
    private Pagination pagination;

    public ListPorfolioAllocationsResponse() {
    }

    public ListPorfolioAllocationsResponse(Builder builder) {
        this.allocations = builder.allocations;
        this.pagination = builder.pagination;
    }

    public Allocation[] getAllocations() {
        return allocations;
    }

    public void setAllocations(Allocation[] allocations) {
        this.allocations = allocations;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public static class Builder {
        private Allocation[] allocations;
        private Pagination pagination;

        public Builder() {
        }

        public Builder allocations(Allocation[] allocations) {
            this.allocations = allocations;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            this.pagination = pagination;
            return this;
        }

        public ListPorfolioAllocationsResponse build() {
            return new ListPorfolioAllocationsResponse(this);
        }
    }
}
