// Copyright 2025-present Coinbase Global, Inc.
//
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.
package com.coinbase.prime.model;

public class Position {
    /**
     * Asset symbol
     */
    private String symbol;

    private String _long;

    private String _short;

    private PositionReference positionReference;

    public Position() {
    }

    public Position(Builder builder) {
        this.symbol = builder.symbol;
        this._long = builder._long;
        this._short = builder._short;
        this.positionReference = builder.positionReference;
    }

    public String getSymbol() {
        return symbol;
    }

    public String get_long() {
        return _long;
    }

    public String get_short() {
        return _short;
    }

    public PositionReference getPositionReference() {
        return positionReference;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void set_long(String _long) {
        this._long = _long;
    }

    public void set_short(String _short) {
        this._short = _short;
    }

    public void setPositionReference(PositionReference positionReference) {
        this.positionReference = positionReference;
    }

    public static class Builder {
        private String symbol;

        private String _long;

        private String _short;

        private PositionReference positionReference;

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder _long(String _long) {
            this._long = _long;
            return this;
        }

        public Builder _short(String _short) {
            this._short = _short;
            return this;
        }

        public Builder positionReference(PositionReference positionReference) {
            this.positionReference = positionReference;
            return this;
        }

        public Position build() {
            return new Position(this);
        }
    }
}
