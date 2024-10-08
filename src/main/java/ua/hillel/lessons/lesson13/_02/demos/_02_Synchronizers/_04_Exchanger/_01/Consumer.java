package ua.hillel.lessons.lesson13._02.demos._02_Synchronizers._04_Exchanger._01;

import java.util.concurrent.Exchanger;

class Consumer implements Runnable {

    Exchanger<DataBuffer> exchanger;

    Consumer(Exchanger<DataBuffer> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        DataBuffer consumerBuffer = new DataBuffer();
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("waiting...");
                consumerBuffer = exchanger.exchange(consumerBuffer);
                System.out.println("Received- " +
                        consumerBuffer.getData());
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
