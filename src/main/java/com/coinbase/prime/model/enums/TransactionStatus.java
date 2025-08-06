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

public enum TransactionStatus {
    TRANSACTION_APPROVED,
    TRANSACTION_BROADCASTING,
    TRANSACTION_CANCELLED,
    TRANSACTION_CONSTRUCTED,
    TRANSACTION_CREATED,
    TRANSACTION_DELAYED,
    TRANSACTION_DONE,
    TRANSACTION_EXPIRED,
    TRANSACTION_FAILED,
    TRANSACTION_GASSED,
    TRANSACTION_GASSING,
    TRANSACTION_IMPORT_PENDING,
    TRANSACTION_IMPORTED,
    TRANSACTION_PLANNED,
    TRANSACTION_PROCESSING,
    TRANSACTION_PROVISIONED,
    TRANSACTION_REJECTED,
    TRANSACTION_REQUESTED,
    TRANSACTION_RESTORED,
    TRANSACTION_RETRIED,
    OTHER_TRANSACTION_STATUS
}
