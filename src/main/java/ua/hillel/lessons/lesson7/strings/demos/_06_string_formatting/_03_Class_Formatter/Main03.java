package ua.hillel.lessons.lesson7.strings.demos._06_string_formatting._03_Class_Formatter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Formatter;

// Class Formatter працює з Class StringBuilder
public class Main03 {

    public static void main(String[] args) {

        String[] products = new String[] {"orange", "apple", "mango", "kiwi"};
        StringBuilder builder = new StringBuilder();
        Formatter formatter = new Formatter(builder);
        int count = 0;

        formatter.format("List for %tD %tT:%n",
                LocalDate.now(), LocalTime.now());

        for (String item : products) {
            count++;
            builder.append(count).append(") ")
                    .append(item).append("\n");
        }

        System.out.println(builder);
    }
}
