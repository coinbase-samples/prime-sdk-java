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

package com.coinbase.prime.futures;

import com.coinbase.prime.model.Sweep;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListEntityFuturesSweepsResponse {
    private Sweep[] sweeps;

    @JsonProperty("auto_sweep")
    private boolean autoSweep;

    public ListEntityFuturesSweepsResponse() {
    }

    public ListEntityFuturesSweepsResponse(Builder builder) {
        this.sweeps = builder.sweeps;
        this.autoSweep = builder.autoSweep;
    }

    public Sweep[] getSweeps() {
        return sweeps;
    }

    public void setSweeps(Sweep[] sweeps) {
        this.sweeps = sweeps;
    }

    public boolean getAutoSweep() {
        return autoSweep;
    }

    public void setAutoSweep(boolean autoSweep) {
        this.autoSweep = autoSweep;
    }

    public static class Builder {
        private Sweep[] sweeps;
        private boolean autoSweep;

        public Builder() {
        }

        public Builder sweeps(Sweep[] sweeps) {
            this.sweeps = sweeps;
            return this;
        }

        public Builder autoSweep(boolean autoSweep) {
            this.autoSweep = autoSweep;
            return this;
        }

        public ListEntityFuturesSweepsResponse build() {
            return new ListEntityFuturesSweepsResponse(this);
        }        
    }   
}
