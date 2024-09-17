package ua.hillel.lessons.lesson9.demos._04_generic_method._01;

public class InfoUtil {
    // Узагальнений нестатичний метод
    // повертає String значення
    public <T> String getInfo(T info) {
        return "Info: " + info;
    }
}
