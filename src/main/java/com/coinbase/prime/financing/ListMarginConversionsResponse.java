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

package com.coinbase.prime.financing;

import com.coinbase.prime.model.Conversion;

public class ListMarginConversionsResponse {
    private Conversion[] conversions;

    public ListMarginConversionsResponse() {
    }

    public ListMarginConversionsResponse(Builder builder) {
        this.conversions = builder.conversions;
    }

    public Conversion[] getConversions() {
        return conversions;
    }

    public void setConversions(Conversion[] conversions) {
        this.conversions = conversions;
    }

    public static class Builder {
        private Conversion[] conversions;

        public Builder() {
        }

        public Builder conversions(Conversion[] conversions) {
            this.conversions = conversions;
            return this;
        }

        public ListMarginConversionsResponse build() {
            return new ListMarginConversionsResponse(this);
        }
    }
}
