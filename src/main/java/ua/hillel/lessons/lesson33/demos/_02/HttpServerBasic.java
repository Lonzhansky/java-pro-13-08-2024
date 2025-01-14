package ua.hillel.lessons.lesson33.demos._02;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

// Пакет com.sun.net.httpserver надає API
// HTTP-сервера, який можна використовувати
// для створення вбудованого HTTP-сервера.
//
// Для роботи з цим API, застосовуються:
//
// Class HttpServer реалізує простий HTTP-сервер,
// прив'язаний до IP-адреси та номера порту,
// і прослуховує вхідні TCP-з'єднання від
// клієнтів за цією адресою.
//
// Class HttpContext є зіставленням кореневого
// URI шляху програми з Interface HttpHandler, який
// викликається для обробки запитів, призначених
// для цього шляху, у зв'язаному Class HttpServer
// або Class HttpsServer.
// Об'єкти Class HttpContext створюються методами
// create через об'єкти Class HttpServer або
// Class HttpsServer.
//
// Interface HttpHandler - обробник для обробки HTTP
// обміну.
//
// Class HttpExchange інкапсулює отриманий HTTP-запит
// та відповідь, який буде згенеровано в одному обміні.
// Він надає методи для перевірки запиту від клієнта,
// а також для побудови та відправлення відповіді.
//
// Для отримання відповіді сервера через цей API:
// 1) Запустити цей клас;
// 2) У браузері ввести localhost:8800 і натиснути Enter.
//
// ДОВІДКА.
// Порт - унікальне число визначення програми,
// що виконується на відповідному комп'ютері.
public class HttpServerBasic {

    public static void main(String[] args) throws IOException {
        // Встановлення порту.
        // УВАГА! Можливо, наведене значення порту
        // може бути зайнято на Вашій машині.
        // Змініть значення, але у форматі 8ХХХ.
        HttpServer server =
                HttpServer.create(
                        new InetSocketAddress(8800),
                        0);
        HttpContext context =
                server.createContext("/");
        context.setHandler(HttpServerBasic::handleRequest);
        server.start();
        System.out.println("Server is working...");
    }

    private static void handleRequest(HttpExchange exchange)
            throws IOException {
        // Кодування відповіді
        String encoding = "UTF-8";
        // Відповідь сервера в plain text
//        String response = "It's base server :)";
        // Відповідь сервера в HTML
        String response = "<h3>It's base server :)</h3>" +
                "<p>Our list:</p>" +
                "<ol>" +
                "<li>apple</li>" +
                "<li>orange</li>" +
                "<li>banana</li>" +
                "</ol>" +
                "<input type=\"submit\" value=\"Submit\"/>";

        // Заголовок Content-Type використовується для того,
        // щоб визначити MIME тип ресурсу.
        // У відповідях сервера заголовок Content-Type
        // повідомляє клієнта, який буде тип контенту,
        // що передається.
        //
        // MIME (Multipurpose Internet Mail Extensions) -
        // стандарт, що описує передачу різних типів даних
        // електронною поштою, а також, у загальному випадку,
        // специфікація для кодування інформації та форматування
        // повідомлень таким чином, щоб їх можна було пересилати
        // через Інтернет.
//        exchange.getResponseHeaders().set("Content-Type",
//        "text/plain; charset=" + encoding);
        exchange.getResponseHeaders().set("Content-Type",
                "text/html; charset=" + encoding);
        // Код відповіді та довжина
        exchange.sendResponseHeaders(200,
                response.getBytes().length);

        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
