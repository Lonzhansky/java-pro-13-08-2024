package ua.hillel.lessons.lesson12.demos._08_Atomic_Vars._04_AtomicReferenceArray._01_set;

import java.util.concurrent.atomic.AtomicReferenceArray;

// Метод set() класу AtomicReferenceArray використовується
// для встановлення значення елемента з індексом i у нове значення.
// Індекс i та значення і передаються методу як параметри.
// Цей метод встановлює значення з семантикою пам'яті читання,
// ніби змінна була оголошена змінним типом volatile.
public class Main01 {

    public static void main(String[] args) {

        AtomicReferenceArray<String> arr
                = new AtomicReferenceArray<>(5);

        arr.set(0, "orange");
        arr.set(1, "plum");
        arr.set(2, "apple");
        arr.set(3, "banana");
        arr.set(4, "strawberry");

        for (int i = 0; i < 5; i++) {
            System.out.println(arr.get(i));
        }
    }
}
