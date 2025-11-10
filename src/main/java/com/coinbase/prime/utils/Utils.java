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

package com.coinbase.prime.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

public final class Utils {
    private static final ObjectMapper OBJECT_MAPPER = configureObjectMapper();

    private static ObjectMapper configureObjectMapper() {
        ObjectMapper mapper = com.coinbase.core.utils.Utils.configureObjectMapper();
        // add modules here if needed in the future
        return mapper;
    }

    /**
     * Returns a configured ObjectMapper instance matching the configuration used by
     * coinbase-core-java.
     * This mapper is configured with:
     * - NON_NULL serialization
     * - Ignore unknown properties
     * - Read unknown enum values as null
     * - JSR310 JavaTimeModule for date/time support
     *
     * @return Configured ObjectMapper instance
     */
    public static ObjectMapper getObjectMapper() {
        return OBJECT_MAPPER;
    }
}
