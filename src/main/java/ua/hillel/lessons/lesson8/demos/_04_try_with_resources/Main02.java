package ua.hillel.lessons.lesson8.demos._04_try_with_resources;

import ua.hillel.lessons.lesson8.utils.Constants;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;

// try-with-resources.
// Наявність декілька ресурсів.
class Main02 {

    public static void main(String[] args) {

        // Створюємо об'єкт FileOutputStream для запису даних.
        // Додаємо ресурси.
        try (FileOutputStream fos = new FileOutputStream(
                Constants.BASE_PATH + "myfile2.txt"
        );

             // Додавання ресурсу.

             // Читання потоку символів з файлу.
             // Можна змінити назву файлу для викидання винятку.
             BufferedReader br = new BufferedReader(
                     new FileReader(Constants.BASE_PATH + "myfile.txt")
             )
        ) {

            // Рядок, який містить вміст файлу
            String text;

            // Перевірка вмісту через readLine()
            while ((text = br.readLine()) != null) {

                // Читання з вхідного файлу
                byte[] arr = text.getBytes();

                // Конвертація рядка у байти
                fos.write(arr);
            }

            // Повідомлення про успіх
            System.out.println("File content copied to another one.");
        }

        // Блок catch для обробки загальних винятків
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        // Повідомлення про успіх виконання програми
        System.out.println("Resource are closed and message " +
                "has been written into the file");
    }
}

