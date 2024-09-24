package ua.hillel.lessons.lesson11.demos._01_nio._05_buff_remain;

import java.nio.ByteBuffer;

public class BufferRemaining {

    public static void main(String[] args) throws Exception {

        ByteBuffer byteBuffer = ByteBuffer.allocate(10);

        // Додаємо елементи до буфера
        byteBuffer.put((byte) 'A');
        byteBuffer.put((byte) 'B');
        byteBuffer.put((byte) 'C');
        byteBuffer.put((byte) 'D');
        byteBuffer.put((byte) 'E');

        int remainingEle = byteBuffer.remaining();
        System.out.println("position : " + byteBuffer.position() +
                ", limit : " + byteBuffer.limit() +
                "\nRemaining Elements : " + remainingEle);

        System.out.println("\nSetting the position to 0");
        byteBuffer.position(0);
        remainingEle = byteBuffer.remaining();
        System.out.println("position : " + byteBuffer.position() +
                ", limit : " + byteBuffer.limit() +
                "\nRemaining Elements : " + remainingEle);

        System.out.println("\nSetting the limit to 3");
        byteBuffer.limit(3);
        remainingEle = byteBuffer.remaining();
        System.out.println("position : " + byteBuffer.position() +
                ", limit : " + byteBuffer.limit() +
                "\nRemaining Elements : " + remainingEle);

    }
}
