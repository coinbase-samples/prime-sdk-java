package com.coinbase.prime.client;

import com.coinbase.prime.credentials.CoinbasePrimeCredentials;
import com.coinbase.prime.errors.*;
import com.coinbase.prime.model.allocations.*;
import com.coinbase.prime.model.assets.ListAssetsRequest;
import com.coinbase.prime.model.assets.ListAssetsResponse;
import com.coinbase.prime.model.invoice.ListInvoicesRequest;
import com.coinbase.prime.model.invoice.ListInvoicesResponse;
import com.coinbase.prime.model.paymentmethods.GetEntityPaymentMethodRequest;
import com.coinbase.prime.model.paymentmethods.GetEntityPaymentMethodResponse;
import com.coinbase.prime.model.paymentmethods.ListEntityPaymentMethodsRequest;
import com.coinbase.prime.model.paymentmethods.ListEntityPaymentMethodsResponse;
import com.coinbase.prime.model.portfolio.*;
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
    public CreatePortfolioAllocationsResponse createPortfolioAllocations(CreatePortfolioAllocationsRequest request) {
        String path = "/allocations";
        String response = post(path, "", request);
        ObjectMapper mapper = new ObjectMapper();
        try {
            CreatePortfolioAllocationsResponse resp = mapper.readValue(response, CreatePortfolioAllocationsResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public CreatePortfolioNetAllocationsResponse createPortfolioNetAllocations(CreatePortfolioAllocationsRequest request) {
        String path = "/allocations/net";
        String response = post(path, "", request);
        ObjectMapper mapper = new ObjectMapper();
        try {
            CreatePortfolioNetAllocationsResponse resp = mapper.readValue(response, CreatePortfolioNetAllocationsResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ListPortfolioAllocationsResponse listPortfolioAllocations(ListPortfolioAllocationsRequest request) {
        String queryParams = request.getQueryString();
        String path = String.format("/portfolios/%s/allocations", request.getPortfolioId());
        String response = get(path, queryParams);
        ObjectMapper mapper = new ObjectMapper();
        try {
            ListPortfolioAllocationsResponse resp = mapper.readValue(response, ListPortfolioAllocationsResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public GetAllocationByIdResponse getAllocationById(GetAllocationByIdRequest request) {
        String path = String.format("/portfolios/%s/allocations/%s", request.getPortfolioId(), request.getAllocationId());
        String response = get(path, "");
        ObjectMapper mapper = new ObjectMapper();
        try {
            GetAllocationByIdResponse resp = mapper.readValue(response, GetAllocationByIdResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public GetNetAllocationsByNettingIdResponse getNetAllocationsByNettingId(GetNetAllocationsByNettingIdRequest request) {
        String path = String.format("/portfolios/%s/allocations/net/%s", request.getPortfolioId(), request.getNettingId());
        String response = get(path, "");
        ObjectMapper mapper = new ObjectMapper();
        try {
            GetNetAllocationsByNettingIdResponse resp = mapper.readValue(response, GetNetAllocationsByNettingIdResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ListInvoicesResponse listInvoices(ListInvoicesRequest request) {
        String queryParams = request.getQueryString();
        String path = String.format("/entities/%s/invoices", request.getEntityId());
        String response = get(path, queryParams);
        ObjectMapper mapper = new ObjectMapper();
        try {
            ListInvoicesResponse resp = mapper.readValue(response, ListInvoicesResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ListAssetsResponse listAssets(ListAssetsRequest request) {
        String path = "/assets";
        String response = get(path, "");
        ObjectMapper mapper = new ObjectMapper();
        try {
            ListAssetsResponse resp = mapper.readValue(response, ListAssetsResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ListEntityPaymentMethodsResponse listEntityPaymentMethods(ListEntityPaymentMethodsRequest request) {
        String path = String.format("/entities/%s/payment-methods", request.getEntityId());
        String response = get(path, "");
        ObjectMapper mapper = new ObjectMapper();
        try {
            ListEntityPaymentMethodsResponse resp = mapper.readValue(response, ListEntityPaymentMethodsResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public GetEntityPaymentMethodResponse getEntityPaymentMethod(GetEntityPaymentMethodRequest request) {
        String path = String.format("/entities/%s/payment-methods/%s", request.getEntityId(), request.getPaymentMethodId());
        String response = get(path, "");
        ObjectMapper mapper = new ObjectMapper();
        try {
            GetEntityPaymentMethodResponse resp = mapper.readValue(response, GetEntityPaymentMethodResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
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
    public GetPortfolioByIdResponse getPortfolioById(GetPortfolioByIdRequest request) {
        String path = String.format("/portfolios/%s", request.getPortfolioId());
        String response = get(path, "");
        ObjectMapper mapper = new ObjectMapper();
        try {
            GetPortfolioByIdResponse resp = mapper.readValue(response, GetPortfolioByIdResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public GetPortfolioCreditInformationResponse getPortfolioCreditInformation(GetPortfolioCreditInformationRequest request) {
        String path = String.format("/portfolios/%s/credit", request.getPortfolioId());
        String response = get(path, "");
        ObjectMapper mapper = new ObjectMapper();
        try {
            GetPortfolioCreditInformationResponse resp = mapper.readValue(response, GetPortfolioCreditInformationResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ListWalletsResponse listWallets(ListWalletsRequest request) {
        String queryParams = request.getQueryString();
        String path = String.format("/portfolios/%s/wallets", request.getPortfolioId());
        String response = get(path, queryParams);
        ObjectMapper mapper = new ObjectMapper();
        try {
            ListWalletsResponse resp = mapper.readValue(response, ListWalletsResponse.class);
            resp.setRequest(request);
            return resp;
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
            CreateWalletResponse resp = mapper.readValue(response, CreateWalletResponse.class);
            resp.setRequest(request);
            return resp;
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
            GetWalletByIdResponse resp = mapper.readValue(response, GetWalletByIdResponse.class);
            resp.setRequest(request);
            return resp;
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
            GetWalletDepositInstructionsResponse resp = mapper.readValue(response, GetWalletDepositInstructionsResponse.class);
            resp.setRequest(request);
            return resp;
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
