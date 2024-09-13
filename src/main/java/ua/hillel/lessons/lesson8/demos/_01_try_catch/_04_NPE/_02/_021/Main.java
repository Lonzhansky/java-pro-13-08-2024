package ua.hillel.lessons.lesson8.demos._01_try_catch._04_NPE._02._021;

// Приклад NullPointerException (без обробки)
public class Main {

    public static void main(String[] args) {
        String productName;
        // Створюємо об'єкт магазину
        Store store = new Store();
        // Намагаємося отримати назву товару, який, МОЖЛИВО,
        // має бути в магазині, але, насправді його немає,
        // оскільки об'єкт товару не створено.
        // Тому цей рядок коду МАЄ викининути NullPointerException
        productName = store.getProduct().getName();
        // Цей код не виконуєтся, оскільки викидається виняток
        System.out.println("Product: " + productName);
    }
}
