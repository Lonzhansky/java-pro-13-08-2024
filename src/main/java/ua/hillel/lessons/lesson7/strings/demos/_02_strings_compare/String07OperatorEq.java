package ua.hillel.lessons.lesson7.strings.demos._02_strings_compare;

// Оператор == порівнює посилання, а не значення,
// визначаючи чи посилаються вони на один і той же
// екземпляр в пам'яті.
public class String07OperatorEq {

    public static void main(String[] args) {

        String a = "Banana";
        String b = "Banana";
        // Створення нового об'єкта через
        // конструктор String
        String c = new String("Banana");

        // true (обидва відносяться до одного і того ж екземпляра)
        boolean isSame = a == b;
        System.out.println("1) Values \"" + a + "\" and \"" + b +
                "\" are the same? " + isSame);

        // false (відносяться до різних екземплярів)
        isSame = a == c;
        System.out.println("2) Values \"" + a + "\" and \"" + c +
                "\" are the same? " + isSame);

    }
}
