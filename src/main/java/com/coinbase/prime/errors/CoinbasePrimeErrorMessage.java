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

import com.coinbase.core.errors.CoinbaseErrorMessage;
import com.coinbase.core.errors.CoinbaseException;

public class CoinbasePrimeErrorMessage implements CoinbaseErrorMessage {
    private String message;
    private int statusCode;

    public CoinbasePrimeErrorMessage() {
    }

    public CoinbasePrimeErrorMessage(Builder builder) {
        this.message = builder.message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public CoinbaseException createCoinbaseException() {
       return new CoinbasePrimeException(this.statusCode, this.message);
    }

    public static class Builder {
        private String message;

        public Builder() {
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public CoinbasePrimeErrorMessage build() {
            return new CoinbasePrimeErrorMessage(this);
        }
    }
}
