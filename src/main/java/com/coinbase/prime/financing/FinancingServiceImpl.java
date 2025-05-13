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

package com.coinbase.prime.financing;

import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.errors.CoinbasePrimeException;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class FinancingServiceImpl extends CoinbaseServiceImpl implements FinancingService {
    public FinancingServiceImpl(CoinbasePrimeClient client) {
        super(client);
    }

    @Override
    public CreateNewLocatesResponse createNewLocates(CreateNewLocatesRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.POST,
                String.format("/portfolios/%s/locates", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<CreateNewLocatesResponse>() {});
    }

    @Override
    public GetEntityLocateAvailabilitiesResponse getEntityLocateAvailabilities(GetEntityLocateAvailabilitiesRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/entities/%s/locates/locates_availability", request.getEntityId()),
                request,
                List.of(200),
                new TypeReference<GetEntityLocateAvailabilitiesResponse>() {});
    }

    @Override
    public GetMarginInformationResponse getMarginInformation(GetMarginInformationRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/entities/%s/margin", request.getEntityId()),
                null,
                List.of(200),
                new TypeReference<GetMarginInformationResponse>() {});
    }

    @Override
    public GetPortfolioBuyingPowerResponse getPortfolioBuyingPower(GetPortfolioBuyingPowerRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/buying_power", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<GetPortfolioBuyingPowerResponse>() {});
    }

    @Override
    public GetPortfolioCreditInformationResponse getPortfolioCreditInformation(GetPortfolioCreditInformationRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/credit", request.getPortfolioId()),
                null,
                List.of(200),
                new TypeReference<GetPortfolioCreditInformationResponse>() {});
    }

    @Override
    public GetPortfolioWithdrawalPowerResponse getPortfolioWithdrawalPower(GetPortfolioWithdrawalPowerRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/withdrawal_power", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<GetPortfolioWithdrawalPowerResponse>() {});
    }

    @Override
    public GetTradeFinanceTieredPricingFeesResponse getTradeFinanceTieredPricingFees(GetTradeFinanceTieredPricingFeesRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/entities/%s/tf_tiered_fees", request.getEntityId()),
                request,
                List.of(200),
                new TypeReference<GetTradeFinanceTieredPricingFeesResponse>() {});
    }

    @Override
    public ListExistingLocatesResponse listExistingLocates(ListExistingLocatesRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/locates", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<ListExistingLocatesResponse>() {});
    }

    @Override
    public ListInterestAccrualsResponse listInterestAccruals(ListInterestAccrualsRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/entities/%s/accruals", request.getEntityId()),
                request,
                List.of(200),
                new TypeReference<ListInterestAccrualsResponse>() {});
    }

    @Override
    public ListInterestAccrualsForPortfolioResponse listInterestAccrualsForPortfolio(ListInterestAccrualsForPortfolioRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/accruals", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<ListInterestAccrualsForPortfolioResponse>() {});
    }

    @Override
    public ListMarginCallSummariesResponse listMarginCallSummaries(ListMarginCallSummariesRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/entities/%s/margin_summaries", request.getEntityId()),
                request,
                List.of(200),
                new TypeReference<ListMarginCallSummariesResponse>() {});
    }

    @Override
    public ListMarginConversionsResponse listMarginConversions(ListMarginConversionsRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/margin_conversions", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<ListMarginConversionsResponse>() {});
    }
}
