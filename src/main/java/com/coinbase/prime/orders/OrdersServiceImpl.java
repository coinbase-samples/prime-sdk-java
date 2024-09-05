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

import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.errors.CoinbasePrimeException;
import com.coinbase.prime.model.orders.*;

public class OrdersServiceImpl extends CoinbaseServiceImpl implements OrdersService {
    public OrdersServiceImpl(CoinbasePrimeClient client) {
        super(client);
    }

    @Override
    public ListOpenOrdersResponse listOpenOrders(ListOpenOrdersRequest request) throws CoinbasePrimeException {
        ListOpenOrdersResponse resp = doGet(request, ListOpenOrdersResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public CreateOrderResponse createOrder(CreateOrderRequest request) throws CoinbasePrimeException {
        CreateOrderResponse resp = doPost(request, CreateOrderResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public GetOrderPreviewResponse getOrderPreview(GetOrderPreviewRequest request) throws CoinbasePrimeException {
        GetOrderPreviewResponse resp = doPost(request, GetOrderPreviewResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public ListPortfolioOrdersResponse listPortfolioOrders(ListPortfolioOrdersRequest request) throws CoinbasePrimeException {
        ListPortfolioOrdersResponse resp = doGet(request, ListPortfolioOrdersResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public GetOrderByOrderIdResponse getOrderByOrderId(GetOrderByOrderIdRequest request) throws CoinbasePrimeException {
        GetOrderByOrderIdResponse resp = doGet(request, GetOrderByOrderIdResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public CancelOrderResponse cancelOrder(CancelOrderRequest request) throws CoinbasePrimeException {
        CancelOrderResponse resp = doPost(request, CancelOrderResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public ListOrderFillsResponse listOrderFills(ListOrderFillsRequest request) throws CoinbasePrimeException {
        ListOrderFillsResponse resp = doGet(request, ListOrderFillsResponse.class);
        resp.setRequest(request);
        return resp;
    }
}
