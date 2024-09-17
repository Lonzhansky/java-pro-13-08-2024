package ua.hillel.lessons.lesson9.demos._04_generic_method._01;

public class DataUtil {
    // Узагальнений статичний метод
    // повертає String значення
    public static <T> String getData(T data) {
        return "Data: " + data;
    }
}
