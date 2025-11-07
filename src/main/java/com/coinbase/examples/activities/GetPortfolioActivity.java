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

package com.coinbase.examples.activities;

import com.coinbase.prime.activities.ActivitiesService;
import com.coinbase.prime.activities.GetPortfolioActivityRequest;
import com.coinbase.prime.activities.GetPortfolioActivityResponse;
import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.credentials.CoinbasePrimeCredentials;
import com.coinbase.prime.factory.PrimeServiceFactory;
import com.coinbase.prime.utils.Utils;

public class GetPortfolioActivity {
  public static void main(String[] args) {
    try {
      CoinbasePrimeCredentials credentials = new CoinbasePrimeCredentials(System.getenv("COINBASE_PRIME_CREDENTIALS"));
      CoinbasePrimeClient client = new CoinbasePrimeClient(credentials);
      String portfolioId = System.getenv("COINBASE_PRIME_PORTFOLIO_ID");
      String activityId = args.length > 0 ? args[0] : "ACTIVITY_ID_HERE";

      System.out.println("Using Portfolio ID: " + portfolioId);
      System.out.println("Using Activity ID: " + activityId);

      ActivitiesService service = PrimeServiceFactory.createActivitiesService(client);
      GetPortfolioActivityResponse response = service.getPortfolioActivity(
          new GetPortfolioActivityRequest.Builder()
              .portfolioId(portfolioId)
              .activityId(activityId)
              .build());

      System.out.println(Utils.getObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(response));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

