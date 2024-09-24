package ua.hillel.lessons.lesson11.demos._02_nio2._02_files;

import ua.hillel.lessons.lesson11.utils.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// Читання з файлу.
// Застосовуємо метод Files.readString()
// для читання з файлу.
// За замовчуванням Java використовуватиме кодування
// UTF-8 для читання файлів.
public class Files05 {

    public static void main(String[] args) {
//        String fileName = "notes02.txt";
        String fileName = "myfile.txt";
        String strPath = Constants.BASE_PATH_IN + fileName;
        getOutput(readFromFile(strPath));
    }

    private static String readFromFile(String strPath) {
        try {
            return Files.readString(
                    Path.of(strPath // <- Конвертація String у Path
                    ));
        } catch (IOException e) {
            return "Something wrong " + e.getMessage();
        }
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
