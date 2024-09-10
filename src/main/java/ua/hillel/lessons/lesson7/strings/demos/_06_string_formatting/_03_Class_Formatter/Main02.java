package ua.hillel.lessons.lesson7.strings.demos._06_string_formatting._03_Class_Formatter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Formatter;

// Використання Class Formatter
public class Main02 {

    public static void main(String[] args) {

        Formatter formatter = new Formatter();

        formatter.format("Date is %tD and time is %tT",
                LocalDate.now(), LocalTime.now());

        System.out.println(formatter);
    }
}
