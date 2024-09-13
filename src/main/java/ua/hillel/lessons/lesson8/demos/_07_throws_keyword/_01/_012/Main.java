package ua.hillel.lessons.lesson8.demos._07_throws_keyword._01._012;

// Оголошуємо виняток, виняток виникає.
// Обробка винятку за допомогою блоку try-catch.
// У разі, якщо ми обробимо виняток, подальший код буде виконуватись
// нормально, незалежно від того, чи виникне виняток під час
// виконання програми чи ні.
public class Main {

    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        // Обробка винятку за допомогою блоку try-catch.
        try {
            // Виклик методу, який викидає виняток
            someClass.someMethod();
        } catch (Exception e) {
            System.out.println("Exception has processed");
        }
        // Подальший код виконується
        System.out.println("Some code.");
    }
}
