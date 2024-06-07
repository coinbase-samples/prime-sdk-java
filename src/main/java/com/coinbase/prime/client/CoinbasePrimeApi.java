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

import com.coinbase.prime.errors.CoinbasePrimeClientException;
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
    CreateAllocationResponse createAllocation(CreateAllocationRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    CreateNetAllocationResponse createNetAllocation(CreateAllocationRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    GetPortfolioAllocationsResponse getPortfolioAllocations(GetPortfolioAllocationsRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    GetAllocationResponse getAllocation(GetAllocationRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    GetAllocationsByClientNettingIdResponse getNetAllocationsByNettingId(GetAllocationsByClientNettingIdRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;

    // Invoice
    ListInvoicesResponse listInvoices(ListInvoicesRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;

    // Assets
    ListAssetsResponse listAssets(ListAssetsRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;

    // Payment Methods
    ListEntityPaymentMethodsResponse listEntityPaymentMethods(ListEntityPaymentMethodsRequest entityId);
    GetEntityPaymentMethodResponse getEntityPaymentMethod(GetEntityPaymentMethodRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;

    // Users
    ListUsersResponse listUsers(ListUsersRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    ListPortfolioUsersResponse listPortfolioUsers(ListPortfolioUsersRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;

    // Portfolios
    ListPortfoliosResponse listPortfolios();
    GetPortfolioByIdResponse getPortfolioById(GetPortfolioByIdRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    GetPortfolioCreditInformationResponse getPortfolioCreditInformation(GetPortfolioCreditInformationRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;

    // Activities
    ListActivitiesResponse listActivities(ListActivitiesRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    GetActivityByActivityIdResponse getActivityByActivityId(GetActivityByActivityIdRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;

    // Address Book
    GetPortfolioAddressBookResponse getAddressBook(GetPortfolioAddressBookRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    CreateAddressBookEntryResponse createAddressBookEntry(CreateAddressBookEntryRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;

    // Balances
    ListPortfolioBalancesResponse listPortfolioBalances(ListPortfolioBalancesRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    GetWalletBalanceResponse getWalletBalance(GetWalletBalanceRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    ListWeb3WalletBalancesResponse listWeb3WalletBalances(ListWeb3WalletBalancesRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;

    // Commission
    GetPortfolioCommissionResponse getPortfolioCommission(GetPortfolioCommissionRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;

    // Orders
    ListOpenOrdersResponse listOpenOrders(ListOpenOrdersRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    CreateOrderResponse createOrder(CreateOrderRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    GetOrderPreviewResponse getOrderPreview(GetOrderPreviewRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    ListPortfolioOrdersResponse listPortfolioOrders(ListPortfolioOrdersRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    GetOrderByOrderIdResponse getOrderByOrderId(GetOrderByOrderIdRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    CancelOrderResponse cancelOrder(CancelOrderRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    ListOrderFillsResponse listOrderFills(ListOrderFillsRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;

    // Products
    ListPortfolioProductsResponse listPortfolioProducts(ListPortfolioProductsRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;

    // Transactions
    GetTransactionByTransactionIdResponse getTransactionByTransactionId(GetTransactionByTransactionIdRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    CreateConversionResponse createConversion(CreateConversionRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    ListPortfolioTransactionsResponse listPortfolioTransactions(ListPortfolioTransactionsRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    ListWalletTransactionsResponse listWalletTransactions(ListWalletTransactionsRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    CreateTransferResponse createTransfer(CreateTransferRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    CreateWithdrawalResponse createWithdrawal(CreateWithdrawalRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;

    // Wallets
    ListWalletsResponse listWallets(ListWalletsRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    CreateWalletResponse createWallet(CreateWalletRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    GetWalletByIdResponse getWalletById(GetWalletByIdRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
    GetWalletDepositInstructionsResponse getWalletDepositInstructions(GetWalletDepositInstructionsRequest request) throws CoinbasePrimeClientException, CoinbasePrimeException;
}
