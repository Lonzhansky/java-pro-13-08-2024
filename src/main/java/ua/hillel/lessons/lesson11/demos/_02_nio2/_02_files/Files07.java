package ua.hillel.lessons.lesson11.demos._02_nio2._02_files;

import ua.hillel.lessons.lesson11.utils.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// Видалення файлу.
// Застосовуємо метод Files.delete()
// для видалення файла.
public class Files07 {

    public static void main(String[] args) {
        String fileName = "myfile.txt";
        String path = Constants.BASE_PATH_IN + "docs/" ;
        getOutput(deleteFile(path));
    }

    private static String deleteFile(String strPath) {
        try {
            Files.delete(Path.of(strPath));
            return "File has deleted.";
        } catch (IOException e) {
            return "Something wrong " + e.getMessage();
        }
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
