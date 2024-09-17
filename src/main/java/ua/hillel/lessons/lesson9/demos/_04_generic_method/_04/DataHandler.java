package ua.hillel.lessons.lesson9.demos._04_generic_method._04;

public class DataHandler {
    // Узагальнений нестатичний метод, який має параметр
    // як масив узагальненого типу та повертає String значення
    public <T> String handleData(T[] items) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        // Цикл обробки масиву узагальненого типу
        for (T item : items) {
            count++;
            sb.append(count).append(") ")
                    .append(item).append("\n");
        }
        return sb.toString();
    }
}
