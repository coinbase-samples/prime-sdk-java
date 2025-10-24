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

package com.coinbase.prime.staking;

import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.prime.client.CoinbasePrimeClient;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class StakingServiceImpl extends CoinbaseServiceImpl implements StakingService {
    public StakingServiceImpl(CoinbasePrimeClient client) {
        super(client);
    }

    @Override
    public CreateStakeResponse createStake(CreateStakeRequest request) {
        return this.request(
                HttpMethod.POST,
                String.format("/portfolios/%s/wallets/%s/staking/initiate", request.getPortfolioId(), request.getWalletId()),
                request,
                List.of(200),
                new TypeReference<CreateStakeResponse>() {});
    }

    @Override
    public CreateUnstakeResponse createUnstake(CreateUnstakeRequest request) {
        return this.request(
                HttpMethod.POST,
                String.format("/portfolios/%s/wallets/%s/staking/unstake", request.getPortfolioId(), request.getWalletId()),
                request,
                List.of(200),
                new TypeReference<CreateUnstakeResponse>() {});
    }

    @Override
    public ListTransactionValidatorsResponse listTransactionValidators(ListTransactionValidatorsRequest request) {
        return this.request(
                HttpMethod.POST,
                String.format("/portfolios/%s/staking/transaction-validators/query", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<ListTransactionValidatorsResponse>() {});
    }

    @Override
    public PortfolioStakingInitiateResponse portfolioStakingInitiate(PortfolioStakingInitiateRequest request) {
        return this.request(
                HttpMethod.POST,
                String.format("/portfolios/%s/staking/initiate", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<PortfolioStakingInitiateResponse>() {});
    }

    @Override
    public PortfolioStakingUnstakeResponse portfolioStakingUnstake(PortfolioStakingUnstakeRequest request) {
        return this.request(
                HttpMethod.POST,
                String.format("/portfolios/%s/staking/unstake", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<PortfolioStakingUnstakeResponse>() {});
    }

    @Override
    public ClaimRewardsResponse claimRewards(ClaimRewardsRequest request) {
        return this.request(
                HttpMethod.POST,
                String.format("/portfolios/%s/wallets/%s/staking/claim_rewards", request.getPortfolioId(), request.getWalletId()),
                request,
                List.of(200),
                new TypeReference<ClaimRewardsResponse>() {});
    }
}
