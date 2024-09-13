package ua.hillel.lessons.lesson8.demos._09_custom_exceptions._02._023;


public class App {

    public static void main(String[] args) {
        // Отримуємо вхідні дані
        DataProvider provider = new DataProvider();
        String data = provider.getData();
        // Обробляємо вхідні дані
        DataHandler handler = new DataHandler();
        getOutput(handler.handleData(data));
        // Подальший код буде виконаний, навіть якщо валідацію не пройдено,
        // оскільки виняток обробляється
        getOutput("Some code.");
    }

    // Виведення результату роботи програми
    private static void getOutput(String output) {
        System.out.println(output);
    }
}
