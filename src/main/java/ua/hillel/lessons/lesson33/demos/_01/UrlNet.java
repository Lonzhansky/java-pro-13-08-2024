package ua.hillel.lessons.lesson33.demos._01;

import java.io.IOException;
import java.net.URL;
import java.util.logging.Logger;

// Просте отримання даних:
// URL, протокол, хост, порт.
public class UrlNet {

    private static final Logger LOGGER =
            Logger.getLogger(UrlNet.class.getName());

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.ukr.net");
            System.out.println("\nURL -> " + url +
                    "\nprotocol -> " + url.getProtocol() +
                    "\nhost -> " + url.getHost() +
                    "\nport -> " + url.getDefaultPort());
        } catch (IOException e) {
            LOGGER.info(e.getMessage());
        }
    }
}
