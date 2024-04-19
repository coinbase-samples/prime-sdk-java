package com.coinbase.prime.http;

import com.coinbase.prime.credentials.CoinbasePrimeCredentials;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CoinbasePrimeCredentialsIntegrationTest {

    @Test
    public void testSign() {
        // Setup
        String envVariable = "PRIME_CREDENTIALS";
        CoinbasePrimeCredentials credentials;
        ObjectMapper mapper = new ObjectMapper();
        try {
            credentials = mapper.readValue(System.getenv(envVariable), CoinbasePrimeCredentials.class);
        } catch (Exception e) {
            fail("Failed to load credentials from environment variable", e);
            return;
        }

        // Execute
        String result;
        long time = System.currentTimeMillis() / 1000L;
        try {
            result = credentials.Sign(time, "GET", "/test/path", "testKey", "testBody");
        } catch (Exception e) {
            fail("Failed to generate signature", e);
            return;
        }

        // Verify
        assertNotNull(result, "The result of the sign method should not be null");
    }
}