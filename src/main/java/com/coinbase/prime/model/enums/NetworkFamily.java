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

package com.coinbase.prime.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum NetworkFamily {
    NETWORK_FAMILY_UNSPECIFIED("NETWORK_FAMILY_UNSPECIFIED"),
    NETWORK_FAMILY_EVM("NETWORK_FAMILY_EVM"),
    NETWORK_FAMILY_SOLANA("NETWORK_FAMILY_SOLANA"),
    NETWORK_FAMILY_BITCOIN("NETWORK_FAMILY_BITCOIN"),
    NETWORK_FAMILY_COSMOS("NETWORK_FAMILY_COSMOS");

    private final String value;

    NetworkFamily(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static NetworkFamily fromValue(String value) {
        for (NetworkFamily family : NetworkFamily.values()) {
            if (family.value.equals(value)) {
                return family;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}