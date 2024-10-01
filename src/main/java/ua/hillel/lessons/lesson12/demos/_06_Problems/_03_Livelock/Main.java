package ua.hillel.lessons.lesson12.demos._06_Problems._03_Livelock;

// Є два потоки - Клієнта та Магазину.
// Клієнт чекає відправлення замовлення, перш ніж платити гроші.
// Магазин готовий надіслати замовлення лише після отримання грошей.
// Таким чином, обидва потоки реагують на подію, але зайняті,
// якщо умова події не виконана.
// УВАГА. Програма запускається, але не завершується.
public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Shop shop = new Shop();
        Thread thread1 = new Thread(() ->
                customer.payMoney(shop));
        Thread thread2 = new Thread(() ->
                shop.shipOrder(customer));
        thread1.start();
        thread2.start();
    }
}
