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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

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

    /**
     * Helper method to determine if a request object has any serializable fields.
     * Returns null if all fields are @JsonIgnore (path params only), otherwise
     * returns the request.
     * This prevents serialization errors when requests only contain path
     * parameters.
     *
     * @param request
     *            The request object to check
     * @param <T>
     *            The type of the request object
     * @return The request object if it has serializable fields, null otherwise
     */
    public static <T> T getRequestForSerialization(T request) {
        if (request == null) {
            return null;
        }

        // Check if any field is NOT marked with @JsonIgnore
        boolean hasSerializableFields = Arrays.stream(request.getClass().getDeclaredFields())
                .anyMatch(field -> !field.isAnnotationPresent(JsonIgnore.class));

        return hasSerializableFields ? request : null;
    }

    public static String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        return sdf.format(date);
    }
}
