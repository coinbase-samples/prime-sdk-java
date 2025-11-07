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

package com.coinbase.examples.balances;

import com.coinbase.prime.balances.BalancesService;
import com.coinbase.prime.balances.ListPortfolioBalancesRequest;
import com.coinbase.prime.balances.ListPortfolioBalancesResponse;
import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.credentials.CoinbasePrimeCredentials;
import com.coinbase.prime.factory.PrimeServiceFactory;
import com.coinbase.prime.model.enums.PortfolioBalanceType;
import com.coinbase.prime.utils.Utils;

public class ListPortfolioBalances {
  public static void main(String[] args) {
    try {
      CoinbasePrimeCredentials credentials = new CoinbasePrimeCredentials(System.getenv("COINBASE_PRIME_CREDENTIALS"));
      CoinbasePrimeClient client = new CoinbasePrimeClient(credentials);
      String portfolioId = System.getenv("COINBASE_PRIME_PORTFOLIO_ID");

      // Optional args: [symbol1,symbol2,...] [balance_type]
      String[] symbols = null;
      PortfolioBalanceType balanceType = null;

      if (args.length > 0 && !args[0].isEmpty()) {
        symbols = args[0].split(",");
      }
      if (args.length > 1 && !args[1].isEmpty()) {
        balanceType = PortfolioBalanceType.valueOf(args[1].toUpperCase());
      }

      System.out.println("Using IDs: Portfolio ID: " + portfolioId);
      if (symbols != null) {
        System.out.println("Filtering symbols: " + String.join(",", symbols));
      }
      if (balanceType != null) {
        System.out.println("Balance type: " + balanceType);
      }

      ListPortfolioBalancesRequest.Builder builder = new ListPortfolioBalancesRequest.Builder()
          .portfolioId(portfolioId);

      if (symbols != null) {
        builder.symbols(symbols);
      }
      if (balanceType != null) {
        builder.balanceType(balanceType);
      }

      BalancesService service = PrimeServiceFactory.createBalancesService(client);
      ListPortfolioBalancesResponse response = service.listPortfolioBalances(builder.build());

      System.out.println(Utils.getObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(response));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
