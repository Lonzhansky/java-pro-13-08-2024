package ua.hillel.lessons.lesson9.demos._02_generic_class._01;

// Клас, який використовує узагальнений клас
public class UserInfo {

    public static void main(String[] args) {
        // Отримуємо вхідні дані різного типу
        String name = "Alice";
        String email = "alice@mail.com";
        // Створюємо узагальнений об'єкт
        GenericEntity<String, String> user =
                new GenericEntity<>(name, email);
        // Виклики методів щодо результату виведення
        getOutput(formOutput(user));
    }

    // Формуємо текст для виведення
    private static String formOutput(GenericEntity<String, String> user) {
        return "User: " + user.getPropA() +
                ", email: " + user.getPropB();
    }

    // Метод виведення результату
    private static void getOutput(String output) {
        System.out.println(output);
    }
}
