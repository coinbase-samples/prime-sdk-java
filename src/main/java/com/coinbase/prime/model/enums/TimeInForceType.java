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
 * Indicates the order time validity.
 * 
 * - UNKNOWN_TIME_IN_FORCE: nil value
 * - GOOD_UNTIL_DATE_TIME: Expires at a certain date/time
 * - GOOD_UNTIL_CANCELLED: Order stays on the books until cancelled
 * - IMMEDIATE_OR_CANCEL: Order is executed immediately at submission or is cancelled
 * - FILL_OR_KILL: Order is executed immediately and fully at submission or is cancelled
 */
public enum TimeInForceType {
    /** Expires at a certain date/time */
    GOOD_UNTIL_DATE_TIME("GOOD_UNTIL_DATE_TIME"),
    /** Order stays on the books until cancelled */
    GOOD_UNTIL_CANCELLED("GOOD_UNTIL_CANCELLED"),
    /** Order is executed immediately at submission or is cancelled */
    IMMEDIATE_OR_CANCEL("IMMEDIATE_OR_CANCEL"),
    /** Order is executed immediately and fully at submission or is cancelled */
    FILL_OR_KILL("FILL_OR_KILL");

    private final String value;

    TimeInForceType(String value) {
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
    public static TimeInForceType fromValue(String value) {
        for (TimeInForceType type : TimeInForceType.values()) {
            if (type.value.equals(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown TimeInForceType: " + value);
    }
}
