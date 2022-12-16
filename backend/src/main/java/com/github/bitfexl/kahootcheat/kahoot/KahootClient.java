package com.github.bitfexl.kahootcheat.kahoot;

import com.github.bitfexl.kahootcheat.kahoot.pojos.details.Detail;
import com.github.bitfexl.kahootcheat.kahoot.pojos.search.Search;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;

@Slf4j
public class KahootClient {
    private final String API_BASE = "https://create.kahoot.it/rest";
    private final String API_AUTH = "/authenticate";
    private final String API_SEARCH = "/kahoots";
    private final String API_DETAILS_SUFFIX = "/card/?includeKahoot=true";

    private final MediaType JSON = MediaType.parse("application/json");

    private final String mail;

    private final String password;

    private final OkHttpClient httpClient;

    private final Gson gson = new Gson();

    public KahootClient(String mail, String password) {
        this.mail = mail;
        this.password = password;
        httpClient = createHttpClient();
    }

    @SneakyThrows
    public Detail details(String kahootId) {
        final String url = API_BASE + API_SEARCH + "/" + kahootId + API_DETAILS_SUFFIX;

        log.info(url);

        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        try (Response response = httpClient.newCall(request).execute()) {
            log.info("Details Response Code: " + response.code());
            return gson.fromJson(response.body().charStream(), Detail.class);
        }
    }

    @SneakyThrows
    public Search search(String query) {
        HttpUrl url = HttpUrl.parse(API_BASE + API_SEARCH)
                .newBuilder()
                .addQueryParameter("query", query)
                .build();

        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        try (Response response = httpClient.newCall(request).execute()) {
            log.info("Search Response Code: " + response.code());
            return gson.fromJson(response.body().charStream(), Search.class);
        }
    }

    @SneakyThrows
    public void login() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("grant_type", "password");
        jsonObject.addProperty("username", mail);
        jsonObject.addProperty("password", password);
        String json = jsonObject.toString();

        Request request = new Request.Builder()
                .url(API_BASE + API_AUTH)
                .post(RequestBody.create(json, JSON))
                .build();

        try (Response response = httpClient.newCall(request).execute()) {
            log.info("Login Response Code: " + response.code());
        }
    }

    private OkHttpClient createHttpClient() {
        return new OkHttpClient.Builder()
                .cookieJar(new SaveCookieJar())
                .build();
    }
}
