package ua.hillel.lessons.lesson10.demos._02_character_streams._02_filereader;

import ua.hillel.lessons.lesson10.demos.utils.Constants;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// Читання з файлу, який вже існує.
// Застосування конструктора
// public FileReader(File file)
public class FileReader02 {

    public static void main(String[] args) {
        String path = Constants.BASE_PATH_OUT + "records_05.txt";
        getOutput(handleFile(path));
    }

    private static String handleFile(String path) {
        File file = new File(path);
        // try-with-resources
        try (FileReader fr = new FileReader(file)) {
            // Читаємо по символам
            int i;
            StringBuilder stringBuilder = new StringBuilder();
            while ((i = fr.read()) != -1)
                stringBuilder.append((char) i);
            return stringBuilder.toString();
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
