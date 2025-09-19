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
 * Indicates the user's role.
 * 
 * - USER_ROLE_UNKNOWN: nil value
 * - AUDITOR: An auditor
 * - SIGNATORY: A signatory
 * - ADMIN: An admin
 * - INITIATOR: An initiator
 * - REVIEWER: A reviewer
 * - TRADER: A trader
 * - FULL_TRADER: A trader with full permissions
 * - TEAM_MANAGER: A team manager
 * - APPROVER: An approver
 */
public enum UserRole {
    /** An auditor */
    AUDITOR("AUDITOR"),
    /** A signatory */
    SIGNATORY("SIGNATORY"),
    /** An admin */
    ADMIN("ADMIN"),
    /** An initiator */
    INITIATOR("INITIATOR"),
    /** A reviewer */
    REVIEWER("REVIEWER"),
    /** A trader */
    TRADER("TRADER"),
    /** A trader with full permissions */
    FULL_TRADER("FULL_TRADER"),
    /** A team manager */
    TEAM_MANAGER("TEAM_MANAGER"),
    /** An approver */
    APPROVER("APPROVER");

    private final String value;

    UserRole(String value) {
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
    public static UserRole fromValue(String value) {
        for (UserRole role : UserRole.values()) {
            if (role.value.equals(value)) {
                return role;
            }
        }
        throw new IllegalArgumentException("Unknown UserRole: " + value);
    }
}
