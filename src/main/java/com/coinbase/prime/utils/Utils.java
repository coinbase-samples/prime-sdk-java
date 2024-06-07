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

package com.coinbase.prime.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class Utils {
    public static String appendQueryParams(String queryParams, String key, String value) {
        if (value == null || value.isEmpty()) {
            return queryParams;
        }
        return String.format("%s%s%s=%s", queryParams, queryParams.isEmpty() ? "?" : "&", key, value);
    }

    public static String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        return sdf.format(date);
    }

    public static String appendAllQueryParams(Object[] params, String key, String queryString) {
        if (params != null) {
            for (Object param : params) {
                queryString = appendQueryParams(queryString, key, param.toString());
            }
        }
        return queryString;
    }
}
