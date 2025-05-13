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

package com.coinbase.prime.assets;

import com.coinbase.prime.model.Asset;

public class ListAssetsResponse {
    private Asset[] assets;

    public ListAssetsResponse() {
    }

    public ListAssetsResponse(Builder builder) {
        this.assets = builder.assets;
    }

    public Asset[] getAssets() {
        return assets;
    }

    public void setAssets(Asset[] assets) {
        this.assets = assets;
    }

    public static class Builder {
        private Asset[] assets;

        public Builder() {
        }

        public Builder assets(Asset[] assets) {
            this.assets = assets;
            return this;
        }

        public ListAssetsResponse build() {
            return new ListAssetsResponse(this);
        }
    }
}
