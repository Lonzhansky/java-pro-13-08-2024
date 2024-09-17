package ua.hillel.lessons.lesson9.demos._06_generic_wildcard._03;

import java.util.List;

// Знак підстановки з обмеженням знизу
// (Lower bounded wildcard)
//  ? super SubType
// Найбільш наочніше пояснення - через колекції
// (тут, List, ArrayList)
public class Main02 {

    public static void main(String[] args) {
        // Створюємо об'єкт, який постачає вхідні данні
        DataProvider provider = new DataProvider();

        // Обробка об'єктів типу UserA1
        // Не можемо обробити об'єкти типу UserA1,
        // оскільки такий тип нижче нижньої межи,
        // тобто класу UserA
//        getOutput("UserA1 data:\n" + getData01(provider.getUserA1Data()));
        // Обробка об'єктів типу UserA
        getOutput("UserA data:\n" + getData01(provider.getUserAData()));
        // Обробка об'єктів типу User
        getOutput("User data:\n" + getData01(provider.getUserData()));

        // Обробка об'єктів типу UserB1
        getOutput("UserB1 data:\n" + getData02(provider.getUserB1Data()));
        // Обробка об'єктів типу UserB,
        // оскільки такий тип вище нижньої межи,
        // тобто класу UserB1
        getOutput("UserB data:\n" + getData02(provider.getUserBData()));
        // Обробка об'єктів типу User,
        // оскільки такий тип вище нижньої межи,
        // тобто класу UserB1
        getOutput("User data:\n" + getData02(provider.getUserData()));
    }

    // List<? super UserA> означає, що список типізовано або класом UserA,
    // або класом/класами, які вище за ієрархією класів.
    // Параметр List<? super UserA> list використовує знак підстановки
    // з обмеженням знизу, де UserA - нижня межа.
    // Можна використовувати екземпляри User або його підкласу UserA.
    private static String getData01(List<? super UserA> list) {
        StringBuilder builder = new StringBuilder();
        int count = 0;
        for (Object user : list) {
            count++;
            builder.append(count).append(") ")
                    .append(user.toString()).append("\n");
        }
        return builder.toString();
    }

    // List<? super UserB1> означає, що список типізовано класом UserB1.
    // або класом/класами, які вище за ієрархією класів.
    // Параметр List<? super UserB1> list використовує знак підстановки
    // з обмеженням знизу, де UserB1 - нижня межа.
    // Можна використовувати екземпляри User або UserB, або UserB1.
    private static String getData02(List<? super UserB1> list) {
        StringBuilder builder = new StringBuilder();
        int count = 0;
        for (Object user : list) {
            count++;
            builder.append(count).append(") ")
                    .append(user.toString()).append("\n");
        }
        return builder.toString();
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
