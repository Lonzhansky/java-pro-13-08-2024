package ua.hillel.lessons.lesson10.demos._01_byte_streams._01_fileoutstream._02;

import java.util.Scanner;

public class Main {

    static String text;
    static String fileName;

    public static void main(String[] args) {
        getData();
        getOutput(handleData());
    }

    private static void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you text: ");
        text = scanner.nextLine();
        // e.g. - абревіатура латинської фрази exempli gratia,
        // означає "for example" ("наприклад")
        System.out.println("Enter file name, e.g. notes: ");
        fileName = scanner.nextLine();
    }

    private static String handleData() {
        return new FileService().handleFile(text, fileName);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
