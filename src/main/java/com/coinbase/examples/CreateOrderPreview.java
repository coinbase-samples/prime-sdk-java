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

package com.coinbase.examples;

import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.credentials.CoinbasePrimeCredentials;
import com.coinbase.prime.factory.PrimeServiceFactory;
import com.coinbase.prime.model.enums.OrderSide;
import com.coinbase.prime.model.enums.OrderType;
import com.coinbase.prime.model.enums.TimeInForceType;
import com.coinbase.prime.orders.GetOrderPreviewRequest;
import com.coinbase.prime.orders.GetOrderPreviewResponse;
import com.coinbase.prime.orders.OrdersService;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Example demonstrating order preview functionality.
 *
 * Order preview allows you to see estimated commission, slippage, and fill price
 * before placing an order. This is useful for understanding the cost and impact
 * of your order without committing to the trade.
 *
 * <p><b>Note:</b> This is a read-only operation that does NOT place an order.
 * No ADA will be purchased by running this example.
 *
 * <p><b>Environment Variables Required:</b>
 * <ul>
 *   <li>COINBASE_PRIME_CREDENTIALS - JSON with accessKey, passphrase, signingKey</li>
 *   <li>COINBASE_PRIME_PORTFOLIO_ID - Your portfolio ID</li>
 * </ul>
 */
public class CreateOrderPreview {
  public static void main(String[] args) {
    try {
      // Initialize client and credentials
      CoinbasePrimeCredentials credentials = new CoinbasePrimeCredentials(
          System.getenv("COINBASE_PRIME_CREDENTIALS"));
      CoinbasePrimeClient client = new CoinbasePrimeClient(credentials);

      String portfolioId = System.getenv("COINBASE_PRIME_PORTFOLIO_ID");

      // Create orders service
      OrdersService ordersService = PrimeServiceFactory.createOrdersService(client);

      // Preview a market buy order for 10 ADA
      System.out.println("=== Market Order Preview ===");
      GetOrderPreviewResponse marketPreview = ordersService.getOrderPreview(
          new GetOrderPreviewRequest.Builder()
              .portfolioId(portfolioId)
              .productId("ADA-USD")
              .side(OrderSide.BUY)
              .type(OrderType.MARKET)
              .baseQuantity("10.0")
              .build());

      printOrderPreview(marketPreview, "Market Order");

      // Preview a limit order
      System.out.println("\n=== Limit Order Preview ===");
      GetOrderPreviewResponse limitPreview = ordersService.getOrderPreview(
          new GetOrderPreviewRequest.Builder()
              .portfolioId(portfolioId)
              .productId("BTC-USD")
              .side(OrderSide.BUY)
              .type(OrderType.LIMIT)
              .baseQuantity("0.001")
              .limitPrice("50000.00")
              .timeInForce(TimeInForceType.GOOD_UNTIL_CANCELLED)
              .build());

      printOrderPreview(limitPreview, "Limit Order");

      // Show full JSON response for deserialization testing
      System.out.println("\n=== Full JSON Response (for deserialization testing) ===");
      System.out.println(new ObjectMapper().writerWithDefaultPrettyPrinter()
          .writeValueAsString(marketPreview));

    } catch (Exception e) {
      System.err.println("Error previewing order: " + e.getMessage());
      e.printStackTrace();
    }
  }

  /**
   * Helper method to print order preview details in human-readable format.
   */
  private static void printOrderPreview(GetOrderPreviewResponse preview, String orderType) {
    System.out.println(orderType + " Preview:");
    System.out.println("  Product: " + preview.getProductId());
    System.out.println("  Side: " + preview.getSide());
    System.out.println("  Type: " + preview.getType());
    System.out.println("  Base Quantity: " + preview.getBaseQuantity());
    System.out.println("  Quote Value: " + preview.getQuoteValue());

    if (preview.getLimitPrice() != null) {
      System.out.println("  Limit Price: $" + preview.getLimitPrice());
    }

    if (preview.getCommission() != null) {
      System.out.println("  Estimated Commission: $" + preview.getCommission());
    }

    if (preview.getSlippage() != null) {
      System.out.println("  Estimated Slippage: $" + preview.getSlippage());
    }

    if (preview.getBestBid() != null) {
      System.out.println("  Best Bid: $" + preview.getBestBid());
    }

    if (preview.getBestAsk() != null) {
      System.out.println("  Best Ask: $" + preview.getBestAsk());
    }

    if (preview.getAverageFilledPrice() != null) {
      System.out.println("  Avg Fill Price: $" + preview.getAverageFilledPrice());
    }

    if (preview.getOrderTotal() != null) {
      System.out.println("  Order Total: $" + preview.getOrderTotal());
    }
  }
}
