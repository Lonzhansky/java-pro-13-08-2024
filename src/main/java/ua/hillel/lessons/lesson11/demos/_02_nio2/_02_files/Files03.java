package ua.hillel.lessons.lesson11.demos._02_nio2._02_files;

import ua.hillel.lessons.lesson11.utils.Constants;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

// Метод Files.createFile() створює
// новий файл з екземпляру Path.
public class Files03 {

    public static void main(String[] args) {
        String newFileName = "records_new.txt";
        String newPath = Constants.BASE_PATH_SMPL + newFileName;
        getOutput(makeFile(newPath));
    }

    private static String makeFile(String newPath) {
        Path newFile;
        try {
            newFile = Files.createFile(Path.of(newPath));
        } catch (FileAlreadyExistsException e) {
            return "File already exists!";
        } catch (IOException e) {
           return "Something wrong " + e.getMessage();
        }
        return newFile + " has created!";
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
