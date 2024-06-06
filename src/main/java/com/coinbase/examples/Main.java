/*
 *
 *  Copyright 2024-present Coinbase Global, Inc.
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
 *
 */

package com.coinbase.examples;

import com.coinbase.prime.client.CoinbasePrimeHttpClient;
import com.coinbase.prime.credentials.CoinbasePrimeCredentials;
import com.coinbase.prime.model.balances.GetWalletBalanceRequest;
import com.coinbase.prime.model.balances.GetWalletBalanceResponse;
import com.coinbase.prime.model.orders.CreateOrderRequest;
import com.coinbase.prime.model.orders.CreateOrderResponse;
import com.coinbase.prime.model.orders.OrderSide;
import com.coinbase.prime.model.orders.OrderType;
import com.coinbase.prime.model.portfolios.GetPortfolioByIdRequest;
import com.coinbase.prime.model.portfolios.GetPortfolioByIdResponse;
import com.coinbase.prime.model.wallets.ListWalletsRequest;
import com.coinbase.prime.model.wallets.ListWalletsResponse;
import com.coinbase.prime.model.wallets.WalletType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.http.HttpClient;

public class Main {
    public static void main(String[] args) {
        String credsStringBlob = System.getenv("COINBASE_PRIME_CREDENTIALS");
        ObjectMapper mapper = new ObjectMapper();

        try {
            CoinbasePrimeCredentials credentials = mapper.readValue(credsStringBlob, CoinbasePrimeCredentials.class);
            CoinbasePrimeHttpClient client = new CoinbasePrimeHttpClient.Builder(credentials)
                    .withClient(HttpClient.newHttpClient())
                    .build();

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

            CreateOrderResponse createOrderResponse = client.createOrder(
                    new CreateOrderRequest.Builder()
                            .portfolioId(portfolioResponse.getPortfolio().getId())
                            .baseQuantity("0.00001")
                            .side(OrderSide.BUY)
                            .type(OrderType.MARKET)
                            .productId("ADA-USD")
                            .build());
            System.out.println(mapper.writeValueAsString(createOrderResponse));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
