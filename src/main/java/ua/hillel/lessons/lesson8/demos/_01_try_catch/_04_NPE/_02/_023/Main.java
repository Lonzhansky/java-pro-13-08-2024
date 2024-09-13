package ua.hillel.lessons.lesson8.demos._01_try_catch._04_NPE._02._023;

// Приклад відсутності NullPointerException
public class Main {

    public static void main(String[] args) {
        String productName;
        // Створюємо об'єкт магазину
        Store store = new Store();
        // Створюємо об'єкт товару та надаємо йому назву
        Product product = new Product();
        product.setName("Orange");
        // Товар поставлено у магазин
        store.setProduct(product);
        // Намагаємося отримати назву товару,
        // який ВЖЕ Є в магазині.
        // Тому цей рядок коду НЕ МАЄ викинути NullPointerException
        productName = store.getProduct().getName();
        // Цей код виконуєтся, назва товару виводиться
        System.out.println("Product: " + productName);
    }
}
