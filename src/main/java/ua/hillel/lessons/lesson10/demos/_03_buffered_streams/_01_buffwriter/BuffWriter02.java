package ua.hillel.lessons.lesson10.demos._03_buffered_streams._01_buffwriter;

import ua.hillel.lessons.lesson10.demos.utils.Constants;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// Додання контенту в файл.
public class BuffWriter02 {

    public static void main(String[] args) {
        String myFile = "records_06.txt";
        String content = " Additional content for the file.";
        String path = Constants.BASE_PATH_OUT + myFile;
        getOutput(handleFile(path, content));
    }

    private static String handleFile(String path, String content) {
        // try-with-resources
        try (BufferedWriter bw = new BufferedWriter(
                // true для додання контенту в файл
                new FileWriter(path, true))) {
            bw.write(content);
            return "Success.";
        } catch (IOException ioe) {
            return ioe.getMessage();
        }
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
