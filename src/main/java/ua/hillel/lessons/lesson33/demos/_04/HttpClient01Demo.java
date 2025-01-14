package ua.hillel.lessons.lesson33.demos._04;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.logging.Logger;

public class HttpClient01Demo {

    private static final Logger LOGGER =
            Logger.getLogger(HttpClient01Demo.class.getName());

    public static void main(String[] args) {

        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(10))
                .build();
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create("https://jsonplaceholder.typicode.com/"))
                    .build();
            HttpResponse<String> response = httpClient.send(request,
                    HttpResponse.BodyHandlers.ofString());
            System.out.println("Status code: " +
                    response.statusCode() +
                    "\nHeaders: " + response.headers()
                    .allValues("content-type") +
                    "\nBody: " + response.body());
        } catch (IOException | InterruptedException e) {
            LOGGER.info(e.getMessage());
        }
    }
}
