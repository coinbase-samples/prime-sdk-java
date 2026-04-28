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
import com.coinbase.prime.activities.ListPortfolioActivitiesRequest;
import com.coinbase.prime.activities.ListPortfolioActivitiesResponse;
import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.credentials.CoinbasePrimeCredentials;
import com.coinbase.prime.factory.PrimeServiceFactory;
import com.coinbase.prime.model.enums.ActivityCategory;
import com.coinbase.prime.utils.Utils;

public class ListPortfolioActivities {
  public static void main(String[] args) {
    try {
      CoinbasePrimeCredentials credentials = new CoinbasePrimeCredentials(System.getenv("COINBASE_PRIME_CREDENTIALS"));
      CoinbasePrimeClient client = new CoinbasePrimeClient(credentials);
      String portfolioId = System.getenv("COINBASE_PRIME_PORTFOLIO_ID");

      System.out.println("Using Portfolio ID: " + portfolioId);

      // Parse symbols from CSV if provided as first argument
      // Parse categories from CSV if provided as second argument
      ListPortfolioActivitiesRequest.Builder builder = new ListPortfolioActivitiesRequest.Builder(portfolioId);
      
      if (args.length > 0 && !args[0].isEmpty()) {
        String[] symbols = args[0].split(",");
        for (int i = 0; i < symbols.length; i++) {
          symbols[i] = symbols[i].trim();
        }
        builder.symbols(symbols);
        System.out.println("Filtering by symbols: " + String.join(", ", symbols));
      }
      
      if (args.length > 1 && !args[1].isEmpty()) {
        String[] categoryStrings = args[1].split(",");
        ActivityCategory[] categories = new ActivityCategory[categoryStrings.length];
        
        for (int i = 0; i < categoryStrings.length; i++) {
          try {
            categories[i] = ActivityCategory.valueOf(categoryStrings[i].trim());
          } catch (IllegalArgumentException e) {
            System.err.println("Invalid category: " + categoryStrings[i].trim());
            return;
          }
        }
        
        builder.categories(categories);
        System.out.println("Filtering by categories: " + String.join(", ", categoryStrings));
      }

      ActivitiesService service = PrimeServiceFactory.createActivitiesService(client);
      ListPortfolioActivitiesResponse response = service.listPortfolioActivities(builder.build());

      System.out.println(Utils.getObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(response));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
