package ua.hillel.lessons.lesson11.demos._03_nio_nio2._01_buffer;

import ua.hillel.lessons.lesson11.utils.Constants;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

// Читаємо з існуючого файлу
public class BufferRead {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get(Constants.BASE_PATH_READ +
                "lorem.txt");
        getOutput(readBuffer(path));
    }

    private static String readBuffer(Path path) throws IOException {
        // Відкриваємо канал через Path.
        FileChannel channel = FileChannel.open(path);
        // Визначається буфер.
        // Метод allocate() створить екземпляр буферу
        // і виділить простір із певною місткістю.
        ByteBuffer byteBuffer = ByteBuffer.allocate(512);

        // Метод read() зчитує дані
        // з FileChannel в буфер.
        channel.read(byteBuffer);

        byte[] byteArray = byteBuffer.array();
        // Закриваємо канал.
        channel.close();

        return new String(byteArray).trim();
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
