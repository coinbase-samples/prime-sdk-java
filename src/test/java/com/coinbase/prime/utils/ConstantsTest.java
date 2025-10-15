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

package com.coinbase.prime.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConstantsTest {

    @Test
    public void testSdkVersionIsCorrect() {
        // RED PHASE: This test should FAIL initially because SDK_VERSION is "1.0.0"
        // but we expect it to be "1.4.0" to match pom.xml version
        assertEquals("1.4.0", Constants.SDK_VERSION, 
            "SDK_VERSION should match the version in pom.xml");
    }

    @Test
    public void testSdkVersionIsNotNull() {
        assertNotNull(Constants.SDK_VERSION, "SDK_VERSION should not be null");
    }

    @Test
    public void testSdkVersionIsNotEmpty() {
        assertFalse(Constants.SDK_VERSION.trim().isEmpty(), 
            "SDK_VERSION should not be empty");
    }

    @Test
    public void testSdkVersionFollowsSemVer() {
        // Verify that the version follows semantic versioning format (x.y.z)
        String versionPattern = "^\\d+\\.\\d+\\.\\d+$";
        assertTrue(Constants.SDK_VERSION.matches(versionPattern), 
            "SDK_VERSION should follow semantic versioning format (x.y.z)");
    }
}