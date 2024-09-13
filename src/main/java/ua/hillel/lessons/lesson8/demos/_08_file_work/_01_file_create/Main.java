package ua.hillel.lessons.lesson8.demos._08_file_work._01_file_create;

import ua.hillel.lessons.lesson8.utils.Constants;

import java.io.File;
import java.io.IOException;

// Створення файлу
public class Main {

    public static void main(String[] args) {
        // Новий файл
        String fileName = "myfile.txt";
        // Виклик методів роботи з файлом
        getOutput(createFile(fileName));
    }

    // Метод створює файл та обробляє виняток
    private static String createFile(String fileName) {
        // Обробка винятку
        try {
            // Код роботи з файловим API
            File file = new File(Constants.BASE_PATH + fileName);
            if (file.createNewFile()) {
                // Повідомлення при відсутності винятку
                return "File has created :)";
            } else {
                // Якщо створюємо файл з такою ж назвою, буде
                // попередження про наявність файлу з таким імененм
                return "File already exists :/";
            }
        } catch (IOException e) {
            // Повідомлення про виняток
            return "Exception: " + e.getMessage();
        }
    }

    // Виведення результату роботи програми
    public static void getOutput(String output) {
        System.out.println(output);
    }
}
