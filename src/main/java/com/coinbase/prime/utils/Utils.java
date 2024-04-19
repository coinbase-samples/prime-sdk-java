package com.coinbase.prime.utils;

import com.coinbase.prime.errors.CoinbasePrimeException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public final class Utils {
    public static String appendQueryParams(String queryParams, String key, String value) {
        return String.format("%s%s%s=%s", queryParams, queryParams.isEmpty() ? "?" : "&", key, value);
    }


}
