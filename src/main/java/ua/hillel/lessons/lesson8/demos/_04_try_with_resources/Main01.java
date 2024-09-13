package ua.hillel.lessons.lesson8.demos._04_try_with_resources;

import ua.hillel.lessons.lesson8.utils.Constants;

import java.io.FileOutputStream;

// try-with-resources.
// Є один ресурс.
class Main01 {

    public static void main(String[] args) {

        try (
                // Створюємо об'єкт FileOutputStream (потік)
                // для запису даних в файл.
                // Додаємо ресурс (файл)
                FileOutputStream fos = new FileOutputStream(
                        Constants.BASE_PATH + "myfile.txt"
                )
        ) {

            // Текст файлу
            String text = "Hello World. This is my Java app.";

            // Конвертація рядка у байти
            byte[] arr = text.getBytes();

            // Текст (потік), який записується в файл.
            fos.write(arr);

            // Надлишково.
            // Оператор try гарантує закриття ресурсу (файла),
            // оскільки FileOutputStream реалізує AutoCloseable.
            // https://docs.oracle.com/javase/8/docs/api/java/io/FileOutputStream.html
//            fos.close();
        }
        // Catch блок для обробки винятків
        catch (Exception e) {
            // Повідомлення про виняток
            System.out.println("Exception: " + e);
        }
        // Повідомлення про успіх виконання програми
        System.out.println("Resource are closed and message " +
                "has been written into file :)");
    }
}
