package ua.hillel.lessons.lesson9.demos._02_generic_class._01;

// Клас, який використовує узагальнений клас
public class ProductInfo {

    public static void main(String[] args) {
        // Отримуємо вхідні дані різного типу
        String name = "Orange";
        double price = 2.99;
        // Створюємо узагальнений об'єкт
        GenericEntity<String, Double> product =
                new GenericEntity<>(name, price);
        // Виклики методів щодо результату виведення
        getOutput(formOutput(product));
    }

    // Формуємо текст для виведення
    private static String formOutput(GenericEntity<String, Double> product) {
        return "Product is " + product.getPropA() +
                ", price is USD " + product.getPropB();
    }

    // Метод виведення результату
    private static void getOutput(String output) {
        System.out.println(output);
    }
}
