package ua.hillel.lessons.lesson11.demos._01_nio._04_buff_clear_flip_rewind;

import java.nio.ByteBuffer;

public class BufferRewind {

    private static final String ALPHABETS = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) throws Exception {

        ByteBuffer byteBuffer = ByteBuffer.allocate(50);
        System.out.println("Before inserting the data into buffer");
        getOutput(byteBuffer);

        for (int i = 0; i < ALPHABETS.length(); i++) {
            byteBuffer.put((byte) ALPHABETS.charAt(i));
        }
        System.out.println("After inserting 26 characters " +
                "into the buffer");
        getOutput(byteBuffer);

        byteBuffer.flip();
        System.out.println("After flip");
        getOutput(byteBuffer);
        byteBuffer.position(15);
        getOutput(byteBuffer);
        byteBuffer.rewind();

        System.out.println("After calling rewind() api " +
                "on the buffer");
        getOutput(byteBuffer);
    }

    private static void getOutput(ByteBuffer byteBuffer) {
        int currentPosition = byteBuffer.position();
        int activeElePosition = byteBuffer.limit();
        int capacity = byteBuffer.capacity();
        System.out.println("position : " + currentPosition + ", limit : " +
                activeElePosition + ", capacity : " + capacity + "\n");
    }
}
