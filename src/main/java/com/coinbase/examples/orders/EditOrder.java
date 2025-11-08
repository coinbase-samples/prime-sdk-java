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
import com.coinbase.prime.orders.EditOrderRequest;
import com.coinbase.prime.orders.EditOrderResponse;
import com.coinbase.prime.orders.OrdersService;
import com.coinbase.prime.utils.Utils;

import java.util.UUID;

public class EditOrder {
  public static void main(String[] args) {
    try {
      if (args.length < 5) {
        System.err.println("Usage: EditOrder <order_id> <orig_client_order_id> <quotevalue|basequantity> <amount> <limit_price>");
        System.err.println("Example: EditOrder abc123 orig-uuid-456 basequantity 15.0 51000.00");
        System.err.println("Example: EditOrder abc123 orig-uuid-456 quotevalue 1000.00 51000.00");
        System.exit(1);
      }

      CoinbasePrimeCredentials credentials = new CoinbasePrimeCredentials(System.getenv("COINBASE_PRIME_CREDENTIALS"));
      CoinbasePrimeClient client = new CoinbasePrimeClient(credentials);
      String portfolioId = System.getenv("COINBASE_PRIME_PORTFOLIO_ID");
      String orderId = args[0];
      String origClientOrderId = args[1];

      String quantityType = args[2].toLowerCase();
      String amount = args[3];
      String limitPrice = args[4];
      String newClientOrderId = UUID.randomUUID().toString();

      System.out.println("Using IDs: Portfolio ID: " + portfolioId + ", Order ID: " + orderId + ", Original Client Order ID: " + origClientOrderId + ", New Client Order ID: " + newClientOrderId + ", Edit parameters: " + quantityType + " = " + amount + ", limit_price = " + limitPrice);

      EditOrderRequest.Builder builder = new EditOrderRequest.Builder()
          .portfolioId(portfolioId)
          .orderId(orderId)
          .origClientOrderId(origClientOrderId)
          .clientOrderId(newClientOrderId)
          .limitPrice(limitPrice);

      if (quantityType.equals("basequantity")) {
        builder.baseQuantity(amount);
      } else if (quantityType.equals("quotevalue")) {
        builder.quoteValue(amount);
      } else {
        System.err.println("Error: First argument must be either 'basequantity' or 'quotevalue'");
        System.exit(1);
      }

      OrdersService service = PrimeServiceFactory.createOrdersService(client);
      EditOrderResponse response = service.editOrder(builder.build());

      System.out.println(Utils.getObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(response));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
