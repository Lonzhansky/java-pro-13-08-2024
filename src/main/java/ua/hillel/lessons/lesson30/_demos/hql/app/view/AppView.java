package ua.hillel.lessons.lesson30._demos.hql.app.view;

import ua.hillel.lessons.lesson30._demos.hql.app.utils.AppStarter;
import ua.hillel.lessons.lesson30._demos.hql.app.utils.Message;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppView {

    Scanner scanner;
    int option;

    public int chooseOption() {
        scanner = new Scanner(System.in);
        showMenu();
        try {
            option = scanner.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println(Message.INCORRECT_OPTION_MSG.getMessage());
            AppStarter.startApp();
        }
        return option;
    }

    private void showMenu() {
        System.out.print("""
                
                ______ MENU ___________
                1 - Create contact.
                2 - Read contacts.
                3 - Update contact.
                4 - Delete contact.
                5 - Read contact by id.
                0 - Close the App.
                """);
        System.out.print("Input option: ");
    }

    public void getOutput(String output) {
        if (output.equals("0")) {
            System.out.println(Message.APP_CLOSE_MSG.getMessage());
            System.exit(0);
        } else System.out.println(output);
    }
}
