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

package com.coinbase.prime.futures;

import com.coinbase.prime.model.FcmBalance;

public class GetEntityFcmBalanceResponse {
    private FcmBalance fcmBalance;

    public GetEntityFcmBalanceResponse() {
    }

    public GetEntityFcmBalanceResponse(Builder builder) {
        this.fcmBalance = builder.fcmBalance;
    }

    public FcmBalance getFcmBalance() {
        return fcmBalance;
    }

    public void setFcmBalance(FcmBalance fcmBalance) {
        this.fcmBalance = fcmBalance;
    }

    public static class Builder {
        private FcmBalance fcmBalance;

        public Builder() {
        }

        public Builder fcmBalance(FcmBalance fcmBalance) {
            this.fcmBalance = fcmBalance;
            return this;
        }

        public GetEntityFcmBalanceResponse build() {
            return new GetEntityFcmBalanceResponse(this);
        }
    }
}
