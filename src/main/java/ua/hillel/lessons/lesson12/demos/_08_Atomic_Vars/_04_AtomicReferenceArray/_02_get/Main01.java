package ua.hillel.lessons.lesson12.demos._08_Atomic_Vars._04_AtomicReferenceArray._02_get;

import java.util.concurrent.atomic.AtomicReferenceArray;

// Метод get() класу AtomicReferenceArray використовується
// для повернення значення елемента з індексом i для цього
// об'єкта AtomicReferenceArray з семантикою читання пам'яті,
// ніби змінна index була оголошена змінним типом volatile.
public class Main01 {

    public static void main(String[] args) {

        AtomicReferenceArray<String> arr
                = new AtomicReferenceArray<>(4);

        arr.set(0, "orange");
        arr.set(1, "apple");
        arr.set(2, "banana");
        arr.set(3, "plum");

        for (int i = 0; i < 2; i++) {
            String value = arr.get(i);
            System.out.println("value at " + i + " = " + value);
        }
    }
}
