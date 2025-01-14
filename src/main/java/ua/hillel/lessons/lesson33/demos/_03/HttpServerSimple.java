package ua.hillel.lessons.lesson33.demos._03;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.logging.Logger;

// Для обробки вхідних запитів необхідно реалізувати
// один або кілька об'єктів Interface HttpHandler, які
// повинні бути пов'язані з Class HttpServer.
//
// Також необхідно зареєструвати HttpHandler з базовим URI,
// який представляє розташування програми або служби на HttpServer,
// викликавши createContext(String, HttpHandler) типу HttpServer
// для порівняння конкретного обробника з HttpServer.
public class HttpServerSimple {

    private static final Logger LOGGER =
            Logger.getLogger(HttpServerSimple.class.getName());

    private HttpServer httpServer;

    /**
     * Інстанціюємо HTTP сервер.
     *
     * @param port    the port
     * @param context the context
     * @param handler the handler
     */
    public HttpServerSimple(int port, String context, HttpHandler handler) {

        try {
            // Створення HttpServer, який прослуховує встановлений порт.
            //
            // HttpServer.create(new InetSocketAddress(port), 0)
            //
            // Першим аргументом є InetSocketAddress(int port),
            // який створює адресу сокету, де IP-адреса - це підстановочна
            // адреса, а номер порту - вказане значення, подібно до формату
            // localhost:8ХХХ.
            //
            // Другий аргумент - це набір невиконаних з'єднань,
            // які операційна система має поставити в чергу,
            // поки вони очікують на прийняття серверним процесом.
            // Якщо встановлено в нуль, то використовується значення за замовчуванням,
            // яке має підходити більшість цілей.
            //
            // Class InetSocketAddress реалізує IP-адресу сокета
            // (IP-адреса + номер порту).
            // Сокет - унікально визначає програми в мережі.
            httpServer = HttpServer.create(new InetSocketAddress(port), 0);

            // Створення нового контексту для даного контексту та оброблювача.
            //
            // createContext(context, handler) створює HttpContext.
            // HttpContext представляє відображення (mapping) від
            // шляху URI до обробника обміну на цьому HttpServer.
            // Після створення всі запити, отримані сервером для шляху,
            // будуть оброблятися через виклик цього об'єкта-оброблювача.
            httpServer.createContext(context, handler);

            // Створення Executor (виконавця) за замовчуванням.
            //
            // Управління потоками може бути зроблено шляхом надання
            // об'єкту Executor для HttpServer. Якщо вказано значення null,
            // використовується реалізація за замовчуванням.
            //
            // setExecutor() встановлює об'єкт Executor цього сервера.
            // Executor має бути встановлений до виклику start().
            // Усі HTTP-запити обробляються у завданнях, переданих Executor.
            // Якщо цей метод не викликається (перед start()) або якщо він
            // викликається з порожнім Executor, то використовується реалізація
            // за замовчуванням, яка використовує потік, створений методом start().
            httpServer.setExecutor(null);
        } catch (IOException e) {
            LOGGER.info(e.getMessage());
        }
    }

    // Запуск створеного HttpServer
    public void start() {
        this.httpServer.start();
    }
}
