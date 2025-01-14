package ua.hillel.lessons.lesson33.demos._01;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Logger;

// Class HttpURLConnection працює тільки
// за протоколом HTTP.
// За допомогою Class HttpURLConnection можна
// отримати інформацію про URL-адресу HTTP, таку як
// інформація заголовка, код стану, код відповіді тощо.
// Class HttpURLConnection успадковує Class URLConnection.
public class HttpUrlConn {

    private static final Logger LOGGER =
            Logger.getLogger(HttpUrlConn.class.getName());

    public static void main(String[] args) {
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/");
            HttpURLConnection httpUrlConn =
                    (HttpURLConnection) url.openConnection();
            for (int i = 1; i <= 8; i++) {
                System.out.println(httpUrlConn.getHeaderFieldKey(i) +
                        " = " + httpUrlConn.getHeaderField(i));
            }
            httpUrlConn.disconnect();
        } catch (Exception e) {
            LOGGER.info(e.getMessage());
        }
    }
}
