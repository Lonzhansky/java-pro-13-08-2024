package ua.hillel.lessons.lesson8.demos._03_try_nested;

// Блок try в іншому блоці try для двох різних винятків.
//
// Коли якийсь блок try не має блоку catch
// для певного винятку, тоді блок catch
// зовнішнього (батьківського) блоку try перевіряється
// щодо цього винятку, і якщо він збігається,
// виконується блок catch зовнішнього блоку try.
//
// Якщо жоден із блоків catch, зазначених у коді,
// не може обробити виняток, то система часу
// виконання Java обробить виняток.
// Потім відображається повідомлення, створене системою
// для цього винятку.
public class Main01 {

    public static void main(String[] args) {

        // Зовнішний блок try
        try {

            // Внутрішній блок try 1
            try {
                System.out.println("Let's divide by 0");
                int b = 27 / 0;
            }
            // catch блок внутрішнього блоку try 1
            catch (ArithmeticException e) {
                System.out.println("ArithmeticException: " + e);
            }

            // Внутрішній блок try 2
            try {
                int[] arr = new int[4];

                // Присвоюємо значення за межами масиву
                arr[4] = 7;
            }
            // catch блок внутрішнього блоку try 2
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException: " + e);
            }

            String str = null;
            str.length();

            System.out.println("Some kind of expression");
        }
        // catch блок зовнішнього блоку try
        catch (Exception e) {
            System.out.println("Exception handling (outer catch)");
        }

        System.out.println("Further down the code...");
    }
}
