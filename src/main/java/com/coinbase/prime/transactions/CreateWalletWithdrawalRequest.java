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

package com.coinbase.prime.transactions;

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.model.BlockchainAddress;
import com.coinbase.prime.model.CounterpartyDestination;
import com.coinbase.prime.model.PaymentMethodDestination;
import com.coinbase.prime.model.enums.DestinationType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.*;

public class CreateWalletWithdrawalRequest {
    @JsonProperty(required = true, value = "portfolio_id")
    @JsonIgnore
    private String portfolioId;
    @JsonProperty(required = true, value = "wallet_id")
    @JsonIgnore
    private String walletId;
    private String amount;
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    @JsonProperty("destination_type")
    private DestinationType destinationType;
    @JsonProperty("idempotency_key")
    private String idempotencyKey;
    @JsonProperty("payment_method")
    private PaymentMethodDestination paymentMethod;
    @JsonProperty("blockchain_address")
    private BlockchainAddress blockchainAddress;
    private CounterpartyDestination counterparty;

    public CreateWalletWithdrawalRequest() {
    }

    public CreateWalletWithdrawalRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.walletId = builder.walletId;
        this.amount = builder.amount;
        this.currencySymbol = builder.currencySymbol;
        this.destinationType = builder.destinationType;
        this.idempotencyKey = builder.idempotencyKey;
        this.paymentMethod = builder.paymentMethod;
        this.blockchainAddress = builder.blockchainAddress;
        this.counterparty = builder.counterparty;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public DestinationType getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(DestinationType destinationType) {
        this.destinationType = destinationType;
    }

    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    public void setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
    }

    public PaymentMethodDestination getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethodDestination paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public BlockchainAddress getBlockchainAddress() {
        return blockchainAddress;
    }

    public void setBlockchainAddress(BlockchainAddress blockchainAddress) {
        this.blockchainAddress = blockchainAddress;
    }

    public CounterpartyDestination getCounterparty() {
        return counterparty;
    }

    public void setCounterparty(CounterpartyDestination counterparty) {
        this.counterparty = counterparty;
    }

    public static class Builder {
        private final String portfolioId;
        private final String walletId;
        private String amount;
        private String currencySymbol;
        private DestinationType destinationType;
        private String idempotencyKey;
        private PaymentMethodDestination paymentMethod;
        private BlockchainAddress blockchainAddress;
        private CounterpartyDestination counterparty;

        public Builder(String portfolioId, String walletId) {
            this.portfolioId = portfolioId;
            this.walletId = walletId;
        }

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder currencySymbol(String currencySymbol) {
            this.currencySymbol = currencySymbol;
            return this;
        }

        public Builder destinationType(DestinationType destinationType) {
            this.destinationType = destinationType;
            return this;
        }

        public Builder idempotencyKey(String idempotencyKey) {
            this.idempotencyKey = idempotencyKey;
            return this;
        }

        public Builder paymentMethod(PaymentMethodDestination paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Builder blockchainAddress(BlockchainAddress blockchainAddress) {
            this.blockchainAddress = blockchainAddress;
            return this;
        }

        public Builder counterparty(CounterpartyDestination counterparty) {
            this.counterparty = counterparty;
            return this;
        }

        public CreateWalletWithdrawalRequest build() throws CoinbaseClientException {
            this.validate();
            return new CreateWalletWithdrawalRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.portfolioId)) {
                throw new CoinbaseClientException("PortfolioId is required");
            }
            if (isNullOrEmpty(this.walletId)) {
                throw new CoinbaseClientException("WalletId is required");
            }
            if (isNullOrEmpty(this.amount)) {
                throw new CoinbaseClientException("Amount is required");
            }
            if (isNullOrEmpty(this.currencySymbol)) {
                throw new CoinbaseClientException("Currency symbol is required");
            }
            if (this.destinationType == null) {
                throw new CoinbaseClientException("Destination type is required");
            }
            if (isNullOrEmpty(this.idempotencyKey)) {
                throw new CoinbaseClientException("Idempotency key is required");
            }
        }
    }
}
