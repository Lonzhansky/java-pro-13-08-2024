package ua.hillel.lessons.lesson7.strings.demos._06_string_formatting._05_Class_DecimalFormat;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

// Округлюємо значення
public class Main01 {

    public static void main(String[] args) {

        double quota = 301.235;
        double quota1 = 100;
        double price = 12.99;
        double cost = quota * price;
        double cost1 = quota1 * price;

        // В конструкторі DecimalFormat зазначаємо
        // відповідний шаблон для форматування

        String strCost = new DecimalFormat("#.##").format(cost);
        System.out.println("1) Non-rounded is " + cost + ", rounded is " + strCost);

        String strCost1 = new DecimalFormat("0.00").format(cost1);
        System.out.println("2) Non-rounded is " + cost1 + ", rounded is " + strCost1);

        // Додаємо локаль

        String strCost2 = new DecimalFormat("#.##",
                new DecimalFormatSymbols(Locale.ENGLISH)).format(cost);
        System.out.println("3) Non-rounded is " + cost + ", rounded is " + strCost2);

        String strCost3 = new DecimalFormat("0.00",
                new DecimalFormatSymbols(Locale.ENGLISH)).format(cost1);
        System.out.println("4) Non-rounded is " + cost1 + ", rounded is " + strCost3);

    }
}
