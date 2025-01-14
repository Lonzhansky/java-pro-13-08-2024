package ua.hillel.lessons.lesson33.demos._01;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Logger;

// Для отримання більш повної інформації про ресурс,
// потрібно застосовувати Class URLConnection.
// Для отримання екземпляру Class URLConnection, слід
// викликати через екземпляр Class URL метод openConnection().
// Class URLConnection надає метод getInputStream(), через
// який можемо відобразити всі дані Web-сторінки (початковий код).
// Метод getInputStream() повертає всі дані вказаного
// URL у потоці, які можуть бути прочитані та відображені.
public class UrlConn {

    private static final Logger LOGGER =
            Logger.getLogger(UrlConn.class.getName());

    public static void main(String[] args) {
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/");
            URLConnection urlConn = url.openConnection();
            InputStream stream = urlConn.getInputStream();
            int i;
            while ((i = stream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            LOGGER.info(e.getMessage());
        }
    }
}
