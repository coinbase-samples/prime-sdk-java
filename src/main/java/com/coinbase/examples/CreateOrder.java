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
import com.coinbase.prime.model.enums.OrderStatus;
import com.coinbase.prime.model.enums.OrderType;
import com.coinbase.prime.orders.CreateOrderRequest;
import com.coinbase.prime.orders.CreateOrderResponse;
import com.coinbase.prime.orders.GetOrderByOrderIdRequest;
import com.coinbase.prime.orders.GetOrderByOrderIdResponse;
import com.coinbase.prime.orders.OrdersService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.UUID;

public class CreateOrder {
  public static void main(String[] args) {
    try {
      CoinbasePrimeCredentials credentials = new CoinbasePrimeCredentials(System.getenv("COINBASE_PRIME_CREDENTIALS"));
      CoinbasePrimeClient client = new CoinbasePrimeClient(credentials);

      String portfolioId = System.getenv("COINBASE_PRIME_PORTFOLIO_ID");

      OrdersService ordersService = PrimeServiceFactory.createOrdersService(client);
      CreateOrderResponse orderResponse = ordersService.createOrder(
          new CreateOrderRequest.Builder()
              .portfolioId(portfolioId)
              .productId("ADA-USD")
              .side(OrderSide.BUY)
              .type(OrderType.MARKET)
              .baseQuantity("10.0")
              .clientOrderId(UUID.randomUUID().toString())
              .build());

      System.out.println(new ObjectMapper().writeValueAsString(orderResponse));

      // Wait for the order to be processed
      Thread.sleep(1000);
      checkOrderStatus(ordersService, portfolioId, orderResponse.getOrderId());

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void checkOrderStatus(OrdersService ordersService, String portfolioId, String orderId)
      throws Exception {
    GetOrderByOrderIdResponse getOrderResponse = ordersService.getOrderByOrderId(
        new GetOrderByOrderIdRequest.Builder()
            .portfolioId(portfolioId)
            .orderId(orderId)
            .build());

    System.out.println(new ObjectMapper().writeValueAsString(getOrderResponse));

    while (getOrderResponse.getOrder().getStatus() == OrderStatus.OPEN
        || getOrderResponse.getOrder().getStatus() == OrderStatus.PENDING) {
      Thread.sleep(1000);
      getOrderResponse = ordersService.getOrderByOrderId(
          new GetOrderByOrderIdRequest.Builder()
              .portfolioId(portfolioId)
              .orderId(orderId)
              .build());
    }
  }
}
