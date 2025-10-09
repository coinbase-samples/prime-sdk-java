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

package com.coinbase.prime.integration;

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.credentials.CoinbasePrimeCredentials;
import com.coinbase.prime.utils.Constants;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Integration test to verify the version header functionality works correctly
 * from end-to-end in the prime-sdk-java implementation.
 */
public class VersionHeaderIntegrationTest {

    @Test
    public void testVersionHeaderMatchesPomVersion() throws CoinbaseClientException {
        // Arrange: Create credentials using the standard constructor
        CoinbasePrimeCredentials credentials = new CoinbasePrimeCredentials(
            "test-access-key",
            "test-passphrase", 
            "test-signing-key"
        );
        
        URI testUri = URI.create("https://api.prime.coinbase.com/v1/portfolios");
        
        // Act: Generate auth headers including User-Agent
        Map<String, String> headers = credentials.generateAuthHeaders("GET", testUri, "");
        
        // Assert: Verify the version header contains the correct version
        String userAgent = headers.get(Constants.CB_USER_AGENT_HEADER);
        
        assertNotNull(userAgent, "User-Agent header should be present");
        assertEquals("prime-sdk-java/1.4.0", userAgent, 
            "User-Agent should contain 'prime-sdk-java/1.4.0' to match pom.xml version");
        
        // Additional verification: Ensure the SDK_VERSION constant is used correctly
        String expectedUserAgent = String.format("prime-sdk-java/%s", Constants.SDK_VERSION);
        assertEquals(expectedUserAgent, userAgent, 
            "User-Agent should be constructed using Constants.SDK_VERSION");
    }

    @Test
    public void testSdkVersionConstantMatches() {
        // Verify that the SDK_VERSION constant has been updated correctly
        assertEquals("1.4.0", Constants.SDK_VERSION, 
            "SDK_VERSION constant should be '1.4.0' to match pom.xml version");
    }

    @Test
    public void testAllApiCallsWillIncludeVersionHeader() throws CoinbaseClientException {
        // Test multiple different URI paths to ensure consistency
        String[] testPaths = {
            "/v1/portfolios",
            "/v1/orders",
            "/v1/activities",
            "/v1/wallets",
            "/v1/transactions"
        };
        
        CoinbasePrimeCredentials credentials = new CoinbasePrimeCredentials(
            "test-access-key",
            "test-passphrase", 
            "test-signing-key"
        );
        
        for (String path : testPaths) {
            URI testUri = URI.create("https://api.prime.coinbase.com" + path);
            Map<String, String> headers = credentials.generateAuthHeaders("GET", testUri, "");
            
            String userAgent = headers.get(Constants.CB_USER_AGENT_HEADER);
            assertEquals("prime-sdk-java/1.4.0", userAgent, 
                "All API calls should include the correct version header, failed for path: " + path);
        }
    }
}