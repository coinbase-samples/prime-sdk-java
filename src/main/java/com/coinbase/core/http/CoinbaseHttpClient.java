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

package com.coinbase.core.http;

import com.coinbase.core.credentials.CoinbaseCredentials;
import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.core.errors.CoinbaseException;
import com.coinbase.prime.errors.CoinbasePrimeException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Instant;

import static com.coinbase.core.utils.Utils.toJsonString;

public abstract class CoinbaseHttpClient {
    private static final String HTTP_METHOD_GET = "GET";
    private static final String HTTP_METHOD_POST = "POST";
    private static ObjectMapper mapper = new ObjectMapper();
    private CoinbaseCredentials credentials;
    private String baseUrl;
    private HttpClient client;

    protected Object doGet(CoinbaseGetRequest request, String path, Class<?> responseClass) {
        String queryParams = request.getQueryString();
        String response = get(path, queryParams);

        handleResponse(response);

        try {
            return mapper.readValue(response, responseClass);
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    private String get(String path, String query) {
        HttpRequest.Builder builder = generateHttpRequest(path, query, HTTP_METHOD_GET, "");

        HttpRequest httpRequest = builder
                .GET()
                .build();

        return sendRequest(httpRequest);
    }

    protected String post(String path, Object request) throws CoinbaseException {
        HttpRequest.Builder builder = generateHttpRequest(
                path,
                "",
                HTTP_METHOD_POST,
                toJsonString(mapper, request));


        HttpRequest httpRequest;
        try {
            httpRequest = builder
                    .POST(HttpRequest.BodyPublishers.ofString(mapper.writeValueAsString(request)))
                    .build();
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }

        return sendRequest(httpRequest);
    }


    protected HttpRequest.Builder generateHttpRequest(String path, String query, String method, String body) {
        String callUrl = baseUrl + path + query;
        URI uri = URI.create(callUrl);
        long unixTime = Instant.now().getEpochSecond();
        String signature;
        try {
            signature = credentials.sign(method, path, body);
        } catch (Exception e) {
            throw new CoinbasePrimeException(e);
        }

        return attachHeaders(HttpRequest.newBuilder().uri(uri), signature, unixTime);
    }

    protected abstract HttpRequest.Builder attachHeaders(HttpRequest.Builder builder, String signature, long timestamp);

    private String sendRequest(HttpRequest request) throws CoinbaseException {
        try {
            HttpResponse<String> resp = client.send(request, HttpResponse.BodyHandlers.ofString());

            return handleResponse(resp.body());
        } catch (IOException | InterruptedException e) {
            throw new CoinbaseClientException("Failed to send request", e);
        }
    }

    protected abstract String handleResponse(String responseBody) throws CoinbaseException;
}
