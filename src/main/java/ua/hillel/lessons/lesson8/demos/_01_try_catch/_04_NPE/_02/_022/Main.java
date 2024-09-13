package ua.hillel.lessons.lesson8.demos._01_try_catch._04_NPE._02._022;

// Приклад NullPointerException (з обробкою)
public class Main {

    public static void main(String[] args) {
        String productName = "unknown";
        // Створюємо об'єкт магазину
        Store store = new Store();
        // Обробляємо виняток через try-catch
        try {
            // Намагаємося отримати назву товару, який, МОЖЛИВО,
            // має бути в магазині, але, насправді його немає,
            // оскільки об'єкт товару не створено.
            // Тому цей рядок коду МАЄ викинути NullPointerException
            productName = store.getProduct().getName();
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        // Цей код виконуєтся, оскільки виняток оброблюється,
        // але назва товару не виводиться
        System.out.println("Product: " + productName);
    }

}
