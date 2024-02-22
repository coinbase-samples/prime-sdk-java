
# CoinbaseEngPrimeApiApiWalletBalance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | Total balance |  [optional]
**usdValue** | **String** | Total balance in fiat |  [optional]
**withdrawableValue** | **String** | Withdrawable (i.e. available) balance for vault + trading balance |  [optional]
**withdrawableUsdValue** | **String** | Withdrawable (i.e. available) balance for vault + trading balance in fiat |  [optional]
**bondedValue** | **String** | Balance which has been locked due to bonding/staking, potentially subject to an unbonding period |  [optional]
**reservedValue** | **String** | Balance which must remain in the wallet untouched due to the protocol |  [optional]
**unbondingValue** | **String** | Balance which is currently in the process of unbonding |  [optional]
**unvestedValue** | **String** | Unrealized balance subject to a vesting schedule |  [optional]
**vestedValue** | **String** | Realized vested balance (balance - unvested balance) |  [optional]
**pendingRewardsValue** | **String** | Pending bonding/staking rewards that have not yet been realized |  [optional]
**lifetimeRewardsValue** | **String** | Previously realized bonding/staking rewards |  [optional]
**bondableValue** | **String** | Balance available for bonding/staking |  [optional]



