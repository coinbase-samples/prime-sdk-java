package com.coinbase.prime.utils;

public final class Utils {
    public static String appendQueryParams(String queryParams, String key, String value) {
        return String.format("%s%s%s=%s", queryParams, queryParams.isEmpty() ? "?" : "&", key, value);
    }
}
