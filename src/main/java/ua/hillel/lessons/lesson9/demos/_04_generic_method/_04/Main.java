package ua.hillel.lessons.lesson9.demos._04_generic_method._04;

public class Main {

    public static void main(String[] args) {

        DataProvider provider = new DataProvider();
        DataHandler dataHandler = new DataHandler();

        // Обробка String масиву даних
        String[] names = provider.getNames();
        String namesOutput = dataHandler.handleData(names);
        getOutput("Names:\n" + namesOutput);

        // Обробка Integer масиву даних
        Integer[] quotas = provider.getQuotas();
        String quotasOutput = dataHandler.handleData(quotas);
        getOutput("Quotas:\n" + quotasOutput);
    }

    // Виведення результату роботи програми
    private static void getOutput(String output) {
        System.out.println(output);
    }
}
