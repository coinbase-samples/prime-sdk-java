package com.coinbase.prime.http;

import com.coinbase.prime.errors.InternalException;

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

    public String Sign(long timestamp, String method, String path, String key, String body) throws InternalException {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.getDecoder().decode(signingKey), "HmacSHA256");
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(secretKeySpec);
            byte[] hash = mac.doFinal((timestamp + method + path + body).getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(hash);
        } catch (Exception e) {
            throw new InternalException("Failed to sign request", e);
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
            CoinbasePrimeCredentials credentials = new CoinbasePrimeCredentials();
            credentials.setAccessKey(accessKey);
            credentials.setPassphrase(passphrase);
            credentials.setSigningKey(signingKey);
            credentials.setPortfolioId(portfolioId);
            credentials.setEntityId(entityId);
            credentials.setSvcAccountId(svcAccountId);
            return credentials;
        }
    }
}
