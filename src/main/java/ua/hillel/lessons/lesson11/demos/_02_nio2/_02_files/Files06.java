package ua.hillel.lessons.lesson11.demos._02_nio2._02_files;

import ua.hillel.lessons.lesson11.utils.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

// Переміщення файлу.
// Застосовуємо метод Files.move()
// для переміщення файлу.
public class Files06 {

    public static void main(String[] args) {
        String fromPath = Constants.BASE_PATH_IN + "myfile.txt";
        String toPath = Constants.BASE_PATH_IN + "docs/myfile.txt";
        getOutput(replaceFile(fromPath, toPath));
    }

    private static String replaceFile(String fromPath, String toPath) {
        try {
            // StandardCopyOption.REPLACE_EXISTING вказує
            // методу Files.move() перезаписати будь-який існуючий
            // файл за шляхом призначення.
            // Цей параметр є необов'язковим.
            Files.move(Path.of(fromPath), Path.of(toPath),
                    StandardCopyOption.REPLACE_EXISTING);
            return "File has replaced.";
        } catch (IOException e) {
            return "Something wrong " + e.getMessage();
        }
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
