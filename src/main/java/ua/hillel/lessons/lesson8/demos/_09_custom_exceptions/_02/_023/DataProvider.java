package ua.hillel.lessons.lesson8.demos._09_custom_exceptions._02._023;

import java.util.Scanner;

// Постачальник вхідних даних
public class DataProvider {

    // Надаємо можливість введення як літер, так і чисел
    public String getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input quota (from 1 to 3, inclusive): ");
        return scanner.nextLine().trim();
    }
}
