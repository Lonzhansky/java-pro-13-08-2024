package ua.hillel.lessons.lesson9.demos._05_generic_bounded_type._01;

class Main {

    public static void main(String[] args) {

        // ПОМИЛКА!
        // Створюємо об'єкт узагальненого класу за допомогою String.
        // Але клас узагальнений з обмеженням зверху типом Number.
//        String str = "info";
//        Outputer<String> outputer1 = new Outputer<>();
//        outputer1.getOutput(str);

        // Нема помилки
        int value = 5;
        Outputer<Integer> outputer2 = new Outputer<>();
        outputer2.getOutput(value);

    }
}
