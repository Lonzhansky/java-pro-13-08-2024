package ua.hillel.lessons.lesson9.demos._06_generic_wildcard._03;

import java.util.List;

// Знак підстановки з обмеженням зверху
// (Upper bounded wildcard)
// ? extends SuperType
// Найбільш наочніше пояснення - через колекції
// (тут, List)
public class Main01 {

    public static void main(String[] args) {
        // Створюємо об'єкт, який постачає вхідні данні
        DataProvider provider = new DataProvider();

        // Обробка об'єктів типу UserA1
        getOutput("UserA1 data:\n" + getData01(provider.getUserA1Data()));
        // Обробка об'єктів типу UserA
        getOutput("UserA data:\n" + getData01(provider.getUserAData()));
        // Не можемо обробити об'єкти типу User,
        // оскільки такий тип вище верхньої межи,
        // тобто класу UserA
//        getOutput("User data:\n" + getData01(provider.getUserData()));

        // Обробка об'єктів типу UserB1
        getOutput("UserB1 data:\n" + getData02(provider.getUserB1Data()));
        // Не можемо обробити об'єкти типу UserB,
        // оскільки такий тип вище верхньої межи,
        // тобто класу UserB1
//        getOutput("UserB data:\n" + getData02(provider.getUserBData()));
        // Не можемо обробити об'єкти типу User,
        // оскільки такий тип вище верхньої межи,
        // тобто класу UserB1
//        getOutput("User data:\n" + getData02(provider.getUserData()));
    }

    // List<? extends UserA> означає список об’єктів, які є екземплярами
    // класу UserA або його підкласу UserA1.
    // Параметр List<? extends UserA> list використовує знак підстановки
    // з обмеженням зверху, де UserA - верхня межа
    private static String getData01(List<? extends UserA> list) {
        StringBuilder builder = new StringBuilder();
        int count = 0;
        for (UserA user : list) {
            count++;
            builder.append(count).append(") ")
                    .append(user.toString()).append("\n");
        }
        return builder.toString();
    }

    // List<? extends UserB1> означає список об’єктів, які є екземплярами
    // класу UserB1.
    // Параметр List<? extends UserB1> list використовує знак підстановки
    // з обмеженням зверху, де UserB1 - верхня межа
    private static String getData02(List<? extends UserB1> list) {
        StringBuilder builder = new StringBuilder();
        int count = 0;
        for (UserB1 user : list) {
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
