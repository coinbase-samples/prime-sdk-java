package com.coinbase.core.http;

public abstract class CoinbaseDeleteRequest extends CoinbaseHttpRequest {
    protected abstract String getQueryString();
}
