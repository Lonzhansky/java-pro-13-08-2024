package ua.hillel.lessons.lesson12.demos._06_Problems._01_Race_Condition._01;

import java.util.Map;

// Створюємо два потоки, які намагаються обробити дані
// через один об'єкт обробника DataHandler, викликаючі
// метод DataHandler.checkThenAct, що може призводить до видалення
// однієї з пар ключ-значення з ключем, які потоки опрацьовують.
// При запуску програми декілька раз, можуть бути різні результати,
// що спиричиняються станом перегонів.
public class Main {

    public static void main(String[] args) {
        DataRepository repository = new DataRepository();
        DataHandler handler = new DataHandler();
        Map<String, String> map = repository.getData();

        MyThread thread01 = new MyThread("Thread 1");
        thread01.handler = handler;
        thread01.map = map;
        thread01.start();

        MyThread thread02 = new MyThread("Thread 2");
        thread02.handler = handler;
        thread02.map = map;
        thread02.start();
    }
}
