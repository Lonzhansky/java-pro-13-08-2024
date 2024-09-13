package ua.hillel.lessons.lesson8.demos._03_try_nested;

// Блок try у вкладеному блоці try (внутрішній блок try 2)
// не обробляє виняток.
// Потім управління передається його батьківському
// блоку try (внутрішній блок try 1).
// Якщо він не обробляє виняток, то управління передається
// в основний блок try (зовнішній блок try),
// де відповідний блок catch обробляє виняток.
// Це називається гніздуванням.
public class Main02 {

    public static void main(String[] args) {

        // Зовнішній (основний) блок try
        try {

            // Внутрішній блок try 1
            try {

                // Внутрішній блок try 2
                try {
                    int[] arr = {1, 2, 3, 4, 5};

                    // Елемент масиву за його межами
                    System.out.println(arr[8]);

                } catch (ArithmeticException e) {
                    // Обробка ArithmeticException
                    System.out.println("ArithmeticException. " +
                            "Inner try block 2.");
                }
            } catch (ArithmeticException e) {
                // Обробка ArithmeticException
                System.out.println("ArithmeticException. " +
                        "Inner try block 1.");
            }
        } catch (ArrayIndexOutOfBoundsException e2) {
            // Обробка ArrayIndexOutOfBoundsException
            System.out.println(e2 + "\nOuter (main) try block.");
        } catch (Exception e3) {
            System.out.println("Exception processed " +
                    "in the main try block.");
        }
    }
}

