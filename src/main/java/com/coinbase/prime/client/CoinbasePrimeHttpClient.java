package com.coinbase.prime.client;

import com.coinbase.prime.credentials.CoinbasePrimeCredentials;
import com.coinbase.prime.errors.CoinbasePrimeClientException;
import com.coinbase.prime.errors.CoinbasePrimeException;
import com.coinbase.prime.model.activities.GetActivityByActivityIdRequest;
import com.coinbase.prime.model.activities.GetActivityByActivityIdResponse;
import com.coinbase.prime.model.activities.ListActivitiesRequest;
import com.coinbase.prime.model.activities.ListActivitiesResponse;
import com.coinbase.prime.model.addressbook.CreateAddressBookEntryRequest;
import com.coinbase.prime.model.addressbook.CreateAddressBookEntryResponse;
import com.coinbase.prime.model.addressbook.GetAddressBookRequest;
import com.coinbase.prime.model.addressbook.GetAddressBookResponse;
import com.coinbase.prime.model.allocations.*;
import com.coinbase.prime.model.assets.ListAssetsRequest;
import com.coinbase.prime.model.assets.ListAssetsResponse;
import com.coinbase.prime.model.balances.*;
import com.coinbase.prime.model.commission.GetPortfolioCommissionRequest;
import com.coinbase.prime.model.commission.GetPortfolioCommissionResponse;
import com.coinbase.prime.model.invoice.ListInvoicesRequest;
import com.coinbase.prime.model.invoice.Invoice;
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

public class CoinbasePrimeHttpClient implements CoinbasePrimeApi {
    private final CoinbasePrimeCredentials credentials;
    private final String baseUrl;
    HttpClient client;

    private CoinbasePrimeHttpClient(Builder builder) {
        this.credentials = builder.credentials;
        this.client = builder.client;
        this.baseUrl = builder.baseUrl;
    }

