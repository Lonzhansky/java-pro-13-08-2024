package ua.hillel.lessons.lesson13._02.demos._02_Synchronizers._01_Semaphore._02;

import java.util.Arrays;
import java.util.concurrent.Semaphore;

public class ATMArray {

    private final Semaphore semaphore;
    // Логічний масив, який ініціалізується
    // значенням true у конструкторі, вказуючи,
    // що обидва банкомати спочатку вільні
    private final boolean[] freeAtms;

    public ATMArray() {
        semaphore = new Semaphore(2);
        freeAtms = new boolean[2];
        Arrays.fill(freeAtms, true);
    }

    // Тут спочатку отримуємо семафор, а потім перевіряємо,
    // який банкомат вільний. Це робиться через getAvailableATM().
    // Існує ймовірність того, що 2 потоки можуть
    // отримати семафор, увійти до цього блоку коду і змінити змінну
    // загального ресурсу freeAtms.
    // Таким чином, код для перевірки доступних банкоматів
    // та позначення їх як зайнятих перебуває у синхронізованому
    // блоці.
    public void withDrawMoney() {

        try {
            // Спроба отримати семафор.
            // Якщо нічого не доступно, потік тут заблокується
            // доки семафор не стане доступним
            semaphore.acquire();

            // Перевіряємо доступний банкомат
            int atmMachine = getAvailableATM();

            // Оскільки банкомат доступний для зняття
            // грошей, отримуємо семафор
            System.out.println(
                    Thread.currentThread().getName()
                            + ": Withdrawing money from ATM "
                            + atmMachine +
                            "\n---------------------------------");

            Thread.sleep((long) (Math.random() * 1000));

            System.out.println(
                    Thread.currentThread().getName()
                            + ": Done withdrawing money");

            releaseATM(atmMachine);

            System.out.printf("ATM %s is now available%n",
                    atmMachine);

            System.out.println("---------------------------------");

            System.out.println("About to release the semaphore");

            semaphore.release();

            System.out.println("Semaphore released");
        }

        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Як тільки знаходимо доступний банкомат, знімаємо гроші.
    // Як тільки гроші знято, звільняємо банкомат за допомогою
    // методу releaseATM(atmNumber).
    // Цей код також синхронізований, щоб гарантувати,
    // що тільки один потік входить у цей блок і змінює логічний
    // масив freeAtms.
    // Потім звільняємо семафор для інших очікуваних потоків
    // для отримання та зняття грошей залежно від доступного
    // банкомату.
    private void releaseATM(int atmNumber) {
        // Робимо певний банкомат
        // вільним від використання
        synchronized (freeAtms) {
            freeAtms[atmNumber] = true;
        }
    }

    private int getAvailableATM() {

        int freeAtm = -1;

        // Ми використовуємо synchronized, щоб гарантувати,
        // що тільки один потік може отримати доступ
        // і змінити загальний boolean array freeAtms
        synchronized (freeAtms) {

            for (int i = 0; i < freeAtms.length; i++) {
                if (freeAtms[i]) {
                    freeAtms[i] = false;
                    freeAtm = i;
                    break;
                }
            }
        }

        return freeAtm;
    }
}
