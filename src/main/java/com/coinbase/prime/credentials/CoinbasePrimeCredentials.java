package com.coinbase.prime.credentials;

import com.coinbase.prime.errors.CoinbasePrimeException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class CoinbasePrimeCredentials {
    private String accessKey;
    private String passphrase;
    private String signingKey;
    private String portfolioId;
    private String entityId;
    private String svcAccountId;

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
            SecretKeySpec secretKeySpec = new SecretKeySpec(signingKey.getBytes(StandardCharsets.UTF_8), "HmacSHA256");
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(secretKeySpec);
            byte[] hash = mac.doFinal((timestamp + method + path + body).getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(hash);
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
