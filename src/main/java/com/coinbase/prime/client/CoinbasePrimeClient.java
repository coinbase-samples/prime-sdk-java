/*
 * Copyright 2024-present Coinbase Global, Inc.
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

package com.coinbase.prime.client;

import com.coinbase.core.client.CoinbaseNetHttpClient;
import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.credentials.CoinbasePrimeCredentials;
import com.coinbase.prime.errors.CoinbasePrimeErrorMessage;
import com.coinbase.prime.errors.CoinbasePrimeException;
import com.coinbase.prime.utils.Constants;
import com.fasterxml.jackson.core.type.TypeReference;

import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.List;

public class CoinbasePrimeClient extends CoinbaseNetHttpClient {
    public CoinbasePrimeClient(CoinbasePrimeCredentials credentials, String baseUrl) {
        super(credentials, baseUrl);
    }

    public CoinbasePrimeClient(CoinbasePrimeCredentials credentials, String baseUrl, HttpClient client) {
        super(credentials, baseUrl, client);
    }

    public CoinbasePrimeClient(CoinbasePrimeCredentials credentials) {
        super(credentials, Constants.CB_PRIME_BASE_URL);
    }

    public CoinbasePrimeClient(CoinbasePrimeCredentials credentials, HttpClient client) {
        super(credentials, Constants.CB_PRIME_BASE_URL, client);
    }

    @Override
    protected <T> T handleResponse(
            HttpResponse<String> response,
            List<Integer> expectedStatusCodes,
            TypeReference<T> responseClass) throws CoinbasePrimeException {
        if (!expectedStatusCodes.contains(response.statusCode())) {
            try {
                CoinbasePrimeErrorMessage errorMessage = this.mapper.readValue(response.body(), CoinbasePrimeErrorMessage.class);
                errorMessage.setStatusCode(response.statusCode());
                throw errorMessage.createCoinbaseException();
            } catch (Exception e) {
                throw new CoinbasePrimeException(response.statusCode(), response.body());
            }
        }

        try {
            return this.mapper.readValue(response.body(), responseClass);
        } catch (Throwable e) {
            throw new CoinbaseClientException("Failed to deserialize class", e);
        }
    }
}
