/*
 * *
 *  * Copyright 2024-present Coinbase Global, Inc.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *  http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.coinbase.prime.model.activities;

public enum ActivitySecondaryType {
    NONE("NO_SECONDARY_TYPE"),
    BUY("ACTIVITY_SECONDARY_TYPE_BUY"),
    SELL("ACTIVITY_SECONDARY_TYPE_SELL"),
    INTERNAL_TRANSFER("ACTIVITY_SECONDARY_TYPE_INTERNAL_TRANSFER"),
    SWEEP_TRANSFER_TYPE("ACTIVITY_SECONDARY_TYPE_SWEEP_TRANSFER_TYPE"),
    WEB3_SIGNER("ACTIVITY_SECONDARY_TYPE_WEB3_SIGNER"),
    WEB3_WALLET("ACTIVITY_SECONDARY_TYPE_WEB3_WALLET");

    private final String value;

    ActivitySecondaryType(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }
}
