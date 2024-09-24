package ua.hillel.lessons.lesson11.demos._02_nio2._01_path;

import java.nio.file.Path;
import java.nio.file.Paths;

// Створення відносного шляху
public class Path03 {

    public static void main(String[] args) {

        // . означає "поточний каталог"
        Path currentDir = Paths.get(".");
        // Абсолютний шлях, якому відповідає екземпляр Java Path,
        // буде каталогом, в якому виконується програма, що виконує
        // цей код.
        System.out.println(currentDir.toAbsolutePath());

        // .. означає "батьківський каталог" або "на один каталог вище"
        Path parentDir = Paths.get("..");
        System.out.println(parentDir.toAbsolutePath());

    }
}
