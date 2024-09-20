package ua.hillel.lessons.lesson10.demos._03_buffered_streams._02_buffreader;

import ua.hillel.lessons.lesson10.demos.utils.Constants;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Читання з файлу, який вже існує.
public class BuffReader01 {

    public static void main(String[] args) {
        String path = Constants.BASE_PATH_OUT + "records_06.txt";
        getOutput(handleFile(path));
    }

    private static String handleFile(String path) {
        // try-with-resources
        try (BufferedReader buffReader =
                     new BufferedReader(new FileReader(path))) {
            // Читаємо по символам
            int i;
            StringBuilder stringBuilder = new StringBuilder();
            while ((i = buffReader.read()) != -1)
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
