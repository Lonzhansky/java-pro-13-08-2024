package ua.hillel.lessons.lesson10.demos._01_byte_streams._02_fileinstream._01;

import ua.hillel.lessons.lesson10.demos.utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;

// ЧИТАННЯ З ФАЙЛУ
//
// Через while зчитується кожен окремий байт в змінну i.
// Коли в потоці більше немає даних для читання,
// метод повертає число -1.
// Потім кожен зчитаний байт конвертується в об'єкт
// типу char і виводиться на консоль.
// Однак може бути виведений набір ï» перед текстом
// якщо файл створено через IDE.
// Це UTF-8 BOM (Byte order mark).
//
// BOM (Byte order mark) – спеціальний символ зі стандарту
// Unicode, який вставляється на початок текстового файлу
// або потоку для позначення того, що у файлі (потоці)
// використовується Unicode, і навіть для непрямого зазначення
// кодування та порядку байтів, за допомогою яких символи Unicode
// були закодовані.
//
// Відповідь:
// https://stackoverflow.com/questions/20778921/how-do-i-remove-the-character-%C3%AF-from-the-beginning-of-a-text-file-in-c
// Вам потрібно прочитати файл як UTF-8. Якщо вам не потрібний Unicode
// і ви просто використовуєте перші 127 кодових точок ASCII,
// збережіть файл як ASCII або UTF-8 без BOM
public class FileInStream01 {

    static String fileName;
    static String path;
    static FileInputStream fin;

    public static void main(String[] args) {

        fileName = "records_01.txt";
        path = Constants.BASE_PATH_OUT + fileName;

        try {
            fin = new FileInputStream(path);
            int i;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
