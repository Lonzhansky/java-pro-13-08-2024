package ua.hillel.lessons.lesson8.demos._01_try_catch._02_array_ex;

// Маніпуляції з межами масиву можуть викликати
// виняток ArrayIndexOutOfBoundsException
public class Main01 {

    public static void main(String[] args) {
        // Вхідний масив даних, який має індекси
        // з 0 по 3, включно
        int[] arr = {10, 31, 15, 7};
        // Код, який може викликати виняток, оскільки
        // індекс за межами масиву
        System.out.println("Result is " + arr[8]);
        // Подальший код програми, який після викиду
        // винятка виконуватись не буде
        System.out.println("Some code.");
    }
}
