package ua.hillel.lessons.lesson33.demos._03;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;


public class HttpRequestHandler implements HttpHandler {

    private static final String FIRST_NAME = "firstname";
    private static final String LAST_NAME = "lastname";

    private static final int PARAM_NAME_IDX = 0;
    private static final int PARAM_VALUE_IDX = 1;

    private static final int HTTP_OK_STATUS = 200;

    private static final String AND_DELIMITER = "&";
    private static final String EQUAL_DELIMITER = "=";

    private static final String ENCODING = "UTF-8";

    public void handle(HttpExchange exchange) throws IOException {

        // Створення відповіді (response) за параметрами запиту (request)
        URI uri = exchange.getRequestURI();
        String response = createResponseFromQueryParams(uri);
        System.out.println("Response: " + response);

        // getResponseHeaders()
        // Повертає змінний Map, в який можуть бути збережені
        // заголовки (headers) відповіді (response) HTTP і який
        // буде передано як частину цієї відповіді.
        //
        // set("Content-Type", "text/html; charset=" + ENCODING)
        // Встановлення типу виведення та кодування.
        // Без кодування, кирилиця може дати незрозумілі символи у браузері.
        exchange.getResponseHeaders().set("Content-Type", "text/html; charset=" + ENCODING);

        // Статус та довжина відповіді
        // sendResponseHeaders() починає надсилання відповіді клієнту,
        // використовуючи поточний набір заголовків відповіді та числовий
        // код відповіді.
        exchange.sendResponseHeaders(HTTP_OK_STATUS, response.getBytes().length);

        // Запис у відповідь.
        // getResponseBody() повертає потік, в який має бути записано тіло відповіді.
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }

    /**
     * Створення відповіді (response) за параметрами запиту (request)
     *
     * @param uri the uri
     * @return the string
     */
    private String createResponseFromQueryParams(URI uri) {
        // Певні іменовані параметри
        String firstName = "";
        String lastName = "";
        // Отримання запиту (request)
        String query = uri.getQuery();
        if (query != null) {
            System.out.println("Request: " + query);
            String[] queryParams = query.split(AND_DELIMITER);
            for (String qParam : queryParams) {
                String[] param = qParam.split(EQUAL_DELIMITER);
                if (param.length > 0) {
                    for (int i = 0; i < param.length; i++) {
                        if (FIRST_NAME.equalsIgnoreCase(param[PARAM_NAME_IDX])) {
                            firstName = param[PARAM_VALUE_IDX];
                        }
                        if (LAST_NAME.equalsIgnoreCase(param[PARAM_NAME_IDX])) {
                            lastName = param[PARAM_VALUE_IDX];
                        }
                    }
                }
            }
        }

        // Повернення відповіді у форматі простого тексту
        return "Hi, " + firstName + " " + lastName;

        // Повернення відповіді у форматі HTML
//        return "<h3>Hi, " + firstName + " " + lastName + "</h3>";

        // Повернення відповіді (HTML та CSS).
        // Увага на поєднання одинарних і подвійних лапок.
//		 return "<p style='font-size: 32px; font-weight: bold; color: blue;'>" +
//				"Hi, &nbsp;&nbsp;&nbsp;" + firstName + "<br>" + lastName + "</p>";
    }
}
