package ua.hillel.lessons.lesson9.demos._03_generic_interface._02;

// Клас реалізує інтерфейс із узагальненням.
// Неузагальнений клас може використовуватись,
// якщо конкретний параметризований тип
// надається з інтерфейсом під час реалізації.
class AccountA implements IAccount<String> {

    private String id;
    private int sum;

    AccountA(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
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
