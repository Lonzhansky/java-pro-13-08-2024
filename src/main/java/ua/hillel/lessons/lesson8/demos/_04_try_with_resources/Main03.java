package ua.hillel.lessons.lesson8.demos._04_try_with_resources;

import ua.hillel.lessons.lesson8.utils.Constants;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Використовуємо екземпляр BufferedReader
// для читання даних із файлу.
// Оголошення та створення екземпляра BufferedReader
// всередині оператора try-with-resources гарантує,
// що його екземпляр буде закрито незалежно від того,
// чи завершується оператор try нормально чи викликає
// виняток.
public class Main03 {

    public static void main(String[] args) {

        String text;

        try (BufferedReader br = new BufferedReader(
                // Намагаємося читати файл, який має бути.
                // Якщо файлу немає буде викид винятку
                new FileReader(Constants.BASE_PATH + "notes.txt")
        )) {
            while ((text = br.readLine()) != null) {
                System.out.println(text);
            }
            // Надлишково.
            // Оператор try гарантує закриття ресурсу (файлу),
            // оскільки BufferedReader реалізує AutoCloseable.
//            br.close();
        } catch (IOException e) {
            System.out.println("IOException in try block: " + e.getMessage());
        }
    }
}
