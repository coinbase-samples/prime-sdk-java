/*
 * Copyright 2026-present Coinbase Global, Inc.
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

package com.coinbase.prime.assets;

import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssetsServiceSerializationTest {

    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    @Test
    public void testListAssetsRequestConstruction() throws CoinbaseClientException {
        ListAssetsRequest request = new ListAssetsRequest.Builder("entity-123").build();
        assertNotNull(request);
        assertEquals("entity-123", request.getEntityId());
    }

    @Test
    public void testListAssetsRequestBuilderValidation() {
        assertThrows(CoinbaseClientException.class, () ->
                new ListAssetsRequest.Builder(null).build());
        assertThrows(CoinbaseClientException.class, () ->
                new ListAssetsRequest.Builder("").build());
    }

    @Test
    public void testListAssetsResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"assets\":["
                + "{\"name\":\"Bitcoin\",\"symbol\":\"BTC\",\"decimal_precision\":\"8\"},"
                + "{\"name\":\"Ethereum\",\"symbol\":\"ETH\",\"decimal_precision\":\"18\"}"
                + "]"
                + "}";

        ListAssetsResponse response = objectMapper.readValue(json, ListAssetsResponse.class);
        assertNotNull(response);
        assertNotNull(response.getAssets());
        assertEquals(2, response.getAssets().length);
        assertEquals("BTC", response.getAssets()[0].getSymbol());
        assertEquals("ETH", response.getAssets()[1].getSymbol());
    }
}
