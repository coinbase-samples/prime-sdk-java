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

public enum InvoiceType {
    INVOICE_TYPE_UNSPECIFIED,
    INVOICE_TYPE_AUC_FEE,
    INVOICE_TYPE_MINIMUM_FEE,
    INVOICE_TYPE_WITHDRAWAL_FEE,
    INVOICE_TYPE_NEW_WALLET_FEE,
    INVOICE_TYPE_STAKING_FEE
}