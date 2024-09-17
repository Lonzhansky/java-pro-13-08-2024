package ua.hillel.lessons.lesson9.demos._06_generic_wildcard._02;

import java.util.Arrays;
import java.util.List;

// Знак підстановки з обмеженням знизу
// (Lower bounded wildcard)
//  ? super  SubType
// Найбільш наочніше пояснення - через колекції
// (тут, List, ArrayList)
public class Main02 {

    public static void main(String[] args) {

        // Використання колекції з типом Double
        List<Double> list01 = Arrays.asList(5.95, 12.75, 3.26);
        System.out.print("Double data: ");
        getNums(list01);

        // Використання колекції з типом Number
        List<Number> list02 = Arrays.asList(12, 9, 15);
        System.out.print("Number data: ");
        getNums(list02);

        // Не можемо використати колекцію з типом Integer,
        // оскільки клас Integer - не є суперкласом для класу Double
//        List<Integer> list03 = Arrays.asList(12, 9, 15);
//        System.out.print("Integer data: ");
//        getNums(list03);
    }

    // List<? super Double> означає, що список типізовано або класом Double,
    // або його суперкласом Number.
    // Параметр List<? super Double> list використовує знак підстановки
    // з обмеженням знизу, де Double - нижня межа
    // Можна використовувати екземпляри Number або його підкласу Double.
    private static void getNums(List<? super Double> list) {
        System.out.println(list);
    }
}
