package ua.hillel.lessons.lesson11.demos._01_nio._05_buff_remain;

import java.nio.ByteBuffer;

// Застосовуємо метод hasRemaining, щоб перевірити,
// чи є елементи в буфері, і вивести елемент,
// якщо він є.
public class BufferHasRemaining {

    public static void main(String[] args) throws Exception {

        ByteBuffer byteBuffer = ByteBuffer.allocate(5);

        // Додаємо елементи до буфера
        byteBuffer.put((byte) 'A');
        byteBuffer.put((byte) 'B');
        byteBuffer.put((byte) 'C');
        byteBuffer.put((byte) 'D');
        byteBuffer.put((byte) 'E');

        byteBuffer.flip();

        while (byteBuffer.hasRemaining()) {
            byte element = byteBuffer.get();
            System.out.println("element : " + (char) element);
        }
    }
}
