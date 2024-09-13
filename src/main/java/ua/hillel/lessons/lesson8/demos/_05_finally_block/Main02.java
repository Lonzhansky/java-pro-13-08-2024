package ua.hillel.lessons.lesson8.demos._05_finally_block;

// Код видає виняток, проте блок catch неспроможний
// його обробити.
// Незважаючи на це, блок finally виконується
// після блоку try, а потім програма завершується
// аварійно.
public class Main02 {

    public static void main(String[] args) {

        try {
            System.out.println("In try block.");
            // Код кидає виняток
            int result = 15 / 0;
            // Код не буде виконаний
            System.out.println("Result is " + result);
        }
        // catch не може оброблювати ArithmeticException,
        // який саме потрібен.
        // Може приймати тільки NullPointerException.
        catch (NullPointerException e) {
            // Повідомлення про виняток
            System.out.println(e.getMessage());
        }
        // Виконується незалежно від наявності винятку.
        finally {
            System.out.println("Finally block.");
        }
        // Подальший код не буде виконаний, оскільки присутня
        // невідповідна обробка винятку
        System.out.println("Some code.");
    }
}
