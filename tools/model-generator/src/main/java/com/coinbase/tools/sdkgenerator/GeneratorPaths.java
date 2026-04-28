/*
 * Copyright 2026-present Coinbase Global, Inc.
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

package com.coinbase.tools.sdkgenerator;

import java.nio.file.Path;

public final class GeneratorPaths {

    private GeneratorPaths() {}

    public static Path findProjectRoot() {
        Path current = Path.of(System.getProperty("user.dir"));
        for (int i = 0; i < 20; i++) {
            if (current.resolve("pom.xml").toFile().exists()
                    && current.resolve("src/main/java/com/coinbase/prime").toFile().exists()) {
                return current;
            }
            Path parent = current.getParent();
            if (parent == null) {
                break;
            }
            current = parent;
        }
        String env = System.getProperty("user.dir", "");
        if (env.contains("tools/model-generator")) {
            return Path.of(env).getParent().getParent();
        }
        throw new IllegalStateException(
                "Could not find project root (pom.xml and src/main/java/com/coinbase/prime).");
    }

    public static Path configDirectory(Path projectRoot) {
        return projectRoot.resolve("tools/model-generator/config");
    }

    public static Path toolDirectory(Path projectRoot) {
        return projectRoot.resolve("tools/model-generator");
    }
}
