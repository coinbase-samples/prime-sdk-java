package com.coinbase.prime.model.balances;

import com.coinbase.prime.model.common.PaginationParams;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.prime.utils.Utils.appendQueryParams;

public class ListWeb3WalletBalancesRequest {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    @JsonProperty("wallet_id")
    private String walletId;
    @JsonProperty("visibility_statuses")
    private VisibilityStatus[] visibilityStatuses;
    private PaginationParams paginationParams;

    public ListWeb3WalletBalancesRequest() {
    }

    public ListWeb3WalletBalancesRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.walletId = builder.walletId;
        this.visibilityStatuses = builder.visibilityStatuses;
        this.paginationParams = builder.paginationParams;
    }

    public String getQueryString() {
        String queryParams = "";
        if (this.getVisibilityStatuses() != null) {
            for (VisibilityStatus visibilityStatus : this.visibilityStatuses) {
                queryParams = appendQueryParams(queryParams, "visibility_statuses", visibilityStatus.toString());
            }
        }
        if (this.getPaginationParams() != null) {
            queryParams = this.getPaginationParams().generateQueryString(queryParams);
        }
        return queryParams;
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

    public VisibilityStatus[] getVisibilityStatuses() {
        return visibilityStatuses;
    }

    public void setVisibilityStatuses(VisibilityStatus[] visibilityStatuses) {
        this.visibilityStatuses = visibilityStatuses;
    }

    public PaginationParams getPaginationParams() {
        return paginationParams;
    }

    public void setPaginationParams(PaginationParams paginationParams) {
        this.paginationParams = paginationParams;
    }

    public static class Builder {
        private String portfolioId;
        private String walletId;
        private VisibilityStatus[] visibilityStatuses;
        private PaginationParams paginationParams;

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

        public Builder visibilityStatuses(VisibilityStatus[] visibilityStatuses) {
            this.visibilityStatuses = visibilityStatuses;
            return this;
        }

        public Builder paginationParams(PaginationParams paginationParams) {
            this.paginationParams = paginationParams;
            return this;
        }

        public ListWeb3WalletBalancesRequest build() {
            return new ListWeb3WalletBalancesRequest(this);
        }
    }
}
