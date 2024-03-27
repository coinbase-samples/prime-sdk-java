package com.coinbase.prime.client;

import com.coinbase.prime.model.portfolio.ListPortfoliosResponse;

import java.util.concurrent.Future;

public interface CoinbasePrimeClient {
    ListPortfoliosResponse ListPortfolios();
}
