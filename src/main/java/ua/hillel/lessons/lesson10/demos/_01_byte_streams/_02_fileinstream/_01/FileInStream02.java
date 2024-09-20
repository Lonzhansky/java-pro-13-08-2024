package ua.hillel.lessons.lesson10.demos._01_byte_streams._02_fileinstream._01;

import ua.hillel.lessons.lesson10.demos.utils.Constants;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

// ЧИТАННЯ З ФАЙЛУ
//
// Файл вже існує.
// FileInputStream читання з кодування UTF-8.
//
// UTF-8 (Unicode Transformation Format, 8-bit) - формат перетворення
// Юнікоду (8-біт). Стандарт кодування символів, що дозволяє компактніше
// зберігати та передавати символи Юнікоду, використовуючи змінну
// кількість байт (від 1 до 4), і забезпечує повну зворотну сумісність
// із 7-бітним кодуванням ASCII.
//
// Повинно зчитувати кирилицю.
public class FileInStream02 {

    static String fileName;
    static String path;

    public static void main(String[] args) {

        fileName = "records_01.txt";
        path = Constants.BASE_PATH_OUT + fileName;

        try {

//            FileInputStream fileInputStream = new FileInputStream(path);
//            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
//            final BufferedReader br = new BufferedReader(inputStreamReader);

            final BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(path),
                            StandardCharsets.UTF_8 // <- UTF-8
                    )
            );

            String nextString;

            while ((nextString = br.readLine()) != null) {
                System.out.println(nextString);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
