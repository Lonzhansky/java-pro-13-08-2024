package ua.hillel.lessons.lesson9.demos._05_generic_bounded_type._02;

// Як правило, параметр типу може приймати
// будь-які типи даних (крім примітивних типів).
// Однак, якщо ми хочемо використовувати універсальні
// шаблони лише деяких конкретних типів, ми можемо
// використовувати обмежені типи.
// У разі обмежених типів ми використовуємо ключове
// слово extends.
class Outputer<T extends User> {

    public void getOutput(T user) {
        System.out.println("Data: " + user);
    }
}
