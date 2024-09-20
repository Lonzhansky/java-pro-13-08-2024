package ua.hillel.lessons.lesson10.demos._01_byte_streams._02_fileinstream._02;

import ua.hillel.lessons.lesson10.demos.utils.Constants;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInStreamService {

    static String fileName;
    static String path;

    public static void main(String[] args) {
        fileName = "records_01.txt";
        path = Constants.BASE_PATH_OUT + fileName;
        getOutput(readFile(path));
    }

    private static String readFile(String path) {
        try {
            final BufferedReader br =
                    new BufferedReader(new InputStreamReader(
                            new FileInputStream(path)));
            String str;
            StringBuilder stringBuilder = new StringBuilder();
            while ((str = br.readLine()) != null) {
                stringBuilder.append(str).append("\n");
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
