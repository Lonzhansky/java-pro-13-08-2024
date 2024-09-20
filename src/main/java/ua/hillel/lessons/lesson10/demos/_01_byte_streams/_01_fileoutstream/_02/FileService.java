package ua.hillel.lessons.lesson10.demos._01_byte_streams._01_fileoutstream._02;

import ua.hillel.lessons.lesson10.demos.utils.Constants;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileService {

    public String handleFile(String myText, String fileName) {
        try {
            FileOutputStream fout =
                    new FileOutputStream(Constants.BASE_PATH_OUT +
                            fileName + ".txt");
            // Конвертація рядка в байти
            byte[] byteArr = myText.getBytes();
            fout.write(byteArr, 0, byteArr.length);
            // Закриття потоку
            fout.close();
        } catch (IOException ex) {
            return ex.getMessage();
        }
        // За виняткової ситуації,
        // це повідомлення не повинно з'явитися,
        // оскільки вище return повертає
        // повідомлення про виняток.
        return "Success!";
    }
}
