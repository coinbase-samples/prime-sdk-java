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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import static com.coinbase.core.utils.Constants.BASE64_PATTERN;
import static com.coinbase.core.utils.Constants.HMAC_SHA256;
import static com.coinbase.core.utils.Utils.isNullOrEmpty;

public class CoinbaseCredentials {
    @JsonProperty(required = true)
    private String accessKey;
    @JsonProperty(required = true)
    private String passphrase;
    @JsonProperty(required = true)
    private String signingKey;


    public CoinbaseCredentials(String credentialsJson) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            CoinbaseCredentials credentials = mapper.readValue(credentialsJson, CoinbaseCredentials.class);
            this.accessKey = credentials.getAccessKey();
            this.passphrase = credentials.getPassphrase();
            this.signingKey = credentials.getSigningKey();
        } catch (Throwable e) {
            throw new CoinbaseClientException("Failed to parse credentials", e);
        }
    }

    public CoinbaseCredentials(String accessKey, String passphrase, String signingKey) {
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

    public CoinbaseCredentials() {}

    public CoinbaseCredentials(Builder builder) {
        this.accessKey = builder.accessKey;
        this.passphrase = builder.passphrase;
        this.signingKey = builder.signingKey;
    }

    public String sign(long timestamp, String method, String path, String body) {
        try {
            String message = String.format("%s%s%s%s", timestamp, method, path, body);

            byte[] hmacKey;
            if (BASE64_PATTERN.matcher(signingKey).matches()) {
                hmacKey = Base64.getDecoder().decode(signingKey);
            } else {
                hmacKey = this.signingKey.getBytes(StandardCharsets.UTF_8);
            }
            Mac mac = Mac.getInstance(HMAC_SHA256);
            mac.init(new SecretKeySpec(hmacKey, HMAC_SHA256));

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
