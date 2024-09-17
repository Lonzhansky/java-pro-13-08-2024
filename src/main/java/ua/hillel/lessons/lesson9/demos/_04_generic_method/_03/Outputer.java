package ua.hillel.lessons.lesson9.demos._04_generic_method._03;

public class Outputer {
    // Узагальнений нестатичний метод, який має параметр
    // як масив узагальненого типу.
    public <T> void getOutput(T[] items) {
        // Цикл обробки масиву узагальненого типу
        for (T item : items) {
            System.out.print(item + " ");
        }
    }
}
