package ua.hillel.lessons.lesson9.demos._02_generic_class._03;

public class Account<T, S> {

    private T id;
    private S sum;

    Account(T id, S sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public S getSum() {
        return sum;
    }

    public void setSum(S sum) {
        this.sum = sum;
    }
}
