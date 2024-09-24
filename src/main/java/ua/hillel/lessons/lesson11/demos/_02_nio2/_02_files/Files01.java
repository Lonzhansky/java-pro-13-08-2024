package ua.hillel.lessons.lesson11.demos._02_nio2._02_files;

import ua.hillel.lessons.lesson11.utils.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

// Перевірка наявності файлу
// та часу його останньої модифікації.
public class Files01 {

    private static final DateTimeFormatter DATE_TIME_FORMATTER =
            DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    static String fileName;
    static Path path;

    public static void main(String[] args) {

        // Файл існує.
        // НЕ повинно бути винятку.
        fileName = "lorem.txt";
        // Файл НЕ існує.
        // Повинен бути виняток.
//        fileName = "notes1.txt";
        path = Path.of(Constants.BASE_PATH_READ + fileName);

        // Перевірка наявності файлу
        if (isFileExists(path)) {
            System.out.println("File " + fileName +
                    " exists in folder " + Constants.BASE_PATH_READ);
        } else {
            System.out.println("File " + fileName + " does not exist.");
        }

        // Отримання неформатованого часу останньої модифікації файлу.
        // Вивід подібний РРРР-ММ-ДДT11:05:20Z, де
        // T - це просто літерал, що відокремлює дату від часу,
        // а Z означає «зміщення нуля годинника», також відоме
        // як «зулуський час» (UTC).
        System.out.println("Last modification (non-format time) is " +
                getLastModifiedInfo(path));

        // Отримання форматованого часу останньої модифікації файлу.
        String formattedDateTime = formatDateTime(getLastModifiedInfo(path));
        System.out.println("Last modification (format time) is " +
                formattedDateTime);
    }

    private static boolean isFileExists(Path path) {
        // Метод Files.exists() перевіряє наявність
        // шляху в файловій системі.
        // Якщо ТАК - true, НІ - false.
        return Files.exists(path);
    }

    private static FileTime getLastModifiedInfo(Path path) {
        FileTime lastModifiedTime = null;
        try {
            lastModifiedTime = Files.getLastModifiedTime(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lastModifiedTime;
    }

    public static String formatDateTime(FileTime fileTime) {
        LocalDateTime localDateTime = fileTime
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
        return localDateTime.format(DATE_TIME_FORMATTER);
    }
}
