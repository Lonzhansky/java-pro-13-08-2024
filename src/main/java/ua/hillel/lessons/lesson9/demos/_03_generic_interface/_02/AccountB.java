package ua.hillel.lessons.lesson9.demos._03_generic_interface._02;

// Визначення узагальненого класу, який також
// використовує той самий універсальний параметр.
// Клас, що реалізує узагальнений інтерфейс,
// МАЄ бути узагальненим.
public class AccountB<T> implements IAccount<T> {

    private T id;
    private int sum;

    AccountB(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    @Override
    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    @Override
    public int getSum() {
        return sum;
    }

    @Override
    public void setSum(int sum) {
        this.sum = sum;
    }
}
