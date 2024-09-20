package ua.hillel.lessons.lesson10.demos._04_files_dirs;

import ua.hillel.lessons.lesson10.demos.utils.Constants;

import java.io.File;

// Створення нової папки
public class File01 {

    public static void main(String[] args) {
        // Назва нової папки
        String dir = "AAA";

        // Об'єкт File для каталогу/папки
        File folder = new File(Constants.BASE_PATH_OUT + dir);
        boolean isCreated = folder.mkdir();

        if (isCreated) {
            System.out.println("Fold done...");
        } else {
            System.out.println("Something went wrong :(");
        }
    }
}
