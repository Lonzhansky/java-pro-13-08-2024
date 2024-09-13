package ua.hillel.lessons.lesson8.demos._08_file_work._03_file_read;

import ua.hillel.lessons.lesson8.utils.Constants;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Робота з файлом через File IO API.
// Винятки обробляються.
public class Main02 {

    public static void main(String[] args) {
        // Файл, який існує.
        // Для виникнення винятку, можна змінити назву файлу
        String fileName = "notes.txt";
        // Виклик методів роботи з файлом
        getOutput(readFile(fileName));
    }

    // Метод роботи з файлом, який обробляє виняток
    private static String readFile(String fileName) {
        StringBuilder builder = new StringBuilder();
        // Робота з файлами через File IO API
        File file = new File(Constants.BASE_PATH + fileName);
        // Обробка винятку щодо роботи з файлами
        try (FileReader fr = new FileReader(file)) {
            // Читаємо символи
            int i;
            while ((i = fr.read()) != -1)
                builder.append((char) i);
        } catch (FileNotFoundException ex) {
            // Тут перехоплення винятку щодо наявності файлу.
            // Якщо файла не існує, то виведеться відповідне
            // повідомлення про виняток.
            System.out.println("Exception: " + ex.getMessage());
        } catch (IOException e) {
            // Тут перехоплення винятку щодо використання File IO API.
            // При неможливості використання File IO API, виведеться відповідне
            // повідомлення про виняток.
            System.out.println("Exception: " + e.getMessage());
        }
        return builder.toString();
    }

    // Виведення результату роботи програми
    public static void getOutput(String output) {
        System.out.println(output);
    }
}
