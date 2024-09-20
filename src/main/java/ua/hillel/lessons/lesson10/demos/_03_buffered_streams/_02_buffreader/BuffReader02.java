package ua.hillel.lessons.lesson10.demos._03_buffered_streams._02_buffreader;

import ua.hillel.lessons.lesson10.demos.utils.Constants;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

// Читання з файлу, який вже існує,
// через lines()
public class BuffReader02 {

    public static void main(String[] args) {
        String path = Constants.BASE_PATH_IN + "multi_line.txt";
        getOutput(handleFile(path));
    }

    private static String handleFile(String path) {
        // try-with-resources
        try (BufferedReader buffReader =
                     new BufferedReader(new FileReader(path))) {
            // Читаємо по рядкам
            return buffReader.lines()
                    .collect(Collectors.joining(System.lineSeparator()));
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
