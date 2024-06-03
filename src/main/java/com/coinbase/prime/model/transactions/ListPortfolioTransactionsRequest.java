package com.coinbase.prime.model.transactions;

import com.coinbase.prime.model.common.PaginationParams;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.prime.utils.Utils.appendQueryParams;

public class ListPortfolioTransactionsRequest {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    private String[] symbols;
    private TransactionType[] types;
    @JsonProperty("start_time")
    private String startTime;
    @JsonProperty("end_time")
    private String endTime;
    private PaginationParams paginationParams;

    public ListPortfolioTransactionsRequest() {
    }

    public ListPortfolioTransactionsRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.symbols = builder.symbols;
        this.types = builder.types;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.paginationParams = builder.paginationParams;
    }

    public String getQueryString() {
        String queryString = "";
        if (this.getSymbols() != null) {
            for (String symbol : this.getSymbols()) {
                queryString = appendQueryParams(queryString, "symbols", symbol);
            }
        }
        if (this.getTypes() != null) {
            for (TransactionType type : this.getTypes()) {
                queryString = appendQueryParams(queryString, "types", type.toString());
            }
        }
        queryString = appendQueryParams(queryString, "start_time", this.getStartTime());
        queryString = appendQueryParams(queryString, "end_time", this.getEndTime());

        if (this.getPaginationParams() != null) {
            queryString = this.getPaginationParams().generateQueryString(queryString);
        }
        return queryString;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String[] getSymbols() {
        return symbols;
    }

    public void setSymbols(String[] symbols) {
        this.symbols = symbols;
    }

    public TransactionType[] getTypes() {
        return types;
    }

    public void setTypes(TransactionType[] types) {
        this.types = types;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public PaginationParams getPaginationParams() {
        return paginationParams;
    }

    public void setPaginationParams(PaginationParams paginationParams) {
        this.paginationParams = paginationParams;
    }

    public static class Builder {
        private String portfolioId;
        private String[] symbols;
        private TransactionType[] types;
        private String startTime;
        private String endTime;
        private PaginationParams paginationParams;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder symbols(String[] symbols) {
            this.symbols = symbols;
            return this;
        }

        public Builder types(TransactionType[] types) {
            this.types = types;
            return this;
        }

        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder paginationParams(PaginationParams paginationParams) {
            this.paginationParams = paginationParams;
            return this;
        }

        public ListPortfolioTransactionsRequest build() {
            return new ListPortfolioTransactionsRequest(this);
        }
    }
}