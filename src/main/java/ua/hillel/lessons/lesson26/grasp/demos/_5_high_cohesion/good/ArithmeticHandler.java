package ua.hillel.lessons.lesson26.grasp.demos._5_high_cohesion.good;

// Клас фокусується на одній роботі
public class ArithmeticHandler {
    // Метод складання 2-х чисел
    public void addNums(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
}
