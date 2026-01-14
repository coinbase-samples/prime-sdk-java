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

package com.coinbase.examples.wallets;

import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.credentials.CoinbasePrimeCredentials;
import com.coinbase.prime.factory.PrimeServiceFactory;
import com.coinbase.prime.wallets.ListWalletsRequest;
import com.coinbase.prime.wallets.ListWalletsResponse;
import com.coinbase.prime.wallets.WalletsService;
import com.coinbase.prime.model.enums.WalletType;
import com.coinbase.prime.utils.Utils;

public class ListPortfolioWallets {
  public static void main(String[] args) {
    try {
      CoinbasePrimeCredentials credentials = new CoinbasePrimeCredentials(System.getenv("COINBASE_PRIME_CREDENTIALS"));
      CoinbasePrimeClient client = new CoinbasePrimeClient(credentials);
      String portfolioId = System.getenv("COINBASE_PRIME_PORTFOLIO_ID");

      // Parse optional args: symbols (comma-separated) and type (VAULT/TRADING)
      String[] symbols = args.length > 0 && !args[0].isEmpty() ? args[0].split(",") : null;
      WalletType type = args.length > 1 ? WalletType.valueOf(args[1]) : null;

      System.out.println("Portfolio: " + portfolioId + ", Symbols: " + (symbols != null ? String.join(",", symbols) : "all") + ", Type: " + (type != null ? type : "all"));

      WalletsService service = PrimeServiceFactory.createWalletsService(client);
      ListWalletsRequest.Builder builder = new ListWalletsRequest.Builder().portfolioId(portfolioId);
      if (symbols != null) builder.symbols(symbols);
      if (type != null) builder.type(type);

      ListWalletsResponse response = service.listWallets(builder.build());

      System.out.println(Utils.getObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(response));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

