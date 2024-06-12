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

package com.coinbase.prime.errors;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CoinbasePrimeExceptionFactory {

    public static CoinbasePrimeException create(int statusCode, String responseBody) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            CoinbasePrimeErrorMessage errorMessage = mapper.readValue(responseBody, CoinbasePrimeErrorMessage.class);
            return new CoinbasePrimeException(statusCode, errorMessage.getMessage());
        } catch (Exception e) {
            return new CoinbasePrimeException(statusCode, responseBody);
        }
    }

    public static CoinbasePrimeException create(String responseBody, Throwable cause) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            CoinbasePrimeErrorMessage errorMessage = mapper.readValue(responseBody, CoinbasePrimeErrorMessage.class);
            return new CoinbasePrimeException(errorMessage.getMessage(), cause);
        } catch (Exception e) {
            return new CoinbasePrimeException(responseBody, cause);
        }
    }

    public static CoinbasePrimeException create(int statusCode, String responseBody, Throwable cause) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            CoinbasePrimeErrorMessage errorMessage = mapper.readValue(responseBody, CoinbasePrimeErrorMessage.class);
            return new CoinbasePrimeException(statusCode, errorMessage.getMessage(), cause);
        } catch (Exception e) {
            return new CoinbasePrimeException(statusCode, responseBody, cause);
        }
    }

    public static CoinbasePrimeException create(Throwable cause) {
        return new CoinbasePrimeException(cause);
    }
}
