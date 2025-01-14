package ua.hillel.lessons.lesson33.demos._04;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

// HttpClient асинхронний
public class HttpClient03Asynchronous {

    public static void main(String[] args) throws Exception {
        CompletableFuture<HttpResponse<String>> response =
                getHttpResponse();
        String result = response.thenApply(HttpResponse::body)
                .get(5, TimeUnit.SECONDS);
        System.out.println(result);
    }

    private static HttpClient getHttpClient() {
        return HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(10))
                .build();
    }

    private static HttpRequest sendHttpRequest() {
        return HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://httpbin.org/get"))
                .setHeader("User-Agent",
                        "Http Bot")
                .build();
    }

    private static CompletableFuture<HttpResponse<String>> getHttpResponse() {
        return getHttpClient().sendAsync(sendHttpRequest(),
                HttpResponse.BodyHandlers.ofString());
    }
}