    @Override
    public CreatePortfolioAllocationsResponse createPortfolioAllocations(CreatePortfolioAllocationsRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String path = "/allocations";
        String response = post(path, request);
        ObjectMapper mapper = new ObjectMapper();
        try {
            CreatePortfolioAllocationsResponse resp = mapper.readValue(response, CreatePortfolioAllocationsResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public CreatePortfolioNetAllocationsResponse createPortfolioNetAllocations(CreatePortfolioAllocationsRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String path = "/allocations/net";
        String response = post(path, request);
        ObjectMapper mapper = new ObjectMapper();
        try {
            CreatePortfolioNetAllocationsResponse resp = mapper.readValue(response, CreatePortfolioNetAllocationsResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public ListPortfolioAllocationsResponse listPortfolioAllocations(ListPortfolioAllocationsRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String queryParams = request.getQueryString();
        String path = String.format("/portfolios/%s/allocations", request.getPortfolioId());
        String response = get(path, queryParams);
        ObjectMapper mapper = new ObjectMapper();
        try {
            ListPortfolioAllocationsResponse resp = mapper.readValue(response, ListPortfolioAllocationsResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public GetAllocationByIdResponse getAllocationById(GetAllocationByIdRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/allocations/%s", request.getPortfolioId(), request.getAllocationId());
        String response = get(path, "");
        ObjectMapper mapper = new ObjectMapper();
        try {
            GetAllocationByIdResponse resp = mapper.readValue(response, GetAllocationByIdResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public GetNetAllocationsByNettingIdResponse getNetAllocationsByNettingId(GetNetAllocationsByNettingIdRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/allocations/net/%s", request.getPortfolioId(), request.getNettingId());
        String response = get(path, "");
        ObjectMapper mapper = new ObjectMapper();
        try {
            GetNetAllocationsByNettingIdResponse resp = mapper.readValue(response, GetNetAllocationsByNettingIdResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public ListInvoicesResponse listInvoices(ListInvoicesRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String queryParams = request.getQueryString();
        String path = String.format("/entities/%s/invoices", request.getEntityId());
        String response = get(path, queryParams);
        ObjectMapper mapper = new ObjectMapper();
        try {
            ListInvoicesResponse resp = mapper.readValue(response, ListInvoicesResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public ListAssetsResponse listAssets(ListAssetsRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String path = String.format("/entities/%s/assets", request.getEntityId());
        String response = get(path, "");
        ObjectMapper mapper = new ObjectMapper();
        try {
            ListAssetsResponse resp = mapper.readValue(response, ListAssetsResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public ListEntityPaymentMethodsResponse listEntityPaymentMethods(ListEntityPaymentMethodsRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String path = String.format("/entities/%s/payment-methods", request.getEntityId());
        String response = get(path, "");
        ObjectMapper mapper = new ObjectMapper();
        try {
            ListEntityPaymentMethodsResponse resp = mapper.readValue(response, ListEntityPaymentMethodsResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public GetEntityPaymentMethodResponse getEntityPaymentMethod(GetEntityPaymentMethodRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String path = String.format("/entities/%s/payment-methods/%s", request.getEntityId(), request.getPaymentMethodId());
        String response = get(path, "");
        ObjectMapper mapper = new ObjectMapper();
        try {
            GetEntityPaymentMethodResponse resp = mapper.readValue(response, GetEntityPaymentMethodResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public ListUsersResponse listUsers(ListUsersRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String queryParams = request.getPaginationParams() != null ? request.getPaginationParams().generateQueryString(""): "";
        String path = String.format("/entities/%s/users", request.getEntityId());
        String response = get(path, queryParams);
        ObjectMapper mapper = new ObjectMapper();
        try {
            ListUsersResponse resp = mapper.readValue(response, ListUsersResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public ListPortfolioUsersResponse listPortfolioUsers(ListPortfolioUsersRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String queryParams = request.getPaginationParams() != null ? request.getPaginationParams().generateQueryString(""): "";
        String path = String.format("/portfolios/%s/users", request.getPortfolioId());
        String response = get(path, queryParams);
        ObjectMapper mapper = new ObjectMapper();
        try {
            ListPortfolioUsersResponse resp = mapper.readValue(response, ListPortfolioUsersResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
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
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public GetPortfolioByIdResponse getPortfolioById(GetPortfolioByIdRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s", request.getPortfolioId());
        String response = get(path, "");
        ObjectMapper mapper = new ObjectMapper();
        try {
            GetPortfolioByIdResponse resp = mapper.readValue(response, GetPortfolioByIdResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public GetPortfolioCreditInformationResponse getPortfolioCreditInformation(GetPortfolioCreditInformationRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/credit", request.getPortfolioId());
        String response = get(path, "");
        ObjectMapper mapper = new ObjectMapper();
        try {
            GetPortfolioCreditInformationResponse resp = mapper.readValue(response, GetPortfolioCreditInformationResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public ListActivitiesResponse listActivities(ListActivitiesRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String queryParams = request.getQueryString();
        String path = String.format("/portfolios/%s/activities", request.getPortfolioId());
        String response = get(path, queryParams);
        ObjectMapper mapper = new ObjectMapper();
        try {
            ListActivitiesResponse resp = mapper.readValue(response, ListActivitiesResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public GetActivityByActivityIdResponse getActivityByActivityId(GetActivityByActivityIdRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/activities/%s", request.getPortfolioId(), request.getActivityId());
        String response = get(path, "");
        ObjectMapper mapper = new ObjectMapper();
        try {
            GetActivityByActivityIdResponse resp = mapper.readValue(response, GetActivityByActivityIdResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public GetAddressBookResponse getAddressBook(GetAddressBookRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String queryParams = request.getQueryString();
        String path = String.format("/portfolios/%s/address_book", request.getPortfolioId());
        String response = get(path, queryParams);
        ObjectMapper mapper = new ObjectMapper();
        try {
            GetAddressBookResponse resp = mapper.readValue(response, GetAddressBookResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public CreateAddressBookEntryResponse createAddressBookEntry(CreateAddressBookEntryRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/address_book", request.getPortfolioId());
        String response = post(path, request);
        ObjectMapper mapper = new ObjectMapper();
        try {
            CreateAddressBookEntryResponse resp = mapper.readValue(response, CreateAddressBookEntryResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public ListPortfolioBalancesResponse listPortfolioBalances(ListPortfolioBalancesRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String queryParams = request.getQueryString();
        String path = String.format("/portfolios/%s/balances", request.getPortfolioId());
        String response = get(path, queryParams);
        ObjectMapper mapper = new ObjectMapper();
        try {
            ListPortfolioBalancesResponse resp = mapper.readValue(response, ListPortfolioBalancesResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public GetWalletBalanceResponse getWalletBalance(GetWalletBalanceRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/wallets/%s/balance", request.getPortfolioId(), request.getWalletId());
        String response = get(path, "");
        ObjectMapper mapper = new ObjectMapper();
        try {
            GetWalletBalanceResponse resp = mapper.readValue(response, GetWalletBalanceResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public ListWeb3WalletBalancesResponse listWeb3WalletBalances(ListWeb3WalletBalancesRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/wallets/%s/web3_balances", request.getPortfolioId(), request.getWalletId());
        String response = get(path, "");
        ObjectMapper mapper = new ObjectMapper();
        try {
            ListWeb3WalletBalancesResponse resp = mapper.readValue(response, ListWeb3WalletBalancesResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public GetPortfolioCommissionResponse getPortfolioCommission(GetPortfolioCommissionRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/commission", request.getPortfolioId());
        String response = get(path, "");
        ObjectMapper mapper = new ObjectMapper();
        try {
            GetPortfolioCommissionResponse resp = mapper.readValue(response, GetPortfolioCommissionResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public ListOpenOrdersResponse listOpenOrders(ListOpenOrdersRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String queryParams = request.getQueryString();
        String path = String.format("/portfolios/%s/open_orders", request.getPortfolioId());
        String response = get(path, queryParams);
        ObjectMapper mapper = new ObjectMapper();
        try {
            ListOpenOrdersResponse resp = mapper.readValue(response, ListOpenOrdersResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public CreateOrderResponse createOrder(CreateOrderRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/order", request.getPortfolioId());
        String response = post(path, request);
        ObjectMapper mapper = new ObjectMapper();
        try {
            CreateOrderResponse resp = mapper.readValue(response, CreateOrderResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public GetOrderPreviewResponse getOrderPreview(GetOrderPreviewRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/order_preview", request.getPortfolioId());
        String response = post(path, request);
        ObjectMapper mapper = new ObjectMapper();
        try {
            GetOrderPreviewResponse resp = mapper.readValue(response, GetOrderPreviewResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public ListPortfolioOrdersResponse listPortfolioOrders(ListPortfolioOrdersRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String response = get(String.format("/portfolios/%s/orders", request.getPortfolioId()), "");
        if (response == null) {
            return null;
        }

        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(response, ListPortfolioOrdersResponse.class);
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public GetOrderByOrderIdResponse getOrderByOrderId(GetOrderByOrderIdRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/orders/%s", request.getPortfolioId(), request.getOrderId());
        String response = get(path, "");
        ObjectMapper mapper = new ObjectMapper();
        try {
            GetOrderByOrderIdResponse resp = mapper.readValue(response, GetOrderByOrderIdResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public CancelOrderResponse cancelOrder(CancelOrderRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/orders/%s/cancel", request.getPortfolioId(), request.getOrderId());
        String response = post(path, request);
        ObjectMapper mapper = new ObjectMapper();
        try {
            CancelOrderResponse resp = mapper.readValue(response, CancelOrderResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public ListOrderFillsResponse listOrderFills(ListOrderFillsRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String queryParams = request.getQueryString();
        String path = String.format("/portfolios/%s/orders/%s/fills", request.getPortfolioId(), request.getOrderId());
        String response = get(path, queryParams);
        ObjectMapper mapper = new ObjectMapper();
        try {
            ListOrderFillsResponse resp = mapper.readValue(response, ListOrderFillsResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public ListPortfolioProductsResponse listPortfolioProducts(ListPortfolioProductsRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String queryParams = request.getQueryString();
        String path = String.format("/portfolios/%s/products", request.getPortfolioId());
        String response = get(path, queryParams);
        ObjectMapper mapper = new ObjectMapper();
        try {
            ListPortfolioProductsResponse resp = mapper.readValue(response, ListPortfolioProductsResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public GetTransactionByTransactionIdResponse getTransactionByTransactionId(GetTransactionByTransactionIdRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/transactions/%s", request.getPortfolioId(), request.getTransactionId());
        String response = get(path, "");
        ObjectMapper mapper = new ObjectMapper();
        try {
            GetTransactionByTransactionIdResponse resp = mapper.readValue(response, GetTransactionByTransactionIdResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public CreateConversionResponse createConversion(CreateConversionRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/wallets/%s/conversion", request.getPortfolioId(), request.getWalletId());
        String response = post(path, request);
        ObjectMapper mapper = new ObjectMapper();
        try {
            CreateConversionResponse resp = mapper.readValue(response, CreateConversionResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public ListWalletTransactionsResponse listWalletTransactions(ListWalletTransactionsRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String queryParams = request.getQueryString();
        String path = String.format("/portfolios/%s/wallets/%s/transactions", request.getPortfolioId(), request.getWalletId());
        String response = get(path, queryParams);
        ObjectMapper mapper = new ObjectMapper();
        try {
            ListWalletTransactionsResponse resp = mapper.readValue(response, ListWalletTransactionsResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public CreateTransferResponse createTransfer(CreateTransferRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/wallets/%s/transfers", request.getPortfolioId(), request.getWalletId());
        String response = post(path, request);
        ObjectMapper mapper = new ObjectMapper();
        try {
            CreateTransferResponse resp = mapper.readValue(response, CreateTransferResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public CreateWithdrawalResponse createWithdrawal(CreateWithdrawalRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/wallets/%s/withdrawals", request.getPortfolioId(), request.getWalletId());
        String response = post(path, request);
        ObjectMapper mapper = new ObjectMapper();
        try {
            CreateWithdrawalResponse resp = mapper.readValue(response, CreateWithdrawalResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public ListWalletsResponse listWallets(ListWalletsRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String queryParams = request.getQueryString();
        String path = String.format("/portfolios/%s/wallets", request.getPortfolioId());
        String response = get(path, queryParams);
        ObjectMapper mapper = new ObjectMapper();
        try {
            ListWalletsResponse resp = mapper.readValue(response, ListWalletsResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public CreateWalletResponse createWallet(CreateWalletRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/wallets", request.getPortfolioId());
        String response = post(path, request);
        ObjectMapper mapper = new ObjectMapper();
        try {
            CreateWalletResponse resp = mapper.readValue(response, CreateWalletResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public GetWalletByIdResponse getWalletById(GetWalletByIdRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/wallets/%s", request.getPortfolioId(), request.getWalletId());
        String response = get(path, "");
        ObjectMapper mapper = new ObjectMapper();
        try {
            GetWalletByIdResponse resp = mapper.readValue(response, GetWalletByIdResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
        }
    }

    @Override
    public GetWalletDepositInstructionsResponse getWalletDepositInstructions(GetWalletDepositInstructionsRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        String path = String.format("/portfolios/%s/wallets/%s/deposit_instructions", request.getPortfolioId(), request.getWalletId());
        String response = get(path, "");
        ObjectMapper mapper = new ObjectMapper();
        try {
            GetWalletDepositInstructionsResponse resp = mapper.readValue(response, GetWalletDepositInstructionsResponse.class);
            resp.setRequest(request);
            return resp;
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
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

    private String post(String path, Object request) throws CoinbasePrimeClientException, CoinbasePrimeException {
        HttpRequest.Builder builder = generateHttpRequest(path, "");
        if (builder == null) {
            throw new CoinbasePrimeClientException("Failed to generate HttpRequest");
        }

        ObjectMapper mapper = new ObjectMapper();
        HttpRequest httpRequest;
        try {
            httpRequest = builder
                    .POST(HttpRequest.BodyPublishers.ofString(mapper.writeValueAsString(request)))
                    .build();
        } catch (IOException e) {
            throw new CoinbasePrimeClientException(e);
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
            throw new CoinbasePrimeClientException(e);
        }

        return HttpRequest.newBuilder()
                .uri(uri)
                .header("X-CB-ACCESS-KEY", credentials.getAccessKey())
                .header("X-CB-ACCESS-PASSPHRASE", credentials.getPassphrase())
                .header("X-CB-ACCESS-SIGNATURE", signature)
                .header("X-CB-ACCESS-TIMESTAMP", String.valueOf(unixTime));
    }

    private String sendRequest(HttpRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException {
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

        private void validate() throws CoinbasePrimeClientException {
            if (credentials == null) {
                throw new CoinbasePrimeClientException("CoinbasePrimeHttpClient did not receive valid credentials");
            }
        }
    }
}
