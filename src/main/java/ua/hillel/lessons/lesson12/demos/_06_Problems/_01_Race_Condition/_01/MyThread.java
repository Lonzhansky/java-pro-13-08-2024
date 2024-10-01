package ua.hillel.lessons.lesson12.demos._06_Problems._01_Race_Condition._01;

import java.util.Map;

// Цим потоком викликається метод DataHandler.checkThenAct,
// де дані обробляються
public class MyThread extends Thread {

    MyThread(String str) {
        super(str);
    }

    // Обробник
    DataHandler handler;
    // Дані для обробки
    Map<String, String> map;

    public void run() {
        // Обробляємо можливий ConcurrentModificationException
        try {
            System.out.println(Thread.currentThread().getName() + " " +
                    handler.checkThenAct(map));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
