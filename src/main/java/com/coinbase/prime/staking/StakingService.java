package com.coinbase.prime.staking;

public interface StakingService {
    CreateStakeResponse createStake(CreateStakeRequest request);
    CreateUnstakeResponse createUnstake(CreateUnstakeRequest request);
}
