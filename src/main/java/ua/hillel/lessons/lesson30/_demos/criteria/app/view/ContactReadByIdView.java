package ua.hillel.lessons.lesson30._demos.criteria.app.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactReadByIdView {

    // Отримуємо вхідні дані
    public Map<String, String> getData() {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> data = new HashMap<>();
        System.out.print("Enter contact's ID: ");
        data.put("id", scanner.nextLine().trim());
        return data;
    }

    // Виведення результату роботи програми
    public void getOutput(String output) {
        System.out.println(output);
    }
}
