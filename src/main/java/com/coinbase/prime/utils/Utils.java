package com.coinbase.prime.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class Utils {
    public static String appendQueryParams(String queryParams, String key, String value) {
        return String.format("%s%s%s=%s", queryParams, queryParams.isEmpty() ? "?" : "&", key, value);
    }

    public static String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        return sdf.format(date);
    }
}
