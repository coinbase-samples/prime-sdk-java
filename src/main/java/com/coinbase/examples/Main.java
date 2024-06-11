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

import com.coinbase.core.credentials.CoinbaseCredentials;
import com.coinbase.prime.client.CoinbasePrimeHttpClient;
import com.coinbase.prime.model.orders.*;
import com.coinbase.prime.model.portfolios.GetPortfolioByIdRequest;
import com.coinbase.prime.model.portfolios.GetPortfolioByIdResponse;
import com.coinbase.prime.model.transactions.ListPortfolioTransactionsRequest;
import com.coinbase.prime.model.transactions.ListPortfolioTransactionsResponse;
import com.coinbase.prime.model.transactions.TransactionType;
import com.coinbase.prime.model.wallets.ListWalletsRequest;
import com.coinbase.prime.model.wallets.ListWalletsResponse;
import com.coinbase.prime.model.wallets.WalletType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        String credsStringBlob = System.getenv("COINBASE_PRIME_CREDENTIALS");
        ObjectMapper mapper = new ObjectMapper();

        try {
            CoinbaseCredentials credentials = new CoinbaseCredentials(credsStringBlob);
            CoinbasePrimeHttpClient client = new CoinbasePrimeHttpClient(credentials);

            String portfolioId = System.getenv("COINBASE_PRIME_PORTFOLIO_ID");
            GetPortfolioByIdResponse portfolioResponse = client.getPortfolioById(
                    new GetPortfolioByIdRequest.Builder()
                            .portfolioId(portfolioId)
                            .build());

            System.out.println(mapper.writeValueAsString(portfolioResponse));

            ListWalletsResponse walletsResponse = client.listWallets(
                    new ListWalletsRequest.Builder()
                            .portfolioId(portfolioResponse.getPortfolio().getId())
                            .type(WalletType.VAULT)
                            .symbols(new String[]{"ADA"})
                            .build());

            System.out.println(mapper.writeValueAsString(walletsResponse));

            ListPortfolioTransactionsResponse listTransactionsResponse = client.listPortfolioTransactions(
                    new ListPortfolioTransactionsRequest.Builder()
                            .portfolioId(portfolioResponse.getPortfolio().getId())
                            .symbols(new String[]{"ADA"})
                            .types(new TransactionType[]{TransactionType.CLAIM_REWARDS})
                            .build());
            System.out.println(mapper.writeValueAsString(listTransactionsResponse));

            CreateOrderResponse orderResponse = client.createOrder(
                    new CreateOrderRequest.Builder()
                            .portfolioId(portfolioResponse.getPortfolio().getId())
                            .productId("ADA-USD")
                            .side(OrderSide.BUY)
                            .type(OrderType.MARKET)
                            .baseQuantity("0.001")
                            .clientOrderId(UUID.randomUUID().toString())
                            .build());
            System.out.println(mapper.writeValueAsString(orderResponse));

            Thread.sleep(1000);
            GetOrderByOrderIdResponse getOrderResponse = client.getOrderByOrderId(
                    new GetOrderByOrderIdRequest.Builder()
                            .portfolioId(portfolioResponse.getPortfolio().getId())
                            .orderId(orderResponse.getOrderId())
                            .build());
            System.out.println(mapper.writeValueAsString(getOrderResponse));

            while (getOrderResponse.getOrder().getStatus() == OrderStatus.OPEN
                    || getOrderResponse.getOrder().getStatus() == OrderStatus.PENDING) {
                Thread.sleep(1000);
                getOrderResponse = client.getOrderByOrderId(
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
