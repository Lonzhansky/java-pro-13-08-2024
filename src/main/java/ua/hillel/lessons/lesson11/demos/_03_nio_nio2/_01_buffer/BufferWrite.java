package ua.hillel.lessons.lesson11.demos._03_nio_nio2._01_buffer;

import ua.hillel.lessons.lesson11.utils.Constants;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

// Створюємо файл у вже існуючий каталог,
// та записуємо контент.
public class BufferWrite {

    public static void main(String[] args) {
        String filePath = Constants.BASE_PATH_SMPL + "notes.txt";
        String content = "Lorem ipsum dolor sit amet";
        Path path = Paths.get(filePath);
        getOutput(writeBuffer(content, path));
    }

    private static String writeBuffer(String content, Path path) {
        try {
            // Масив байтів
            byte[] contentBytes = content.getBytes();
            // Метод wrap() дозволяє екземпляру
            // повторно використовувати існуючий масив байтів.
            // Концептуально клас ByteBuffer — це масив байтів,
            // загорнутий всередину об’єкта.
            ByteBuffer byteBuffer = ByteBuffer.wrap(contentBytes);
            // Відкриваємо канал
            FileChannel channel = FileChannel.open(path,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.WRITE);
            channel.write(byteBuffer);
            // Закриваємо канал.
            channel.close();
        } catch (IOException e) {
            return "Exception: " + e.getMessage();
        }
        return "The content has been written.";
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
