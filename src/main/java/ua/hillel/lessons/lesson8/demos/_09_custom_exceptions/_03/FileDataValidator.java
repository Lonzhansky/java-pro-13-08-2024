package ua.hillel.lessons.lesson8.demos._09_custom_exceptions._03;

import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileDataValidator {

    public String validateFileExists(String filePath) throws FileAlreadyExistsException {
        if (Files.exists(Path.of(filePath)))
            return new FileAlreadyExistsException("> File " + filePath
                + " already exists!").getMessage();
        else return filePath;
    }
}
