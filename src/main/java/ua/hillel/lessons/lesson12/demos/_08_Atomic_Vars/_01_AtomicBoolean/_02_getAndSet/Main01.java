package ua.hillel.lessons.lesson12.demos._08_Atomic_Vars._01_AtomicBoolean._02_getAndSet;

import java.util.concurrent.atomic.AtomicBoolean;

// Метод getAndSet(boolean newValue)
// атомарно встановлює задане значення та
// повертає попереднє значення.
public class Main01 {

    public static void main(String[] args) {
        // Можемо встановити значення в конструкті
        AtomicBoolean val = new AtomicBoolean(true);
        System.out.println("Initial value is " + val);
        // Перевіряємо, чи було попереднє значення true,
        // а потім оновлюємо його.
        // Якщо змінити порівнюване значення, оновлення не буде.
        boolean res = val.getAndSet(false);
        if (res) {
            System.out.println("Updated value is " + val +
                    "\nPrevious value is " + res);
        } else {
            System.out.println("The value was not updated");
        }
    }
}
