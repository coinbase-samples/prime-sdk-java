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
import com.coinbase.prime.model.BlockchainAddress;
import com.coinbase.prime.model.enums.DestinationType;
import com.coinbase.prime.transactions.CreateWalletWithdrawalRequest;
import com.coinbase.prime.transactions.CreateWalletWithdrawalResponse;
import com.coinbase.prime.transactions.TransactionsService;
import com.coinbase.prime.utils.Utils;

import java.util.UUID;

public class CreateWalletWithdrawal {
  public static void main(String[] args) {
    try {
      if (args.length < 4) {
        System.err.println("Usage: CreateWalletWithdrawal <wallet-id> <amount> <currency-symbol> <destination-address>");
        System.err.println("Example: CreateWalletWithdrawal wallet-id-123 0.01 ETH 0x742d35Cc6634C0532925a3b844Bc9e7595f0bEb");
        System.exit(1);
      }

      CoinbasePrimeCredentials credentials = new CoinbasePrimeCredentials(System.getenv("COINBASE_PRIME_CREDENTIALS"));
      CoinbasePrimeClient client = new CoinbasePrimeClient(credentials);
      String portfolioId = System.getenv("COINBASE_PRIME_PORTFOLIO_ID");
      String walletId = args[0];
      String amount = args[1];
      String currencySymbol = args[2];
      String destinationAddress = args[3];
      String idempotencyKey = UUID.randomUUID().toString();

      BlockchainAddress blockchainAddress = new BlockchainAddress.Builder()
          .address(destinationAddress)
          .build();

      System.out.println("Creating blockchain withdrawal: Portfolio ID: " + portfolioId + ", Wallet: " + walletId + ", Amount: " + amount + " " + currencySymbol + ", Destination: " + destinationAddress);

      TransactionsService service = PrimeServiceFactory.createTransactionsService(client);
      CreateWalletWithdrawalResponse response = service.createWalletWithdrawal(
          new CreateWalletWithdrawalRequest.Builder(portfolioId, walletId)
              .amount(amount)
              .currencySymbol(currencySymbol)
              .destinationType(DestinationType.DESTINATION_BLOCKCHAIN)
              .blockchainAddress(blockchainAddress)
              .idempotencyKey(idempotencyKey)
              .build());

      System.out.println(Utils.getObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(response));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

