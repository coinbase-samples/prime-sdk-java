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
    private static final String HTTP_METHOD_PATCH = "PATCH";
    private static final String HTTP_METHOD_PUT = "PUT";
    private static final String HTTP_METHOD_DELETE = "DELETE";
    private static final ObjectMapper mapper = new ObjectMapper();
    private CoinbaseCredentials credentials;
    private String baseUrl;
    private HttpClient client;

    public CoinbaseHttpClient(String baseUrl, CoinbaseCredentials credentials) {
        this.credentials = credentials;
        this.baseUrl = baseUrl;
        this.client = HttpClient.newHttpClient();
    }

    public CoinbaseHttpClient(String baseUrl, String credentialsJson) {
        this.credentials = new CoinbaseCredentials(credentialsJson);
        this.baseUrl = baseUrl;
        this.client = HttpClient.newHttpClient();
    }

    public CoinbaseHttpClient(String baseUrl, CoinbaseCredentials credentials, HttpClient client) {
        this.credentials = credentials;
        this.baseUrl = baseUrl;
        this.client = client;
    }

    public CoinbaseHttpClient(String baseUrl, String credentialsJson, HttpClient client) {
        this.credentials = new CoinbaseCredentials(credentialsJson);
        this.baseUrl = baseUrl;
        this.client = client;
    }

    protected <T> T doGet(CoinbaseGetRequest request, Class<T> responseClass) {
        String response = get(request.getPath(), request.getQueryString());

        try {
            return mapper.readValue(response, responseClass);
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    protected <T> T doPost(CoinbasePostRequest request, Class<T> responseClass) {
        String response = post(request.getPath(), request);

        try {
            return mapper.readValue(response, responseClass);
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    protected <T> T doPatch(CoinbasePatchRequest request, Class<T> responseClass) {
        String response = patch(request.getPath(), request);

        try {
            return mapper.readValue(response, responseClass);
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    protected <T> T doPut(CoinbasePutRequest request, Class<T> responseClass) {
        String response = put(request.getPath(), request);

        try {
            return mapper.readValue(response, responseClass);
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
    }

    protected <T> T doDelete(CoinbaseDeleteRequest request, Class<T> responseClass) {
        String response = delete(request.getPath(), request.getQueryString());

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

    private String patch(String path, Object request) throws CoinbaseException {
        HttpRequest.Builder builder = generateHttpRequest(
                path,
                "",
                HTTP_METHOD_PATCH,
                toJsonString(mapper, request));

        HttpRequest httpRequest;
        try {
            httpRequest = builder
                    .method(HTTP_METHOD_PATCH, HttpRequest.BodyPublishers.ofString(mapper.writeValueAsString(request)))
                    .build();
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
        return sendRequest(httpRequest);
    }

    private String put(String path, Object request) throws CoinbaseException {
        HttpRequest.Builder builder = generateHttpRequest(
                path,
                "",
                HTTP_METHOD_PUT,
                toJsonString(mapper, request));

        HttpRequest httpRequest;
        try {
            httpRequest = builder
                    .PUT(HttpRequest.BodyPublishers.ofString(mapper.writeValueAsString(request)))
                    .build();
        } catch (IOException e) {
            throw new CoinbaseClientException(e);
        }
        return sendRequest(httpRequest);
    }

    private String delete(String path, String query) {
        HttpRequest.Builder builder = generateHttpRequest(path, query, HTTP_METHOD_DELETE, "");

        HttpRequest httpRequest = builder
                .DELETE()
                .build();

        return sendRequest(httpRequest);
    }

    protected HttpRequest.Builder generateHttpRequest(String path, String query, String method, String body) {
        String callUrl = baseUrl + path + query;
        URI uri = URI.create(callUrl);
        long unixTime = Instant.now().getEpochSecond();
        String signature = credentials.sign(unixTime, method, path, body);

        return attachHeaders(HttpRequest.newBuilder().uri(uri), signature, unixTime);
    }

    protected abstract String handleResponse(int statusCode, String response) throws CoinbaseException;

    protected abstract HttpRequest.Builder attachHeaders(HttpRequest.Builder builder, String signature, long timestamp);

    private String sendRequest(HttpRequest request) throws CoinbaseException {
        try {
            HttpResponse<String> resp = client.send(request, HttpResponse.BodyHandlers.ofString());

            return handleResponse(resp.statusCode(), resp.body());
        } catch (IOException | InterruptedException e) {
            throw new CoinbaseClientException("Failed to send request", e);
        }
    }

    public CoinbaseCredentials getCredentials() {
        return credentials;
    }
}
