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

package com.coinbase.prime.factory;

import com.coinbase.prime.activities.ActivitiesService;
import com.coinbase.prime.activities.ActivitiesServiceImpl;
import com.coinbase.prime.addressbook.AddressBookService;
import com.coinbase.prime.addressbook.AddressBookServiceImpl;
import com.coinbase.prime.allocations.AllocationsService;
import com.coinbase.prime.allocations.AllocationsServiceImpl;
import com.coinbase.prime.assets.AssetsService;
import com.coinbase.prime.assets.AssetsServiceImpl;
import com.coinbase.prime.balances.BalancesService;
import com.coinbase.prime.balances.BalancesServiceImpl;
import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.commission.CommissionService;
import com.coinbase.prime.commission.CommissionServiceImpl;
import com.coinbase.prime.financing.FinancingService;
import com.coinbase.prime.financing.FinancingServiceImpl;
import com.coinbase.prime.futures.FuturesService;
import com.coinbase.prime.futures.FuturesServiceImpl;
import com.coinbase.prime.invoice.InvoiceService;
import com.coinbase.prime.invoice.InvoiceServiceImpl;
import com.coinbase.prime.onchainaddressbook.OnchainAddressBookService;
import com.coinbase.prime.onchainaddressbook.OnchainAddressBookServiceImpl;
import com.coinbase.prime.onchainaddressgroups.OnchainAddressGroupsService;
import com.coinbase.prime.onchainaddressgroups.OnchainAddressGroupsServiceImpl;
import com.coinbase.prime.orders.OrdersService;
import com.coinbase.prime.orders.OrdersServiceImpl;
import com.coinbase.prime.paymentmethods.PaymentMethodsService;
import com.coinbase.prime.paymentmethods.PaymentMethodsServiceImpl;
import com.coinbase.prime.portfolios.PortfoliosService;
import com.coinbase.prime.portfolios.PortfoliosServiceImpl;
import com.coinbase.prime.positions.PositionsService;
import com.coinbase.prime.positions.PositionsServiceImpl;
import com.coinbase.prime.products.ProductsService;
import com.coinbase.prime.products.ProductsServiceImpl;
import com.coinbase.prime.staking.StakingService;
import com.coinbase.prime.staking.StakingServiceImpl;
import com.coinbase.prime.transactions.TransactionsService;
import com.coinbase.prime.transactions.TransactionsServiceImpl;
import com.coinbase.prime.users.UsersService;
import com.coinbase.prime.users.UsersServiceImpl;
import com.coinbase.prime.wallets.WalletsService;
import com.coinbase.prime.wallets.WalletsServiceImpl;

public class PrimeServiceFactory {
    public static ActivitiesService createActivitiesService(CoinbasePrimeClient client) {
        return new ActivitiesServiceImpl(client);
    }

    public static AddressBookService createAddressBookService(CoinbasePrimeClient client) {
        return new AddressBookServiceImpl(client);
    }

    public static AllocationsService createAllocationsService(CoinbasePrimeClient client) {
        return new AllocationsServiceImpl(client);
    }

    public static AssetsService createAssetsService(CoinbasePrimeClient client) {
        return new AssetsServiceImpl(client);
    }

    public static BalancesService createBalancesService(CoinbasePrimeClient client) {
        return new BalancesServiceImpl(client);
    }

    public static CommissionService createCommissionService(CoinbasePrimeClient client) {
        return new CommissionServiceImpl(client);
    }

    public static FinancingService createFinancingService(CoinbasePrimeClient client) {
        return new FinancingServiceImpl(client);
    }

    public static FuturesService createFuturesService(CoinbasePrimeClient client) {
        return new FuturesServiceImpl(client);
    }

    public static InvoiceService createInvoiceService(CoinbasePrimeClient client) {
        return new InvoiceServiceImpl(client);
    }

    public static OnchainAddressBookService createOnchainAddressBookService(CoinbasePrimeClient client) {
        return new OnchainAddressBookServiceImpl(client);
    }

    public static OnchainAddressGroupsService createOnchainAddressGroupsService(CoinbasePrimeClient client) {
        return new OnchainAddressGroupsServiceImpl(client);
    }

    public static OrdersService createOrdersService(CoinbasePrimeClient client) {
        return new OrdersServiceImpl(client);
    }

    public static PaymentMethodsService createPaymentMethodsService(CoinbasePrimeClient client) {
        return new PaymentMethodsServiceImpl(client);
    }

    public static PortfoliosService createPortfoliosService(CoinbasePrimeClient client) {
        return new PortfoliosServiceImpl(client);
    }

    public static PositionsService createPositionsService(CoinbasePrimeClient client) {
        return new PositionsServiceImpl(client);
    }

    public static ProductsService createProductsService(CoinbasePrimeClient client) {
        return new ProductsServiceImpl(client);
    }

    public static StakingService createStakingService(CoinbasePrimeClient client) {
        return new StakingServiceImpl(client);
    }

    public static TransactionsService createTransactionsService(CoinbasePrimeClient client) {
        return new TransactionsServiceImpl(client);
    }

    public static UsersService createUsersService(CoinbasePrimeClient client) {
        return new UsersServiceImpl(client);
    }

    public static WalletsService createWalletsService(CoinbasePrimeClient client) {
        return new WalletsServiceImpl(client);
    }
}
