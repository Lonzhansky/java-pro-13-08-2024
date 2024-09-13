package ua.hillel.lessons.lesson8.demos._06_throw_keyword._02;

import ua.hillel.lessons.lesson8.utils.Constants;

import java.io.File;
import java.io.FileNotFoundException;

// Перевіряємий виняток FileNotFoundException
// викидається в методі через throw,
// обробляється через try-catch.
public class Main {

    public static void main(String[] args) {
        // Шлях до існуючого файлу.
        // Для викидання винятку можна змінити назву файлу
        String filePath = Constants.BASE_PATH + "notes.txt";
        // Class File керує інформацією про файли та каталоги
        File file = new File(filePath);
        // Виклик методів обробки файлу
        getOutput(checkFile(file));
        // Подальший код буде виконаний, оскільки виняток обробляється
        getOutput("Some code.");
    }

    // Метод перевіряє наявність файлу за певним шляхом
    private static String checkFile(File file) {
        if (!file.exists()) {
            // Обробка через try-catch
            try {
                // Викидання винятку через throw
                throw new FileNotFoundException("File " + file +
                        " does not exist.");
            } catch (FileNotFoundException e) {
                // Повернення повідомлення винятку
                // при відсутності файлу
                return "Exception: " + e.getMessage();
            }
        }
        // Повернення повідомлення про наявність файлу
        return "File " + file + " exists.";
    }

    // Виведення результату роботи програми
    public static void getOutput(String output) {
        System.out.println(output);
    }
}
