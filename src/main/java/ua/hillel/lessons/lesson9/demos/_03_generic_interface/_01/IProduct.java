package ua.hillel.lessons.lesson9.demos._03_generic_interface._01;

// Узагальнений інтерфейс
public interface IProduct<T> {
    void setName(T name);
    T getName();
}
