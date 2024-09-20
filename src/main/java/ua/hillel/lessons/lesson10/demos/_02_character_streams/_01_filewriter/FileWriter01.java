package ua.hillel.lessons.lesson10.demos._02_character_streams._01_filewriter;

import ua.hillel.lessons.lesson10.demos.utils.Constants;

import java.io.FileWriter;

// Створення і запис у файл
public class FileWriter01 {

    public static void main(String[] args) {

        String myFile = "records_04.txt";
        String myText = "Hi! This is our file.";

        // try-with-resources
        try(FileWriter fw = new FileWriter(Constants.BASE_PATH_OUT + myFile)) {
            fw.write(myText);
            System.out.println("Success.");
        } catch (Exception e) {
            System.out.println("Something went wrong :( " +
                    e.getMessage());
        }
    }
}
