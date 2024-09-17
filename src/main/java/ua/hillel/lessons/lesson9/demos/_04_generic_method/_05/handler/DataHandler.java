package ua.hillel.lessons.lesson9.demos._04_generic_method._05.handler;

public class DataHandler {
    // Узагальнений нестатичний метод, який має параметр
    // як масив узагальненого типу та повертає String значення
    public <T> String handleData(T[] items) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        // Цикл обробки масиву узагальненого типу
        for (T item : items) {
            count++;
            sb.append(String.format("%d) %s%n", count, item.toString()));
        }
        return sb.toString();
    }
}
