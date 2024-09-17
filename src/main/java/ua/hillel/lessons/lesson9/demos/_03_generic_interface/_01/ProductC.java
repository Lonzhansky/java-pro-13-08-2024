package ua.hillel.lessons.lesson9.demos._03_generic_interface._01;

// Узагальнений клас, що реалізує узагальнений інтерфейс,
// може мати інші параметри параметризованого типу.
public class ProductC<T, U> implements IProduct<T> {

    T name;
    U quantity;

//    public ProductC(T name, U quantity) {
//        this.name = name;
//        this.quantity = quantity;
//    }

    @Override
    public void setName(T name) {
        this.name = name;
    }

    @Override
    public T getName() {
        return name;
    }

    public void setQuantity(U quantity) {
        this.quantity = quantity;
    }

    public U getQuantity() {
        return quantity;
    }

}
