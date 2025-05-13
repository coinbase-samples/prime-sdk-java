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

import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.errors.CoinbasePrimeException;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class OrdersServiceImpl extends CoinbaseServiceImpl implements OrdersService {
    public OrdersServiceImpl(CoinbasePrimeClient client) {
        super(client);
    }

    @Override
    public ListOpenOrdersResponse listOpenOrders(ListOpenOrdersRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/open_orders", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<ListOpenOrdersResponse>() {});
    }

    @Override
    public CreateOrderResponse createOrder(CreateOrderRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.POST,
                String.format("/portfolios/%s/order", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<CreateOrderResponse>() {});
    }

    @Override
    public GetOrderPreviewResponse getOrderPreview(GetOrderPreviewRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.POST,
                String.format("/portfolios/%s/order_preview", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<GetOrderPreviewResponse>() {});
    }

    @Override
    public ListPortfolioOrdersResponse listPortfolioOrders(ListPortfolioOrdersRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/orders", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<ListPortfolioOrdersResponse>() {});
    }

    @Override
    public GetOrderByOrderIdResponse getOrderByOrderId(GetOrderByOrderIdRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/orders/%s", request.getPortfolioId(), request.getOrderId()),
                null,
                List.of(200),
                new TypeReference<GetOrderByOrderIdResponse>() {});
    }

    @Override
    public CancelOrderResponse cancelOrder(CancelOrderRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.POST,
                String.format("/portfolios/%s/orders/%s/cancel", request.getPortfolioId(), request.getOrderId()),
                null,
                List.of(200),
                new TypeReference<CancelOrderResponse>() {});
    }

    @Override
    public ListOrderFillsResponse listOrderFills(ListOrderFillsRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/orders/%s/fills", request.getPortfolioId(), request.getOrderId()),
                request,
                List.of(200),
                new TypeReference<ListOrderFillsResponse>() {});
    }

    @Override
    public ListPortfolioFillsResponse listPortfolioFills(ListPortfolioFillsRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/fills", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<ListPortfolioFillsResponse>() {});
    }

    @Override
    public CreateQuoteResponse createQuote(CreateQuoteRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.POST,
                String.format("/portfolios/%s/rfq", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<CreateQuoteResponse>() {});
    }

    @Override
    public AcceptQuoteResponse acceptQuote(AcceptQuoteRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.POST,
                String.format("/portfolios/%s/accept_quote", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<AcceptQuoteResponse>() {});
    }
}
