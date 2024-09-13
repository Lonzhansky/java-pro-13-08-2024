package ua.hillel.lessons.lesson8.demos._09_custom_exceptions._03;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCreator {

    // Метод створення файлу
    public String createFile(String filePath) throws IOException {
        String msgFileExists = "";
        Path newFile;
        FileDataValidator validator = new FileDataValidator();
        // Обробка винятків через try-catch
        try {
            msgFileExists = validator.validateFileExists(filePath);
            // Метод Files.createFile() створює
            // новий порожній файл
            newFile = Files.createFile(Path.of(filePath));
        } catch (FileAlreadyExistsException e) {
            // Повернення повідомлення кастомного винятку з деталізацією
            // через стандартний виняток
            return new FileWorkException("File work exception: ", e).getMessage()
                    + msgFileExists;
        }
        // Повідомлення, що файл за відповідним шляхом створено
        return "> File " + newFile + " created!";
    }
}
