package ua.hillel.lessons.lesson9.demos._04_generic_method._03;

public class NameInfo {

    public static void main(String[] args) {
        // Створюємо екземпляр класу, який містить узагальнений метод
        Outputer outputer = new Outputer();
        // Вхідні дані
        String[] names = {"Tom", "Linda", "Denis", "Helen"};
        // Виклик метода для виведення
        // При виклику методу можна пропустити параметр
        // конкретного типу, вказаний в <>.
        // Компілятор має достатньо інформації, щоб вивести
        // з такого узагальнення саме той метод, який потрібно
        // викликати.
        outputer.getOutput(names);
    }
}
