package ua.hillel.lessons.lesson13._02.demos._02_Synchronizers._04_Exchanger._01;

import java.util.concurrent.Exchanger;

class Producer implements Runnable {

    Exchanger<DataBuffer> exchanger;

    Producer(Exchanger<DataBuffer> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        DataBuffer producerBuffer = new DataBuffer();
        for (int i = 0; i < 3; i++) {
            producerBuffer.addToBuffer("Producer-" + i);
            try {
                if (producerBuffer.isFull()) {
                    // Обмін (exchange)
                    producerBuffer = exchanger.exchange(producerBuffer);
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
