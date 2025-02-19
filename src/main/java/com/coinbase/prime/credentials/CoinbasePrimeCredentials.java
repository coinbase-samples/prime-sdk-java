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

import com.coinbase.core.credentials.CoinbaseCredentials;
import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.utils.Constants;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.DeserializationFeature;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;

public class CoinbasePrimeCredentials implements CoinbaseCredentials {
    @JsonProperty(required = true)
    private String accessKey;

    @JsonProperty(required = true)
    private String passphrase;

    @JsonProperty(required = true)
    private String signingKey;

    @JsonProperty(required = false)
    private String portfolioId;

    @JsonProperty(required = false)
    private String svcAccountId;

    @JsonProperty(required = false)
    private String entityId;

    public CoinbasePrimeCredentials(String credentialsJson) throws CoinbaseClientException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            CoinbasePrimeCredentials credentials = mapper.readValue(credentialsJson, CoinbasePrimeCredentials.class);
            this.accessKey = credentials.getAccessKey();
            this.passphrase = credentials.getPassphrase();
            this.signingKey = credentials.getSigningKey();
            this.portfolioId = credentials.getPortfolioId();
            this.svcAccountId = credentials.getSvcAccountId();
            this.entityId = credentials.getEntityId();
        } catch (Throwable e) {
            throw new CoinbaseClientException("Failed to parse credentials", e);
        }
    }

		/**
		 * Constructor for the standard REST API.
		 */
    public CoinbasePrimeCredentials(String accessKey, String passphrase, String signingKey) throws CoinbaseClientException {
        if (isNullOrEmpty(accessKey)) {
            throw new CoinbaseClientException("Access key is required");
        }
        this.accessKey = accessKey;

        if (isNullOrEmpty(passphrase)) {
            throw new CoinbaseClientException("Passphrase is required");
        }
        this.passphrase = passphrase;

        if (isNullOrEmpty(signingKey)) {
            throw new CoinbaseClientException("Signing key is required");
        }
        this.signingKey = signingKey;
    }

		/**
		 * Constructor for the standard REST API and WebSocket support.
		 */
    public CoinbasePrimeCredentials(String accessKey, String passphrase, String signingKey, String svcAccountId) throws CoinbaseClientException {
        if (isNullOrEmpty(accessKey)) {
            throw new CoinbaseClientException("Access key is required");
        }
        this.accessKey = accessKey;

        if (isNullOrEmpty(passphrase)) {
            throw new CoinbaseClientException("Passphrase is required");
        }
        this.passphrase = passphrase;

        if (isNullOrEmpty(signingKey)) {
            throw new CoinbaseClientException("Signing key is required");
        }
        this.signingKey = signingKey;

        if (isNullOrEmpty(svcAccountId)) {
            throw new CoinbaseClientException("Service account id is required if you want to use WebSockets");
        }
        this.svcAccountId = svcAccountId;
    }


    public CoinbasePrimeCredentials() {}

    public CoinbasePrimeCredentials(Builder builder) {
        this.accessKey = builder.accessKey;
        this.passphrase = builder.passphrase;
        this.signingKey = builder.signingKey;
        this.portfolioId = builder.portfolioId;
        this.svcAccountId = builder.svcAccountId;
        this.entityId = builder.entityId;
    }

    @Override
    public Map<String, String> generateAuthHeaders(String method, java.net.URI uri, String body) throws CoinbaseClientException {
        long timestamp = System.currentTimeMillis() / 1000;
        String path = uri.getPath();
        String signature = sign(timestamp, method, path, body);

        return Map.of(
                Constants.CB_ACCESS_KEY_HEADER, accessKey,
                Constants.CB_ACCESS_SIGNATURE_HEADER, signature,
                Constants.CB_ACCESS_TIMESTAMP_HEADER, String.valueOf(timestamp),
                Constants.CB_ACCESS_PHRASE_HEADER, passphrase,
                Constants.CB_USER_AGENT_HEADER, String.format("prime-sdk-java/%s", Constants.SDK_VERSION)
        );
    }

    private String sign(long timestamp, String method, String path, String body) throws CoinbaseClientException {
        try {
            String message = String.format("%s%s%s%s", timestamp, method, path, body);

            byte[] hmacKey = this.signingKey.getBytes(StandardCharsets.UTF_8);
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(hmacKey, "HmacSHA256"));

            byte[] signature = mac.doFinal(message.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(signature);
        } catch (Throwable e) {
            throw new CoinbaseClientException("Failed to generate signature", e);
        }
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getPassphrase() {
        return passphrase;
    }

    public void setPassphrase(String passphrase) {
        this.passphrase = passphrase;
    }

    protected String getSigningKey() {
        return signingKey;
    }

    public void setSigningKey(String signingKey) {
        this.signingKey = signingKey;
    }

    protected String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioID(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    protected String getSvcAccountId() {
        return svcAccountId;
    }

    public void setSvcAccountId(String svcAccountId) {
        this.svcAccountId = svcAccountId;
    }

    protected String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public static class Builder {
        private String accessKey;
        private String passphrase;
        private String signingKey;
        private String portfolioId;
        private String svcAccountId;
        private String entityId;

        public Builder() {}

        public Builder accessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        public Builder passphrase(String passphrase) {
            this.passphrase = passphrase;
            return this;
        }

        public Builder signingKey(String signingKey) {
            this.signingKey = signingKey;
            return this;
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder svcAccountId(String svcAccountId) {
            this.svcAccountId = svcAccountId;
            return this;
        }

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public CoinbaseCredentials build() throws CoinbaseClientException {
            this.validate();
            return new CoinbasePrimeCredentials(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.accessKey)) {
                throw new CoinbaseClientException("Access key is required");
            }
            if (isNullOrEmpty(this.passphrase)) {
                throw new CoinbaseClientException("Passphrase is required");
            }
            if (isNullOrEmpty(this.signingKey)) {
                throw new CoinbaseClientException("Signing key is required");
            }
        }
    }
}
