package com.coinbase.prime.positions;

import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.prime.client.CoinbasePrimeClient;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class PositionsServiceImpl extends CoinbaseServiceImpl implements PositionsService {
    public PositionsServiceImpl(CoinbasePrimeClient client) {
        super(client);
    }

    @Override
    public ListAggregateEntityPositionsResponse listAggregateEntityPositions(ListAggregateEntityPositionsRequest request) {
        return this.request(
                HttpMethod.GET,
                String.format("/entities/%s/aggregate_positions", request.getEntityId()),
                request,
                List.of(200),
                new TypeReference<ListAggregateEntityPositionsResponse>() {});
    }

    @Override
    public ListEntityPositionsResponse listEntityPositions(ListEntityPositionsRequest request) {
        return this.request(
                HttpMethod.GET,
                String.format("/entities/%s/positions", request.getEntityId()),
                request,
                List.of(200),
                new TypeReference<ListEntityPositionsResponse>() {});
    }
}
