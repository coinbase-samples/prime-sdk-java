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

package com.coinbase.prime.credentials;

import com.coinbase.prime.errors.CoinbasePrimeClientException;
import com.coinbase.prime.errors.CoinbasePrimeException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class CoinbasePrimeCredentials {
    private static final String HMAC_SHA256 = "HmacSHA256";
    private String accessKey;
    private String passphrase;
    private String signingKey;
    private String portfolioId;
    private String entityId;
    private String svcAccountId;
    private static final Mac macInstance;

    static {
        try {
            macInstance = Mac.getInstance(HMAC_SHA256);
        } catch (Exception e) {
            throw new CoinbasePrimeClientException("Failed to initialize HMAC instance", e);
        }
    }

    public CoinbasePrimeCredentials() {}

    public CoinbasePrimeCredentials(Builder builder) {
        this.accessKey = builder.accessKey;
        this.passphrase = builder.passphrase;
        this.signingKey = builder.signingKey;
        this.portfolioId = builder.portfolioId;
        this.entityId = builder.entityId;
        this.svcAccountId = builder.svcAccountId;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public String getPassphrase() {
        return passphrase;
    }

    public void setPassphrase(String passphrase) {
        this.passphrase = passphrase;
    }

    public String getSigningKey() {
        return signingKey;
    }

    public void setSigningKey(String signingKey) {
        this.signingKey = signingKey;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getSvcAccountId() {
        return svcAccountId;
    }

    public void setSvcAccountId(String svcAccountId) {
        this.svcAccountId = svcAccountId;
    }

    public String Sign(long timestamp, String method, String path, String body) throws CoinbasePrimeException {
        try {
            String message = timestamp + method + path + body;

            synchronized (macInstance) {
                SecretKeySpec secretKeySpec = new SecretKeySpec(signingKey.getBytes(StandardCharsets.UTF_8), HMAC_SHA256);
                macInstance.init(secretKeySpec);
                byte[] signature = macInstance.doFinal(message.getBytes(StandardCharsets.UTF_8));
                return Base64.getEncoder().encodeToString(signature);
            }
        } catch (Exception e) {
            throw new CoinbasePrimeException("Failed to sign request", e);
        }
    }

    public static class Builder {
        private final String accessKey;
        private final String passphrase;
        private final String signingKey;

        private String portfolioId;
        private String entityId;
        private String svcAccountId;

        public Builder(String accessKey, String passphrase, String signingKey) {
            this.accessKey = accessKey;
            this.passphrase = passphrase;
            this.signingKey = signingKey;
        }

        public Builder withPortfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder withEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder withSvcAccountId(String svcAccountId) {
            this.svcAccountId = svcAccountId;
            return this;
        }

        public CoinbasePrimeCredentials build() {
           return new CoinbasePrimeCredentials(this);
        }
    }
}
