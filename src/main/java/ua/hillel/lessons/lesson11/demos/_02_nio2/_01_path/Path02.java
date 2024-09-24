package ua.hillel.lessons.lesson11.demos._02_nio2._01_path;

import ua.hillel.lessons.lesson11.utils.Constants;

import java.nio.file.Path;

// Створення абсолютного шляху.
// Створення екземпляра Path,
// що представляє абсолютний шлях.
// Коли є об'єкт шляху, можемо щось
// з ним робити.
// УВАГА. Для Java 11+
public class Path02 {

    public static void main(String[] args) {

        // Перетворюємо заданий URI в об'єкт Path.
        // URI - Uniform Resource Identifier.
        // Java 11+
        Path path = Path.of(Constants.BASE_PATH_SMPL +
                "records_01.txt");
        System.out.println(path);

    }
}
