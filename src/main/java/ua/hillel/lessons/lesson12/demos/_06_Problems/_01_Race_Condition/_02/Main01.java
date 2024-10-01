package ua.hillel.lessons.lesson12.demos._06_Problems._01_Race_Condition._02;

// Стан перегонів.
// В критичній секції збільшується загальна цілочисленна змінна
// і відображається її значення.
// Створюється 6-ть потоків, і кожен потік збільшує,
// а потім відображає значення змінної.
// Очікувана поведінка полягає в тому, що кожен потік має
// отримати унікальне значення від 1 до 6, АЛЕ не виходить.
// При декількох запусках програми, результат може бути різним,
// однак потоки НЕ отримують унікальне значення.
public class Main01 {

    int counter = 0;

    public static void main(String[] args) {

        Main01 main01 = new Main01();

        for (int i = 1; i <= 6; i++) {
            new Thread(() -> {
                main01.incrementCounter();
                // Зміна та виведення змінної
                System.out.println(Thread.currentThread().getName()
                        + " get value " + main01.getCounter());
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
