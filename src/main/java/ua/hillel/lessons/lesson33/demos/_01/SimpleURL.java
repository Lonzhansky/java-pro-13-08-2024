package ua.hillel.lessons.lesson33.demos._01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

// Отримання Web-сторінки.
// У консолі має бути виведення у форматі HTML.
public class SimpleURL {

    public static void main(String[] args) {
        try {
//            URL url = new URL("https://www.ukr.net/");
            URL url = new URL("https://jsonplaceholder.typicode.com/");
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(url.openStream()));
            String line;
            while ((line = br.readLine()) != null)
                System.out.println(line);
            br.close();
        } catch (MalformedURLException me) {
            System.err.println("Exception: " + me.getMessage());
            System.exit(0);
        } catch (IOException ioe) {
            System.err.println("Exception: " + ioe.getMessage());
        }
    }
}
