package ua.hillel.lessons.lesson7.strings.demos._01_strings;

// Метод join() поєднує елементи з роздільником
// і повертає об'єднаний рядок.
// Якщо елемент має значення null, то додається значення null.
public class String10Join {

    public static void main(String[] args) {

        String str = String.join(" -> ", "Start",
                "Run", "Continue", "Stop");
        System.out.println("1) Result: " + str);

        str = String.join(" -> ", "Start",
                "Run", "Continue", null);
        System.out.println("2) Result: " + str);

        str = String.join(" ", "Sunny", "shop",
                "is", "good", "shop");
        System.out.println("3) Result: " + str);
    }
}
