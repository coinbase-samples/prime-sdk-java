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

public enum UnbondingStatus {
    UNBONDING_STATUS_UNKNOWN("UNBONDING_STATUS_UNKNOWN"),
    UNBONDING_STATUS_UNBONDING("UNBONDING_STATUS_UNBONDING"),
    UNBONDING_STATUS_COMPLETE("UNBONDING_STATUS_COMPLETE"),
    UNBONDING_STATUS_CLAIMABLE("UNBONDING_STATUS_CLAIMABLE"),
    UNBONDING_STATUS_CLAIMED("UNBONDING_STATUS_CLAIMED");

    private final String value;

    UnbondingStatus(String value) {
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
    public static UnbondingStatus fromValue(String value) {
        for (UnbondingStatus status : UnbondingStatus.values()) {
            if (status.value.equals(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}