package ua.hillel.lessons.lesson7.regexes.demos._01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex04 {

    public static void main(String[] args) {

        // Створюємо шаблон для пошуку за жадібним квантифікатором
        Pattern pattern = Pattern.compile("sho*");

        // Шукаємо за шаблоном
        Matcher mtch = pattern.matcher("Sunny shop is a good shop");
        // Перевіряємо чи є шаблон чи ні через метод find()
        while (mtch.find())
            // Виводимо початковий та кінцевий індекси шаблону в тексті
            System.out.println("Pattern found from " + mtch.start() +
                    " to " + (mtch.end() - 1));
    }
}
