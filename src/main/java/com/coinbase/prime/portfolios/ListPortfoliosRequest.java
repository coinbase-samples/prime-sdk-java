/*
 * Copyright 2025-present Coinbase Global, Inc.
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

package com.coinbase.prime.portfolios;

/**
 * List all portfolios associated with a given entity.
 */
public class ListPortfoliosRequest {
    // No parameters required for listing all portfolios
    // This is a simple GET request to /v1/portfolios with no path or query parameters

    public ListPortfoliosRequest() {
    }

    public static class Builder {

        public Builder() {
        }

        public ListPortfoliosRequest build() {
            return new ListPortfoliosRequest();
        }
    }
}
