/*
 *
 *  Copyright 2024-present Coinbase Global, Inc.
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
 *
 */

package com.coinbase.prime.model.transactions;

public enum TransactionStatus {
    TRANSACTION_CREATED,
    TRANSACTION_REQUESTED,
    TRANSACTION_APPROVED,
    TRANSACTION_PROCESSING,
    TRANSACTION_DONE,
    TRANSACTION_IMPORT_PENDING,
    TRANSACTION_IMPORTED,
    TRANSACTION_CANCELLED,
    TRANSACTION_REJECTED,
    TRANSACTION_DELAYED,
    TRANSACTION_RETRIED,
    TRANSACTION_FAILED,
    TRANSACTION_EXPIRED,
    OTHER_TRANSACTION_STATUS
}
