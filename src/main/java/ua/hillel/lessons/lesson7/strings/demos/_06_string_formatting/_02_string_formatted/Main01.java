package ua.hillel.lessons.lesson7.strings.demos._06_string_formatting._02_string_formatted;

import java.time.LocalDate;
import java.time.LocalTime;

// Застосування String.formatted().
// Можливо з Java 15!
public class Main01 {

    public static void main(String[] args) {

        // Вхідні дані
        String productName = "orange";
        double weight = 1.325;
        double price = 2.99;
        double cost = weight * price;

        // %.2f - округлення до 2-х знаків після десяткового роздільника.
        String strPtrn1 = "1) Product: %s, cost is EUR %.2f";
        String frmtedStr1 = strPtrn1.formatted(productName, cost);
        System.out.println(frmtedStr1);

        String strPtrn2 = "2) Date is %tD and time is %tT";
        String frmtedStr2 = strPtrn2.formatted(LocalDate.now(), LocalTime.now());
        System.out.println(frmtedStr2);

        // Безпосередньо на рядковому значенні
        // %.2f - округлення до 2-х знаків після десяткового роздільника.
        String frmtedStr3 = "3) Product: %s, cost is EUR %.2f".formatted(productName, cost);
        System.out.println(frmtedStr3);

    }
}
