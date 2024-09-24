package ua.hillel.lessons.lesson11.demos._01_nio._04_buff_clear_flip_rewind;

import java.nio.ByteBuffer;

public class BufferClear {

    private static final String ALPHABETS = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) throws Exception {
        // Новий ByteBuffer
        ByteBuffer byteBuffer = ByteBuffer.allocate(36);
        System.out.println("Before inserting the data into buffer");
        getOutput(byteBuffer);

        for (int i = 0; i < ALPHABETS.length(); i++) {
            byteBuffer.put((byte) ALPHABETS.charAt(i));
        }

        System.out.println("After inserting 26 characters into the buffer");
        getOutput(byteBuffer);

        // Очистка буферу
        byteBuffer.clear();


        System.out.println("After calling clear() api on the buffer");
        getOutput(byteBuffer);

        System.out.println("Setting the limit to 10");
        byteBuffer.limit(10);
        getOutput(byteBuffer);

        // Очистка буферу
        byteBuffer.clear();

        System.out.println("After calling clear() api on the buffer");
        getOutput(byteBuffer);

    }

    private static void getOutput(ByteBuffer byteBuffer) {
        int currentPosition = byteBuffer.position();
        int activeElePosition = byteBuffer.limit();
        System.out.println("position : " + currentPosition +
                ", limit : " + activeElePosition + "\n");
    }
}
