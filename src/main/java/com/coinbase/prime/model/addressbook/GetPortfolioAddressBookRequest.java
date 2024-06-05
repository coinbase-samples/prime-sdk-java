package com.coinbase.prime.model.addressbook;

import com.coinbase.prime.model.common.PaginationParams;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.prime.utils.Utils.appendQueryParams;

public class GetPortfolioAddressBookRequest {
    private String portfolioId;
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    private String search;
    private PaginationParams paginationParams;

    public GetPortfolioAddressBookRequest() {
    }

    public GetPortfolioAddressBookRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.currencySymbol = builder.currencySymbol;
        this.search = builder.search;
        this.paginationParams = builder.paginationParams;
    }

    public String getQueryString() {
        String queryParams = "";
        if (this.getCurrencySymbol() != null) {
            queryParams = appendQueryParams(queryParams, "currency_symbol", this.getCurrencySymbol());
        }
        if (this.getSearch() != null) {
            queryParams = appendQueryParams(queryParams, "search", this.getSearch());
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

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public PaginationParams getPaginationParams() {
        return paginationParams;
    }

    public void setPaginationParams(PaginationParams paginationParams) {
        this.paginationParams = paginationParams;
    }

    public static class Builder {
        private String portfolioId;
        private String currencySymbol;
        private String search;
        private PaginationParams paginationParams;

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder currencySymbol(String currencySymbol) {
            this.currencySymbol = currencySymbol;
            return this;
        }

        public Builder search(String search) {
            this.search = search;
            return this;
        }

        public Builder paginationParams(PaginationParams paginationParams) {
            this.paginationParams = paginationParams;
            return this;
        }

        public GetPortfolioAddressBookRequest build() {
            return new GetPortfolioAddressBookRequest(this);
        }
    }
}
