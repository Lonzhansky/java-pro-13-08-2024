package ua.hillel.lessons.lesson10.demos._03_buffered_streams._01_buffwriter;

import ua.hillel.lessons.lesson10.demos.utils.Constants;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// Створення і запис у файл
public class BuffWriter01 {

    public static void main(String[] args) throws Exception {
        String fileName = "records_06.txt";
        String text = "It's very important! Top secret.";
        getOutput(handleFile(fileName, text));
    }

    private static String handleFile(String fileName, String text) {
        // try-with-resources
        try (BufferedWriter buffWriter = new BufferedWriter(
                new FileWriter(Constants.BASE_PATH_OUT + fileName))) {
            // Потік запису у файл
            buffWriter.write(text);
            return "Success.";
        } catch (IOException ex) {
            return "Exception: " + ex.getMessage();
        }
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
