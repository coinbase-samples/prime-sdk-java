package com.coinbase.prime.client;

import com.coinbase.prime.credentials.CoinbasePrimeCredentials;
import com.coinbase.prime.errors.*;
import com.coinbase.prime.model.portfolio.ListPortfoliosResponse;
import com.coinbase.prime.model.wallets.*;
import com.coinbase.prime.utils.Utils;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CoinbasePrimeHttpClient implements CoinbasePrimeApi {
    HttpClient client;
    private final CoinbasePrimeCredentials credentials;
    private final String baseUrl;

    private CoinbasePrimeHttpClient(Builder builder) {
        this.credentials = builder.credentials;
        this.client = builder.client;
        this.baseUrl = builder.baseUrl;
    }

    @Override
    public ListPortfoliosResponse listPortfolios() {
        String response = get("/portfolios", "");
        if (response == null) {
            return null;
        }

        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(response, ListPortfoliosResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ListWalletsResponse listWallets(ListWalletsRequest request) {
        String queryParams = Utils.appendQueryParams("", "type", request.getType());
        String path = String.format("/portfolios/%s/wallets", request.getPortfolioId());
        String response = get(path, queryParams);
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(response, ListWalletsResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public CreateWalletResponse createWallet(CreateWalletRequest request) {
        String path = String.format("/portfolios/%s/wallets", request.getPortfolioId());
        String response = post(path, "", request);
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(response, CreateWalletResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public GetWalletByIdResponse getWalletById(GetWalletByIdRequest request) {
        String path = String.format("/portfolios/%s/wallets/%s", request.getPortfolioId(), request.getWalletId());
        String response = get(path, "");
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(response, GetWalletByIdResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public GetWalletDepositInstructionsResponse getWalletDepositInstructions(GetWalletDepositInstructionsRequest request) {
        String path = String.format("/portfolios/%s/wallets/%s/deposit_instructions", request.getPortfolioId(), request.getWalletId());
        String response = get(path, "");
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(response, GetWalletDepositInstructionsResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static class Builder {
        private final CoinbasePrimeCredentials credentials;
        private HttpClient client;
        private String baseUrl = "https://api.prime.coinbase.com/v1";

        public Builder(CoinbasePrimeCredentials credentials) {
            this.credentials = credentials;
        }

        public Builder withClient(HttpClient client) {
            this.client = client;
            return this;
        }

        public Builder withBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public CoinbasePrimeHttpClient build() throws IllegalStateException {
            validate();
            if (client == null) {
                client = HttpClient.newBuilder().build();
            }
            return new CoinbasePrimeHttpClient(this);
        }

        private void validate() throws IllegalStateException {
            if (credentials == null) {
                throw new IllegalStateException("Credentials must be provided");
            }
        }
    }

    private String get(String path, String query) {
        HttpRequest.Builder builder = generateHttpRequest(path, query);
        if (builder == null) {
            return null;
        }

        HttpRequest httpRequest = builder
                .GET()
                .build();

        return sendRequest(httpRequest);
    }

    private String post(String path, String query, Object request) {
        HttpRequest.Builder builder = generateHttpRequest(path, query);
        if (builder == null) {
            return null;
        }

        ObjectMapper mapper = new ObjectMapper();
        HttpRequest httpRequest;
        try {
            httpRequest = builder
                    .POST(HttpRequest.BodyPublishers.ofString(mapper.writeValueAsString(request)))
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return sendRequest(httpRequest);
    }

    private HttpRequest.Builder generateHttpRequest(String path, String query) {
        String callUrl = baseUrl + path + query;
        URI uri = URI.create(callUrl);
        long unixTime = System.currentTimeMillis() / 1000L;
        String signature;
        try {
            signature = credentials.Sign(unixTime, "GET", uri.getPath(), "");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        ObjectMapper mapper = new ObjectMapper();
        return HttpRequest.newBuilder()
                .uri(uri)
                .header("X-CB-ACCESS-KEY", credentials.getAccessKey())
                .header("X-CB-ACCESS-PASSPHRASE", credentials.getPassphrase())
                .header("X-CB-ACCESS-SIGNATURE", signature)
                .header("X-CB-ACCESS-TIMESTAMP", String.valueOf(unixTime));
    }

    private String sendRequest(HttpRequest request) {
        try {
            HttpResponse<String> resp = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (resp.statusCode() != 200) {
                System.out.println("Request failed with status code: " + resp.statusCode());
                System.out.println("Response body: " + resp.body());
                throw new CoinbasePrimeException(resp.statusCode(), resp.body());
            }
            return resp.body();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            throw new CoinbasePrimeException("Failed to send request", e);
        }
    }
}