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
import com.coinbase.prime.orders.ListPortfolioFillsRequest;
import com.coinbase.prime.orders.ListPortfolioFillsResponse;
import com.coinbase.prime.orders.OrdersService;
import com.coinbase.prime.utils.Utils;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class ListPortfolioFills {
  public static void main(String[] args) {
    try {
      CoinbasePrimeCredentials credentials = new CoinbasePrimeCredentials(System.getenv("COINBASE_PRIME_CREDENTIALS"));
      CoinbasePrimeClient client = new CoinbasePrimeClient(credentials);
      String portfolioId = System.getenv("COINBASE_PRIME_PORTFOLIO_ID");

      // Calculate date range: 1 month ago to now
      Instant now = Instant.now();
      Instant oneMonthAgo = now.minus(30, ChronoUnit.DAYS);
      String startDate = oneMonthAgo.toString();
      String endDate = now.toString();

      System.out.println("Using IDs: Portfolio ID: " + portfolioId);
      System.out.println("Date range: " + startDate + " to " + endDate);

      OrdersService service = PrimeServiceFactory.createOrdersService(client);
      ListPortfolioFillsResponse response = service.listPortfolioFills(
          new ListPortfolioFillsRequest.Builder()
              .portfolioId(portfolioId)
              .startDate(startDate)
              .endDate(endDate)
              .build());

      System.out.println(Utils.getObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(response));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
