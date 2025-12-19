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

package com.coinbase.examples.staking;

import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.credentials.CoinbasePrimeCredentials;
import com.coinbase.prime.factory.PrimeServiceFactory;
import com.coinbase.prime.staking.PortfolioStakingUnstakeRequest;
import com.coinbase.prime.staking.PortfolioStakingUnstakeResponse;
import com.coinbase.prime.staking.StakingService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.UUID;

public class PortfolioStakingUnstake {
    public static void main(String[] args) {
        try {
            CoinbasePrimeCredentials credentials = new CoinbasePrimeCredentials(System.getenv("COINBASE_PRIME_CREDENTIALS"));
            CoinbasePrimeClient client = new CoinbasePrimeClient(credentials);
            String portfolioId = System.getenv("COINBASE_PRIME_PORTFOLIO_ID");

            StakingService service = PrimeServiceFactory.createStakingService(client);
            PortfolioStakingUnstakeResponse response = service.portfolioStakingUnstake(
                    new PortfolioStakingUnstakeRequest.Builder()
                            .portfolioId(portfolioId)
                            .idempotencyKey(UUID.randomUUID().toString())
                            .currencySymbol("ETH")
                            .amount("1.0")
                            .build());

            System.out.println(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
