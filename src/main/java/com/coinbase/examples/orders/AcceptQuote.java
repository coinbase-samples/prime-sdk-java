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
import com.coinbase.prime.orders.OrdersService;
import com.coinbase.prime.utils.Utils;

import java.util.UUID;

public class AcceptQuote {
  public static void main(String[] args) {
    try {
      if (args.length < 1) {
        System.err.println("Usage: AcceptQuote <quote_id>");
        System.err.println("Example: AcceptQuote 9039fdc1-9f04-447b-bd96-05a1d26f8010");
        System.exit(1);
      }

      CoinbasePrimeCredentials credentials = new CoinbasePrimeCredentials(System.getenv("COINBASE_PRIME_CREDENTIALS"));
      CoinbasePrimeClient client = new CoinbasePrimeClient(credentials);
      String portfolioId = System.getenv("COINBASE_PRIME_PORTFOLIO_ID");
      String quoteId = args[0];

      System.out.println("Using IDs: Portfolio ID: " + portfolioId + ", Quote ID: " + quoteId);

      OrdersService service = PrimeServiceFactory.createOrdersService(client);
      AcceptQuoteResponse response = service.acceptQuote(
          new AcceptQuoteRequest.Builder()
              .portfolioId(portfolioId)
              .quoteId(quoteId)
              .productId("ETH-USD")
              .side(OrderSide.BUY)
              .clientOrderId(UUID.randomUUID().toString())
              .build());

      System.out.println(Utils.getObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(response));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
