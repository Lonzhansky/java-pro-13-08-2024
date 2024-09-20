package ua.hillel.lessons.lesson10.demos._03_buffered_streams._02_buffreader;

import ua.hillel.lessons.lesson10.demos.utils.Constants;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Читання CSV-файлу через BufferedReader
public class BuffReaderCSV {

    static String path;
    static String line;
    static String splitBy;
    static BufferedReader br;

    public static void main(String[] args) {

        path = Constants.BASE_PATH_IN + "contacts.csv";
        splitBy = ",";

        try {
            // Парсинг CSV-файлу в конструктор класу BufferedReader
            br = new BufferedReader(new FileReader(path));

            int count = 1;

            while ((line = br.readLine()) != null) {
                String[] contacts = line.split(splitBy);
                System.out.printf("%d) %s %s %s%n",
                        count++, contacts[0],
                        contacts[1], contacts[2]);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
