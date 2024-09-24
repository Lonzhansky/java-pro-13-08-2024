package ua.hillel.lessons.lesson11.demos._01_nio._03_buff_mark_reset;

import java.nio.ByteBuffer;

public class Main {

    private static final String ALPHABETS = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) throws Exception {

        ByteBuffer byteBuffer = ByteBuffer.allocate(26);
        System.out.println("Before inserting the data into buffer");
        getOutput(byteBuffer);

        for (int i = 0; i < ALPHABETS.length(); i++) {
            byteBuffer.put((byte) ALPHABETS.charAt(i));
        }
        System.out.println("After inserting 26 characters into the buffer");
        getOutput(byteBuffer);

        byteBuffer.flip();
        getOutput(byteBuffer);

        System.out.println("Reading first five characters from buffer");
        // Читаємо перші п'ять символів із буфера
        for (int i = 0; i < 5; i++) {
            System.out.println((char) byteBuffer.get());
        }

        getOutput(byteBuffer);

        System.out.println("Marking the buffer");
        byteBuffer.mark();
        getOutput(byteBuffer);

        System.out.println("Reading next 5 characters from the buffer");
        // Читання наступних 5 символів
        for (int i = 0; i < 5; i++) {
            System.out.println((char) byteBuffer.get());
        }

        getOutput(byteBuffer);

        System.out.println("Reseting the buffer");
        byteBuffer.reset();

        getOutput(byteBuffer);

        System.out.println("Reading again 5 characters from the buffer");
        // Читання тих самих 5 символів
        for (int i = 0; i < 5; i++) {
            System.out.println((char) byteBuffer.get());
        }
    }

    private static void getOutput(ByteBuffer byteBuffer) {
        int currentPosition = byteBuffer.position();
        int activeElePosition = byteBuffer.limit();
        int capacity = byteBuffer.capacity();
        System.out.println("position : " + currentPosition +
                ", limit : " + activeElePosition + ", capacity : " + capacity + "\n");
    }
}
