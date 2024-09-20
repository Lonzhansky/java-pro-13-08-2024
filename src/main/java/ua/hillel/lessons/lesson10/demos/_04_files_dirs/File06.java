package ua.hillel.lessons.lesson10.demos._04_files_dirs;

import ua.hillel.lessons.lesson10.demos.utils.Constants;

import java.io.File;
import java.text.SimpleDateFormat;

// Визначення дати та часу
// останньої модифікації файлу.
public class File06 {

    static String fileName;
    static File file;
    static SimpleDateFormat sdf;

    public static void main(String[] args) {

        fileName = "records_01.txt";

        file = new File(Constants.BASE_PATH_OUT + fileName);

        sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        System.out.println("Last modification: "
                + file.getName() + " "
                + sdf.format(file.lastModified()));
    }
}
