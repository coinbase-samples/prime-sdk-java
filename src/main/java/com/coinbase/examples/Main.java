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

package com.coinbase.examples;

import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.factory.PrimeServiceFactory;
import com.coinbase.prime.credentials.CoinbasePrimeCredentials;
import com.coinbase.prime.model.orders.*;
import com.coinbase.prime.model.portfolios.GetPortfolioByIdRequest;
import com.coinbase.prime.model.portfolios.GetPortfolioByIdResponse;
import com.coinbase.prime.model.transactions.ListPortfolioTransactionsRequest;
import com.coinbase.prime.model.transactions.ListPortfolioTransactionsResponse;
import com.coinbase.prime.model.transactions.TransactionType;
import com.coinbase.prime.model.wallets.ListWalletsRequest;
import com.coinbase.prime.model.wallets.ListWalletsResponse;
import com.coinbase.prime.model.wallets.WalletType;
import com.coinbase.prime.orders.OrdersService;
import com.coinbase.prime.portfolios.PortfoliosService;
import com.coinbase.prime.transactions.TransactionsService;
import com.coinbase.prime.wallets.WalletsService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        String credsStringBlob = System.getenv("COINBASE_PRIME_CREDENTIALS");
        ObjectMapper mapper = new ObjectMapper();

        try {
            CoinbasePrimeCredentials credentials = new CoinbasePrimeCredentials(credsStringBlob);
            CoinbasePrimeClient client = new CoinbasePrimeClient(credentials);

            String portfolioId = System.getenv("COINBASE_PRIME_PORTFOLIO_ID");

            PortfoliosService portfoliosService = PrimeServiceFactory.createPortfoliosService(client);
            GetPortfolioByIdResponse portfolioResponse = portfoliosService.getPortfolioById(
                    new GetPortfolioByIdRequest.Builder()
                            .portfolioId(portfolioId)
                            .build());

            System.out.println(mapper.writeValueAsString(portfolioResponse));

            WalletsService walletsService = PrimeServiceFactory.createWalletsService(client);
            ListWalletsResponse walletsResponse = walletsService.listWallets(
                    new ListWalletsRequest.Builder()
                            .portfolioId(portfolioResponse.getPortfolio().getId())
                            .type(WalletType.VAULT)
                            .symbols(new String[]{"ADA"})
                            .build());

            System.out.println(mapper.writeValueAsString(walletsResponse));

            TransactionsService transactionsService = PrimeServiceFactory.createTransactionsService(client);
            ListPortfolioTransactionsResponse listTransactionsResponse = transactionsService.listPortfolioTransactions(
                    new ListPortfolioTransactionsRequest.Builder()
                            .portfolioId(portfolioResponse.getPortfolio().getId())
                            .symbols(new String[]{"ADA"})
                            .types(new TransactionType[]{TransactionType.CLAIM_REWARDS})
                            .build());
            System.out.println(mapper.writeValueAsString(listTransactionsResponse));

            OrdersService ordersService = PrimeServiceFactory.createOrdersService(client);
            CreateOrderResponse orderResponse = ordersService.createOrder(
                    new CreateOrderRequest.Builder()
                            .portfolioId(portfolioResponse.getPortfolio().getId())
                            .productId("ADA-USD")
                            .side(OrderSide.BUY)
                            .type(OrderType.MARKET)
                            .baseQuantity("10.0")
                            .clientOrderId(UUID.randomUUID().toString())
                            .build());
            System.out.println(mapper.writeValueAsString(orderResponse));

            // Wait for the order to be processed by Coinbase Prime
            Thread.sleep(1000);
            GetOrderByOrderIdResponse getOrderResponse = ordersService.getOrderByOrderId(
                    new GetOrderByOrderIdRequest.Builder()
                            .portfolioId(portfolioResponse.getPortfolio().getId())
                            .orderId(orderResponse.getOrderId())
                            .build());
            System.out.println(mapper.writeValueAsString(getOrderResponse));

            while (getOrderResponse.getOrder().getStatus() == OrderStatus.OPEN
                    || getOrderResponse.getOrder().getStatus() == OrderStatus.PENDING) {
                // Wait for additional order fills
                Thread.sleep(1000);
                getOrderResponse = ordersService.getOrderByOrderId(
                        new GetOrderByOrderIdRequest.Builder()
                                .portfolioId(portfolioResponse.getPortfolio().getId())
                                .orderId(orderResponse.getOrderId())
                                .build());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
