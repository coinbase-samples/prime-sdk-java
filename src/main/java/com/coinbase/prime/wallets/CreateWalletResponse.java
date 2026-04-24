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

import com.coinbase.prime.model.enums.NetworkFamily;
import com.coinbase.prime.model.enums.WalletType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Create Wallet
 */
public class CreateWalletResponse {
    @JsonProperty("activity_id")
    private String activityId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("wallet_type")
    private WalletType walletType;

    @JsonProperty("network_family")
    private NetworkFamily networkFamily;

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

    public WalletType getWalletType() {
        return walletType;
    }

    public void setWalletType(WalletType walletType) {
        this.walletType = walletType;
    }

    public NetworkFamily getNetworkFamily() {
        return networkFamily;
    }

    public void setNetworkFamily(NetworkFamily networkFamily) {
        this.networkFamily = networkFamily;
    }

}
