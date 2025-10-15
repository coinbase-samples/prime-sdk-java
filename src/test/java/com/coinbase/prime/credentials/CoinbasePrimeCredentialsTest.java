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

package com.coinbase.prime.credentials;

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.utils.Constants;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class CoinbasePrimeCredentialsTest {
    
    private CoinbasePrimeCredentials credentials;
    
    @BeforeEach
    public void setUp() throws CoinbaseClientException {
        // Create test credentials for testing
        credentials = new CoinbasePrimeCredentials(
            "test-access-key",
            "test-passphrase", 
            "test-signing-key"
        );
    }

    @Test
    public void testUserAgentHeaderContainsCorrectVersion() throws CoinbaseClientException {
        // RED PHASE: This test should FAIL initially because the User-Agent
        // will contain "prime-sdk-java/1.0.0" but we expect "prime-sdk-java/1.4.0"
        URI testUri = URI.create("https://api.prime.coinbase.com/v1/portfolios");
        Map<String, String> headers = credentials.generateAuthHeaders("GET", testUri, "");
        
        String userAgent = headers.get(Constants.CB_USER_AGENT_HEADER);
        assertNotNull(userAgent, "User-Agent header should be present");
        assertEquals("prime-sdk-java/1.4.0", userAgent, 
            "User-Agent header should contain correct SDK version");
    }

    @Test
    public void testUserAgentHeaderIsPresent() throws CoinbaseClientException {
        URI testUri = URI.create("https://api.prime.coinbase.com/v1/portfolios");
        Map<String, String> headers = credentials.generateAuthHeaders("GET", testUri, "");
        
        assertTrue(headers.containsKey(Constants.CB_USER_AGENT_HEADER), 
            "User-Agent header should be present in auth headers");
    }

    @Test
    public void testUserAgentHeaderFormat() throws CoinbaseClientException {
        URI testUri = URI.create("https://api.prime.coinbase.com/v1/portfolios");
        Map<String, String> headers = credentials.generateAuthHeaders("GET", testUri, "");
        
        String userAgent = headers.get(Constants.CB_USER_AGENT_HEADER);
        assertNotNull(userAgent);
        
        // Verify format: "prime-sdk-java/{version}"
        assertTrue(userAgent.startsWith("prime-sdk-java/"), 
            "User-Agent should start with 'prime-sdk-java/'");
        
        String version = userAgent.substring("prime-sdk-java/".length());
        assertFalse(version.isEmpty(), "Version part should not be empty");
        
        // Should match semantic versioning pattern
        String versionPattern = "^\\d+\\.\\d+\\.\\d+$";
        assertTrue(version.matches(versionPattern), 
            "Version should follow semantic versioning format");
    }

    @Test 
    public void testAllRequiredHeadersArePresent() throws CoinbaseClientException {
        URI testUri = URI.create("https://api.prime.coinbase.com/v1/portfolios");
        Map<String, String> headers = credentials.generateAuthHeaders("GET", testUri, "");
        
        // Verify all required headers are present
        assertTrue(headers.containsKey(Constants.CB_ACCESS_KEY_HEADER), 
            "Access key header should be present");
        assertTrue(headers.containsKey(Constants.CB_ACCESS_SIGNATURE_HEADER), 
            "Signature header should be present");
        assertTrue(headers.containsKey(Constants.CB_ACCESS_TIMESTAMP_HEADER), 
            "Timestamp header should be present");
        assertTrue(headers.containsKey(Constants.CB_ACCESS_PHRASE_HEADER), 
            "Passphrase header should be present");
        assertTrue(headers.containsKey(Constants.CB_USER_AGENT_HEADER), 
            "User-Agent header should be present");
    }
}