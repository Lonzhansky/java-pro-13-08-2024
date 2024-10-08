package ua.hillel.lessons.lesson13._02.demos._02_Synchronizers._04_Exchanger._01;

import java.util.concurrent.Exchanger;

public class Main {

    public static void main(String[] args) {
        Exchanger<DataBuffer> exchanger = new Exchanger<>();
        // Запуск потоків
        new Thread(new Producer(exchanger)).start();
        new Thread(new Consumer(exchanger)).start();
    }
}
