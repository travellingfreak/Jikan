package com.schalar.jikan.helper;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class Client {

    private final HttpClient httpClient;

    public Client(@Nullable HttpClient httpClient) {
        this.httpClient = httpClient != null ? httpClient : HttpClient.newHttpClient();
    }

    @Nullable
    public String get(String path) {

        try {
            HttpRequest.Builder builder = HttpRequest.newBuilder(new URI(Constants.BASE_URL + path)).GET();

            HttpResponse<String> response = httpClient.sendAsync(builder.build(), HttpResponse.BodyHandlers.ofString()).get();

            return response.body();
        } catch (InterruptedException | URISyntaxException | ExecutionException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String http_build_query(@NotNull Map<String, ? extends Serializable> map) {
        StringBuilder stringBuilder = new StringBuilder();
        map.forEach((s, serializable) -> stringBuilder.append(s).append("=").append(URLEncoder.encode(serializable.toString(), StandardCharsets.UTF_8)).append("&"));

        if (stringBuilder.toString().endsWith("&")) {
            return stringBuilder.toString().substring(0, stringBuilder.toString().length() - 1);
        }

        return stringBuilder.toString();
    }

}
