package ua.hillel.lessons.lesson9.demos._03_generic_interface._02;

// Узагальнений інтерфейс
interface IAccount<T> {
    T getId();
    int getSum();
    void setSum(int sum);
}
