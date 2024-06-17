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

import com.coinbase.core.errors.CoinbaseClientException;
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

public interface CoinbasePrimeApi {
    // Allocations
    CreateAllocationResponse createAllocation(CreateAllocationRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    CreateNetAllocationResponse createNetAllocation(CreateNetAllocationRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    GetPortfolioAllocationsResponse getPortfolioAllocations(GetPortfolioAllocationsRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    GetAllocationResponse getAllocation(GetAllocationRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    GetAllocationsByClientNettingIdResponse getNetAllocationsByNettingId(GetAllocationsByClientNettingIdRequest request) throws CoinbaseClientException, CoinbasePrimeException;

    // Invoice
    ListInvoicesResponse listInvoices(ListInvoicesRequest request) throws CoinbaseClientException, CoinbasePrimeException;

    // Assets
    ListAssetsResponse listAssets(ListAssetsRequest request) throws CoinbaseClientException, CoinbasePrimeException;

    // Payment Methods
    ListEntityPaymentMethodsResponse listEntityPaymentMethods(ListEntityPaymentMethodsRequest entityId);
    GetEntityPaymentMethodResponse getEntityPaymentMethod(GetEntityPaymentMethodRequest request) throws CoinbaseClientException, CoinbasePrimeException;

    // Users
    ListUsersResponse listUsers(ListUsersRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    ListPortfolioUsersResponse listPortfolioUsers(ListPortfolioUsersRequest request) throws CoinbaseClientException, CoinbasePrimeException;

    // Portfolios
    ListPortfoliosResponse listPortfolios();
    GetPortfolioByIdResponse getPortfolioById(GetPortfolioByIdRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    GetPortfolioCreditInformationResponse getPortfolioCreditInformation(GetPortfolioCreditInformationRequest request) throws CoinbaseClientException, CoinbasePrimeException;

    // Activities
    ListActivitiesResponse listActivities(ListActivitiesRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    GetActivityByActivityIdResponse getActivityByActivityId(GetActivityByActivityIdRequest request) throws CoinbaseClientException, CoinbasePrimeException;

    // Address Book
    GetPortfolioAddressBookResponse getAddressBook(GetPortfolioAddressBookRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    CreateAddressBookEntryResponse createAddressBookEntry(CreateAddressBookEntryRequest request) throws CoinbaseClientException, CoinbasePrimeException;

    // Balances
    ListPortfolioBalancesResponse listPortfolioBalances(ListPortfolioBalancesRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    GetWalletBalanceResponse getWalletBalance(GetWalletBalanceRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    ListWeb3WalletBalancesResponse listWeb3WalletBalances(ListWeb3WalletBalancesRequest request) throws CoinbaseClientException, CoinbasePrimeException;

    // Commission
    GetPortfolioCommissionResponse getPortfolioCommission(GetPortfolioCommissionRequest request) throws CoinbaseClientException, CoinbasePrimeException;

    // Orders
    ListOpenOrdersResponse listOpenOrders(ListOpenOrdersRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    CreateOrderResponse createOrder(CreateOrderRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    GetOrderPreviewResponse getOrderPreview(GetOrderPreviewRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    ListPortfolioOrdersResponse listPortfolioOrders(ListPortfolioOrdersRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    GetOrderByOrderIdResponse getOrderByOrderId(GetOrderByOrderIdRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    CancelOrderResponse cancelOrder(CancelOrderRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    ListOrderFillsResponse listOrderFills(ListOrderFillsRequest request) throws CoinbaseClientException, CoinbasePrimeException;

    // Products
    ListPortfolioProductsResponse listPortfolioProducts(ListPortfolioProductsRequest request) throws CoinbaseClientException, CoinbasePrimeException;

    // Transactions
    GetTransactionByTransactionIdResponse getTransactionByTransactionId(GetTransactionByTransactionIdRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    CreateConversionResponse createConversion(CreateConversionRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    ListPortfolioTransactionsResponse listPortfolioTransactions(ListPortfolioTransactionsRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    ListWalletTransactionsResponse listWalletTransactions(ListWalletTransactionsRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    CreateTransferResponse createTransfer(CreateTransferRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    CreateWithdrawalResponse createWithdrawal(CreateWithdrawalRequest request) throws CoinbaseClientException, CoinbasePrimeException;

    // Wallets
    ListWalletsResponse listWallets(ListWalletsRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    CreateWalletResponse createWallet(CreateWalletRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    GetWalletByIdResponse getWalletById(GetWalletByIdRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    GetWalletDepositInstructionsResponse getWalletDepositInstructions(GetWalletDepositInstructionsRequest request) throws CoinbaseClientException, CoinbasePrimeException;
}
