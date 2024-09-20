package ua.hillel.lessons.lesson10.demos._01_byte_streams._01_fileoutstream._01;

import ua.hillel.lessons.lesson10.demos.utils.Constants;

import java.io.FileOutputStream;
import java.io.IOException;

// Створення та запис файлу.
// Текст містить переведення рядків.
// Папка вже заздалегідь створена.
public class FileOutStream02 {

    static String fileName;
    static String myFile;
    static String myText;
    static FileOutputStream fout;
    static byte[] byteArr;

    public static void main(String[] args) {

        myText = "Super secret info!\n Read \n and forget :(";
        fileName = "records_02.txt";
        myFile = Constants.BASE_PATH_OUT + fileName;

        try {
            fout = new FileOutputStream(myFile);
            // Конвертація рядка в байти
            byteArr = myText.getBytes();
            fout.write(byteArr, 0, byteArr.length);
            // Закриття потоку
            fout.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.exit(0);
        }
        System.out.println("Success!");
    }
}
