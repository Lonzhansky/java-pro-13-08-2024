package ua.hillel.lessons.lesson33.demos._04;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

// HttpClient синхронний
public class HttpClient02Synchronous {

    public static void main(String[] args)
            throws IOException, InterruptedException {
        HttpResponse<String> response = getHttpResponse();
        // Заголовки відповіді
        HttpHeaders headers = response.headers();
        headers.map().forEach((k, v) ->
                System.out.println(k + ":" + v));
        // Код стану
        System.out.println(response.statusCode());
        // Тіло відповіді
        System.out.println(response.body());
    }

    private static HttpClient getHttpClient() {
        return HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .connectTimeout(Duration.ofSeconds(10))
                .build();
    }

    private static HttpRequest sendHttpRequest() {
        return HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://httpbin.org/get"))
                .setHeader("User-Agent",
                        "Http Bot") // <- request header
                .build();
    }

    private static HttpResponse<String> getHttpResponse()
            throws IOException, InterruptedException {
        return getHttpClient().send(sendHttpRequest(),
                HttpResponse.BodyHandlers.ofString());
    }
}
