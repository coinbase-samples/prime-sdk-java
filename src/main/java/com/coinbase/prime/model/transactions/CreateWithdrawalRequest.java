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

package com.coinbase.prime.model.transactions;

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.model.enums.DestinationType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;

public class CreateWithdrawalRequest {
    @JsonProperty(required = true, value = "portfolio_id")
    @JsonIgnore
    private String portfolioId;
    @JsonProperty(required = true, value = "wallet_id")
    @JsonIgnore
    private String walletId;
    private String amount;
    @JsonProperty("destination_type")
    private DestinationType destinationType;
    @JsonProperty("idempotency_key")
    private String idempotencyKey;
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    @JsonProperty("payment_method")
    private PaymentMethod paymentMethod;
    @JsonProperty("blockchain_address")
    private BlockchainAddress blockchainAddress;

    public CreateWithdrawalRequest() {
    }

    public CreateWithdrawalRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.walletId = builder.walletId;
        this.amount = builder.amount;
        this.destinationType = builder.destinationType;
        this.idempotencyKey = builder.idempotencyKey;
        this.currencySymbol = builder.currencySymbol;
        this.paymentMethod = builder.paymentMethod;
        this.blockchainAddress = builder.blockchainAddress;
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

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public BlockchainAddress getBlockchainAddress() {
        return blockchainAddress;
    }

    public void setBlockchainAddress(BlockchainAddress blockchainAddress) {
        this.blockchainAddress = blockchainAddress;
    }

    public static class Builder {
        private String portfolioId;
        private String walletId;
        private String amount;
        private DestinationType destinationType;
        private String idempotencyKey;
        private String currencySymbol;
        private PaymentMethod paymentMethod;
        private BlockchainAddress blockchainAddress;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder walletId(String walletId) {
            this.walletId = walletId;
            return this;
        }

        public Builder amount(String amount) {
            this.amount = amount;
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

        public Builder currencySymbol(String currencySymbol) {
            this.currencySymbol = currencySymbol;
            return this;
        }

        public Builder paymentMethod(PaymentMethod paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Builder blockchainAddress(BlockchainAddress blockchainAddress) {
            this.blockchainAddress = blockchainAddress;
            return this;
        }

        public CreateWithdrawalRequest build() throws CoinbaseClientException {
            this.validate();
            return new CreateWithdrawalRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.portfolioId)) {
                throw new CoinbaseClientException("PortfolioId is required");
            }
            if (isNullOrEmpty(this.walletId)) {
                throw new CoinbaseClientException("WalletId is required");
            }
        }
    }
}
