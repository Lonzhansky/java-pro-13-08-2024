package ua.hillel.lessons.lesson7.strings.demos._01_strings;

// replace() повертає рядок, що замінює
// усі старі символи char чи CharSequence
// на нові char або CharSequence.
//
// replaceAll() повертає рядок, що замінює
// всю послідовність символів, відповідних
// шаблону.
//
// replaceFirst() замінює перший підрядок рядка,
// який відповідає заданому регулярному виразу,
// заданою заміною.
public class String05Replace {

    static String str1;
    static String str2;

    public static void main(String[] args) {

        // Заміна символу
        str1 = "Sunny shop";
        str2 = str1.replace("S","B");
        System.out.println("1) " + str2);

        // Заміна послідовності символів
        str1 = "Orange is good";
        str2 = str1.replace("Orange","Apple");
        System.out.println("2) " + str2);

        // Заміна всіх символів за шаблоном
        str1 = "sunny shop";
        String a = "s";
        str2 = str1.replaceAll(a,"b");
        System.out.println("3) " + str2);

        // Заміна послідовності всіх символів за шаблоном
        str1 = "It's raining raining raining raining raining";
        str2 = str1.replaceAll("raining","sunny");
        System.out.println("4) " + str2);

        // Заміна першого підрядка
        str1 = "Sunny shop is good shop";
        str2 = str1.replaceFirst("shop","company");
        System.out.println("5) " + str2);

    }
}
