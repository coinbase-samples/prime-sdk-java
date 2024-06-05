package com.coinbase.prime.client;

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

public interface CoinbasePrimeApi {
    CreateAllocationResponse createAllocation(CreateAllocationRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    CreateNetAllocationResponse createNetAllocation(CreateAllocationRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    GetPortfolioAllocationsResponse getPortfolioAllocations(GetPortfolioAllocationsRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    GetAllocationResponse getAllocation(GetAllocationRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    GetAllocationsByClientNettingIdResponse getNetAllocationsByNettingId(GetAllocationsByClientNettingIdRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;

    ListInvoicesResponse listInvoices(ListInvoicesRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;

    ListAssetsResponse listAssets(ListAssetsRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;

    ListEntityPaymentMethodsResponse listEntityPaymentMethods(ListEntityPaymentMethodsRequest entityId);
    GetEntityPaymentMethodResponse getEntityPaymentMethod(GetEntityPaymentMethodRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;

    ListUsersResponse listUsers(ListUsersRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    ListPortfolioUsersResponse listPortfolioUsers(ListPortfolioUsersRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;

    ListActivitiesResponse listActivities(ListActivitiesRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    GetActivityByActivityIdResponse getActivityByActivityId(GetActivityByActivityIdRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;

    GetAddressBookResponse getAddressBook(GetAddressBookRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    CreateAddressBookEntryResponse createAddressBookEntry(CreateAddressBookEntryRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;

    ListPortfolioBalancesResponse listPortfolioBalances(ListPortfolioBalancesRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    GetWalletBalanceResponse getWalletBalance(GetWalletBalanceRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    ListWeb3WalletBalancesResponse listWeb3WalletBalances(ListWeb3WalletBalancesRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;

    GetPortfolioCommissionResponse getPortfolioCommission(GetPortfolioCommissionRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;

    ListOpenOrdersResponse listOpenOrders(ListOpenOrdersRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    CreateOrderResponse createOrder(CreateOrderRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    GetOrderPreviewResponse getOrderPreview(GetOrderPreviewRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    ListPortfolioOrdersResponse listPortfolioOrders(ListPortfolioOrdersRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    GetOrderByOrderIdResponse getOrderByOrderId(GetOrderByOrderIdRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    CancelOrderResponse cancelOrder(CancelOrderRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    ListOrderFillsResponse listOrderFills(ListOrderFillsRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;

    ListPortfolioProductsResponse listPortfolioProducts(ListPortfolioProductsRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    GetTransactionByTransactionIdResponse getTransactionByTransactionId(GetTransactionByTransactionIdRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    CreateConversionResponse createConversion(CreateConversionRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    ListWalletTransactionsResponse listWalletTransactions(ListWalletTransactionsRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    CreateTransferResponse createTransfer(CreateTransferRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    CreateWithdrawalResponse createWithdrawal(CreateWithdrawalRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;

    ListPortfoliosResponse listPortfolios();
    GetPortfolioByIdResponse getPortfolioById(GetPortfolioByIdRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    GetPortfolioCreditInformationResponse getPortfolioCreditInformation(GetPortfolioCreditInformationRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;

    ListWalletsResponse listWallets(ListWalletsRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    CreateWalletResponse createWallet(CreateWalletRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    GetWalletByIdResponse getWalletById(GetWalletByIdRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    GetWalletDepositInstructionsResponse getWalletDepositInstructions(GetWalletDepositInstructionsRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
}
