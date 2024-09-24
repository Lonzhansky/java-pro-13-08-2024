package ua.hillel.lessons.lesson11.demos._03_nio_nio2._02_filechannel;

import ua.hillel.lessons.lesson11.utils.Constants;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Paths;

//import static java.nio.file.StandardOpenOption.READ;

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
public class FileChannelRead {

    static String filePath;

    public static void main(String[] args) throws IOException {
        filePath = Constants.BASE_PATH_READ + "lorem.txt";
        readFile(filePath);
    }

    public static void readFile(String filePath) throws IOException {

        FileChannel channel = FileChannel.open(Paths.get(filePath), java.nio.file.StandardOpenOption.READ);

        // Визначається буфер з ємністю у байтах
        ByteBuffer buffer = ByteBuffer.allocate(512);
        // Зміна обсягу буфера може дати інший результат.
//        ByteBuffer buffer = ByteBuffer.allocate(32);

        // Метод read() зчитує дані
        // з FileChannel в буфер.
        while (channel.read(buffer) != -1) {
            buffer.flip();
//            System.out.println(Charset.defaultCharset().decode(buffer));
            System.out.print(Charset.defaultCharset().decode(buffer));
            // Готуємо буфер для запису
            buffer.clear();
        }
        // Закриваємо канал.
        channel.close();
    }

}
