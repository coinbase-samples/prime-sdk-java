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

package com.coinbase.prime.invoice;

import com.coinbase.prime.model.Invoice;

public class ListInvoicesResponse {
    private Invoice[] invoices;

    public ListInvoicesResponse() {
    }

    public ListInvoicesResponse(Builder builder) {
        this.invoices = builder.invoices;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }

    public void setInvoices(Invoice[] invoices) {
        this.invoices = invoices;
    }

    public static class Builder {
        private Invoice[] invoices;

        public Builder invoices(Invoice[] invoices) {
            this.invoices = invoices;
            return this;
        }

        public ListInvoicesResponse build() {
            return new ListInvoicesResponse(this);
        }
    }
}
