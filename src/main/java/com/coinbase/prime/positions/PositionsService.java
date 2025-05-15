package com.coinbase.prime.positions;

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.errors.CoinbasePrimeException;

public interface PositionsService {
    ListAggregateEntityPositionsResponse listAggregateEntityPositions(ListAggregateEntityPositionsRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    ListEntityPositionsResponse listEntityPositions(ListEntityPositionsRequest request) throws CoinbaseClientException, CoinbasePrimeException;
}
