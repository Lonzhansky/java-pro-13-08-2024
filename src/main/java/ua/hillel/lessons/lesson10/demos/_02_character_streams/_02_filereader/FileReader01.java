package ua.hillel.lessons.lesson10.demos._02_character_streams._02_filereader;

import ua.hillel.lessons.lesson10.demos.utils.Constants;

import java.io.FileReader;
import java.io.IOException;

// Читання з файлу, який вже існує.
// Застосування конструктора
// public FileReader(String fileName)
public class FileReader01 {

    public static void main(String[] args) {
        String path = Constants.BASE_PATH_OUT + "records_05.txt";
        getOutput(handleFile(path));
    }

    private static String handleFile(String path) {
        // try-with-resources
        try (FileReader reader = new FileReader(path)) {
            // Читаємо по символам
            int sym;
            StringBuilder stringBuilder = new StringBuilder();
            while ((sym = reader.read()) != -1) {
                stringBuilder.append((char) sym);
            }
            return stringBuilder.toString();
        } catch (IOException ex) {
           return ex.getMessage();
        }
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
