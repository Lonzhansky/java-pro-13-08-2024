package ua.hillel.lessons.lesson33.demos._04;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

// POST JSON
public class HttpClient04PostJSON {

    public static void main(String[] args) throws
            IOException, InterruptedException {
        // Данні в JSON
        String json = "{" +
                "\"name\":\"Alice\"," +
                "\"position\":\"manager\"" +
                "}";

        HttpResponse<String> response =
                getHttpClient().send(sendHttpRequest(json),
                HttpResponse.BodyHandlers.ofString());

        // Статус код
        System.out.println(response.statusCode());
        // Тіло відповіді
        System.out.println(response.body());
    }

    private static HttpClient getHttpClient() {
        return HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(10))
                .build();
    }

    private static HttpRequest sendHttpRequest(String json) {
        return HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .uri(URI.create("https://httpbin.org/post"))
                .setHeader("User-Agent",
                        "Http Bot") // <- request header
                .header("Content-Type", "application/json")
                .build();
    }
}
