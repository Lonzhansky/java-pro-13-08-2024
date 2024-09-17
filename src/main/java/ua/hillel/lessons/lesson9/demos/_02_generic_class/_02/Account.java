package ua.hillel.lessons.lesson9.demos._02_generic_class._02;

// Конструктор. Узагальнення.
public class Account  {

    private String id;
    private int sum;

    <T> Account(T id, int sum) {
        this.id = id.toString();
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
