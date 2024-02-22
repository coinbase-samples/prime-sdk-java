
# CoinbaseCustodyApiBalance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currencySymbol** | **String** |  | 
**value** | **String** | Total balance | 
**withdrawableValue** | **String** | Withdrawable (i.e. available) balance for vault + trading balance | 
**usdValue** | **String** | Total balance in fiat | 
**scope** | [**CoinbaseCustodyApiBalanceScope**](CoinbaseCustodyApiBalanceScope.md) |  |  [optional]
**withdrawableUsdValue** | **String** | Withdrawable (i.e. available) balance for vault + trading balance in fiat |  [optional]
**bondedValue** | **String** | Balance which has been locked due to bonding/staking, potentially subject to an unbonding period | 
**reservedValue** | **String** | Balance which must remain in the wallet untouched due to the protocol | 
**unbondingValue** | **String** | Balance which is currently in the process of unbonding | 
**unvestedValue** | **String** | Unrealized balance subject to a vesting schedule | 
**vestedValue** | **String** | Realized vested balance (balance - unvested balance) | 
**currencyType** | **String** |  | 
**tradableValue** | **String** | Tradable (i.e. available) balance from trading balance wallet | 
**tradableUsdValue** | **String** | Tradable (i.e. available) balance from trading balance wallet in fiat | 
**holdTradableValue** | **String** | Hold balance from trading balance wallet | 
**holdTradableUsdValue** | **String** | Hold balance from trading balance wallet in fiat | 
**totalTradableValue** | **String** | Total balance of trading balance wallet (available + hold) | 
**totalTradableUsdValue** | **String** | Total balance of trading balance wallet (available + hold) in fiat | 
**pendingRewardsValue** | **String** | Pending bonding/staking rewards that have not yet been realized | 
**lifetimeRewardsValue** | **String** | Previously realized bonding/staking rewards | 
**bondableValue** | **String** | Balance available for bonding/staking |  [optional]
**omnibusQcValue** | **String** | Omnibus QC (i.e. available) balance from omnibus qc wallet | 
**omnibusQcUsdValue** | **String** | Omnibus QC (i.e. available) balance from omnibus qc wallet in USD | 
**holdOmnibusQcValue** | **String** | Hold balance from omnibus qc wallet | 
**holdOmnibusQcUsdValue** | **String** | Hold balance from omnibus qc wallet in USD | 
**totalOmnibusQcValue** | **String** | Total balance of omnibus qc wallet (available + hold) | 
**totalOmnibusQcUsdValue** | **String** | Total balance of omnibus qc wallet (available + hold) in USD | 
**holdValue** | **String** | Total Hold balance |  [optional]
**holdUsdValue** | **String** | Total Hold in fiat |  [optional]



