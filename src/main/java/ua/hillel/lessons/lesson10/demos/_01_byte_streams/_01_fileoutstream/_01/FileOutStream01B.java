package ua.hillel.lessons.lesson10.demos._01_byte_streams._01_fileoutstream._01;

import ua.hillel.lessons.lesson10.demos.utils.Constants;

import java.io.FileOutputStream;
import java.io.IOException;

// Створення та запис файлу у
// ВНУТРІШНЮ папку щодо проекту.
// Папка вже заздалегідь створена.
public class FileOutStream01B {

    static String fileName;
    static String myFile;

    public static void main(String[] args) {

        // Конструкція try-catch дозволяє:
        // відловити помилки, автоматично
        // закрити файл і звільнити ресурси,
        // щоб не було витоку пам'яті.
        try {
            fileName = "records_01.txt";
            myFile = Constants.BASE_PATH_IN + fileName;

            FileOutputStream fout = new FileOutputStream(myFile);
            String myText = "Our super record!";

            // Конвертація рядка в байти
            byte[] someBytes = myText.getBytes();
            // Потік запису в файл
            fout.write(someBytes);
            // Закриття потоку
            fout.close();
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
            System.exit(0);
        }
        // За виняткової ситуації,
        // це повідомлення не повинно з'явитися,
        // оскільки прописано переривання програми.
        System.out.println("Success :)");
    }
}
