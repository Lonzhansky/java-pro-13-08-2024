package ua.hillel.lessons.lesson11.demos._01_nio._04_buff_clear_flip_rewind;

import java.io.IOException;
import java.nio.ByteBuffer;

public class BufferFlipClear {

    public static void main(String[] args) throws IOException {

        int bufferCapacity = 10;
        ByteBuffer byteBuffer = ByteBuffer.allocate(bufferCapacity);

        String message = String.format("Bytebuffer is initialized " +
                "with capcity %d", bufferCapacity);
        getInfo(message, byteBuffer);

        byteBuffer.put((byte) 64);
        byteBuffer.put((byte) 65);
        byteBuffer.put((byte) 66);

        message = String.format("\nInserted %d elements", 3);
        getInfo(message, byteBuffer);

        byteBuffer.put((byte) 67);
        byteBuffer.put((byte) 68);

        message = String.format("\nInserted %d more elements", 2);
        getInfo(message, byteBuffer);

        byteBuffer.flip();
        message = "\nFlipping the buffer";
        getInfo(message, byteBuffer);

        byteBuffer.clear();
        message = "\nClearning the buffer";
        getInfo(message, byteBuffer);
    }

    private static void getInfo(String message, ByteBuffer byteBuffer) {
        System.out.printf("%s%nLimit : %d%nCapacity : %d%nPosition : %d%n",
                message, byteBuffer.limit(), byteBuffer.capacity(),  byteBuffer.position());
    }
}
