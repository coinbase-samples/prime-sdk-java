package com.coinbase.prime.model.wallets;

import com.coinbase.prime.model.common.PaginationParams;
import com.fasterxml.jackson.annotation.JsonProperty;

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
