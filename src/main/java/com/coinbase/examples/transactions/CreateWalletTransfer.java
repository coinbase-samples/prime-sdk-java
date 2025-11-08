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

package com.coinbase.examples.transactions;

import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.credentials.CoinbasePrimeCredentials;
import com.coinbase.prime.factory.PrimeServiceFactory;
import com.coinbase.prime.transactions.CreateWalletTransferRequest;
import com.coinbase.prime.transactions.CreateWalletTransferResponse;
import com.coinbase.prime.transactions.TransactionsService;
import com.coinbase.prime.utils.Utils;

import java.util.UUID;

public class CreateWalletTransfer {
  public static void main(String[] args) {
    try {
      if (args.length < 4) {
        System.err.println("Usage: CreateWalletTransfer <source-wallet-id> <amount> <currency-symbol> <destination-wallet-id>");
        System.err.println("Example: CreateWalletTransfer wallet-id-123 1.5 ETH destination-wallet-id-456");
        System.exit(1);
      }

      CoinbasePrimeCredentials credentials = new CoinbasePrimeCredentials(System.getenv("COINBASE_PRIME_CREDENTIALS"));
      CoinbasePrimeClient client = new CoinbasePrimeClient(credentials);
      String portfolioId = System.getenv("COINBASE_PRIME_PORTFOLIO_ID");
      String sourceWalletId = args[0];
      String amount = args[1];
      String currencySymbol = args[2];
      String destinationWalletId = args[3];
      String idempotencyKey = UUID.randomUUID().toString();

      System.out.println("Creating wallet transfer: Portfolio ID: " + portfolioId + ", Source Wallet: " + sourceWalletId + ", Amount: " + amount + " " + currencySymbol + ", Destination: " + destinationWalletId);

      TransactionsService service = PrimeServiceFactory.createTransactionsService(client);
      CreateWalletTransferResponse response = service.createWalletTransfer(
          new CreateWalletTransferRequest.Builder(portfolioId, sourceWalletId)
              .amount(amount)
              .currencySymbol(currencySymbol)
              .destination(destinationWalletId)
              .idempotencyKey(idempotencyKey)
              .build());

      System.out.println(Utils.getObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(response));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

