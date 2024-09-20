package ua.hillel.lessons.lesson10.demos._04_files_dirs;

import ua.hillel.lessons.lesson10.demos.utils.Constants;

import java.io.File;
import java.io.IOException;

// Створення файлу
public class File04 {

    static String fileName;
    static File file;

    public static void main(String[] args) {

        // Існуючий файл.
        // Якщо спробувати створити, буде
        // попередження про наявність цього файлу.
//        fileName = "records_01.txt";
        // Новий файл
        fileName = "records_07.txt";

        try {
            file = new File(Constants.BASE_PATH_OUT + fileName);
            if (file.createNewFile()) {
                System.out.println("File has created :)");
            } else {
                System.out.println("File already exists :/");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
