package ua.hillel.lessons.lesson8.demos._01_try_catch._01_arithm_ex;

// Застосування блоку catch
public class Main06 {

    public static void main(String[] args) {

        int a = 15;
        int b = 0;
        int c = 3;
        int result;

        // Обробка винятку
        try {
            // Код, який може викликати виняток
            result = a / b;
        } catch (Exception e) {
            // Застосування дій в блоці catch
            result = a / (b + c);
        }
        // Цей код буде виконаний, оскільки присутня обробка винятку
        // та дії при перехоплені
        System.out.println("Result is " + result);
        // Подальший код буде виконаний, оскільки присутня обробка винятку
        System.out.println("Some code.");
    }
}
