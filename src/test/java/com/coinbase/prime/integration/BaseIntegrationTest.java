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

package com.coinbase.prime.integration;

import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.credentials.CoinbasePrimeCredentials;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * Base class for live integration tests. Tests are skipped automatically when
 * COINBASE_PRIME_CREDENTIALS is not set in the environment.
 *
 * Required env vars:
 *   COINBASE_PRIME_CREDENTIALS - JSON with accessKey, passphrase, signingKey
 *   COINBASE_PRIME_PORTFOLIO_ID - portfolio UUID used in portfolio-scoped calls
 *   COINBASE_PRIME_ENTITY_ID    - entity UUID used in entity-scoped calls
 */
public abstract class BaseIntegrationTest {

    protected CoinbasePrimeClient client;
    protected String portfolioId;
    protected String entityId;

    @BeforeEach
    public void setUpBase() throws Exception {
        String credentialsJson = System.getenv("COINBASE_PRIME_CREDENTIALS");
        assumeTrue(credentialsJson != null && !credentialsJson.isEmpty(),
                "Skipping integration test: COINBASE_PRIME_CREDENTIALS not set");

        portfolioId = System.getenv("COINBASE_PRIME_PORTFOLIO_ID");
        entityId = System.getenv("COINBASE_PRIME_ENTITY_ID");

        CoinbasePrimeCredentials credentials = new CoinbasePrimeCredentials(credentialsJson);
        client = new CoinbasePrimeClient(credentials);
    }
}
