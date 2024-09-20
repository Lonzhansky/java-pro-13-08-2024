package ua.hillel.lessons.lesson10.demos._04_files_dirs;

import ua.hillel.lessons.lesson10.demos.utils.Constants;

import java.io.File;

// Перейменування каталогу/папки
public class File02 {

    static String dir;
    static String dirNew;
    static File folder;
    static File newFolder;

    public static void main(String[] args) {

        dir = "AAA";
        dirNew = "BBB";

        // Об'єкт File для каталогу/папки
        folder = new File(Constants.BASE_PATH_OUT + dir);
        // Об'єкт File для новогу каталогу/папки
        newFolder = new File(Constants.BASE_PATH_OUT + dirNew);
        // Перейменування через метод renameTo()
        boolean isRenamed = folder.renameTo(newFolder);

        if (isRenamed) {
            // Виведення інформації в консоль при успіху
            System.out.println("Fold renamed!");
        } else {
            // Виведення інформації в консоль при провалі
            System.out.println("Something went wrong :(");
        }
    }
}
