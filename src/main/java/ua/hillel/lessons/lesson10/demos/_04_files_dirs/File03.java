package ua.hillel.lessons.lesson10.demos._04_files_dirs;

import ua.hillel.lessons.lesson10.demos.utils.Constants;

import java.io.File;

// Видалення каталогу/папки
public class File03 {

    static String folder;
    static File delFolder;
    static boolean isDeleted;

    public static void main(String[] args) {

        // Ім'я папки, яка має бути видалена
        folder = "BBB";
        // Об'єкт File для каталогу/папки
        delFolder = new File(Constants.BASE_PATH_OUT + folder);
        // Видалення каталогу/папки через метод delete()
        isDeleted = delFolder.delete();

        if (isDeleted) {
            // Виведення інформації в консоль при успіху
            System.out.println("Fold has deleted!");
        } else {
            // Виведення інформації в консоль при провалі
            System.out.println("Something went wrong :(");
        }
    }
}
