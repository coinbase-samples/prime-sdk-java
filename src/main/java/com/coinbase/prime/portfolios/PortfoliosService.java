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

package com.coinbase.prime.portfolios;

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.errors.CoinbasePrimeException;

public interface PortfoliosService {
    // Portfolios
    GetPortfolioByIdResponse getPortfolioById(GetPortfolioByIdRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    GetPortfolioCounterpartyIdResponse getPortfolioCounterpartyId(GetPortfolioCounterpartyIdRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    ListPortfoliosResponse listPortfolios();
}
