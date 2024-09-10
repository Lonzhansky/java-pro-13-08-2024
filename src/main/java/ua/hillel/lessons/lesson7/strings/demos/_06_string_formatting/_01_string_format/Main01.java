package ua.hillel.lessons.lesson7.strings.demos._06_string_formatting._01_string_format;

import java.util.Locale;

// Застосування String.format()
public class Main01 {

    public static void main(String[] args) {

        // Вхідні дані
        String productName = "orange";
        double weight = 1.325;
        double price = 2.99;
        double cost = weight * price;

        // Застосовано синтаксис
        // public static String format(String format, Object... args),
        // де "1) Product: %s, cost is EUR %.2f" є String format,
        // а productName, price є Object... args.
        // Специфікатори:
        // %s - рядкове значення;
        // %.2f - використаний специфікатор %f (десяткове число
        // з плаваючою комою), який округлюється до 2-х знаків після
        // десяткового роздільника.
        String frmtStr1 = String.format(
                "1) Product: %s, cost is EUR %.2f",
                productName, cost
        );
        System.out.println(frmtStr1);

        // Застосовано синтаксис
        // public static String format(Locale l, String format, Object... args),
        // де Locale.ENGLISH є Locale loc,
        // "2) Product: %s, cost is GBP %.2f" є String format,
        // а productName, price є Object... args.
        // Специфікатори:
        // %s - рядкове значення;
        // %.2f - використаний специфікатор %f (десяткове число
        // з плаваючою комою), який округлюється до 2-х знаків після
        // десяткового роздільника.
        String frmtStr2 = String.format(
                Locale.ENGLISH,
                "2) Product: %s, cost is GBP %.2f",
                productName, cost
        );
        System.out.println(frmtStr2);

        // Застосування %n для перенесення рядків
        String frmtStr3 = String.format(
                "%n3) Product:%nname is %s,%ncost is EUR %.2f%n",
                productName, cost
        );
        System.out.println(frmtStr3);

    }
}
