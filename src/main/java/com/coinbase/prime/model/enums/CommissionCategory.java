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

package com.coinbase.prime.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum representing different categories of commission.
 */
public enum CommissionCategory {
    /**
     * Trading commission for spot trading.
     */
    TRADING("trading"),
    
    /**
     * Commission for futures trading.
     */
    FUTURES("futures"),
    
    /**
     * Commission for options trading.
     */
    OPTIONS("options"),
    
    /**
     * Commission for staking operations.
     */
    STAKING("staking"),
    
    /**
     * Commission for lending operations.
     */
    LENDING("lending"),
    
    /**
     * Commission for margin trading.
     */
    MARGIN("margin"),
    
    /**
     * Commission for OTC trades.
     */
    OTC("otc"),
    
    /**
     * Commission for block trades.
     */
    BLOCK("block"),
    
    /**
     * Commission for RFQ trades.
     */
    RFQ("rfq");

    private final String value;

    CommissionCategory(String value) {
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
    public static CommissionCategory fromString(String value) {
        for (CommissionCategory category : CommissionCategory.values()) {
            if (category.value.equals(value)) {
                return category;
            }
        }
        throw new IllegalArgumentException("Invalid CommissionCategory: " + value);
    }
}