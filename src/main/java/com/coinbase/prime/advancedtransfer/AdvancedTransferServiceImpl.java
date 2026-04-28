/*
 * Copyright 2026-present Coinbase Global, Inc.
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

package com.coinbase.prime.advancedtransfer;

import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.errors.CoinbasePrimeException;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class AdvancedTransferServiceImpl extends CoinbaseServiceImpl implements AdvancedTransferService {
    public AdvancedTransferServiceImpl(CoinbasePrimeClient client) {
        super(client);
    }

    @Override
    public ListAdvancedTransfersResponse listAdvancedTransfers(ListAdvancedTransfersRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/advanced_transfers", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<ListAdvancedTransfersResponse>() {});
    }

    @Override
    public CreateAdvancedTransferResponse createAdvancedTransfer(CreateAdvancedTransferRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.POST,
                String.format("/portfolios/%s/advanced_transfers", request.getPortfolioId()),
                request,
                List.of(201, 200),
                new TypeReference<CreateAdvancedTransferResponse>() {});
    }

    @Override
    public CancelAdvancedTransferResponse cancelAdvancedTransfer(CancelAdvancedTransferRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.POST,
                String.format("/portfolios/%s/advanced_transfers/%s/cancel", request.getPortfolioId(), request.getAdvancedTransferId()),
                request,
                List.of(200),
                new TypeReference<CancelAdvancedTransferResponse>() {});
    }

    @Override
    public ListAdvancedTransferTransactionsResponse listAdvancedTransferTransactions(ListAdvancedTransferTransactionsRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/advanced_transfers/%s/transactions", request.getPortfolioId(), request.getAdvancedTransferId()),
                request,
                List.of(200),
                new TypeReference<ListAdvancedTransferTransactionsResponse>() {});
    }

    @Override
    public GetPortfolioCounterpartyIdResponse getPortfolioCounterpartyId(GetPortfolioCounterpartyIdRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/counterparty", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<GetPortfolioCounterpartyIdResponse>() {});
    }

}
