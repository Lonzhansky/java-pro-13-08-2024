package ua.hillel.lessons.lesson7.strings.demos._06_string_formatting._04_string_printf;

import java.time.LocalDate;

// Використання System.out.printf()
public class Main01 {

    public static void main(String[] args) {

        String firstName = "Alice";
        String lastName = "Terra";
        String email = "alice@mail.com";

        String productName = "orange";
        double quota = 1.23;
        double price = 2.99;
        double cost = quota * price;

        System.out.printf("1) User: %s %s, email: %s%n",
                firstName, lastName, email);

        System.out.printf("2) Product: %s,%nCost is EUR %.2f%n",
                productName, cost);

        System.out.printf("3) Today date is %tD%n", LocalDate.now());

    }
}
