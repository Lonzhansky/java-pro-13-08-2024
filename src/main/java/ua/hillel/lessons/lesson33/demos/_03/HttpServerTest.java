package ua.hillel.lessons.lesson33.demos._03;

// Порт - унікальне число визначення в мережі програми,
// яка виконується на відповідному комп'ютері.
//
// Для отримання відповіді сервера:
// 1) Запустити цей клас;
// 2) У браузері ввести
// неправильно
// localhost:8000/server-app?firstName=Tom&lastName=Brown
// правильно
// localhost:8000/users?firstName=Tom&lastName=Brown
// та натиснути Enter.
public class HttpServerTest {

    private static final String CONTEXT = "/users";
    // УВАГА. Можливо, наведене значення порту
    // може бути зайнято на Вашій машині.
    // Змініть значення, але у форматі 8ХХХ.
    private static final int PORT = 8000;

    public static void main(String[] args) {
        // Створюємо екземпляр HttpServerSimple
        HttpServerSimple simpleHttpServer =
                new HttpServerSimple(PORT, CONTEXT,
                new HttpRequestHandler());
        // Запуск серверу
        simpleHttpServer.start();
        System.out.println("The server is running and " +
                "listening on a port " + PORT);
    }
}
