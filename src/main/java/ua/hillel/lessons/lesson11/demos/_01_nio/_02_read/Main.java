package ua.hillel.lessons.lesson11.demos._01_nio._02_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

// Читання з файлу.
// Читаємо дані з FileChannel, викликаючи read().
//
// Спочатку виділяється буфер (ByteBuffer).
// Дані, зчитані з FileChannel, зчитуються в буфер.
//
// Потім викликається метод FileChannel.read().
// Цей метод зчитує дані з FileChannel у буфер.
// Ціле число, яке повертається методом read(), повідомляє,
// скільки байтів записано в буфер.
// Якщо повертається -1, досягнуто кінець файлу.
public class Main {

    private static final String BASE_PATH = "files\\";

    public static void main(String[] args) throws IOException {
        String filePath = BASE_PATH + "myfile.txt";
        getOutput(readFile(filePath));
    }

    // Метод читання нашого файлу
    public static String readFile(String filePath) throws IOException {

        FileChannel channel;
        StringBuilder builder;

        try(FileInputStream fis = new FileInputStream(filePath)) {
            // Отримання FileChannel через FileInputStream
            channel = fis.getChannel();
            // Виділяємо новий байтовий буфер
            // через метод allocate() з ємністю у байтах
            ByteBuffer buffer = ByteBuffer.allocate(17);
            // Створюємо StringBuilder для зчитаних даних
            builder = new StringBuilder();
            // Метод read() зчитує дані
            // з FileChannel в буфер.
            while (channel.read(buffer) != -1) {
                buffer.flip();
                System.out.println(buffer);
                builder.append(Charset.defaultCharset().decode(buffer));
                System.out.println(builder);
                // Готуємо буфер для запису
                buffer.clear();
            }
        } catch (FileNotFoundException e) {
            return e.getMessage();
        }
        // Закриваємо канал
        channel.close();
        // Повертаємо результат читання
        return builder.toString();
    }

    // Виведення результату роботи програми
    public static void getOutput(String output) {
        System.out.println(output);
    }
}
