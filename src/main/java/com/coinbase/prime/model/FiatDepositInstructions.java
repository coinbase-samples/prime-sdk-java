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

package com.coinbase.prime.model;

import com.coinbase.prime.model.enums.DepositType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FiatDepositInstructions {
    private String id;
    private String name;
    private DepositType type;
    @JsonProperty("account_number")
    private String accountNumber;
    @JsonProperty("routing_number")
    private String routingNumber;
    @JsonProperty("reference_code")
    private String referenceCode;
}
