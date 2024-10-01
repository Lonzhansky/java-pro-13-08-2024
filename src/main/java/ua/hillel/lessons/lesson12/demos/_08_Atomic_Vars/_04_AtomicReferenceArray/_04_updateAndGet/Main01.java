package ua.hillel.lessons.lesson12.demos._08_Atomic_Vars._04_AtomicReferenceArray._04_updateAndGet;

import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.UnaryOperator;

// Метод updateAndGet() класу AtomicReferenceArray
// використовується для атомарного оновлення, яке
// оновлює поточне значення AtomicReferenceArray
// шляхом застосування зазначеної операції updateFunction
// до поточного значення.
// Він приймає як параметр об'єкт інтерфейсу
// updateFunction і застосовує вказану в об'єкті операцію
// до поточного значення.
// Повертає попереднє значення.
public class Main01 {

    public static void main(String[] args) {

        Integer[] arr = {5, 9, 12, 7, 32};

        AtomicReferenceArray<Integer> arr1
                = new AtomicReferenceArray<>(arr);

        System.out.println("The AtomicReferenceArray before update : "
                        + arr1);

        int index = 3;

        UnaryOperator<Integer> add = (u) ->
                Integer.parseInt(u.toString()) * 10;

        int value = arr1.updateAndGet(index, add);

        System.out.println("Updated value of index "
                + index + " is " + value);
        System.out.println("The AtomicReferenceArray after update: "
                + arr1);
    }
}
