package ua.hillel.lessons.lesson7.strings.demos._01_strings;

import java.util.Arrays;

// split() - метод, який розбиває рядок на декілька рядків
// із заданим роздільником (шаблоном), який їх розділяє.
// Повернений об’єкт – масив, який містить розділені рядки.
// Можна також передати обмеження на кількість елементів у поверненому
// масиві.
// Якщо передається від'ємне число як обмеження, метод повертає масив,
// що містить усі елементи, які можна розділити за допомогою переданого
// розділювача.
// Якщо передається нуль як обмеження, split() поводиться так, ніби
// не передається жодного обмеження.
// Метод повертає масив, що містить усі елементи, які можна розділити
// за допомогою заданого шаблону, а кінцеві порожні рядки будуть
// відкинуті.
public class String16Split {

    public static void main(String[] args) {

        // # - роздільник
        String str = "Orange#is#very#good##";

        String[] strArr1 = str.split("#");
        System.out.println("1) " + Arrays.toString(strArr1));

        String[] strArr2 = str.split("#", 3);
        System.out.println("2) " + Arrays.toString(strArr2));

        String[] strArr3 = str.split("#", -2);
        System.out.println("3) " + Arrays.toString(strArr3));

        String[] strArr4 = str.split("#", 0);
        System.out.println("4) " + Arrays.toString(strArr4));

    }
}
