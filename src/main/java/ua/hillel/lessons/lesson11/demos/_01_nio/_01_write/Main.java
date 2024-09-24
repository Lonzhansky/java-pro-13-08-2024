package ua.hillel.lessons.lesson11.demos._01_nio._01_write;

import ua.hillel.lessons.lesson11.utils.Constants;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

// Створення та запис у файл
public class Main {

    public static void main(String[] args) throws IOException {
        // Контент для запису у файл
        String content = "Some information.";
        // Шлях до файлу
        String filePath = Constants.BASE_PATH_IN + "myfile.txt";
        getOutput(writeToFile(content, filePath));
    }

    // Метод створення та запису в файл
    public static String writeToFile(String content, String filePath)
            throws IOException {

        FileChannel fileChannel;

        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            // Кодуємо рядковий контен у послідовність байтів
            byte[] contentBytes = content.getBytes();
            // Виділяємо новий байтовий буфер
            // через метод allocate()
            ByteBuffer buffer = ByteBuffer.allocate(contentBytes.length);
            // Передаємо весь вміст даного вихідного
            // масиву байтів у цей буфер через метод put()
            buffer.put(contentBytes);
            // Отримання FileChannel через FileOutputStream
            fileChannel = fos.getChannel();
            // Готуємо буфер до читання
            buffer.flip();
            // Метод write() записує дані у файл, який створюється.
            // Цей метод приймає буфер як параметр.
            fileChannel.write(buffer);
        } catch (FileNotFoundException e) {
            return e.getMessage();
        }
        // Закриваємо канал
        fileChannel.close();
        return "The content has been written.";
    }

    // Виведення результату роботи програми
    public static void getOutput(String output) {
        System.out.println(output);
    }
}
