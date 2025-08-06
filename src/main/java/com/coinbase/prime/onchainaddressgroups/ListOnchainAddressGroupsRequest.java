package com.coinbase.prime.onchainaddressgroups;

import com.coinbase.prime.common.PrimeListRequest;
import com.coinbase.prime.model.enums.SortDirection;

/**
 * Request for listing onchain address groups for a portfolio.
 */
public class ListOnchainAddressGroupsRequest extends PrimeListRequest {
    private String portfolioId;

    public ListOnchainAddressGroupsRequest() {
    }

    private ListOnchainAddressGroupsRequest(Builder builder) {
        super(builder.cursor, builder.sortDirection != null ? SortDirection.valueOf(builder.sortDirection) : null, builder.limit);
        this.portfolioId = builder.portfolioId;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getPath() {
        return String.format("/v1/portfolios/%s/onchain_address_groups", this.portfolioId);
    }

    public static class Builder {
        private String portfolioId;
        private String cursor;
        private String sortDirection;
        private Integer limit;

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder sortDirection(String sortDirection) {
            this.sortDirection = sortDirection;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public ListOnchainAddressGroupsRequest build() {
            return new ListOnchainAddressGroupsRequest(this);
        }
    }
}