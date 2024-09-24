package ua.hillel.lessons.lesson11.demos._02_nio2._02_files;

import ua.hillel.lessons.lesson11.utils.Constants;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// Метод Files.createDirectory() створює
// нову директорію з екземпляру Path.
public class Files02 {

    public static void main(String[] args) {
        String newDirName = "docs";
        String newPath = Constants.BASE_PATH_SMPL + newDirName;
        getOutput(makeDir(newPath));
    }

    private static String makeDir(String newPath) {
        Path path = Paths.get(newPath);
        Path newDir;
        try {
            newDir = Files.createDirectory(path);
        } catch (FileAlreadyExistsException e) {
            return "Directory already exists!";
        } catch (IOException e) {
            return "Something wrong " + e.getMessage();
        }
        return newDir + " created!";
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
