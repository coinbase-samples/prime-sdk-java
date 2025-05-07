/*
 * Copyright 2024-present Coinbase Global, Inc.
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

package com.coinbase.prime.orders;

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.errors.CoinbasePrimeException;

public interface OrdersService {
    // Orders
    ListOpenOrdersResponse listOpenOrders(ListOpenOrdersRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    CreateOrderResponse createOrder(CreateOrderRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    GetOrderPreviewResponse getOrderPreview(GetOrderPreviewRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    ListPortfolioOrdersResponse listPortfolioOrders(ListPortfolioOrdersRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    GetOrderByOrderIdResponse getOrderByOrderId(GetOrderByOrderIdRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    CancelOrderResponse cancelOrder(CancelOrderRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    ListOrderFillsResponse listOrderFills(ListOrderFillsRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    ListPortfolioFillsResponse listPortfolioFills(ListPortfolioFillsRequest request) throws CoinbaseClientException, CoinbasePrimeException;
}
