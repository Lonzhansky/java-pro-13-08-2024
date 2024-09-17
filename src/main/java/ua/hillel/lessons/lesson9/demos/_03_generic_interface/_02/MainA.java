package ua.hillel.lessons.lesson9.demos._03_generic_interface._02;

// При реалізації універсального параметра інтерфейсу
// задається конкретний тип, тут тип String.
// Тоді клас, що реалізує інтерфейс, жорстко прив'язаний
// до цього типу.
public class MainA {

    public static void main(String[] args) {

        IAccount<String> acc1 = new AccountA("1235sdc", 5000);
        AccountA acc2 = new AccountA("2376", 4300);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
    }
}
