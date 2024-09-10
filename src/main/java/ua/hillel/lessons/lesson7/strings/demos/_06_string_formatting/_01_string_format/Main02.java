package ua.hillel.lessons.lesson7.strings.demos._06_string_formatting._01_string_format;

import java.util.Locale;

// Рядкове форматування чисел
public class Main02 {

    public static void main(String[] args) {

        // Вхідні дані
        int num1 = 47;
        float num2 = 17.582f;
        double num3 = 42896742.365d;

        // Формат як вісімкове число
        String strOct = String.format("1) num in octal: %o", num1);
        System.out.println(strOct);

        // Формат як шістнадцяткове число
        String strHex1 = String.format("2) num in hexadecimal: %x", num1);
        System.out.println(strHex1);
        String strHex2 = String.format("3) num in hexadecimal: %X", num1);
        System.out.println(strHex2);

        // Формат як рядки
        String strStr1 = String.format("4) num as string: %s", num1);
        System.out.println(strStr1);
        String strStr2 = String.format("5) num as string: %s", num2);
        System.out.println(strStr2);

        // Формат як наукова нотація
        String strSci = String.format("6) num in scientific notation: %g", num3);
        System.out.println(strSci);

        // Формат чисел з десятковим дробом з округленням.
        // %.2f - округлення до 2-х знаків після десяткового роздільника.
        // %.3f - округлення до 3-х знаків після десяткового роздільника.
        double num4 = 87.36752;
        double num5 = 12.2491;
        String strDecim = String.format("7) Result: %.3f and %.2f", num4, num5);
        System.out.println(strDecim);
        // Застосування локалі
        String strDecim1 = String.format(Locale.ENGLISH,
                "8) Result: %.3f and %.2f", num4, num5);
        System.out.println(strDecim1);

    }
}
