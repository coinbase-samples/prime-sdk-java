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

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.errors.CoinbasePrimeException;

public interface FinancingService {
    CreateNewLocatesResponse createNewLocates(CreateNewLocatesRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    GetEntityLocateAvailabilitiesResponse getEntityLocateAvailabilities(GetEntityLocateAvailabilitiesRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    GetMarginInformationResponse getMarginInformation(GetMarginInformationRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    GetPortfolioBuyingPowerResponse getPortfolioBuyingPower(GetPortfolioBuyingPowerRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    GetPortfolioCreditInformationResponse getPortfolioCreditInformation(GetPortfolioCreditInformationRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    GetPortfolioWithdrawalPowerResponse getPortfolioWithdrawalPower(GetPortfolioWithdrawalPowerRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    GetTradeFinanceTieredPricingFeesResponse getTradeFinanceTieredPricingFees(GetTradeFinanceTieredPricingFeesRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    ListExistingLocatesResponse listExistingLocates(ListExistingLocatesRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    ListInterestAccrualsResponse listInterestAccruals(ListInterestAccrualsRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    ListInterestAccrualsForPortfolioResponse listInterestAccrualsForPortfolio(ListInterestAccrualsForPortfolioRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    ListMarginCallSummariesResponse listMarginCallSummaries(ListMarginCallSummariesRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    ListMarginConversionsResponse listMarginConversions(ListMarginConversionsRequest request) throws CoinbaseClientException, CoinbasePrimeException;
}
