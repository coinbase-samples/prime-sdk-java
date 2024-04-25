package com.coinbase.prime.model.wallets;

import com.coinbase.prime.model.common.PaginationParams;
import com.coinbase.prime.utils.Utils;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.prime.utils.Utils.appendQueryParams;

public class ListWalletsRequest {
    @JsonProperty("portfolio_id")
    private String portfolioId;

    private WalletType type;

    private String[] symbols;

    @JsonProperty("pagination_params")
    private PaginationParams paginationParams;

    public ListWalletsRequest() {}

    public ListWalletsRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.type = builder.type;
        this.symbols = builder.symbols;
        this.paginationParams = builder.paginationParams;
    }

    public String getQueryString() {
        String queryParams = "";
        if (this.getSymbols() != null) {
            for (String symbol : this.getSymbols()) {
                queryParams = appendQueryParams(queryParams, "symbols", symbol);
            }
        }
        if (this.getType() != null) {
            queryParams = appendQueryParams(queryParams, "type", this.getType().toString());
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

    public WalletType getType() {
        return type;
    }

    public void setType(WalletType type) {
        this.type = type;
    }

    public String[] getSymbols() {
        return symbols;
    }

    public void setSymbols(String[] symbols) {
        this.symbols = symbols;
    }

    public PaginationParams getPaginationParams() {
        return paginationParams;
    }

    public void setPaginationParams(PaginationParams paginationParams) {
        this.paginationParams = paginationParams;
    }

    public static class Builder {
        private String portfolioId;
        private WalletType type;
        private String[] symbols;
        private PaginationParams paginationParams;

        public Builder() {}

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder type(WalletType type) {
            this.type = type;
            return this;
        }

        public Builder symbols(String[] symbols) {
            this.symbols = symbols;
            return this;
        }

        public Builder paginationParams(PaginationParams paginationParams) {
            this.paginationParams = paginationParams;
            return this;
        }

        public ListWalletsRequest build() {
            return new ListWalletsRequest(this);
        }
    }
}
