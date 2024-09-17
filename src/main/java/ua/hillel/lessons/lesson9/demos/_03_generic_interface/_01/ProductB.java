package ua.hillel.lessons.lesson9.demos._03_generic_interface._01;

// Неузагальнений клас може використовуватись,
// якщо конкретний параметризований тип
// надається з інтерфейсом під час реалізації.
public class ProductB implements IProduct<String> {

    String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
