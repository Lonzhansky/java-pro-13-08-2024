package ua.hillel.lessons.lesson8.demos._10_stacktrace;

import java.util.Scanner;

// Програма конвертації миль в кілометри.
// Повинні ввести число, а не, наприклад, рядок.
// При введенні неправильного значення, отримаємо
// виняткову ситуацію з виведенням стеку.
public class Main01 {

    public static void main(String[] args) {
        getOutput(convertMilesToKms(getData()));
    }

    private static double getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter kms: ");
        return scanner.nextDouble();
    }

    private static double convertMilesToKms(double miles) {
        return miles * 1.60934;
    }

    private static void getOutput(double result) {
        System.out.printf("The result is %.1f kms", result);
    }
}
