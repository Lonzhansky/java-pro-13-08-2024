package ua.hillel.lessons.lesson9.demos._04_generic_method._05;

import ua.hillel.lessons.lesson9.demos._04_generic_method._05.handler.DataHandler;
import ua.hillel.lessons.lesson9.demos._04_generic_method._05.provider.DataProvider;

public class Main {

    public static void main(String[] args) {

        DataProvider provider = new DataProvider();
        DataHandler dataHandler = new DataHandler();

        // Обробка масиву клієнтів
        String clientsOutput =
                dataHandler.handleData(provider.getClients());
        getOutput("Clients:\n" + clientsOutput);

        // Обробка масиву товарів
        String productsOutput =
                dataHandler.handleData(provider.getProducts());
        getOutput("Products:\n" + productsOutput);
    }

    // Виведення результату роботи програми
    private static void getOutput(String output) {
        System.out.println(output);
    }
}
