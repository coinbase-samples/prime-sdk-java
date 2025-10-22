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

package com.coinbase.prime.allocations;

import com.coinbase.prime.model.Allocation;
import com.coinbase.prime.common.Pagination;

/**
 * Response object for listing historical allocations for a given portfolio.
 * 
 * Returns paginated list of allocations with optional filtering by products and allocation IDs.
 */
public class GetPortfolioAllocationsResponse {
    /** List of allocations for the portfolio */
    private Allocation[] allocations;
    
    /** Pagination information for the response */
    private Pagination pagination;

    /** The original request that generated this response */
    private GetPortfolioAllocationsRequest request;

    public GetPortfolioAllocationsResponse() {
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

    public GetPortfolioAllocationsRequest getRequest() {
        return request;
    }

    public void setRequest(GetPortfolioAllocationsRequest request) {
        this.request = request;
    }

}
