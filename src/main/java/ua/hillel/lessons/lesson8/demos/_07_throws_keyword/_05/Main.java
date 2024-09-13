package ua.hillel.lessons.lesson8.demos._07_throws_keyword._05;

import ua.hillel.lessons.lesson8.utils.Constants;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Перевіряємий виняток IOException
// зазначається методом через throws,
// обробляється через try-catch.
public class Main {

    public static void main(String[] args) {
        // Шлях до існуючого файлу.
        // Для викидання винятку можна змінити назву файлу
        String filePath = Constants.BASE_PATH + "notes.txt";
        // Обробка через try-catch.
        try {
            // Виклик методів роботи з файлом.
            // Код, який може викинути виняток
            getOutput(readFile(filePath));
        } catch (IOException e) {
            // Виведення повідомлення про виняток
            getOutput("Exception: " + e);
        }
        // Подальший код буде виконаний, оскільки виняток обробляється
        getOutput("Some code.");
    }

    // Метод читає файл та має викинути виняток
    public static String readFile(String filePath) throws IOException {
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);
        int i;
        StringBuilder builder = new StringBuilder();
        while ((i = br.read()) != -1) {
            builder.append((char) i);
        }
        return builder.toString();
    }

    // Виведення результату роботи програми
    public static void getOutput(String output) {
        System.out.println(output);
    }
}
