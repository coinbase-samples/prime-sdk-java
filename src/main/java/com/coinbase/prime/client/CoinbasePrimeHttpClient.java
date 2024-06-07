/*
 * Copyright 2024-present Coinbase Global, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.coinbase.prime.client;

import com.coinbase.core.http.CoinbaseHttpClient;
import com.coinbase.prime.credentials.CoinbasePrimeCredentials;
import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.errors.CoinbasePrimeErrorMessage;
import com.coinbase.prime.errors.CoinbasePrimeException;
import com.coinbase.prime.model.activities.GetActivityByActivityIdRequest;
import com.coinbase.prime.model.activities.GetActivityByActivityIdResponse;
import com.coinbase.prime.model.activities.ListActivitiesRequest;
import com.coinbase.prime.model.activities.ListActivitiesResponse;
import com.coinbase.prime.model.addressbook.CreateAddressBookEntryRequest;
import com.coinbase.prime.model.addressbook.CreateAddressBookEntryResponse;
import com.coinbase.prime.model.addressbook.GetPortfolioAddressBookRequest;
import com.coinbase.prime.model.addressbook.GetPortfolioAddressBookResponse;
import com.coinbase.prime.model.allocations.*;
import com.coinbase.prime.model.assets.ListAssetsRequest;
import com.coinbase.prime.model.assets.ListAssetsResponse;
import com.coinbase.prime.model.balances.*;
import com.coinbase.prime.model.commission.GetPortfolioCommissionRequest;
import com.coinbase.prime.model.commission.GetPortfolioCommissionResponse;
import com.coinbase.prime.model.invoice.ListInvoicesRequest;
import com.coinbase.prime.model.invoice.ListInvoicesResponse;
import com.coinbase.prime.model.orders.*;
import com.coinbase.prime.model.paymentmethods.GetEntityPaymentMethodRequest;
import com.coinbase.prime.model.paymentmethods.GetEntityPaymentMethodResponse;
import com.coinbase.prime.model.paymentmethods.ListEntityPaymentMethodsRequest;
import com.coinbase.prime.model.paymentmethods.ListEntityPaymentMethodsResponse;
import com.coinbase.prime.model.portfolios.*;
import com.coinbase.prime.model.products.ListPortfolioProductsRequest;
import com.coinbase.prime.model.products.ListPortfolioProductsResponse;
import com.coinbase.prime.model.transactions.*;
import com.coinbase.prime.model.users.ListPortfolioUsersRequest;
import com.coinbase.prime.model.users.ListPortfolioUsersResponse;
import com.coinbase.prime.model.users.ListUsersRequest;
import com.coinbase.prime.model.users.ListUsersResponse;
import com.coinbase.prime.model.wallets.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Instant;

import static com.coinbase.core.utils.Utils.toJsonString;

public class CoinbasePrimeHttpClient extends CoinbaseHttpClient implements CoinbasePrimeApi {
    private static final String CB_ACCESS_KEY_HEADER = "X-CB-ACCESS-KEY";
    private static final String CB_ACCESS_PHRASE_HEADER = "X-CB-ACCESS-PASSPHRASE";
    private static final String CB_ACCESS_SIGNATURE_HEADER = "X-CB-ACCESS-SIGNATURE";
    private static final String CB_ACCESS_TIMESTAMP_HEADER = "X-CB-ACCESS-TIMESTAMP";
    private static final String CB_PRIME_BASE_URL = "https://api.prime.coinbase.com/v1";
    private final CoinbasePrimeCredentials credentials;
    private final String baseUrl;
    private final HttpClient client;
    private final ObjectMapper mapper = new ObjectMapper();

    private CoinbasePrimeHttpClient(Builder builder) {
        this.credentials = builder.credentials;
        this.client = builder.client;
        this.baseUrl = builder.baseUrl;
    }

    public CoinbasePrimeHttpClient(CoinbasePrimeCredentials credentials) {
        this.credentials = credentials;
        this.baseUrl = CB_PRIME_BASE_URL;
        this.client = HttpClient.newHttpClient();
    }

    @Override
    protected String handleResponse(String statusCode, String response) throws CoinbasePrimeException {
        try {
            CoinbasePrimeErrorMessage errorMessage = mapper.readValue(response, CoinbasePrimeErrorMessage.class);
            throw new CoinbasePrimeException(errorMessage.getMessage());
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }

        return response;
    }

    @Override
    public CreateAllocationResponse createAllocation(CreateAllocationRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String path = "/allocations";
        String response = post(path, request);

        try {
            CreateAllocationResponse resp = mapper.readValue(response, CreateAllocationResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public CreateNetAllocationResponse createNetAllocation(CreateAllocationRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String path = "/allocations/net";
        String response = post(path, request);

        try {
            CreateNetAllocationResponse resp = mapper.readValue(response, CreateNetAllocationResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public GetPortfolioAllocationsResponse getPortfolioAllocations(GetPortfolioAllocationsRequest request) throws CoinbasePrimeException {
        String path = String.format("/portfolios/%s/allocations", request.getPortfolioId());
        GetPortfolioAllocationsResponse response = (GetPortfolioAllocationsResponse) doGet(request, path, GetPortfolioAllocationsResponse.class);

        response.setRequest(request);
        return response;
    }

    @Override
    public GetAllocationResponse getAllocation(GetAllocationRequest request) throws CoinbasePrimeException {
        String path = String.format("/portfolios/%s/allocations/%s", request.getPortfolioId(), request.getAllocationId());
        String response = get(path, "");

        try {
            GetAllocationResponse resp = mapper.readValue(response, GetAllocationResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public GetAllocationsByClientNettingIdResponse getNetAllocationsByNettingId(GetAllocationsByClientNettingIdRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/allocations/net/%s", request.getPortfolioId(), request.getNettingId());
        String response = get(path, "");

        try {
            GetAllocationsByClientNettingIdResponse resp = mapper.readValue(response, GetAllocationsByClientNettingIdResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public ListInvoicesResponse listInvoices(ListInvoicesRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String queryParams = request.getQueryString();
        String path = String.format("/entities/%s/invoices", request.getEntityId());
        String response = get(path, queryParams);

        try {
            ListInvoicesResponse resp = mapper.readValue(response, ListInvoicesResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public ListAssetsResponse listAssets(ListAssetsRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String path = String.format("/entities/%s/assets", request.getEntityId());
        String response = get(path, "");

        try {
            ListAssetsResponse resp = mapper.readValue(response, ListAssetsResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public ListEntityPaymentMethodsResponse listEntityPaymentMethods(ListEntityPaymentMethodsRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String path = String.format("/entities/%s/payment-methods", request.getEntityId());
        String response = get(path, "");

        try {
            ListEntityPaymentMethodsResponse resp = mapper.readValue(response, ListEntityPaymentMethodsResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public GetEntityPaymentMethodResponse getEntityPaymentMethod(GetEntityPaymentMethodRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String path = String.format("/entities/%s/payment-methods/%s", request.getEntityId(), request.getPaymentMethodId());
        String response = get(path, "");

        try {
            GetEntityPaymentMethodResponse resp = mapper.readValue(response, GetEntityPaymentMethodResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public ListUsersResponse listUsers(ListUsersRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String queryParams = request.getPaginationParams() != null ? request.getPaginationParams().generateQueryString("") : "";
        String path = String.format("/entities/%s/users", request.getEntityId());
        String response = get(path, queryParams);

        try {
            ListUsersResponse resp = mapper.readValue(response, ListUsersResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public ListPortfolioUsersResponse listPortfolioUsers(ListPortfolioUsersRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String queryParams = request.getPaginationParams() != null ? request.getPaginationParams().generateQueryString("") : "";
        String path = String.format("/portfolios/%s/users", request.getPortfolioId());
        String response = get(path, queryParams);

        try {
            ListPortfolioUsersResponse resp = mapper.readValue(response, ListPortfolioUsersResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public ListPortfoliosResponse listPortfolios() {
        String response = get("/portfolios", "");
        if (response == null) {
            return null;
        }


        try {
            return mapper.readValue(response, ListPortfoliosResponse.class);
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public GetPortfolioByIdResponse getPortfolioById(GetPortfolioByIdRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s", request.getPortfolioId());
        String response = get(path, "");

        try {
            GetPortfolioByIdResponse resp = mapper.readValue(response, GetPortfolioByIdResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public GetPortfolioCreditInformationResponse getPortfolioCreditInformation(GetPortfolioCreditInformationRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/credit", request.getPortfolioId());
        String response = get(path, "");

        try {
            GetPortfolioCreditInformationResponse resp = mapper.readValue(response, GetPortfolioCreditInformationResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public ListActivitiesResponse listActivities(ListActivitiesRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String queryParams = request.getQueryString();
        String path = String.format("/portfolios/%s/activities", request.getPortfolioId());
        String response = get(path, queryParams);

        try {
            ListActivitiesResponse resp = mapper.readValue(response, ListActivitiesResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public GetActivityByActivityIdResponse getActivityByActivityId(GetActivityByActivityIdRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/activities/%s", request.getPortfolioId(), request.getActivityId());
        String response = get(path, "");

        try {
            GetActivityByActivityIdResponse resp = mapper.readValue(response, GetActivityByActivityIdResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public GetPortfolioAddressBookResponse getAddressBook(GetPortfolioAddressBookRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String queryParams = request.getQueryString();
        String path = String.format("/portfolios/%s/address_book", request.getPortfolioId());
        String response = get(path, queryParams);

        try {
            GetPortfolioAddressBookResponse resp = mapper.readValue(response, GetPortfolioAddressBookResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public CreateAddressBookEntryResponse createAddressBookEntry(CreateAddressBookEntryRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/address_book", request.getPortfolioId());
        String response = post(path, request);

        try {
            CreateAddressBookEntryResponse resp = mapper.readValue(response, CreateAddressBookEntryResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public ListPortfolioBalancesResponse listPortfolioBalances(ListPortfolioBalancesRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String queryParams = request.getQueryString();
        String path = String.format("/portfolios/%s/balances", request.getPortfolioId());
        String response = get(path, queryParams);

        try {
            ListPortfolioBalancesResponse resp = mapper.readValue(response, ListPortfolioBalancesResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public GetWalletBalanceResponse getWalletBalance(GetWalletBalanceRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/wallets/%s/balance", request.getPortfolioId(), request.getWalletId());
        String response = get(path, "");

        try {
            GetWalletBalanceResponse resp = mapper.readValue(response, GetWalletBalanceResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public ListWeb3WalletBalancesResponse listWeb3WalletBalances(ListWeb3WalletBalancesRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/wallets/%s/web3_balances", request.getPortfolioId(), request.getWalletId());
        String response = get(path, "");

        try {
            ListWeb3WalletBalancesResponse resp = mapper.readValue(response, ListWeb3WalletBalancesResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public GetPortfolioCommissionResponse getPortfolioCommission(GetPortfolioCommissionRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/commission", request.getPortfolioId());
        String response = get(path, "");

        try {
            GetPortfolioCommissionResponse resp = mapper.readValue(response, GetPortfolioCommissionResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public ListOpenOrdersResponse listOpenOrders(ListOpenOrdersRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String queryParams = request.getQueryString();
        String path = String.format("/portfolios/%s/open_orders", request.getPortfolioId());
        String response = get(path, queryParams);

        try {
            ListOpenOrdersResponse resp = mapper.readValue(response, ListOpenOrdersResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public CreateOrderResponse createOrder(CreateOrderRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/order", request.getPortfolioId());
        String response = post(path, request);

        try {
            CreateOrderResponse resp = mapper.readValue(response, CreateOrderResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public GetOrderPreviewResponse getOrderPreview(GetOrderPreviewRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/order_preview", request.getPortfolioId());
        String response = post(path, request);

        try {
            GetOrderPreviewResponse resp = mapper.readValue(response, GetOrderPreviewResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public ListPortfolioOrdersResponse listPortfolioOrders(ListPortfolioOrdersRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String response = get(String.format("/portfolios/%s/orders", request.getPortfolioId()), "");
        if (response == null) {
            return null;
        }


        try {
            return mapper.readValue(response, ListPortfolioOrdersResponse.class);
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public GetOrderByOrderIdResponse getOrderByOrderId(GetOrderByOrderIdRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/orders/%s", request.getPortfolioId(), request.getOrderId());
        String response = get(path, "");

        try {
            GetOrderByOrderIdResponse resp = mapper.readValue(response, GetOrderByOrderIdResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public CancelOrderResponse cancelOrder(CancelOrderRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/orders/%s/cancel", request.getPortfolioId(), request.getOrderId());
        String response = post(path, request);

        try {
            CancelOrderResponse resp = mapper.readValue(response, CancelOrderResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public ListOrderFillsResponse listOrderFills(ListOrderFillsRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String queryParams = request.getQueryString();
        String path = String.format("/portfolios/%s/orders/%s/fills", request.getPortfolioId(), request.getOrderId());
        String response = get(path, queryParams);

        try {
            ListOrderFillsResponse resp = mapper.readValue(response, ListOrderFillsResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public ListPortfolioProductsResponse listPortfolioProducts(ListPortfolioProductsRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String queryParams = request.getQueryString();
        String path = String.format("/portfolios/%s/products", request.getPortfolioId());
        String response = get(path, queryParams);

        try {
            ListPortfolioProductsResponse resp = mapper.readValue(response, ListPortfolioProductsResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public GetTransactionByTransactionIdResponse getTransactionByTransactionId(GetTransactionByTransactionIdRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/transactions/%s", request.getPortfolioId(), request.getTransactionId());
        String response = get(path, "");

        try {
            GetTransactionByTransactionIdResponse resp = mapper.readValue(response, GetTransactionByTransactionIdResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public CreateConversionResponse createConversion(CreateConversionRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/wallets/%s/conversion", request.getPortfolioId(), request.getWalletId());
        String response = post(path, request);

        try {
            CreateConversionResponse resp = mapper.readValue(response, CreateConversionResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public ListPortfolioTransactionsResponse listPortfolioTransactions(ListPortfolioTransactionsRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String queryParams = request.getQueryString();
        String path = String.format("/portfolios/%s/transactions", request.getPortfolioId());
        String response = get(path, queryParams);

        try {
            ListPortfolioTransactionsResponse resp = mapper.readValue(response, ListPortfolioTransactionsResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public ListWalletTransactionsResponse listWalletTransactions(ListWalletTransactionsRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String queryParams = request.getQueryString();
        String path = String.format("/portfolios/%s/wallets/%s/transactions", request.getPortfolioId(), request.getWalletId());
        String response = get(path, queryParams);

        try {
            ListWalletTransactionsResponse resp = mapper.readValue(response, ListWalletTransactionsResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public CreateTransferResponse createTransfer(CreateTransferRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/wallets/%s/transfers", request.getPortfolioId(), request.getWalletId());
        String response = post(path, request);

        try {
            CreateTransferResponse resp = mapper.readValue(response, CreateTransferResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public CreateWithdrawalResponse createWithdrawal(CreateWithdrawalRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/wallets/%s/withdrawals", request.getPortfolioId(), request.getWalletId());
        String response = post(path, request);

        try {
            CreateWithdrawalResponse resp = mapper.readValue(response, CreateWithdrawalResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public ListWalletsResponse listWallets(ListWalletsRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String queryParams = request.getQueryString();
        String path = String.format("/portfolios/%s/wallets", request.getPortfolioId());
        String response = get(path, queryParams);

        try {
            ListWalletsResponse resp = mapper.readValue(response, ListWalletsResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public CreateWalletResponse createWallet(CreateWalletRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/wallets", request.getPortfolioId());
        String response = post(path, request);

        try {
            CreateWalletResponse resp = mapper.readValue(response, CreateWalletResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public GetWalletByIdResponse getWalletById(GetWalletByIdRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/wallets/%s", request.getPortfolioId(), request.getWalletId());
        String response = get(path, "");

        try {
            GetWalletByIdResponse resp = mapper.readValue(response, GetWalletByIdResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    public GetWalletDepositInstructionsResponse getWalletDepositInstructions(GetWalletDepositInstructionsRequest request) throws CoinbasePrimeException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/wallets/%s/deposit_instructions", request.getPortfolioId(), request.getWalletId());
        String response = get(path, "");

        try {
            GetWalletDepositInstructionsResponse resp = mapper.readValue(response, GetWalletDepositInstructionsResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    @Override
    protected HttpRequest.Builder attachHeaders(HttpRequest.Builder builder, String signature, long timestamp) {
        return builder
                .header(CB_ACCESS_KEY_HEADER, credentials.getAccessKey())
                .header(CB_ACCESS_PHRASE_HEADER, credentials.getPassphrase())
                .header(CB_ACCESS_SIGNATURE_HEADER, signature)
                .header(CB_ACCESS_TIMESTAMP_HEADER, String.valueOf(timestamp));
    }

    public static class Builder {
        private final CoinbasePrimeCredentials credentials;
        private HttpClient client = HttpClient.newHttpClient();
        private String baseUrl = CB_PRIME_BASE_URL;

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

        private void validate() throws CoinbasePrimeException {
            if (credentials == null) {
                throw new CoinbaseClientException("CoinbasePrimeHttpClient did not receive valid credentials");
            }
        }
    }
}
