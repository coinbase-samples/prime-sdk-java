package com.coinbase.prime.http;

import com.coinbase.prime.errors.InternalException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;

public class CoinbasePrimeCredentials {
    private String accessKey;
    private String passphrase;
    private String signingKey;
    private String portfolioId;
    private String entityId;
    private String svcAccountId;

    public CoinbasePrimeCredentials(
            String accessKey,
            String passphrase,
            String signingKey,
            String portfolioId,
            String entityId,
            String svcAccountId
    ) {
        this.accessKey = accessKey;
        this.passphrase = passphrase;
        this.signingKey = signingKey;
        this.portfolioId = portfolioId;
        this.entityId = entityId;
        this.svcAccountId = svcAccountId;
    }

    public CoinbasePrimeCredentials(
            String accessKey,
            String passphrase,
            String signingKey
    ) {
        this.accessKey = accessKey;
        this.passphrase = passphrase;
        this.signingKey = signingKey;
    }

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
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest((timestamp + method + path + body).getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(hash);
        } catch (Exception e) {
            throw new InternalException("Failed to sign request", e);
        }
    }
}
