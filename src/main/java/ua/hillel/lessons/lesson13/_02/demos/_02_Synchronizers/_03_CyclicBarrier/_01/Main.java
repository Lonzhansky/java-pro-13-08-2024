package ua.hillel.lessons.lesson13._02.demos._02_Synchronizers._03_CyclicBarrier._01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CyclicBarrier;

public class Main {

    public static void main(String[] args) {

        List<Integer> dataList =
                Collections.synchronizedList(new ArrayList<>());

        // Ініціалізація CyclicBarrier значенням 3
        CyclicBarrier cb =
                new CyclicBarrier(3, new BarrierAction(dataList));

        // Запуск потоків
        for (int i = 0; i < 3; i++) {
            new Thread(new Worker(dataList, cb)).start();
        }
    }
}
