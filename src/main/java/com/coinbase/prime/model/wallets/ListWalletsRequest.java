package com.coinbase.prime.model.wallets;

import com.coinbase.prime.model.common.PaginationParams;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListWalletsRequest {
    @JsonProperty("portfolio_id")
    private String portfolioId;

    private String type;

    private String[] symbols;

    @JsonProperty("pagination_params")
    private PaginationParams paginationParams;

    public ListWalletsRequest() {}

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
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
}
