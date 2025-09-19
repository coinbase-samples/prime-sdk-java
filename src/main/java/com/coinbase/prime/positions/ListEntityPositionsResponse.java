/*
 * Copyright 2025-present Coinbase Global, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.coinbase.prime.positions;

import com.coinbase.prime.model.Pagination;
import com.coinbase.prime.model.Position;

/**
 * Response object for listing positions for a specific entity.
 */
public class ListEntityPositionsResponse {
    /** Array of position information for the entity */
    private Position[] positions;

    /** Pagination information for the response */
    private Pagination pagination;

    public ListEntityPositionsResponse() {
    }

    public ListEntityPositionsResponse(Position[] positions, Pagination pagination) {
        this.positions = positions;
        this.pagination = pagination;
    }

    public ListEntityPositionsResponse(Builder builder) {
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

        public ListEntityPositionsResponse build() {
            return new ListEntityPositionsResponse(this);
        }
    }
}
