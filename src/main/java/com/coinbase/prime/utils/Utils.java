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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class Utils {
    private static final ObjectMapper OBJECT_MAPPER = configureObjectMapper();

    private static ObjectMapper configureObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        // Include non-null properties during serialization
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        // Ignore unknown fields during deserialization
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        // Read unknown enum values as null instead of failing
        mapper.configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true);
        // Register JSR310 module for Java 8 date/time types
        mapper.registerModule(new JavaTimeModule());
        return mapper;
    }

    /**
     * Returns a configured ObjectMapper instance matching the configuration used by coinbase-core-java.
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

    public static String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        return sdf.format(date);
    }
}
