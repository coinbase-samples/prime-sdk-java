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

package com.coinbase.prime.products;

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.common.PrimeListRequest;
import com.coinbase.prime.common.Pagination;
import com.coinbase.prime.model.enums.ContractExpiryType;
import com.coinbase.prime.model.enums.ExpiringContractStatus;
import com.coinbase.prime.model.enums.ProductType;
import com.coinbase.prime.model.enums.SortDirection;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;

/**
 * List Portfolio Products
 */
public class ListPortfolioProductsRequest extends PrimeListRequest {
    @JsonProperty(required = true, value = "portfolio_id")
    @JsonIgnore
    private String portfolioId;

    @JsonProperty("product_type")
    private ProductType productType;

    @JsonProperty("contract_expiry_type")
    private ContractExpiryType contractExpiryType;

    @JsonProperty("expiring_contract_status")
    private ExpiringContractStatus expiringContractStatus;

    public ListPortfolioProductsRequest() {
    }

    public ListPortfolioProductsRequest(Builder builder) {
        super(builder.cursor, builder.sortDirection, builder.limit);
        this.portfolioId = builder.portfolioId;
        this.productType = builder.productType;
        this.contractExpiryType = builder.contractExpiryType;
        this.expiringContractStatus = builder.expiringContractStatus;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public ContractExpiryType getContractExpiryType() {
        return contractExpiryType;
    }

    public void setContractExpiryType(ContractExpiryType contractExpiryType) {
        this.contractExpiryType = contractExpiryType;
    }

    public ExpiringContractStatus getExpiringContractStatus() {
        return expiringContractStatus;
    }

    public void setExpiringContractStatus(ExpiringContractStatus expiringContractStatus) {
        this.expiringContractStatus = expiringContractStatus;
    }

    public static class Builder {
        private String portfolioId;
        private ProductType productType;
        private ContractExpiryType contractExpiryType;
        private ExpiringContractStatus expiringContractStatus;
        private String cursor;
        private SortDirection sortDirection;
        private Integer limit;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder productType(ProductType productType) {
            this.productType = productType;
            return this;
        }

        public Builder contractExpiryType(ContractExpiryType contractExpiryType) {
            this.contractExpiryType = contractExpiryType;
            return this;
        }

        public Builder expiringContractStatus(ExpiringContractStatus expiringContractStatus) {
            this.expiringContractStatus = expiringContractStatus;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            this.cursor = pagination.getNextCursor();
            this.sortDirection = pagination.getSortDirection();
            return this;
        }

        public ListPortfolioProductsRequest build() throws CoinbaseClientException {
            validate();
            return new ListPortfolioProductsRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.portfolioId)) {
                throw new CoinbaseClientException("PortfolioId is required");
            }
        }
    }
}
