package ua.hillel.lessons.lesson10.demos._04_files_dirs;

import ua.hillel.lessons.lesson10.demos.utils.Constants;

import java.io.File;

// Видалення файлу
public class File05 {

    static String fileName;
    static File file;

    public static void main(String[] args) {

        try {
            fileName = "records_07.txt";
            file = new File(Constants.BASE_PATH_OUT + fileName);
            // delete() повертає true, якщо файл видалено,
            // false - якщо ні
            if (file.delete()) {
                // Виведення інформації в консоль при успіху
                System.out.println(file.getName() + " - deleted!");
            } else {
                // Виведення інформації в консоль при провалі
                System.out.println("File does not exist or not deleted!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
