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

public enum PrimeActivityType {
    OTHER_ACTIVITY_TYPE,
    ACTIVITY_TYPE_LIMIT_ORDER,
    ACTIVITY_TYPE_STOP_LIMIT_ORDER,
    ACTIVITY_TYPE_MARKET_ORDER,
    ACTIVITY_TYPE_TWAP_ORDER,
    ACTIVITY_TYPE_DEPOSIT,
    ACTIVITY_TYPE_WITHDRAWAL,
    ACTIVITY_TYPE_INTERNAL_TRANSFER,
    ACTIVITY_TYPE_CREATE_WALLET,
    ACTIVITY_TYPE_REMOVE_WALLET,
    ACTIVITY_TYPE_UPDATE_WALLET,
    ACTIVITY_TYPE_CAST_VOTE,
    ACTIVITY_TYPE_ENABLE_VOTING,
    ACTIVITY_TYPE_STAKE,
    ACTIVITY_TYPE_UNSTAKE,
    ACTIVITY_TYPE_CHANGE_VALIDATOR,
    ACTIVITY_TYPE_RESTAKE,
    ACTIVITY_TYPE_ADDRESS_BOOK,
    ACTIVITY_TYPE_TEAM_MEMBERS,
    ACTIVITY_TYPE_BILLING,
    ACTIVITY_TYPE_SECURITY,
    ACTIVITY_TYPE_API,
    ACTIVITY_TYPE_SETTINGS,
    ACTIVITY_TYPE_SMART_CONTRACT,
    ACTIVITY_TYPE_ALLOCATION_IN,
    ACTIVITY_TYPE_ALLOCATION_OUT,
    ACTIVITY_TYPE_IN_REVERSAL,
    ACTIVITY_TYPE_OUT_REVERSAL,
    ACTIVITY_TYPE_CONVERSION,
    ACTIVITY_TYPE_BLOCK_TRADE,
    ACTIVITY_TYPE_VWAP_ORDER,
    WEB3ACTIVITY_TYPE_WEB3_MESSAGE,
    WEB3ACTIVITY_TYPE_WEB3_TRANSACTION,
    WEB3ACTIVITY_TYPE_WEB3_DEVICE_RECOVERY,
    WEB3ACTIVITY_TYPE_WEB3_RECREATE_BACKUP,
    WEB3ACTIVITY_TYPE_WEB3_ONBOARDING
}
