package com.coinbase.prime.model.enums;


/*
 * Copyright 2025-present Coinbase Global, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.coinbase.prime.model.enums;

public enum TransactionType {
  DEPOSIT,
  WITHDRAWAL,
  INTERNAL_DEPOSIT,
  INTERNAL_WITHDRAWAL,
  SWEEP_DEPOSIT,
  SWEEP_WITHDRAWAL,
  PROXY_DEPOSIT,
  PROXY_WITHDRAWAL,
  BILLING_WITHDRAWAL,
  REWARD,
  COINBASE_REFUND,
  TRANSACTION_TYPE_OTHER,
  WITHDRAWAL_ADJUSTMENT,
  DEPOSIT_ADJUSTMENT,
  KEY_REGISTRATION,
  DELEGATION,
  UNDELEGATION,
  RESTAKE,
  COMPLETE_UNBONDING,
  WITHDRAW_UNBONDED,
  STAKE_ACCOUNT_CREATE,
  CHANGE_VALIDATOR,
  STAKE,
  UNSTAKE,
  REMOVE_AUTHORIZED_PARTY,
  STAKE_AUTHORIZE_WITH_SEED,
  SLASH,
  COINBASE_DEPOSIT,
  CONVERSION,
  CLAIM_REWARDS,
  VOTE_AUTHORIZE,
  WEB3_TRANSACTION,
  ONCHAIN_TRANSACTION
}

