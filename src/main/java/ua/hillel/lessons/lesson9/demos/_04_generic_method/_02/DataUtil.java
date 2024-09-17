package ua.hillel.lessons.lesson9.demos._04_generic_method._02;

public class DataUtil {
    // Узагальнений статичний метод
    // повертає певного типу значення
    public static <T> T getData(T data) {
        return data;
    }
}
