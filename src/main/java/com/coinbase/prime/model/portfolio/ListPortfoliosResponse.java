package com.coinbase.prime.model.portfolio;

import java.util.List;

public class ListPortfoliosResponse{
    private List<Portfolio> portfolios;

    public ListPortfoliosResponse(List<Portfolio> portfolios) {
        this.portfolios = portfolios;
    }

    public ListPortfoliosResponse() {}

    public List<Portfolio> getPortfolios() {
        return portfolios;
    }

    public void setPortfolios(List<Portfolio> portfolios) {
        this.portfolios = portfolios;
    }
}