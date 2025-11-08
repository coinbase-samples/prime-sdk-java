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
import com.coinbase.prime.model.enums.WalletDepositInstructionType;
import com.coinbase.prime.wallets.GetWalletDepositInstructionsRequest;
import com.coinbase.prime.wallets.GetWalletDepositInstructionsResponse;
import com.coinbase.prime.wallets.WalletsService;
import com.coinbase.prime.utils.Utils;

public class GetWalletDepositInstructions {
  public static void main(String[] args) {
    try {
      CoinbasePrimeCredentials credentials = new CoinbasePrimeCredentials(System.getenv("COINBASE_PRIME_CREDENTIALS"));
      CoinbasePrimeClient client = new CoinbasePrimeClient(credentials);
      String portfolioId = System.getenv("COINBASE_PRIME_PORTFOLIO_ID");
      String walletId = args.length > 0 ? args[0] : System.getenv("COINBASE_PRIME_WALLET_ID");
      WalletDepositInstructionType depositType = WalletDepositInstructionType.CRYPTO;

      System.out.println("Using IDs: Portfolio ID: " + portfolioId + ", Wallet ID: " + walletId + ", Deposit Type: " + depositType);

      WalletsService service = PrimeServiceFactory.createWalletsService(client);
      GetWalletDepositInstructionsResponse response = service.getWalletDepositInstructions(
          new GetWalletDepositInstructionsRequest.Builder()
              .portfolioId(portfolioId)
              .walletId(walletId)
              .depositType(depositType)
              .build());

      System.out.println(Utils.getObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(response));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

