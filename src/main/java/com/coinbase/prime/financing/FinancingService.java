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
    /** List Interest Accruals */
    ListInterestAccrualsResponse listInterestAccruals(ListInterestAccrualsRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    /** Get Cross Margin Overview */
    GetCrossMarginOverviewResponse getCrossMarginOverview(GetCrossMarginOverviewRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    /** Get Entity Locate Availabilities */
    GetEntityLocateAvailabilitiesResponse getEntityLocateAvailabilities(GetEntityLocateAvailabilitiesRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    /** Get Margin Information */
    GetMarginInformationResponse getMarginInformation(GetMarginInformationRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    /** List Margin Call Summaries */
    ListMarginCallSummariesResponse listMarginCallSummaries(ListMarginCallSummariesRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    /** List Trade Finance Obligations */
    ListTradeFinanceObligationsResponse listTradeFinanceObligations(ListTradeFinanceObligationsRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    /** Get Trade Finance Tiered Pricing Fees */
    GetTradeFinanceTieredPricingFeesResponse getTradeFinanceTieredPricingFees(GetTradeFinanceTieredPricingFeesRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    /** List Financing Eligible Assets */
    ListFinancingEligibleAssetsResponse listFinancingEligibleAssets() throws CoinbaseClientException, CoinbasePrimeException;
    /** List Interest Accruals For Portfolio */
    ListInterestAccrualsForPortfolioResponse listInterestAccrualsForPortfolio(ListInterestAccrualsForPortfolioRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    /** Get Portfolio Buying Power */
    GetPortfolioBuyingPowerResponse getPortfolioBuyingPower(GetPortfolioBuyingPowerRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    /** Get Portfolio Credit Information */
    GetPortfolioCreditInformationResponse getPortfolioCreditInformation(GetPortfolioCreditInformationRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    /** List Existing Locates */
    ListExistingLocatesResponse listExistingLocates(ListExistingLocatesRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    /** Create New Locates */
    CreateNewLocatesResponse createNewLocates(CreateNewLocatesRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    /** List Margin Conversions */
    ListMarginConversionsResponse listMarginConversions(ListMarginConversionsRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    /** Get Portfolio Withdrawal Power */
    GetPortfolioWithdrawalPowerResponse getPortfolioWithdrawalPower(GetPortfolioWithdrawalPowerRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    /** Update Funding Settings (Beta) */
    UpdateFundingSettingsResponse updateFundingSettings(UpdateFundingSettingsRequest request) throws CoinbaseClientException, CoinbasePrimeException;
}
