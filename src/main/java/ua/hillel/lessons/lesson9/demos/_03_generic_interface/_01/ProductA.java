package ua.hillel.lessons.lesson9.demos._03_generic_interface._01;

// Клас, що реалізує узагальнений інтерфейс,
// МАЄ бути узагальненим.
public class ProductA<T> implements IProduct<T> {

    T name;

    @Override
    public void setName(T name) {
        this.name = name;
    }

    @Override
    public T getName() {
        return name;
    }
}
