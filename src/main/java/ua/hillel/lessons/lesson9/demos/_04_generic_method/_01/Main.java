package ua.hillel.lessons.lesson9.demos._04_generic_method._01;

// Використання різних типів аргументів методу
// через узагальнення
public class Main {

    public static void main(String[] args) {

        // Створюємо екземпляр класу
        InfoUtil infoUtil = new InfoUtil();

        // Присутній виклик нестатичного метода getInfo()
        // з аргументом типу Integer
        getOutput("1) " + infoUtil.getInfo(15));

        // Присутній виклик нестатичного метода getInfo()
        // з аргументом типу String
        getOutput("2) " + infoUtil.getInfo("some text"));

        // Присутній виклик нестатичного метода getInfo()
        // з аргументом типу Double
        getOutput("3) " + infoUtil.getInfo(23.95));

        // Присутній виклик статичного метода getData()
        // з аргументом типу Integer
        getOutput("4) " + DataUtil.getData(15));

        // Присутній виклик статичного метода getData()
        // з аргументом типу String
        getOutput("5) " + DataUtil.getData("some text"));

        // Присутній виклик статичного метода getData()
        // з аргументом типу Double
        getOutput("6) " + DataUtil.getData(23.95));

    }

    // Виведення результату
    private static void getOutput(String output) {
        System.out.println(output);
    }
}
