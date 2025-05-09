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
}
