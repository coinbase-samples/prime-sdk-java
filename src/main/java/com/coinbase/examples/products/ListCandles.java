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

package com.coinbase.examples.products;

import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.credentials.CoinbasePrimeCredentials;
import com.coinbase.prime.factory.PrimeServiceFactory;
import com.coinbase.prime.model.enums.CandlesGranularity;
import com.coinbase.prime.products.ListCandlesRequest;
import com.coinbase.prime.products.ListCandlesResponse;
import com.coinbase.prime.products.ProductsService;
import com.coinbase.prime.utils.Utils;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class ListCandles {
  public static void main(String[] args) {
    try {
      CoinbasePrimeCredentials credentials = new CoinbasePrimeCredentials(System.getenv("COINBASE_PRIME_CREDENTIALS"));
      CoinbasePrimeClient client = new CoinbasePrimeClient(credentials);
      String portfolioId = System.getenv("COINBASE_PRIME_PORTFOLIO_ID");
      String productId = args[0];

      Instant now = Instant.now();
      Instant oneDayAgo = now.minus(1, ChronoUnit.DAYS);
      String startTime = oneDayAgo.toString();
      String endTime = now.toString();

      System.out.println("Using Portfolio ID: " + portfolioId + ", Product ID: " + productId + ", Start: " + startTime
          + ", End: " + endTime);

      ProductsService service = PrimeServiceFactory.createProductsService(client);
      ListCandlesResponse response = service.listCandles(
          new ListCandlesRequest.Builder()
              .portfolioId(portfolioId)
              .productId(productId)
              .startTime(startTime)
              .endTime(endTime)
              .granularity(CandlesGranularity.ONE_DAY)
              .build());

      System.out.println(Utils.getObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(response));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
