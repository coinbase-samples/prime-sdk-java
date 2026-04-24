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

package com.coinbase.prime.orders;

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.errors.CoinbasePrimeException;

public interface OrdersService {
    /** Accept Quote */
    AcceptQuoteResponse acceptQuote(AcceptQuoteRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    /** List Portfolio Fills */
    ListPortfolioFillsResponse listPortfolioFills(ListPortfolioFillsRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    /** List Open Orders */
    ListOpenOrdersResponse listOpenOrders(ListOpenOrdersRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    /** Create Order */
    CreateOrderResponse createOrder(CreateOrderRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    /** Get Order Preview */
    GetOrderPreviewResponse getOrderPreview(GetOrderPreviewRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    /** List Portfolio Orders */
    ListPortfolioOrdersResponse listPortfolioOrders(ListPortfolioOrdersRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    /** Get Order by Order ID */
    GetOrderByOrderIdResponse getOrderByOrderId(GetOrderByOrderIdRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    /** Cancel Order */
    CancelOrderResponse cancelOrder(CancelOrderRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    /** Edit Order (Beta) */
    EditOrderResponse editOrder(EditOrderRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    /** List Order Edit History */
    ListOrderEditHistoryResponse listOrderEditHistory(ListOrderEditHistoryRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    /** List Order Fills */
    ListOrderFillsResponse listOrderFills(ListOrderFillsRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    /** Create Quote Request */
    CreateQuoteResponse createQuote(CreateQuoteRequest request) throws CoinbaseClientException, CoinbasePrimeException;
}
