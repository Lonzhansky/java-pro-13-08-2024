package ua.hillel.lessons.lesson8.demos._09_custom_exceptions._03;

import java.io.IOException;

// Створення файлу
public class Main {

    // Шлях до існуючої папки.
    // Для викиду винятку можна імітувати неіснуючу папку.
    private static final String BASE_PATH = "files/";

    public static void main(String[] args) {
        // Назва нового файлу
        String newFileName = "myfile.txt";
        // Шлях для нового файлу
        String filePath = BASE_PATH + newFileName;
        // Виклики методів маніпуляції з файлом
        getOutput(handleFile(filePath));
    }

    // Метод роботи з файлом
    private static String handleFile(String filePath) {
        FileCreator fileCreator = new FileCreator();
        // Обробка винятків по роботі з файловою API
        try {
            // Виклики методів маніпуляції з файлом
            return fileCreator.createFile(filePath);
        } catch (IOException e) {
            // Повернення повідомлення кастомного винятку з деталізацією
            // через стандартний виняток
            return new FileWorkException("File work exception: ", e).getMessage()
                    + "> Check file path for " + e.getMessage();
        }
    }

    // Виведення повідомлення про результат роботи програми
    private static void getOutput(String output) {
        System.out.println(output);
    }
}
