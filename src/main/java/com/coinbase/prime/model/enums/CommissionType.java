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

/**
 * Enum representing different types of commission structures.
 */
public enum CommissionType {
    /**
     * Maker commission for providing liquidity.
     */
    MAKER("maker"),
    
    /**
     * Taker commission for consuming liquidity.
     */
    TAKER("taker"),
    
    /**
     * Base commission rate.
     */
    BASE("base"),
    
    /**
     * Volume-based commission rate.
     */
    VOLUME_BASED("volume_based"),
    
    /**
     * Fixed commission rate.
     */
    FIXED("fixed"),
    
    /**
     * Percentage-based commission rate.
     */
    PERCENTAGE("percentage");

    private final String value;

    CommissionType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }

    @JsonCreator
    public static CommissionType fromString(String value) {
        for (CommissionType commissionType : CommissionType.values()) {
            if (commissionType.value.equals(value)) {
                return commissionType;
            }
        }
        throw new IllegalArgumentException("Invalid CommissionType: " + value);
    }
}