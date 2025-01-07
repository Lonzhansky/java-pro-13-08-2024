package ua.hillel.lessons.lesson32.jul.demo_01;

import java.io.IOException;
import java.util.logging.*;

public class JULDemo {

    private static final Logger LOGGER = Logger.getLogger(JULDemo.class.getName());

    public static void main(String[] args) throws IOException {
        setupLogger();

        LOGGER.severe("This is a SEVER level log message");
        LOGGER.warning("This is a WARNING level log message");
        LOGGER.info("This is a INFO level log message");
        LOGGER.config("This is a CONFIG level log message");
        LOGGER.fine("This is a FINE level log message");
        LOGGER.finer("This is a FINER level log message");
        LOGGER.finest("This is a FINEST level log message");
    }


    private static void setupLogger() throws IOException {

        LOGGER.setUseParentHandlers(false);

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.WARNING);
        consoleHandler.setFormatter(new SimpleFormatter());

        FileHandler fileHandler = new FileHandler("logs/jul_demo.log", true);
        fileHandler.setLevel(Level.CONFIG);
        fileHandler.setFormatter(new SimpleFormatter());

        LOGGER.addHandler(consoleHandler);
        LOGGER.addHandler(fileHandler);

        LOGGER.setLevel(Level.ALL);
    }

}
