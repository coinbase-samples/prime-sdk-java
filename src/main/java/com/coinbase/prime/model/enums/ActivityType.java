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
 * Activity types include various operations such as orders, deposits, withdrawals,
 * wallet operations, staking activities, and administrative actions.
 */
public enum ActivityType {
    /** Default activity type */
    OTHER_ACTIVITY_TYPE("OTHER_ACTIVITY_TYPE"),
    /** Limit order activity */
    ACTIVITY_TYPE_LIMIT_ORDER("ACTIVITY_TYPE_LIMIT_ORDER"),
    /** Market order activity */
    ACTIVITY_TYPE_MARKET_ORDER("ACTIVITY_TYPE_MARKET_ORDER"),
    /** TWAP order activity */
    ACTIVITY_TYPE_TWAP_ORDER("ACTIVITY_TYPE_TWAP_ORDER"),
    /** Block trade activity */
    ACTIVITY_TYPE_BLOCK_TRADE("ACTIVITY_TYPE_BLOCK_TRADE"),
    /** VWAP order activity */
    ACTIVITY_TYPE_VWAP_ORDER("ACTIVITY_TYPE_VWAP_ORDER"),
    /** Stop limit order activity */
    ACTIVITY_TYPE_STOP_LIMIT_ORDER("ACTIVITY_TYPE_STOP_LIMIT_ORDER"),
    /** Deposit activity */
    ACTIVITY_TYPE_DEPOSIT("ACTIVITY_TYPE_DEPOSIT"),
    /** Withdrawal activity */
    ACTIVITY_TYPE_WITHDRAWAL("ACTIVITY_TYPE_WITHDRAWAL"),
    /** Internal transfer activity */
    ACTIVITY_TYPE_INTERNAL_TRANSFER("ACTIVITY_TYPE_INTERNAL_TRANSFER"),
    /** Create wallet activity */
    ACTIVITY_TYPE_CREATE_WALLET("ACTIVITY_TYPE_CREATE_WALLET"),
    /** Remove wallet activity */
    ACTIVITY_TYPE_REMOVE_WALLET("ACTIVITY_TYPE_REMOVE_WALLET"),
    /** Update wallet activity */
    ACTIVITY_TYPE_UPDATE_WALLET("ACTIVITY_TYPE_UPDATE_WALLET"),
    /** Cast vote activity */
    ACTIVITY_TYPE_CAST_VOTE("ACTIVITY_TYPE_CAST_VOTE"),
    /** Enable voting activity */
    ACTIVITY_TYPE_ENABLE_VOTING("ACTIVITY_TYPE_ENABLE_VOTING"),
    /** Stake activity */
    ACTIVITY_TYPE_STAKE("ACTIVITY_TYPE_STAKE"),
    /** Unstake activity */
    ACTIVITY_TYPE_UNSTAKE("ACTIVITY_TYPE_UNSTAKE"),
    /** Change validator activity */
    ACTIVITY_TYPE_CHANGE_VALIDATOR("ACTIVITY_TYPE_CHANGE_VALIDATOR"),
    /** Restake activity */
    ACTIVITY_TYPE_RESTAKE("ACTIVITY_TYPE_RESTAKE"),
    /** Address book activity */
    ACTIVITY_TYPE_ADDRESS_BOOK("ACTIVITY_TYPE_ADDRESS_BOOK"),
    /** Team members activity */
    ACTIVITY_TYPE_TEAM_MEMBERS("ACTIVITY_TYPE_TEAM_MEMBERS"),
    /** Billing activity */
    ACTIVITY_TYPE_BILLING("ACTIVITY_TYPE_BILLING"),
    /** Security activity */
    ACTIVITY_TYPE_SECURITY("ACTIVITY_TYPE_SECURITY"),
    /** API activity */
    ACTIVITY_TYPE_API("ACTIVITY_TYPE_API"),
    /** Settings activity */
    ACTIVITY_TYPE_SETTINGS("ACTIVITY_TYPE_SETTINGS"),
    /** Smart contract activity */
    ACTIVITY_TYPE_SMART_CONTRACT("ACTIVITY_TYPE_SMART_CONTRACT"),
    /** Allocation in activity */
    ACTIVITY_TYPE_ALLOCATION_IN("ACTIVITY_TYPE_ALLOCATION_IN"),
    /** Allocation out activity */
    ACTIVITY_TYPE_ALLOCATION_OUT("ACTIVITY_TYPE_ALLOCATION_OUT"),
    /** Allocation in reversal activity */
    ACTIVITY_TYPE_ALLOCATION_IN_REVERSAL("ACTIVITY_TYPE_ALLOCATION_IN_REVERSAL"),
    /** Allocation out reversal activity */
    ACTIVITY_TYPE_ALLOCATION_OUT_REVERSAL("ACTIVITY_TYPE_ALLOCATION_OUT_REVERSAL"),
    /** Conversion activity */
    ACTIVITY_TYPE_CONVERSION("ACTIVITY_TYPE_CONVERSION"),
    /** Principal out activity */
    ACTIVITY_TYPE_PRINCIPAL_OUT("ACTIVITY_TYPE_PRINCIPAL_OUT"),
    /** Principal in activity */
    ACTIVITY_TYPE_PRINCIPAL_IN("ACTIVITY_TYPE_PRINCIPAL_IN"),
    /** Collateral out activity */
    ACTIVITY_TYPE_COLLATERAL_OUT("ACTIVITY_TYPE_COLLATERAL_OUT"),
    /** Collateral in activity */
    ACTIVITY_TYPE_COLLATERAL_IN("ACTIVITY_TYPE_COLLATERAL_IN"),
    /** Interest out activity */
    ACTIVITY_TYPE_INTEREST_OUT("ACTIVITY_TYPE_INTEREST_OUT"),
    /** Interest in activity */
    ACTIVITY_TYPE_INTEREST_IN("ACTIVITY_TYPE_INTEREST_IN"),
    /** Web3 message activity */
    ACTIVITY_TYPE_WEB3_MESSAGE("ACTIVITY_TYPE_WEB3_MESSAGE"),
    /** Web3 transaction activity */
    ACTIVITY_TYPE_WEB3_TRANSACTION("ACTIVITY_TYPE_WEB3_TRANSACTION"),
    /** Web3 device recovery activity */
    ACTIVITY_TYPE_WEB3_DEVICE_RECOVERY("ACTIVITY_TYPE_WEB3_DEVICE_RECOVERY"),
    /** Web3 recreate backup activity */
    ACTIVITY_TYPE_WEB3_RECREATE_BACKUP("ACTIVITY_TYPE_WEB3_RECREATE_BACKUP"),
    /** Web3 onboarding activity */
    ACTIVITY_TYPE_WEB3_ONBOARDING("ACTIVITY_TYPE_WEB3_ONBOARDING"),
    /** Governance vote activity */
    ACTIVITY_TYPE_GOVERNANCE_VOTE("ACTIVITY_TYPE_GOVERNANCE_VOTE"),
    /** Invitation activity */
    ACTIVITY_TYPE_INVITATION("ACTIVITY_TYPE_INVITATION"),
    /** Wallet change activity */
    ACTIVITY_TYPE_WALLET_CHANGE("ACTIVITY_TYPE_WALLET_CHANGE"),
    /** API key change activity */
    ACTIVITY_TYPE_API_KEY_CHANGE("ACTIVITY_TYPE_API_KEY_CHANGE"),
    /** Settings change activity */
    ACTIVITY_TYPE_SETTINGS_CHANGE("ACTIVITY_TYPE_SETTINGS_CHANGE"),
    /** Billing preference change activity */
    ACTIVITY_TYPE_BILLING_PREFERENCE_CHANGE("ACTIVITY_TYPE_BILLING_PREFERENCE_CHANGE"),
    /** Payment method change activity */
    ACTIVITY_TYPE_PAYMENT_METHOD_CHANGE("ACTIVITY_TYPE_PAYMENT_METHOD_CHANGE"),
    /** User change request without PAS activity */
    ACTIVITY_TYPE_USER_CHANGE_REQUEST_NO_PAS("ACTIVITY_TYPE_USER_CHANGE_REQUEST_NO_PAS"),
    /** Claim rewards activity */
    ACTIVITY_TYPE_CLAIM_REWARDS("ACTIVITY_TYPE_CLAIM_REWARDS");

    private final String value;

    ActivityType(String value) {
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
    public static ActivityType fromValue(String value) {
        for (ActivityType type : ActivityType.values()) {
            if (type.value.equals(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown ActivityType: " + value);
    }
}