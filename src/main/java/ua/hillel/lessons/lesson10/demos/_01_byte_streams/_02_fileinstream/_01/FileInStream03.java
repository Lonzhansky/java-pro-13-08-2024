package ua.hillel.lessons.lesson10.demos._01_byte_streams._02_fileinstream._01;

import ua.hillel.lessons.lesson10.demos.utils.Constants;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// КОПІЮВАННЯ з файлу в файл.
// Файлу, у який копіюється текст - ще не існує.
// Після виконання коду файл створюється, і в
// нього вносяться дані.
public class FileInStream03 {

    static String fileNameIn;
    static String fileNameOut;

    static FileInputStream fin;
    static FileOutputStream fout;
    static byte[] bytes;

    public static void main(String[] args) {

        fileNameIn = "records_01.txt";
        fileNameOut = "records_03.txt";

        try {
            fin = new FileInputStream(Constants.BASE_PATH_OUT +
                    fileNameIn);
            fout = new FileOutputStream(Constants.BASE_PATH_OUT +
                    fileNameOut);

            bytes = new byte[fin.available()];
            // Зчитуємо буфер
            fin.read(bytes, 0, bytes.length);
            // Записуємо з буфера в файл
            fout.write(bytes, 0, bytes.length);

            System.out.println("Success...");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
