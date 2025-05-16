package com.coinbase.prime.positions;

import com.coinbase.prime.model.Pagination;
import com.coinbase.prime.model.Position;

public class ListAggregateEntityPositionsResponse {
    private Position[] positions;

    private Pagination pagination;

    public ListAggregateEntityPositionsResponse() {
    }

    public ListAggregateEntityPositionsResponse(Position[] positions, Pagination pagination) {
        this.positions = positions;
        this.pagination = pagination;
    }

    public ListAggregateEntityPositionsResponse(Builder builder) {
        this.positions = builder.positions;
        this.pagination = builder.pagination;
    }

    public Position[] getPositions() {
        return positions;
    }

    public void setPositions(Position[] positions) {
        this.positions = positions;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public static class Builder {
        private Position[] positions;
        private Pagination pagination;

        public Builder() {
        }

        public Builder withPositions(Position[] positions) {
            this.positions = positions;
            return this;
        }

        public Builder withPagination(Pagination pagination) {
            this.pagination = pagination;
            return this;
        }

        public ListAggregateEntityPositionsResponse build() {
            return new ListAggregateEntityPositionsResponse(this);
        }
    }
}
