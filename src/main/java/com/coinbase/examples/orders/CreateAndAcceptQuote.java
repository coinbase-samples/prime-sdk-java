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

package com.coinbase.examples.orders;

import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.credentials.CoinbasePrimeCredentials;
import com.coinbase.prime.factory.PrimeServiceFactory;
import com.coinbase.prime.model.enums.OrderSide;
import com.coinbase.prime.orders.AcceptQuoteRequest;
import com.coinbase.prime.orders.AcceptQuoteResponse;
import com.coinbase.prime.orders.CreateQuoteRequest;
import com.coinbase.prime.orders.CreateQuoteResponse;
import com.coinbase.prime.orders.OrdersService;
import com.coinbase.prime.utils.Utils;

import java.util.UUID;

public class CreateAndAcceptQuote {
  public static void main(String[] args) {
    try {
      CoinbasePrimeCredentials credentials = new CoinbasePrimeCredentials(System.getenv("COINBASE_PRIME_CREDENTIALS"));
      CoinbasePrimeClient client = new CoinbasePrimeClient(credentials);
      String portfolioId = System.getenv("COINBASE_PRIME_PORTFOLIO_ID");

      System.out.println("Using IDs: Portfolio ID: " + portfolioId);

      OrdersService service = PrimeServiceFactory.createOrdersService(client);

      // Step 1: Create Quote
      System.out.println("\n=== Creating Quote ===");
      CreateQuoteResponse quoteResponse = service.createQuote(
          new CreateQuoteRequest.Builder()
              .portfolioId(portfolioId)
              .productId("ETH-USD")
              .side(OrderSide.BUY)
              .baseQuantity("0.007")
              .limitPrice("3500.00")
              .clientQuoteId(UUID.randomUUID().toString())
              .build());

      System.out.println(Utils.getObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(quoteResponse));
      System.out.println("\nQuote ID: " + quoteResponse.getQuoteId());

      // Step 2: Immediately Accept Quote
      System.out.println("\n=== Accepting Quote ===");
      AcceptQuoteResponse acceptResponse = service.acceptQuote(
          new AcceptQuoteRequest.Builder()
              .portfolioId(portfolioId)
              .quoteId(quoteResponse.getQuoteId())
              .productId("ETH-USD")
              .side(OrderSide.BUY)
              .clientOrderId(UUID.randomUUID().toString())
              .build());

      System.out.println(Utils.getObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(acceptResponse));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
