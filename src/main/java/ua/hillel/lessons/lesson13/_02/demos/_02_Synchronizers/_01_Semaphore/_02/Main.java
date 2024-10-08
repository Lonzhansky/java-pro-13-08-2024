package ua.hillel.lessons.lesson13._02.demos._02_Synchronizers._01_Semaphore._02;

// У будь-який момент часу тільки 2 потоки можуть
// отримати семафор і зняти гроші.
// Якщо потік не може отримати семафор, він блокується
// до тих пір, поки один із потоків, який захопив семафор,
// не звільнить його.
// Так семафори можна використовувати для захисту більш ніж однієї
// копії загального ресурсу, яким тут є банкомат.
public class Main {

    public static void main(String[] args) {

        ATMArray atmArray = new ATMArray();

        Thread[] thread = new Thread[5];

        for (int i = 0; i < 5; i++) {
            thread[i] = new Thread(
                    new WithdrawMoneyTask(atmArray),
                    "Thread " + i);
        }

        for (int i = 0; i < 5; i++) {
            thread[i].start();
        }
    }
}
