package ua.hillel.lessons.lesson8.demos._04_try_with_resources;

import ua.hillel.lessons.lesson8.utils.Constants;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

// Можемо оголосити більше одного ресурсу
// в операторі try-with-resources, розділивши
// їх крапкою з комою.
// Якщо ця програма виконується без будь-яких
// винятків, об'єкт Scanner зчитує рядок
// з файлу notes.txt і записує їх у новий файл notes2.txt.
// Коли робиться кілька оголошень, інструкція try-with-resources
// закриває ці ресурси у зворотньому порядку.
// У цьому прикладі спочатку закривається об'єкт PrintWriter,
// а потім закривається об'єкт Scanner.
public class Main04 {

    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(
                new File(Constants.BASE_PATH + "notes.txt"));
             PrintWriter writer = new PrintWriter(
                     Constants.BASE_PATH + "notes2.txt")) {
            while (scanner.hasNext()) {
                writer.print(scanner.nextLine());
            }
            System.out.println("Done.");
        }
    }
}
