package ua.hillel.lessons.lesson12.demos._06_Problems._01_Race_Condition._02;

// Стан перегонів опрацьовано.
// В критичній секції збільшується загальна цілочисленна змінна
// і відображається її значення.
// Створюється 6-ть потоків, і кожен потік збільшує,
// а потім відображає значення змінної.
// Очікувана поведінка полягає в тому, що кожен потік має
// отримати унікальне значення від 1 до 6.
// Синхронізація виклику методу повинна уникнути стану перегонів.
// Використання синхронізації гарантує, що модифікація змінної
// в одному потоці виконується без втручання інших потоків.
// При декількох запусках програми, потоки отримують УНІКАЛЬНЕ значення.
public class Main02 {

    int counter;

    public static void main(String[] args) {

        Main02 main02 = new Main02();

        for (int i = 1; i <= 6; i++) {
            new Thread(() -> {
                synchronized (main02) {
                    main02.incrementCounter();
                    System.out.println(Thread.currentThread().getName()
                            + " get value " + main02.getCounter());
                }
            }).start();
        }
    }

    public void incrementCounter() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
