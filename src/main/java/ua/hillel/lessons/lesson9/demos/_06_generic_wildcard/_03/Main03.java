package ua.hillel.lessons.lesson9.demos._06_generic_wildcard._03;

import java.util.List;

// Необмежений знак підстановки
// (Unbounded wildcard)
// Ніяких обмежень, які можуть встановлюватись
// певною ієрахією класів, немає.
// Найбільш наочніше пояснення - через колекції
// (тут, List)
public class Main03 {

    public static void main(String[] args) {
        // Створюємо об'єкт, який постачає вхідні данні
        DataProvider provider = new DataProvider();

        // Обробка об'єктів типу User
        getOutput("User data:\n" + getData(provider.getUserData()));

        // Обробка об'єктів типу Product
        getOutput("Product data:\n" + getData(provider.getProductData()));

    }

    // List<?> означає, що список типізовано будь-яким класом
    private static String getData(List<?> list) {
        StringBuilder builder = new StringBuilder();
        int count = 0;
        for (Object object : list) {
            count++;
            builder.append(count).append(") ")
                    .append(object.toString()).append("\n");
        }
        return builder.toString();
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
