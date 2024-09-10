package ua.hillel.lessons.lesson7.strings.demos._06_string_formatting._02_string_formatted;

// Застосування String.formatted() з текстовим блоком
public class Main02 {

    public static void main(String[] args) {

        // Вхідні дані
        String productName = "orange";
        double weight = 1.325;
        double price = 2.99;
        double cost = weight * price;

        // Текстовий блок. Увага на потрійні лапки.
        // Виведення рядків тексту буде в такій компоновці
        // як є - багаторядковим текстом з усіма відступами.
        // %.2f - округлення до 2-х знаків після десяткового роздільника.
        // %.3f - округлення до 3-х знаків після десяткового роздільника.
        String strPtrn = """
                Product: %s,
                 weight is %.3f kilos
                 price is EUR %.2f per kilo
                -----------------------------
                Cost is EUR %.2f
                """;

        String frmtedStr = strPtrn.formatted(productName, weight, price, cost);
        System.out.println(frmtedStr);
    }
}
