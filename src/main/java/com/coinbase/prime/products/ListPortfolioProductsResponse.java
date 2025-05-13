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

package com.coinbase.prime.products;

import com.coinbase.prime.model.Pagination;
import com.coinbase.prime.model.Product;

public class ListPortfolioProductsResponse {
    private Product[] products;
    private Pagination pagination;

    public ListPortfolioProductsResponse() {
    }

    public ListPortfolioProductsResponse(Builder builder) {
        this.products = builder.products;
        this.pagination = builder.pagination;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public static class Builder {
        private Product[] products;
        private Pagination pagination;

        public Builder() {
        }

        public Builder products(Product[] products) {
            this.products = products;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            this.pagination = pagination;
            return this;
        }

        public ListPortfolioProductsResponse build() {
            return new ListPortfolioProductsResponse(this);
        }
    }
}
