package ua.hillel.lessons.lesson8.demos._08_file_work._02_file_write;

import ua.hillel.lessons.lesson8.utils.Constants;

import java.io.FileWriter;
import java.io.IOException;

// Створення та запис в файл
public class Main {

    public static void main(String[] args) {
        // Вхідні дані
        String myFile = "abc.txt";
        String myText = "This is our info file.";
        // Виклик методів роботи з файлом
        getOutput(writeFile(myFile, myText));
    }

    // Метод створює та записує в файл, та обробляє виняток
    private static String writeFile(String myFile, String content) {
        // Обробка винятку
        try {
            // Код роботи з файловим API
            FileWriter fw = new FileWriter(Constants.BASE_PATH + myFile);
            fw.write(content);
            fw.close();
            // Повідомлення при відсутності винятку
            return "Success.";
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
