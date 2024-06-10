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

import com.coinbase.core.credentials.CoinbaseCredentials;
import com.coinbase.core.http.CoinbaseHttpClient;
import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.errors.CoinbasePrimeException;
import com.coinbase.prime.errors.CoinbasePrimeExceptionFactory;
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
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.Objects;

public class CoinbasePrimeHttpClient extends CoinbaseHttpClient implements CoinbasePrimeApi {
    private static final String CB_ACCESS_KEY_HEADER = "X-CB-ACCESS-KEY";
    private static final String CB_ACCESS_PHRASE_HEADER = "X-CB-ACCESS-PASSPHRASE";
    private static final String CB_ACCESS_SIGNATURE_HEADER = "X-CB-ACCESS-SIGNATURE";
    private static final String CB_ACCESS_TIMESTAMP_HEADER = "X-CB-ACCESS-TIMESTAMP";
    private static final String CB_PRIME_BASE_URL = "https://api.prime.coinbase.com/v1";
    private final CoinbaseCredentials credentials;
    private final String baseUrl;
    private final HttpClient client;
    private final ObjectMapper mapper = new ObjectMapper();

    private CoinbasePrimeHttpClient(Builder builder) {
        this.credentials = builder.credentials;
        this.client = builder.client;
        this.baseUrl = builder.baseUrl;
    }

    public CoinbasePrimeHttpClient(CoinbaseCredentials credentials) {
        this.credentials = credentials;
        this.baseUrl = CB_PRIME_BASE_URL;
        this.client = HttpClient.newHttpClient();
    }

    @Override
    protected String handleResponse(int statusCode, String response) throws CoinbasePrimeException {
        if (statusCode != 200 && statusCode != 201 && statusCode != 204) {
            throw CoinbasePrimeExceptionFactory.create(statusCode, response);
        }

        return response;
    }

