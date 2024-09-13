package ua.hillel.lessons.lesson8.demos._09_custom_exceptions._01._012;

import java.util.Scanner;

// Постачальник вхідних даних
public class DataProvider {

    // Надаємо можливість введення як літер, так і чисел
    public String getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input age: ");
        return scanner.nextLine().trim();
    }
}
