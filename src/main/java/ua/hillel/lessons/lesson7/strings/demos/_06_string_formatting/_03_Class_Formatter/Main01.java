package ua.hillel.lessons.lesson7.strings.demos._06_string_formatting._03_Class_Formatter;

import java.util.Formatter;

// Використання Class Formatter
public class Main01 {

    public static void main(String[] args) {

        String productName = "orange";
        double quota = 1.23;
        double price = 2.99;
        double cost = quota * price;

        Formatter formatter = new Formatter();

        formatter.format("Product: %s,%nCost is EUR %.2f%n",
                productName, cost);

        System.out.println(formatter);
    }
}
