package ua.hillel.lessons.lesson8.demos._08_file_work._03_file_read;

import ua.hillel.lessons.lesson8.utils.Constants;

import java.io.FileReader;

// Робота з файлом через File IO API.
// Без блоку try-catch виникає помилка компіляції, оскільки
// необроблені перевіряємі винятки FileNotFoundException, IOException.
// Це незалежно від того чи існує файл, або ні.
public class Main01 {

//    public static void main(String[] args) {
//
//        // Помилка компіляції
//        // Unhandled exception: java.io.FileNotFoundException
//        FileReader fr = new FileReader(Constants.BASE_PATH + "notes.txt");
//
//        // Пробуємо читати символи файлу
//        int i;
//        // Помилка компіляції
//        // Unhandled exception: java.io.IOException
//        // Неможливість роботи через File IO API
//        while ((i = fr.read()) != -1)
//            System.out.print((char) i);
//    }
}
