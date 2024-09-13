package ua.hillel.lessons.lesson8.demos._10_stacktrace;

import java.util.InputMismatchException;
import java.util.Scanner;

// Програма конвертації миль в кілометри.
// Повинні ввести число, а не, наприклад, рядок.
// Введення неправильного значення обробляється
// як виняток.
// InputMismatchException - виняток, який викидується
// Scanner при неправильному введенні.
// Також можемо вивести трасування стеку.
public class Main02 {

    public static void main(String[] args) {
        getOutput(convertMilesToKms(getData()));
    }

    private static double getData() {
        Scanner scanner = new Scanner(System.in);
        double miles = 0;
        System.out.print("Enter miles: ");
        // Обробка винятку через try-catch
        try {
            miles = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Wrong input!");
            // Або трасування стеку
//            e.printStackTrace();
        }
        return miles;
    }

    private static double convertMilesToKms(double miles) {
        return miles * 1.60934;
    }

    private static void getOutput(double result) {
        if (result > 0) System.out.printf("The result is %.1f kms", result);
        else System.exit(0);
    }
}
