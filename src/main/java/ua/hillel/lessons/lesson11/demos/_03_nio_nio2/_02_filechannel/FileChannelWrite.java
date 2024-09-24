package ua.hillel.lessons.lesson11.demos._03_nio_nio2._02_filechannel;

import ua.hillel.lessons.lesson11.utils.Constants;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

// FileChannel.write() записує дані у файл.
// Цей метод приймає буфер як параметр.
// Тут є каталог, а файл створюється.
public class FileChannelWrite {

    static String content;
    static String filePath;
    static FileChannel fileChannel;

    public static void main(String[] args) throws IOException {

        content = "Good information for us.";
        filePath = Constants.BASE_PATH_SMPL + "notes02.txt";
        getOutput(writeToFile(content.trim(), filePath.trim()));

        // FileNotFoundException.
        // Неправильний шлях, оскільки немає каталогу abc/
//        content = "Good information for us.";
//        filePath = Constants.BASE_PATH_SMPL + "abc/notes02.txt";
//        getOutput(writeToFile(content.trim(), filePath.trim()));

        // Контент порожній
//        content = " ";
//        filePath = Constants.BASE_PATH_SMPL + "notes02.txt";
//        getOutput(writeToFile(content.trim(), filePath.trim()));

        // Шлях порожній
//        content = "Good information for us.";
//        filePath = " ";
//        getOutput(writeToFile(content.trim(), filePath.trim()));
    }

    public static String writeToFile(String content, String filePath)
            throws IOException {

        // Перевірка на наявність контента або його порожнечу
        if (content == null || content.isEmpty()) {
            return "There is no content to write in.";
        }

        // Перевірка на наявність шляху до файлу
        if (filePath == null || filePath.isEmpty()) {
            return "File path is absent or empty!";
        }

        try (FileOutputStream fout = new FileOutputStream(filePath)) {

            byte[] contentBytes = content.getBytes();
            ByteBuffer buffer = ByteBuffer.allocate(contentBytes.length);
            buffer.put(contentBytes);

            // Отримання FileChannel через FileOutputStream
            fileChannel = fout.getChannel();
            // готуємо буфер для читання
            buffer.flip();
            fileChannel.write(buffer);
        } catch (FileNotFoundException e) {
            return e.getMessage();
        }
        // Закриваємо канал
        fileChannel.close();
        return "The content has been written.";
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}
