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

package com.coinbase.prime.wallets;

import com.coinbase.prime.model.enums.WalletType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response object for the create wallet operation.
 * 
 * Creates a new wallet for the specified portfolio. Note that the first ONCHAIN wallet 
 * for each network family must be created through the Prime UI.
 */
public class CreateWalletResponse {
    /** The ID of the activity associated with the wallet creation */
    @JsonProperty("activity_id")
    private String activityId;

    /** The name of the wallet */
    private String name;

    /** The asset symbol stored in the wallet */
    private String symbol;

    /** The wallet type (VAULT, TRADING, or WALLET_TYPE_OTHER) */
    @JsonProperty("wallet_type")
    private WalletType type;

    public CreateWalletResponse() {
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public WalletType getType() {
        return type;
    }

    public void setType(WalletType type) {
        this.type = type;
    }
}