    @Override
    public CreateAllocationResponse createAllocation(CreateAllocationRequest request) throws CoinbasePrimeException {
        CreateAllocationResponse resp = doPost(request, CreateAllocationResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public CreateNetAllocationResponse createNetAllocation(CreateNetAllocationRequest request) throws CoinbasePrimeException {
        CreateNetAllocationResponse resp = doPost(request, CreateNetAllocationResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public GetPortfolioAllocationsResponse getPortfolioAllocations(GetPortfolioAllocationsRequest request) throws CoinbasePrimeException {
        GetPortfolioAllocationsResponse response = doGet(request, GetPortfolioAllocationsResponse.class);
        response.setRequest(request);
        return response;
    }

    @Override
    public GetAllocationResponse getAllocation(GetAllocationRequest request) throws CoinbasePrimeException {
        GetAllocationResponse resp = doGet(request, GetAllocationResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public GetAllocationsByClientNettingIdResponse getNetAllocationsByNettingId(GetAllocationsByClientNettingIdRequest request) throws CoinbasePrimeException {
        GetAllocationsByClientNettingIdResponse resp = doGet(request, GetAllocationsByClientNettingIdResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public ListInvoicesResponse listInvoices(ListInvoicesRequest request) throws CoinbasePrimeException {
        ListInvoicesResponse resp = doGet(request, ListInvoicesResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public ListAssetsResponse listAssets(ListAssetsRequest request) throws CoinbasePrimeException {
        ListAssetsResponse response = doGet(request, ListAssetsResponse.class);
        response.setRequest(request);
        return response;
    }

    @Override
    public ListEntityPaymentMethodsResponse listEntityPaymentMethods(ListEntityPaymentMethodsRequest request) throws CoinbasePrimeException {
        ListEntityPaymentMethodsResponse response = doGet(request, ListEntityPaymentMethodsResponse.class);
        response.setRequest(request);
        return response;
    }

    @Override
    public GetEntityPaymentMethodResponse getEntityPaymentMethod(GetEntityPaymentMethodRequest request) throws CoinbasePrimeException {
        GetEntityPaymentMethodResponse resp = doGet(request, GetEntityPaymentMethodResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public ListUsersResponse listUsers(ListUsersRequest request) throws CoinbasePrimeException {
        ListUsersResponse resp = doGet(request, ListUsersResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public ListPortfolioUsersResponse listPortfolioUsers(ListPortfolioUsersRequest request) throws CoinbasePrimeException {
        ListPortfolioUsersResponse resp = doGet(request, ListPortfolioUsersResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public ListPortfoliosResponse listPortfolios() throws CoinbasePrimeException {
        return doGet(new ListPortfoliosRequest(), ListPortfoliosResponse.class);
    }

    @Override
    public GetPortfolioByIdResponse getPortfolioById(GetPortfolioByIdRequest request) throws CoinbasePrimeException {
        GetPortfolioByIdResponse resp = doGet(request, GetPortfolioByIdResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public GetPortfolioCreditInformationResponse getPortfolioCreditInformation(GetPortfolioCreditInformationRequest request) throws CoinbasePrimeException {
        GetPortfolioCreditInformationResponse resp = doGet(request, GetPortfolioCreditInformationResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public ListActivitiesResponse listActivities(ListActivitiesRequest request) throws CoinbasePrimeException {
        ListActivitiesResponse resp = doGet(request, ListActivitiesResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public GetActivityByActivityIdResponse getActivityByActivityId(GetActivityByActivityIdRequest request) throws CoinbasePrimeException {
        GetActivityByActivityIdResponse resp = doGet(request, GetActivityByActivityIdResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public GetPortfolioAddressBookResponse getAddressBook(GetPortfolioAddressBookRequest request) throws CoinbasePrimeException {
        GetPortfolioAddressBookResponse resp = doGet(request, GetPortfolioAddressBookResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public CreateAddressBookEntryResponse createAddressBookEntry(CreateAddressBookEntryRequest request) throws CoinbasePrimeException {
        CreateAddressBookEntryResponse resp = doPost(request, CreateAddressBookEntryResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public ListPortfolioBalancesResponse listPortfolioBalances(ListPortfolioBalancesRequest request) throws CoinbasePrimeException {
        ListPortfolioBalancesResponse resp = doGet(request, ListPortfolioBalancesResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public GetWalletBalanceResponse getWalletBalance(GetWalletBalanceRequest request) throws CoinbasePrimeException {
        GetWalletBalanceResponse resp = doGet(request, GetWalletBalanceResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public ListWeb3WalletBalancesResponse listWeb3WalletBalances(ListWeb3WalletBalancesRequest request) throws CoinbasePrimeException {
        ListWeb3WalletBalancesResponse resp = doGet(request, ListWeb3WalletBalancesResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public GetPortfolioCommissionResponse getPortfolioCommission(GetPortfolioCommissionRequest request) throws CoinbasePrimeException {
        GetPortfolioCommissionResponse resp = doGet(request, GetPortfolioCommissionResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public ListOpenOrdersResponse listOpenOrders(ListOpenOrdersRequest request) throws CoinbasePrimeException {
        ListOpenOrdersResponse resp = doGet(request, ListOpenOrdersResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public CreateOrderResponse createOrder(CreateOrderRequest request) throws CoinbasePrimeException {
        CreateOrderResponse resp = doPost(request, CreateOrderResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public GetOrderPreviewResponse getOrderPreview(GetOrderPreviewRequest request) throws CoinbasePrimeException {
        GetOrderPreviewResponse resp = doPost(request, GetOrderPreviewResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public ListPortfolioOrdersResponse listPortfolioOrders(ListPortfolioOrdersRequest request) throws CoinbasePrimeException {
        ListPortfolioOrdersResponse resp = doGet(request, ListPortfolioOrdersResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public GetOrderByOrderIdResponse getOrderByOrderId(GetOrderByOrderIdRequest request) throws CoinbasePrimeException {
        GetOrderByOrderIdResponse resp = doGet(request, GetOrderByOrderIdResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public CancelOrderResponse cancelOrder(CancelOrderRequest request) throws CoinbasePrimeException {
        CancelOrderResponse resp = doPost(request, CancelOrderResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public ListOrderFillsResponse listOrderFills(ListOrderFillsRequest request) throws CoinbasePrimeException {
        ListOrderFillsResponse resp = doGet(request, ListOrderFillsResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public ListPortfolioProductsResponse listPortfolioProducts(ListPortfolioProductsRequest request) throws CoinbasePrimeException {
        ListPortfolioProductsResponse resp = doGet(request, ListPortfolioProductsResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public GetTransactionByTransactionIdResponse getTransactionByTransactionId(GetTransactionByTransactionIdRequest request) throws CoinbasePrimeException {
        GetTransactionByTransactionIdResponse resp = doGet(request, GetTransactionByTransactionIdResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public CreateConversionResponse createConversion(CreateConversionRequest request) throws CoinbasePrimeException {
        CreateConversionResponse resp = doPost(request, CreateConversionResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public ListPortfolioTransactionsResponse listPortfolioTransactions(ListPortfolioTransactionsRequest request) throws CoinbasePrimeException {
        ListPortfolioTransactionsResponse resp = doGet(request, ListPortfolioTransactionsResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public ListWalletTransactionsResponse listWalletTransactions(ListWalletTransactionsRequest request) throws CoinbasePrimeException {
        ListWalletTransactionsResponse resp = doGet(request, ListWalletTransactionsResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public CreateTransferResponse createTransfer(CreateTransferRequest request) throws CoinbasePrimeException {
        CreateTransferResponse resp = doPost(request, CreateTransferResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public CreateWithdrawalResponse createWithdrawal(CreateWithdrawalRequest request) throws CoinbasePrimeException {
        CreateWithdrawalResponse resp = doPost(request, CreateWithdrawalResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public ListWalletsResponse listWallets(ListWalletsRequest request) throws CoinbasePrimeException {
        ListWalletsResponse resp = doGet(request, ListWalletsResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public CreateWalletResponse createWallet(CreateWalletRequest request) throws CoinbasePrimeException {
        CreateWalletResponse resp = doPost(request, CreateWalletResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public GetWalletByIdResponse getWalletById(GetWalletByIdRequest request) throws CoinbasePrimeException {
        GetWalletByIdResponse resp = doGet(request, GetWalletByIdResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public GetWalletDepositInstructionsResponse getWalletDepositInstructions(GetWalletDepositInstructionsRequest request) throws CoinbasePrimeException {
        GetWalletDepositInstructionsResponse resp = doGet(request, GetWalletDepositInstructionsResponse.class);
        resp.setRequest(request);
        return resp;
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
        private final CoinbaseCredentials credentials;
        private HttpClient client = HttpClient.newHttpClient();
        private String baseUrl = CB_PRIME_BASE_URL;

        public Builder(CoinbaseCredentials credentials) {
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
