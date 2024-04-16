package com.coinbase.examples;

import com.coinbase.prime.http.CoinbasePrimeCredentials;
import com.coinbase.prime.http.CoinbasePrimeHttpClient;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        String credsStringBlob = System.getenv("PRIME_CREDENTIALS");
        ObjectMapper mapper = new ObjectMapper();
        try {
            CoinbasePrimeCredentials credentials = mapper.readValue(credsStringBlob, CoinbasePrimeCredentials.class);

            CoinbasePrimeHttpClient client = new CoinbasePrimeHttpClient.Builder(credentials).build();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
