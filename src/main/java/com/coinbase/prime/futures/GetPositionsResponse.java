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

import com.coinbase.prime.model.FcmPosition;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response containing FCM positions for an entity.
 */
public class GetPositionsResponse {
    private FcmPosition[] positions;

    @JsonProperty("clearing_account_id")
    private String clearingAccountId;

    public GetPositionsResponse() {
    }

    public FcmPosition[] getPositions() {
        return positions;
    }

    public void setPositions(FcmPosition[] positions) {
        this.positions = positions;
    }

    public String getClearingAccountId() {
        return clearingAccountId;
    }

    public void setClearingAccountId(String clearingAccountId) {
        this.clearingAccountId = clearingAccountId;
    }

}
