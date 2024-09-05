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

package com.coinbase.prime.common;

import com.coinbase.core.errors.CoinbaseClientException;
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
import com.coinbase.prime.invoice.InvoiceService;
import com.coinbase.prime.invoice.InvoiceServiceImpl;
import com.coinbase.prime.orders.OrdersService;
import com.coinbase.prime.orders.OrdersServiceImpl;
import com.coinbase.prime.paymentmethods.PaymentMethodsService;
import com.coinbase.prime.paymentmethods.PaymentMethodsServiceImpl;
import com.coinbase.prime.portfolios.PortfoliosService;
import com.coinbase.prime.portfolios.PortfoliosServiceImpl;
import com.coinbase.prime.products.ProductsService;
import com.coinbase.prime.products.ProductsServiceImpl;
import com.coinbase.prime.transactions.TransactionsService;
import com.coinbase.prime.transactions.TransactionsServiceImpl;
import com.coinbase.prime.users.UsersService;
import com.coinbase.prime.users.UsersServiceImpl;
import com.coinbase.prime.wallets.WalletsService;
import com.coinbase.prime.wallets.WalletsServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class PrimeServiceFactory {
    private static final Map<Class<?>, Class<?>> serviceRegistry = new HashMap<>();

    static {
        // Mapping service interfaces to their respective implementations
        serviceRegistry.put(ActivitiesService.class, ActivitiesServiceImpl.class);
        serviceRegistry.put(AddressBookService.class, AddressBookServiceImpl.class);
        serviceRegistry.put(AllocationsService.class, AllocationsServiceImpl.class);
        serviceRegistry.put(AssetsService.class, AssetsServiceImpl.class);
        serviceRegistry.put(BalancesService.class, BalancesServiceImpl.class);
        serviceRegistry.put(CommissionService.class, CommissionServiceImpl.class);
        serviceRegistry.put(InvoiceService.class, InvoiceServiceImpl.class);
        serviceRegistry.put(OrdersService.class, OrdersServiceImpl.class);
        serviceRegistry.put(PaymentMethodsService.class, PaymentMethodsServiceImpl.class);
        serviceRegistry.put(PortfoliosService.class, PortfoliosServiceImpl.class);
        serviceRegistry.put(ProductsService.class, ProductsServiceImpl.class);
        serviceRegistry.put(TransactionsService.class, TransactionsServiceImpl.class);
        serviceRegistry.put(UsersService.class, UsersServiceImpl.class);
        serviceRegistry.put(WalletsService.class, WalletsServiceImpl.class);
    }

    public static <T> T createService(Class<T> serviceInterface, CoinbasePrimeClient client) {
        try {
            // Look up the implementation class for the given service interface
            Class<?> implClass = serviceRegistry.get(serviceInterface);
            if (implClass != null) {
                // Return a new instance of the implementation class
                return (T) implClass.getDeclaredConstructor(CoinbasePrimeClient.class).newInstance(client);
            } else {
                throw new CoinbaseClientException("No implementation found for: " + serviceInterface.getName());
            }
        } catch (Exception e) {
            throw new CoinbaseClientException("Failed to create service for: " + serviceInterface.getName(), e);
        }
    }
}
