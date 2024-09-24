package ua.hillel.lessons.lesson11.demos._02_nio2._02_files;

import ua.hillel.lessons.lesson11.utils.Constants;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// Створення файлу та запис до нього.
// Застосовуємо метод Files.writeString()
// для запису в файл.
// За умовчанням використовується кодування UTF-8.
public class Files04 {

    public static void main(String[] args) {
        String newFileName = "my_notes.txt";
        String content = "Super secret NOTE!";
        String strPath = Constants.BASE_PATH_SMPL + newFileName;

        // При повторному запуску програми файл буде перестворюватись,
        // контент буде перезаписуватись

        getOutput(createFile(strPath));

        getOutput(writeToFile(
                Paths.get(strPath), // <- Конвертація String у Path
                content
        ));
    }

    private static String createFile(String strPath) {
        Path newFile;
        try {
            newFile = Files.createFile(Path.of(strPath));
        } catch (FileAlreadyExistsException e) {
           return "File already exists!";
        } catch (IOException e) {
           return "Something wrong " + e.getMessage();
        }
        return newFile + " created!";
    }

    private static String writeToFile(Path path, String content) {
        try {
            Files.writeString(path, content);
        } catch (IOException e) {
            return e.getMessage();
        }
        return "Recorded in: " + path;
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
