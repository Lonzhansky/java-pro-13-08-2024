package ua.hillel.lessons.lesson10.demos._01_byte_streams._02_fileinstream._03;

import java.util.Scanner;

// Читаємо файл з внутрішньої папки проекту,
// назва якого вводиться без розширення
public class Main {

    public static void main(String[] args) {
        getOutput(getFileData(getData()));
    }

    private static String getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input file name, for example, notes: ");
        return scanner.nextLine();
    }

    private static String getFileData(String file) {
        return new FileService().readFile(file);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
