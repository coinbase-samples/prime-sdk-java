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
import com.coinbase.prime.model.enums.OrderType;
import com.coinbase.prime.orders.GetOrderPreviewRequest;
import com.coinbase.prime.orders.GetOrderPreviewResponse;
import com.coinbase.prime.orders.OrdersService;
import com.coinbase.prime.utils.Utils;

public class CreateOrderPreview {
  public static void main(String[] args) {
    try {
      if (args.length < 5) {
        System.err.println("Usage: CreateOrderPreview <product_id> <side> <type> <basequantity|quotevalue> <amount>");
        System.err.println("Example: CreateOrderPreview BTC-USD BUY MARKET basequantity 0.001");
        System.err.println("Example: CreateOrderPreview ETH-USD SELL LIMIT quotevalue 1000.00");
        System.exit(1);
      }

      CoinbasePrimeCredentials credentials = new CoinbasePrimeCredentials(System.getenv("COINBASE_PRIME_CREDENTIALS"));
      CoinbasePrimeClient client = new CoinbasePrimeClient(credentials);
      String portfolioId = System.getenv("COINBASE_PRIME_PORTFOLIO_ID");

      String productId = args[0];
      OrderSide side = OrderSide.valueOf(args[1].toUpperCase());
      OrderType type = OrderType.valueOf(args[2].toUpperCase());
      String quantityType = args[3].toLowerCase();
      String amount = args[4];

      System.out.println("Using IDs: Portfolio ID: " + portfolioId);
      System.out.println("Order parameters: " + productId + " " + side + " " + type + " " + quantityType + "=" + amount);

      GetOrderPreviewRequest.Builder builder = new GetOrderPreviewRequest.Builder()
          .portfolioId(portfolioId)
          .productId(productId)
          .side(side)
          .type(type);

      if (quantityType.equals("basequantity")) {
        builder.baseQuantity(amount);
      } else if (quantityType.equals("quotevalue")) {
        builder.quoteValue(amount);
      } else {
        System.err.println("Error: Fourth argument must be either 'basequantity' or 'quotevalue'");
        System.exit(1);
      }

      OrdersService ordersService = PrimeServiceFactory.createOrdersService(client);
      GetOrderPreviewResponse response = ordersService.getOrderPreview(builder.build());

      System.out.println(Utils.getObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(response));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
