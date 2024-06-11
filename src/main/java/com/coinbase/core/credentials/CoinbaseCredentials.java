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

package com.coinbase.core.credentials;

import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class CoinbaseCredentials {
    private static final String HMAC_SHA256 = "HmacSHA256";
    private final String accessKey;
    private final String passphrase;
    private final String signingKey;

    public CoinbaseCredentials(String credentialsJson) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            CoinbaseCredentials credentials = mapper.readValue(credentialsJson, CoinbaseCredentials.class);
            this.accessKey = credentials.getAccessKey();
            this.passphrase = credentials.getPassphrase();
            this.signingKey = credentials.getSigningKey();
        } catch (Exception e) {
            throw new CoinbaseClientException("Failed to parse credentials", e);
        }
    }

    public CoinbaseCredentials(String accessKey, String passphrase, String signingKey) {
        this.accessKey = accessKey;
        this.passphrase = passphrase;
        this.signingKey = signingKey;
    }

    public CoinbaseCredentials(Builder builder) {
        this.accessKey = builder.accessKey;
        this.passphrase = builder.passphrase;
        this.signingKey = builder.signingKey;
    }

    public String sign(long timestamp, String method, String path, String body) {
        try {
            String message = String.format("%s%s%s%s", timestamp, method, path, body);

            Mac macInstance = Mac.getInstance(HMAC_SHA256);
            SecretKeySpec secretKeySpec = new SecretKeySpec(signingKey.getBytes(StandardCharsets.UTF_8), HMAC_SHA256);
            macInstance.init(secretKeySpec);
            byte[] signature = macInstance.doFinal(message.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(signature);
        } catch (NoSuchAlgorithmException e) {
            throw new CoinbaseClientException(String.format("Algorithm %s is invalid", HMAC_SHA256), e);
        } catch (Exception e) {
            throw new CoinbaseClientException("Failed to sign request", e);
        }
    }

    public String getAccessKey() {
        return accessKey;
    }

    public String getPassphrase() {
        return passphrase;
    }

    protected String getSigningKey() {
        return signingKey;
    }

    public static class Builder {
        private final String accessKey;
        private final String passphrase;
        private final String signingKey;

        public Builder(String accessKey, String passphrase, String signingKey) {
            this.accessKey = accessKey;
            this.passphrase = passphrase;
            this.signingKey = signingKey;
        }

        public CoinbaseCredentials build() {
            return new CoinbaseCredentials(this);
        }
    }
}
