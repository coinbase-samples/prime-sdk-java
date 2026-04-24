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

package com.coinbase.tools.sdkgenerator;

public final class CopyrightHelper {
    public static final int DEFAULT_YEAR = 2025;

    private CopyrightHelper() {}

    public static String javaFileHeader() {
        return "/*\n"
                + " * Copyright "
                + DEFAULT_YEAR
                + "-present Coinbase Global, Inc.\n"
                + " *\n"
                + " *  Licensed under the Apache License, Version 2.0 (the \"License\");\n"
                + " *  you may not use this file except in compliance with the License.\n"
                + " *  You may obtain a copy of the License at\n"
                + " *\n"
                + " *  http://www.apache.org/licenses/LICENSE-2.0\n"
                + " *\n"
                + " *  Unless required by applicable law or agreed to in writing, software\n"
                + " *  distributed under the License is distributed on an \"AS IS\" BASIS,\n"
                + " *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n"
                + " *  See the License for the specific language governing permissions and\n"
                + " *  limitations under the License.\n"
                + " */\n\n";
    }
}
