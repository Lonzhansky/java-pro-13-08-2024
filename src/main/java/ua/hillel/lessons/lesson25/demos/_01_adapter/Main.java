package ua.hillel.lessons.lesson25.demos._01_adapter;

public class Main {

    public static void main(String[] args) {
        // Об'єкт машини створюємо через
        // конструктор, який приймає об'єкт адаптера
        Machine machine = new Machine(new DetailBAdapter());
        machine.workA();
    }
}