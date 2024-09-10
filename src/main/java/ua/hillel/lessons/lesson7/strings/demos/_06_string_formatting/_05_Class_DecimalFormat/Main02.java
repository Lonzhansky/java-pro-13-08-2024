package ua.hillel.lessons.lesson7.strings.demos._06_string_formatting._05_Class_DecimalFormat;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

// Групування цифр.
public class Main02 {

    public static void main(String[] args) {

        double num = 4582697456.523;

        DecimalFormat df = new DecimalFormat("#,###.###");
        // Метод DecimalFormat.setGroupingSize() встановлює,
        // скільки цифр цілої частини групувати.
        // Групи розділяються роздільником угруповання.
        df.setGroupingSize(3);

        String strNum = df.format(num);
        System.out.println("1) Result is " + strNum);

        // В конструкторі DecimalFormat зазначаємо
        // відповідний шаблон для форматування

        String strNum1 = new DecimalFormat("#,###.#").format(num);
        System.out.println("2) Result is " + strNum1);

        // Додаємо локаль

        String strNum2 = new DecimalFormat("#,###.#",
                new DecimalFormatSymbols(Locale.ENGLISH)).format(num);
        System.out.println("3) Result is " + strNum2);

        String strNum3 = new DecimalFormat("#,###.#",
                new DecimalFormatSymbols(Locale.GERMAN)).format(num);
        System.out.println("4) Result is " + strNum3);

    }
}
