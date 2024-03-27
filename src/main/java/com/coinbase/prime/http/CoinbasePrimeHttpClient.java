package com.coinbase.prime.http;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CoinbasePrimeHttpClient {
    HttpClient client;
    private CoinbasePrimeCredentials credentials;
    private String baseUrl = "https://api.prime.coinbase.com";

    public CoinbasePrimeHttpClient(CoinbasePrimeCredentials credentials) {
        this.credentials = credentials;
        this.client = HttpClient.newBuilder().build();
    }

    public CoinbasePrimeHttpClient(CoinbasePrimeCredentials credentials, HttpClient client) {
        this.credentials = credentials;
        this.client = client;
    }

    public CoinbasePrimeHttpClient(CoinbasePrimeCredentials credentials, HttpClient client, String baseUrl) {
        this.credentials = credentials;
        this.client = client;
        this.baseUrl = baseUrl;
    }

    public HttpResponse<String> get(String path) {
        long unixTime = System.currentTimeMillis() / 1000L;
        String signature;
        try {
           signature = credentials.Sign(unixTime, "GET", path, credentials.getSigningKey(), "");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl + path))
                .header("X-CB-ACCESS-KEY", credentials.getAccessKey())
                .header("X-CB-ACCESS-PASSPHRASE", credentials.getPassphrase())
                .header("X-CB-ACCESS-SIGNATURE", signature)
                .GET()
                .build();

        try {
            return client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
