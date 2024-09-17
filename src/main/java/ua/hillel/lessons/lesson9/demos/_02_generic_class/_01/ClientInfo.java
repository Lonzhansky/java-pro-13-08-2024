package ua.hillel.lessons.lesson9.demos._02_generic_class._01;

// Клас, який використовує узагальнений клас
public class ClientInfo {

    public static void main(String[] args) {
        // Отримуємо вхідні дані різного типу
        int id = 5;
        String name = "Bob";
        // Створюємо узагальнений об'єкт
        GenericEntity<Integer, String> client =
                new GenericEntity<>(id, name);
        // Виклики методів щодо результату виведення
        getOutput(formOutput(client));
    }

    // Формуємо текст для виведення
    private static String formOutput(GenericEntity<Integer, String> client) {
        return "Client id: " + client.getPropA() +
                ", name: " + client.getPropB();
    }

    // Метод виведення результату
    private static void getOutput(String output) {
        System.out.println(output);
    }
}
