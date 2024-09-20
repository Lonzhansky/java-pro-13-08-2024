package ua.hillel.lessons.lesson10.demos._02_character_streams._01_filewriter;

import ua.hillel.lessons.lesson10.demos.utils.Constants;

import java.io.FileWriter;
import java.io.IOException;

// Створення і запис у файл
public class FileWriter02 {

    public static void main(String[] args) {
        String myFile = "records_05.txt";
        String myText = "Super secret files! Read.\nAnd forget! :[";
        getOutput(handleFile(myFile, myText));
    }

    private static String handleFile(String myFile, String myText) {
        // try-with-resources.
        // У конструкторі FileWriter використовується
        // параметр append зі значенням false - тобто
        // файл перезаписуватиметься.
        // Потім за допомогою методів, визначених
        // у базовому класі Writer виконується запис
        // даних.
        try (FileWriter fileWriter =
                     new FileWriter(Constants.BASE_PATH_OUT +
                             myFile)) {
            // Запис тексту
            fileWriter.write(myText);
            // Запис по символам
            fileWriter.append(' ').append('+').append(' ')
                    .append('O').append('_').append('O');
            return "Success.";
        } catch (IOException ex) {
            return "Exception: " + ex.getMessage();
        }
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
