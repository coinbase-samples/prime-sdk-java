
# CoinbaseBrokerageProxyTradingApiOrderSimulated

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**liftAsk** | [**CoinbaseBrokerageProxyTradingApiLadderBestPrice**](CoinbaseBrokerageProxyTradingApiLadderBestPrice.md) | The weighted price that can accommodate the order amount, otherwise it returns an error. If the order amount is 0 it will return the lowest ask. | 
**hitBid** | [**CoinbaseBrokerageProxyTradingApiLadderBestPrice**](CoinbaseBrokerageProxyTradingApiLadderBestPrice.md) | The weighted price that can accommodate the order amount, otherwise it returns an error. If the order amount is 0 it will return the highest bid. | 
**spread** | [**CoinbaseBrokerageProxyTradingApiSpread**](CoinbaseBrokerageProxyTradingApiSpread.md) | Calculated as lift_ask - hit_bid, otherwise it returns an error. | 
**spreadBps** | [**CoinbaseBrokerageProxyTradingApiSpread**](CoinbaseBrokerageProxyTradingApiSpread.md) | Calculated as ((lift_ask - hit_bid) / lift_ask) * 10000, otherwise returns an error. | 



