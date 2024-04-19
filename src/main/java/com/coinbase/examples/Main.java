package com.coinbase.examples;

import com.coinbase.prime.credentials.CoinbasePrimeCredentials;
import com.coinbase.prime.client.CoinbasePrimeHttpClient;
import com.coinbase.prime.model.portfolio.ListPortfoliosResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        String credsStringBlob = System.getenv("PRIME_CREDENTIALS");
        ObjectMapper mapper = new ObjectMapper();
        try {
            CoinbasePrimeCredentials credentials = mapper.readValue(credsStringBlob, CoinbasePrimeCredentials.class);

            CoinbasePrimeHttpClient client = new CoinbasePrimeHttpClient.Builder(credentials).build();

            ListPortfoliosResponse resp = client.listPortfolios();
            System.out.println(mapper.writeValueAsString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
