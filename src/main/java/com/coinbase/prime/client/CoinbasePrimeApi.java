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
    CreateAllocationResponse createAllocation(CreateAllocationRequest request) throws CoinbasePrimeException, CoinbasePrimeException;
    CreateNetAllocationResponse createNetAllocation(CreateAllocationRequest request) throws CoinbasePrimeException, CoinbasePrimeException;
    GetPortfolioAllocationsResponse getPortfolioAllocations(GetPortfolioAllocationsRequest request) throws CoinbasePrimeException, CoinbasePrimeException;
    GetAllocationResponse getAllocation(GetAllocationRequest request) throws CoinbasePrimeException, CoinbasePrimeException;
    GetAllocationsByClientNettingIdResponse getNetAllocationsByNettingId(GetAllocationsByClientNettingIdRequest request) throws CoinbasePrimeException, CoinbasePrimeException;

    // Invoice
    ListInvoicesResponse listInvoices(ListInvoicesRequest request) throws CoinbasePrimeException, CoinbasePrimeException;

    // Assets
    ListAssetsResponse listAssets(ListAssetsRequest request) throws CoinbasePrimeException, CoinbasePrimeException;

    // Payment Methods
    ListEntityPaymentMethodsResponse listEntityPaymentMethods(ListEntityPaymentMethodsRequest entityId);
    GetEntityPaymentMethodResponse getEntityPaymentMethod(GetEntityPaymentMethodRequest request) throws CoinbasePrimeException, CoinbasePrimeException;

    // Users
    ListUsersResponse listUsers(ListUsersRequest request) throws CoinbasePrimeException, CoinbasePrimeException;
    ListPortfolioUsersResponse listPortfolioUsers(ListPortfolioUsersRequest request) throws CoinbasePrimeException, CoinbasePrimeException;

    // Portfolios
    ListPortfoliosResponse listPortfolios();
    GetPortfolioByIdResponse getPortfolioById(GetPortfolioByIdRequest request) throws CoinbasePrimeException, CoinbasePrimeException;
    GetPortfolioCreditInformationResponse getPortfolioCreditInformation(GetPortfolioCreditInformationRequest request) throws CoinbasePrimeException, CoinbasePrimeException;

    // Activities
    ListActivitiesResponse listActivities(ListActivitiesRequest request) throws CoinbasePrimeException, CoinbasePrimeException;
    GetActivityByActivityIdResponse getActivityByActivityId(GetActivityByActivityIdRequest request) throws CoinbasePrimeException, CoinbasePrimeException;

    // Address Book
    GetPortfolioAddressBookResponse getAddressBook(GetPortfolioAddressBookRequest request) throws CoinbasePrimeException, CoinbasePrimeException;
    CreateAddressBookEntryResponse createAddressBookEntry(CreateAddressBookEntryRequest request) throws CoinbasePrimeException, CoinbasePrimeException;

    // Balances
    ListPortfolioBalancesResponse listPortfolioBalances(ListPortfolioBalancesRequest request) throws CoinbasePrimeException, CoinbasePrimeException;
    GetWalletBalanceResponse getWalletBalance(GetWalletBalanceRequest request) throws CoinbasePrimeException, CoinbasePrimeException;
    ListWeb3WalletBalancesResponse listWeb3WalletBalances(ListWeb3WalletBalancesRequest request) throws CoinbasePrimeException, CoinbasePrimeException;

    // Commission
    GetPortfolioCommissionResponse getPortfolioCommission(GetPortfolioCommissionRequest request) throws CoinbasePrimeException, CoinbasePrimeException;

    // Orders
    ListOpenOrdersResponse listOpenOrders(ListOpenOrdersRequest request) throws CoinbasePrimeException, CoinbasePrimeException;
    CreateOrderResponse createOrder(CreateOrderRequest request) throws CoinbasePrimeException, CoinbasePrimeException;
    GetOrderPreviewResponse getOrderPreview(GetOrderPreviewRequest request) throws CoinbasePrimeException, CoinbasePrimeException;
    ListPortfolioOrdersResponse listPortfolioOrders(ListPortfolioOrdersRequest request) throws CoinbasePrimeException, CoinbasePrimeException;
    GetOrderByOrderIdResponse getOrderByOrderId(GetOrderByOrderIdRequest request) throws CoinbasePrimeException, CoinbasePrimeException;
    CancelOrderResponse cancelOrder(CancelOrderRequest request) throws CoinbasePrimeException, CoinbasePrimeException;
    ListOrderFillsResponse listOrderFills(ListOrderFillsRequest request) throws CoinbasePrimeException, CoinbasePrimeException;

    // Products
    ListPortfolioProductsResponse listPortfolioProducts(ListPortfolioProductsRequest request) throws CoinbasePrimeException, CoinbasePrimeException;

    // Transactions
    GetTransactionByTransactionIdResponse getTransactionByTransactionId(GetTransactionByTransactionIdRequest request) throws CoinbasePrimeException, CoinbasePrimeException;
    CreateConversionResponse createConversion(CreateConversionRequest request) throws CoinbasePrimeException, CoinbasePrimeException;
    ListPortfolioTransactionsResponse listPortfolioTransactions(ListPortfolioTransactionsRequest request) throws CoinbasePrimeException, CoinbasePrimeException;
    ListWalletTransactionsResponse listWalletTransactions(ListWalletTransactionsRequest request) throws CoinbasePrimeException, CoinbasePrimeException;
    CreateTransferResponse createTransfer(CreateTransferRequest request) throws CoinbasePrimeException, CoinbasePrimeException;
    CreateWithdrawalResponse createWithdrawal(CreateWithdrawalRequest request) throws CoinbasePrimeException, CoinbasePrimeException;

    // Wallets
    ListWalletsResponse listWallets(ListWalletsRequest request) throws CoinbasePrimeException, CoinbasePrimeException;
    CreateWalletResponse createWallet(CreateWalletRequest request) throws CoinbasePrimeException, CoinbasePrimeException;
    GetWalletByIdResponse getWalletById(GetWalletByIdRequest request) throws CoinbasePrimeException, CoinbasePrimeException;
    GetWalletDepositInstructionsResponse getWalletDepositInstructions(GetWalletDepositInstructionsRequest request) throws CoinbasePrimeException, CoinbasePrimeException;
}
