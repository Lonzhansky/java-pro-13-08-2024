package ua.hillel.lessons.lesson10.demos._01_byte_streams._02_fileinstream._03;

import ua.hillel.lessons.lesson10.demos.utils.Constants;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileService {

    public String readFile(String file) {

        // try-with-resources
        try (final BufferedReader br =
                     new BufferedReader(
                             new InputStreamReader(
                                     new FileInputStream(
                                             Constants.BASE_PATH_IN + file + ".txt")
                             )
                     )
        ) {

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
}
