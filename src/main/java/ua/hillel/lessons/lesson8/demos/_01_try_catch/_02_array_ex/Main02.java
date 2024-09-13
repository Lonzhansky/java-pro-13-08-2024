package ua.hillel.lessons.lesson8.demos._01_try_catch._02_array_ex;

// Маніпуляції з межами масиву
public class Main02 {

    public static void main(String[] args) {
        // Обробка винятку ArrayIndexOutOfBoundsException
        try {
            // Вхідний масив даних, який має індекси
            // з 0 по 3, включно
            int[] arr = {10, 31, 15, 7};  // 10 - 0, 31 - 1, 15 - 2, 7 - 3
            // Код, який може викликати виняток, оскільки
            // індекс за межами масиву
            System.out.println("Result is " + arr[8]);
        } catch(ArrayIndexOutOfBoundsException e) {
            // Повідомлення про виняток ArrayIndexOutOfBoundsException
            System.out.println("Exception: " + e.getMessage());
        }
        // Подальший код програми, який після обробки
        // винятку виконуватись буде
        System.out.println("Some code.");
    }
}
