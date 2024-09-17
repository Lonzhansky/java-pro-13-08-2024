package ua.hillel.lessons.lesson9.demos._04_generic_method._02;

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
        Integer res = DataUtil.getData(15);
        getOutput("4) Data: " + res);
        // або
        getOutput("5) Data: " + DataUtil.getData(15));

        // Присутній виклик статичного метода getData()
        // з аргументом типу String
        String res1 = DataUtil.getData("15");
        getOutput("6) Data: " + res1);

        // Присутній виклик статичного метода getData()
        // з аргументом типу String
        getOutput("7) Data: " + DataUtil.getData("some text"));

        // Присутній виклик статичного метода getData()
        // з аргументом типу Double
        Double res2 = DataUtil.getData(23.95);
        getOutput("8) Data: " + res2);
        // або
        getOutput("9) Data: " + DataUtil.getData(23.95));

    }

    // Виведення результату
    private static void getOutput(String output) {
        System.out.println(output);
    }
}
