package ua.hillel.lessons.lesson9.demos._05_generic_bounded_type._01;

// Як правило, параметр типу може приймати
// будь-які типи даних (крім примітивних типів).
// Однак, якщо ми хочемо використовувати універсальні
// шаблони лише деяких конкретних типів
// (наприклад, приймати дані числових типів), ми
// можемо використовувати обмежені типи.
// У разі обмежених типів ми використовуємо ключове
// слово extends.
class Outputer<T extends Number> {

    public void getOutput(T value) {
        System.out.println("Bounded type class. " +
                "Data is " + value);
    }
}
