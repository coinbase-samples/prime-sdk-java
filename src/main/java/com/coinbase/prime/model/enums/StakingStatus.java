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

public enum StakingStatus {
    STAKING_STATUS_UNKNOWN("STAKING_STATUS_UNKNOWN"),
    STAKING_STATUS_PENDING("STAKING_STATUS_PENDING"),
    STAKING_STATUS_ACTIVE("STAKING_STATUS_ACTIVE"),
    STAKING_STATUS_INACTIVE("STAKING_STATUS_INACTIVE"),
    STAKING_STATUS_UNSTAKING("STAKING_STATUS_UNSTAKING"),
    STAKING_STATUS_UNSTAKED("STAKING_STATUS_UNSTAKED"),
    STAKING_STATUS_SLASHED("STAKING_STATUS_SLASHED"),
    STAKING_STATUS_CLAIMABLE("STAKING_STATUS_CLAIMABLE");

    private final String value;

    StakingStatus(String value) {
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
    public static StakingStatus fromValue(String value) {
        for (StakingStatus status : StakingStatus.values()) {
            if (status.value.equals(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}