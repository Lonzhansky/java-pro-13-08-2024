package ua.hillel.lessons.lesson12.demos._05_Thread_stop;

import java.util.ArrayList;
import java.util.List;

/*
    Реальний приклад проблеми, спричиненої використанням методу thread.stop().
    У вас виникне ConcurrentModificationException,
    який виникає, коли один потік змінює колекцію під час її ітерації іншим потоком.
    Це трапляється через некоректну зупинку потоку та паралельний доступ до спільного ресурсу.

    Що сталося?
    Потік writerThread додає елементи до списку, викликаючи метод addData().
    Потік readerThread періодично отримує дані зі списку та намагається їх вивести.
    Коли він викликає resource.getData(), він намагається ітерувати список і вивести його в консоль.
    В той же час writerThread змінює список, додаючи нові елементи.
    Зупинка writerThread за допомогою thread.stop() спричинила те, що потік був примусово зупинений під час операції
    додавання, яка змінила колекцію, але не встигла завершитися.
    Паралельно readerThread ітерує список і натрапляє на зміну колекції,
    що призводить до ConcurrentModificationException.

    Пояснення помилки:
    ConcurrentModificationException виникає, коли один потік змінює колекцію, в той час як інший потік ітерує її,
    не очікуючи таких змін. У цьому випадку:
    Потік, що читає (readerThread), намагався виконати ітерацію по списку, використовуючи метод toString(),
    який не є синхронізованим, і в цей момент потік, що пише (writerThread), продовжував змінювати список.
    Потік був зупинений у "небезпечний момент", що призвело до неочікуваних змін в колекції,
    яку намагається читати інший потік.

*/

class SharedResource {
    private List<String> data = new ArrayList<>();

    // Синхронізований метод для додавання даних
    public synchronized void addData(String value) {
        System.out.println("Додаємо: " + value);
        data.add(value);

        // Симулюємо довгу операцію для підвищення шансів на зупинку в небезпечний момент
        try {
            Thread.sleep(200); // Затримка
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Дані додані: " + data);
    }

    // Синхронізований метод для отримання даних
    public synchronized List<String> getData() {
        return data;
    }
}

public class UnsafeStopExample {
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();

//        // Потік, що додає дані
//        Thread writerThread = new Thread(() -> {
//            for (int i = 0; i < 5; i++) {
//                resource.addData("Елемент " + i);
//            }
//        });

        // Потік, що зчитує дані
//        Thread readerThread = new Thread(() -> {
//            while (true) {
//                System.out.println("Стан даних: " + resource.getData());
//                try {
//                    Thread.sleep(300);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });

        WriterThread writerThread = new WriterThread(resource);
        ReaderThread readerThread = new ReaderThread(resource);

        writerThread.start();
        readerThread.start();

        // Даємо трохи часу для виконання
        Thread.sleep(700);

        // Примусово зупиняємо потік, який додає дані
        writerThread.stop();
        System.out.println("Потік запису зупинено.");

        // Даємо трохи часу для виведення даних після зупинки потоку
        Thread.sleep(1000);

        // Зупиняємо потік читання
        readerThread.stop();
        System.out.println("Потік читання зупинено.");

        // Виводимо остаточний стан даних
        System.out.println("Остаточний стан даних: " + resource.getData());
    }
}