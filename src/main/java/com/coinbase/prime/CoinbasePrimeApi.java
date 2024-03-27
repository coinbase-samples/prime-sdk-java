package com.coinbase.prime;

import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.http.CoinbasePrimeHttpClient;
import com.coinbase.prime.model.portfolio.ListPortfoliosResponse;

public class CoinbasePrimeApi implements CoinbasePrimeClient {
    CoinbasePrimeHttpClient client;

    public CoinbasePrimeApi(CoinbasePrimeHttpClient client) {
        this.client = client;
    }

    public ListPortfoliosResponse ListPortfolios() {
        client.get("/portfolios");

        return null;
    }
}
