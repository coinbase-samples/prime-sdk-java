/*
 * Copyright 2025-present Coinbase Global, Inc.
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
import com.coinbase.prime.model.enums.OrderSide;
import com.coinbase.prime.model.orders.*;
import com.coinbase.prime.orders.OrdersService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.UUID;

public class CreateRfq {
    public static void main(String[] args) {
        String credsStringBlob = System.getenv("COINBASE_PRIME_CREDENTIALS");
        ObjectMapper mapper = new ObjectMapper();

        try {
            CoinbasePrimeCredentials credentials = new CoinbasePrimeCredentials(credsStringBlob);
            CoinbasePrimeClient client = new CoinbasePrimeClient(credentials);
                
            OrdersService ordersService = PrimeServiceFactory.createOrdersService(client);

            String portfolioId = System.getenv("COINBASE_PRIME_PORTFOLIO_ID");
            
            // Create and Accept RFQ
            CreateQuoteResponse quoteResponse = ordersService.createQuote(
                    new CreateQuoteRequest.Builder()
                            .portfolioId(portfolioId)
                            .productId("ETH-USD")
                            .side(OrderSide.BUY)
                            .baseQuantity("0.007")
                            .limitPrice("3000.00")
                            .clientQuoteId(UUID.randomUUID().toString())
                            .build());
            System.out.println(mapper.writeValueAsString(quoteResponse));

            AcceptQuoteResponse acceptQuoteResponse = ordersService.acceptQuote(
                    new AcceptQuoteRequest.Builder()
                            .portfolioId(portfolioId)
                            .quoteId(quoteResponse.getQuoteId())
                            .productId("ETH-USD")
                            .side(OrderSide.BUY)
                            .clientOrderId(UUID.randomUUID().toString())
                            .build());
            System.out.println(mapper.writeValueAsString(acceptQuoteResponse));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
